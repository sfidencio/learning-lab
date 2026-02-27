public class Fatorial {
    public static void main(String[] args) {
        System.out.println("Calculate factorial of 5:");
        calculateFactorialFor(5);
        System.out.println("Calculate factorial of 5 recursively:");
        int result = calculateFactorialRecursively(5);
        System.out.println("Factorial of 5 is: " + result);
    }

    // Complexidade:
    // Tempo: O(n) -> faz um laço de 1 até n, com 1 multiplicação por iteração.
    // Espaço: O(1) -> usa apenas variáveis locais (não cresce com n).
    private static void calculateFactorialFor(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    // Complexidade:
    // Tempo: O(n) -> a função chama a si mesma n vezes até chegar no caso base (0 ou 1).
    // Espaço: O(n) -> cada chamada fica na stack até retornar (pilha cresce proporcionalmente a n).
    // Observação: para n grande, pode ocorrer StackOverflowError por profundidade de recursão.
    private static int calculateFactorialRecursively(int n) {
        return (n == 0 || n == 1) ? 1 : n * calculateFactorialRecursively(n - 1);
    }
}
