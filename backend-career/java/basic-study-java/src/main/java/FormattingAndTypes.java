public class FormattingAndTypes {
    public static void main(String[] args) {
        int number = 42;
        double decimal = 3.14159;
        String text = "Hello, World!";

        // Using printf for formatted output
        System.out.printf("Number %d%n", number);
        System.out.printf("Number Decimal %.3f%n", decimal);
        System.out.printf("Text: %s%n", text);

        byte byteValue = 101;
        short shortValue = byteValue;
        System.out.println("Short value: " + shortValue);

        char charValue = (char) byteValue;
        System.out.println("Char value: " + charValue);

        char quote = 34; // ASCII value for double quote
        System.out.println("Quoted text: " + quote + text + quote);

        char backslash = 92; // ASCII value for backslash
        System.out.println("Path: " + backslash + "usr" + backslash + "local" + backslash + "bin");

        double largeNumber = 1234567.89;
        int smallNumber = (int) largeNumber;
        System.out.println("Small number: " + smallNumber);

        String name = "Alice";
        int age = 30;
        System.out.println(name + " is age -> " + age);

    }
}
