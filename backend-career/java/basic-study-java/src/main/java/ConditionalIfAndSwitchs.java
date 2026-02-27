public class ConditionalIfAndSwitchs {
    public static void main(String[] args) {
        // Movie
        String movieName = "Terminator";
        int releaseYear = 1984;
        boolean includeThePlan = true;
        String typePlan = "plus";

        if (movieName.equals("Terminator") && releaseYear == 1984) {
            System.out.println("Great movie!");
            if (includeThePlan) {
                System.out.println("Including the plan in the discussion.");
            } else {
                System.out.println("Not including the plan.");
            }
        } else if (movieName.equals("Inception")) {
            System.out.println("Mind-bending movie!");
        } else {
            System.out.println("Just another movie.");
        }

        // Using {} for single statements - //O mesmo vale para loops etc.
        int score = 85;
        if (score >= 90)
            System.out.println("Grade A");
        else if (score >= 80)
            System.out.println("Grade B");

        if (includeThePlan && typePlan.equals("plus"))
            System.out.println("Plan included.");

        switch (typePlan) {
            case "plus":
                System.out.println("Plus Plan selected.");
                break;
            default:
                System.out.println("Standard Plan selected.");
                break;
        }

    }
}
