import java.io.Console;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CashApplication {
    static Map<String, Account> accounts = new HashMap<>();
    static Map<String, Transaction> transactions = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            var control = 0;
            var accountService = new AccountService();
            Console console = System.console();

            scanner = new Scanner(System.in);

            // authentication
            System.out.println("Welcome to the Electronic Cash System");
            System.out.println("Please login to continue - Username: admin, Password: admin");
            var username = console.readLine("%s", "Username: ");

            var password = console.readPassword("Enter password: ");

            boolean isAuthenticated = "admin".equals(username) && "admin".equals(new String(password));

            if (!isAuthenticated) {
                System.out.println("Invalid credentials. Exiting the application.");
                System.exit(0);
            }

            while (control != 7) {

                System.out.println();
                System.out.println("===ELECTRONIC CASH SYSTEM MENU - v1.0===");

                System.out.println("1. Create Account");
                System.out.println("2. Deposit Cash");
                System.out.println("3. Withdraw Cash");
                System.out.println("4. Print Balance Analytic");
                System.out.println("5. Print Accounts");
                System.out.println("6. Print Balance Synthetic");
                System.out.println("7. Exit");

                System.out.println("========================================");

                System.out.print("Select an option:");

                control = scanner.nextInt();

                if (control == 1) {
                    System.out.printf("Enter account name: ");
                    var name = scanner.next();
                    if (name == null || name.isBlank())
                        throw new RuntimeException("Name cannot be empty");
                    accountService.register(accounts, name);
                } else if (control == 2) {
                    System.out.println("Deposit Cash");
                    System.out.printf("Enter account ID: ");
                    var accountId = scanner.next();
                    var foundAccount = accountService.findAccountById(accounts, accountId);
                    if (foundAccount == null)
                        throw new RuntimeException("Account not found");

                    System.out.printf("Enter amount to deposit: ");
                    var amount = scanner.nextDouble();
                    var transaction = new Transaction(
                            foundAccount,
                            amount, TransactionType.DEPOSIT);

                    transaction.save(transactions);
                } else if (control == 3) {
                    System.out.println("Withdraw Cash");
                    System.out.printf("Enter account ID: ");
                    var accountId = scanner.next();
                    var foundAccount = accountService.findAccountById(accounts, accountId);
                    if (foundAccount == null)
                        throw new RuntimeException("Account not found");

                    System.out.printf("Enter amount to withdraw: ");
                    var amount = scanner.nextDouble();
                    var transaction = new Transaction(
                            foundAccount,
                            amount,
                            TransactionType.WITHDRAW);

                    transaction.save(transactions);
                }

                else if (control == 5) {
                    accountService.printAccounts(accounts);
                } else if (control == 4) {
                    accountService.printBalance(transactions, TypeReport.DETAIL);
                } else if (control == 6) {
                    accountService.printBalance(transactions, TypeReport.BALANCE);
                } else if (control == 7) {
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);
                }

            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            main(args);
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }

    static class AccountService {
        public void register(Map<String, Account> accounts, String name) {
            var account = new Account(name);

            accounts.put(account.getId().toString(), account);
            System.out.printf("Name: %s, ID: %s",
                    account.getName(),
                    account.getId());

        }

        public void printBalance(Map<String, Transaction> transactions,
                TypeReport typeReport) {

            if (typeReport == TypeReport.DETAIL) {
                System.out.println("==================Account Balances:==========================================");
                System.out.println("Account ID\t\t\t\t\tAmount\t\tType");

                transactions.values().stream()
                        .forEach(t -> {
                            System.out.printf("%s\t\t%.2f\t\t%s\n",
                                    t.getAccount().getId(), t.getAmount(),
                                    t.getType());
                        });
            } else if (typeReport == TypeReport.BALANCE) {
                System.out.println("==================Account Balances:==========================================");
                System.out.println("Account ID\t\t\t\t\t\t\tBalance\n");
                transactions.values().stream()
                        .collect(
                                Collectors.groupingBy(
                                        t -> t.getAccount().getId(),
                                        Collectors.summingDouble(
                                                t -> t.getType() == TransactionType.DEPOSIT ? t.getAmount()
                                                        : -t.getAmount())

                                ))
                        .forEach((accountId, balance) -> {
                            var account = accounts.get(accountId.toString());
                            System.out.printf("%s\t\t%.2f\n",
                                    accountId.toString().concat("-")
                                            .concat(account != null ? account.getName() : "Unknown"),
                                    balance);
                        });
            }
            System.out.println("==============================================================================");
        }

        public void printAccounts(Map<String, Account> accounts) {
            System.out.println("============Accounts:==================================");
            // tabular format
            System.out.println("Account ID\t\t\t\t\tName");
            for (var account : accounts.values()) {
                System.out.printf("%s\t\t%s\n", account.getId(), account.getName());
            }

            System.out.println("===============================================================");
        }

        public Account findAccountById(Map<String, Account> accounts, String accountId) {
            return accounts.get(accountId);
        }
    }

    static class Account {
        private UUID id;
        private String name;

        public Account(String name) {
            this.id = UUID.randomUUID();
            this.name = name.toUpperCase();
        }

        public UUID getId() {
            return id;
        }

        public String getName() {
            return name;
        }

    }

    static enum TransactionType {
        DEPOSIT, WITHDRAW
    }

    static enum TypeReport {
        DETAIL, BALANCE
    }

    static class Transaction {
        private Account account;
        private TransactionType type = TransactionType.DEPOSIT;
        private double amount;

        public Transaction(Account account, double amount, TransactionType type) {

            if (account == null)
                throw new RuntimeException("Account cannot be null");

            if (amount <= 0)
                throw new RuntimeException("Amount must be greater than zero");

            this.account = account;
            this.amount = amount;
            this.type = type;
        }

        public void save(Map<String, Transaction> transactions) {
            System.out.printf("Saving transaction for account %s with amount %.2f and type %s\n", account.getId(),
                    amount, type);
            // fail fast approach
            if (this.type == TransactionType.WITHDRAW && this.amount > this.getBalance(transactions))
                throw new RuntimeException("Insufficient balance for withdrawal");
            transactions.put(UUID.randomUUID().toString(), this);
        }

        private double getBalance(Map<String, Transaction> transactions) {
            return transactions.values().stream()
                    .filter(t -> t.getAccount().getId().equals(account.getId()))
                    .mapToDouble(t -> t.getType() == TransactionType.DEPOSIT ? t.getAmount() : -t.getAmount())
                    .sum();
        }

        public Account getAccount() {
            return account;
        }

        public double getAmount() {
            return amount;
        }

        public TransactionType getType() {
            return type;
        }

    }
}
