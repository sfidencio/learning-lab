public class CurrencyConverter {
    public static void main(String[] args) {
        double usdAmount = 143.89; // Amount in US Dollars -> Quantia em Dólares Americanos
        double exchangeRate = 4.89; // Example exchange rate from USD to BRL -> Taxa de câmbio
        double brlAmount = usdAmount * exchangeRate;
        System.out.printf("USD %.2f is BRL %.2f%n", usdAmount, brlAmount);
    }
}
