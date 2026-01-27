public class UsingPrints {
    public static void main(String[] args) {
        //print, printf, println
        System.out.print("Test01");
        System.out.print("Test02");
        //Output: Test01Test02

        System.out.printf("%nTest03%n");
        //Output:
        //Test03
        System.out.println("Test04");
        //Output: Test04

        System.out.printf("Hello, %s!,%n %d,%n %.3f%n", "User", 10, 5.56789);
        //Output:
        //Hello, User!
        //10
        //5.57  

    }
}
