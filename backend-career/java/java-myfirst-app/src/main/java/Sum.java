import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s!%n", name);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.printf("Result: %d", num1 + num2);
        scanner.close();
    }
}
