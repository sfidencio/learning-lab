public class Switch__2 {
    public static void main(String[] args) {
        int day = 3;
        // Using switch expression to assign a value to dayName
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            default -> "Invalid day";
        };

        System.out.println("Day " + day + " is " + dayName);

        System.out.println("-------------------");

        // Using yeld in switch statement
        String dayName2 = switch (day) {
            case 1, 2 -> "Monday or Tuesday";
            case 3 -> {
                String name = "Wednesday";
                yield name; // Using yield to return value from block
            }
            case 4 -> "Thursday";
            default -> "Invalid day";
        };
        System.out.println("Day " + day + " is " + dayName2);
    }
}
