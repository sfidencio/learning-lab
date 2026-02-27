import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int control = 0;
        Scanner scanner = new Scanner(System.in);

        /*
         * TESTE DE MESA (exemplo de execução)
         *
         * Estado inicial:
         * control = 0
         *
         * LOOP 1 (entra no while pois control != -1):
         * imprime:
         * "Welcome..."
         * "Select a number ... (or -1 to exit): "
         * entrada do usuário: 1
         * => control = 1
         * imprime o menu (1..4)
         * verifica if (control == 1) -> TRUE
         * executa tabelas de multiplicação para i=1..9
         * para cada i:
         * imprime "Multiplication Table for i"
         * para j=1..9:
         * imprime "i x j = i*j"
         * verifica if (control == 2) -> FALSE (não executa divisão)
         * fim do LOOP 1
         *
         * LOOP 2 (control ainda é 1, então entra no while):
         * imprime novamente os textos e pede entrada
         * entrada do usuário: -1
         * => control = -1
         * imprime o menu (1..4) mesmo assim (pois o while só testa no início)
         * if (control == 1) -> FALSE
         * if (control == 2) -> FALSE
         * fim do LOOP 2
         *
         * Próxima checagem do while:
         * control == -1 -> condição (control != -1) é FALSE -> programa termina.
         */

        while (control != -1) {
            System.out.println("Welcome to the Multiplication Table Generator!");
            System.out.print("Select a number to see its multiplication table (or -1 to exit): ");
            control = scanner.nextInt();
            System.out.println("-------------------------------");
            System.out.println("1. Multiplication Table");
            System.out.println("2. Division Table");
            System.out.println("3. Addition Table");
            System.out.println("4. Subtraction Table");
            System.out.println("-------------------------------");
            if (control == 1) {
                for (int i = 1; i < 10; i++) {
                    System.out.println("-------------------------------");
                    for (int j = 1; j < 10; j++) {
                        System.out.println(i + " x " + j + " = " + (i * j));
                    }
                    System.out.println("-------------------------------");

                }
            }

            if (control == 2) {
                // LÓGICA DA "TABELA DE DIVISÃO"
                // Aqui o "número escolhido" não é usado para calcular uma única tabela.
                // Em vez disso, o código gera várias divisões EXATAS (sem resto) para cada i.
                //
                // Para cada i (1..9), i funciona como o DIVISOR fixo da "tabela".
                // Para cada j (1..9), j é o QUOCIENTE esperado.
                // O dividendo é construído como (i * j), justamente para garantir:
                // (i * j) / i = j (divisão inteira dá exato, porque i é fator do dividendo).
                //
                // Exemplo: i=4, j=7 -> dividendo=28 -> 28 / 4 = 7.

                for (int i = 1; i < 10; i++) {
                    System.out.println("-------------------------------");
                    for (int j = 1; j < 10; j++) {
                        // i * j -> dividendo (múltiplo de i)
                        // i -> divisor
                        // j -> quociente (resultado), pois (i*j)/i simplifica para j
                        System.out.println(i * j + " / " + i + " = " + j);
                    }
                    System.out.println("-------------------------------");

                }
            }
            if (control == 3) {
                // LÓGICA DA "TABELA DE ADIÇÃO"
                for (int i = 1; i < 10; i++) {
                    System.out.println("-------------------------------");
                    for (int j = 1; j < 10; j++) {
                        System.out.println(i + " + " + j + " = " + (i + j));
                    }
                    System.out.println("-------------------------------");

                }
            }

            if(control == 4) {
                // LÓGICA DA "TABELA DE SUBTRAÇÃO"
                for (int i = 1; i < 10; i++) {
                    System.out.println("-------------------------------");
                    for (int j = 1; j < 10; j++) {
                        System.out.println((i + j) + " - " + j + " = " + i);
                    }
                    System.out.println("-------------------------------");

                }
            }
        }
    }
}