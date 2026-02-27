public class PreAndPosIncrement {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        // Post-increment
        int postIncrementResult = a++;
        System.out.println("Post-increment:");
        System.out.println("Initial value of a: 5");
        System.out.println("Value after post-increment (a++): " + postIncrementResult);
        System.out.println("Value of a after operation: " + a);

        // Pre-increment
        int preIncrementResult = ++b;
        System.out.println("\nPre-increment:");
        System.out.println("Initial value of b: 5");
        System.out.println("Value after pre-increment (++b): " + preIncrementResult);
        System.out.println("Value of b after operation: " + b);
    }
}
