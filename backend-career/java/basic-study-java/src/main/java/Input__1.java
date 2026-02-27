import java.util.Scanner;

public class Input__1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        System.out.println("You entered: " + i);
        input.close();
    }

    private static int calcFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcFactorial(n - 1);
        }
    }
}
