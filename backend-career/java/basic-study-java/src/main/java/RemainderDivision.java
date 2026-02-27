public class RemainderDivision {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;

        int quotient = dividend / divisor; // Resultado da divisão inteira
        int remainder = dividend % divisor; // Resto da divisão

        // Par ou ímpar (em inglês):
        String dividendParity = (dividend % 2 == 0) ? "even" : "odd";
        String divisorParity  = (divisor % 2 == 0) ? "even" : "odd";

        System.out.println("Dividend: " + dividend + " (" + dividendParity + ")");
        System.out.println("Divisor: " + divisor + " (" + divisorParity + ")");
        System.out.println("Quotient (divisão inteira): " + quotient);
        System.out.println("Remainder (resto da divisão): " + remainder);
    }
}
