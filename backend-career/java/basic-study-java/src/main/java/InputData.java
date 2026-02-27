import java.util.Scanner;



public class InputData {
    public static void main(String[] args) {
        // don't here hard code values
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter name movie:");
        String movieName = in.nextLine();
        System.out.print("Please enter release year:");
        //if you enter a non-integer value here, it will throw an InputMismatchException
        int releaseYear = in.nextInt();
        System.out.print("Include the plan (true/false):");
        boolean includeThePlan = in.nextBoolean();
        System.out.print("Type of plan (standard/plus):");
        String typePlan = in.next();
        System.out.printf("Movie: %s, Year: %d, Include Plan: %b, Type of Plan: %s%n",
                movieName, releaseYear, includeThePlan, typePlan);
        in.close(); // close the scanner, good practice to release resources
    }
}
