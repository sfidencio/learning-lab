public class RelationalOperators {
    public static void main(String[] args) {
        // Relational operators: >, <, >=, <=, ==, !=
        int a = 10;
        int b = 20;
        if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is not less than " + b);
        }
        System.out.println();

        boolean equals = (a == b);
        boolean notEquals = (a != b);
        boolean difference = (a != b);
        boolean greaterThan = (a > b);
        boolean greaterThanOrEqual = (a >= b);
        boolean lessThanOrEqual = (a <= b);
        boolean lessThan = (a < b);

        System.out.println("Equals: " + equals);
        System.out.println("Not Equals: " + notEquals);
        System.out.println("Difference: " + difference);
        System.out.println("Greater Than: " + greaterThan);
        System.out.println("Greater Than Or Equal: " + greaterThanOrEqual);
        System.out.println("Less Than Or Equal: " + lessThanOrEqual);
        System.out.println("Less Than: " + lessThan);

    }
}