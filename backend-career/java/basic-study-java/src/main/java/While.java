import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int examGrade = 0;
        double media = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (examGrade != -1) {
            System.out.print("Enter exam grade (-1 to finish): ");
            examGrade = scanner.nextInt();
            if (examGrade != -1) {
                media += examGrade;
                count++;
            }

        }

        if (count > 0) {
            media = media / count;
            System.out.println("Average grade: " + media);
        } else {
            System.out.println("No grades were entered.");
        }
        scanner.close();
    }
}
