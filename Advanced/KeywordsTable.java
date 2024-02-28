package Advanced;

public class KeywordsTable {
    public static void main(String[] args) {
        String[] keywords = {
            "abstract", "continue", "for", "new", "switch",
            "assert", "default", "goto", "package", "synchronized",
            "boolean", "do", "if", "private", "this",
            "break", "double", "implements", "protected", "throw",
            "byte", "else", "import", "public", "throws",
            "case", "enum", "instanceof", "return", "transient",
            "catch", "extends", "int", "short", "try",
            "char", "final", "interface", "static", "void",
            "class", "finally", "long", "strictfp", "volatile",
            "const", "float", "native", "super", "while"
        };
        
        int columns = 5;
        int rows = (int) Math.ceil((double) keywords.length / columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int index = i + j * rows;
                if (index < keywords.length) {
                    System.out.printf("%-12s", keywords[index]);
                }
            }
            System.out.println();
        }
    }
}

