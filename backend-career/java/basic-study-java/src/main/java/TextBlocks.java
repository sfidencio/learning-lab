public class TextBlocks {
    public static void main(String[] args) {
        String block = """
                Java
                Programming
                Language
                C++
                """;

        System.out.println(block);
        System.out.println();

        String blockFormatter = """
                Meu nome é %s
                Eu estou aprendendo %s
                Eu gosto de %s
                """.formatted("João", "Java", "programar");
        System.out.println(blockFormatter);
    }
}
