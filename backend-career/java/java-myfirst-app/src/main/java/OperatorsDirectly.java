public class OperatorsDirectly {
    public static void main(String[] args) {
        //adding values stored in variables
        int x = 15;
        int y = 25;
        int total = x + y;
        System.out.println("The total of " + x + " and " + y + " is: " + total);

        //using =+ operator directly in print statement
        total += 5;
        System.out.println("After adding 5, the new total is: " + total);

        total -=3;
        System.out.println("After subtracting 3, the new total is: " + total);

        //arithmetic operations
        int difference = y - x;
        System.out.println("The difference between " + y + " and " + x + " is: " + difference);

        //+, -, *, /, %
        int product = x * y;
        System.out.println("The product of " + x + " and " + y + " is: " + product);
        int quotient = y / x;
        System.out.println("The quotient of " + y + " divided by " + x + " is: " + quotient);
        int remainder = y % x; //resto da divisão
        System.out.println("The remainder of " + y + " divided by " + x + " is: " + remainder);


    }
    
}
