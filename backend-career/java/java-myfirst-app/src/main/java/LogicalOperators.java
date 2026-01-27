public class LogicalOperators {
    public static void main(String[] args) {
        // Demonstrating logical operators
        boolean a = true;
        boolean b = false;

        // Logical AND
        boolean andResult = a && b;
        System.out.println("Logical AND (true && false): " + andResult);

        // Logical OR
        boolean orResult = a || b;
        System.out.println("Logical OR (true || false): " + orResult);

        // Logical NOT
        boolean notResult = !a;
        System.out.println("Logical NOT (!true): " + notResult);
    }
}