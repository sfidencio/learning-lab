public class Switch__3_PatternMatching {
    public static void main(String[] args) {
        // Pattern Matching for switch
        Object obj = "Text length greater than five";
        String result = switch (obj) {
            case Integer i -> "It's an Integer: " + i;
            case String str when str.length() > 5 -> "It's a long String: " + str;
            case Double d -> "It's a Double: " + d;
            default -> "Unknown type";
        };
        System.out.println(result);
    }
}
