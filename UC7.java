public class UC7 {

    // ==========================
    // Inner Class
    // ==========================
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getters
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // ==========================
    // Create Character Pattern Maps
    // ==========================
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] oPattern = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] pPattern = {
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] sPattern = {
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };

        String[] spacePattern = {
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   "
        };

        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        charMaps[0] = new CharacterPatternMap('O', oPattern);
        charMaps[1] = new CharacterPatternMap('P', pPattern);
        charMaps[2] = new CharacterPatternMap('S', sPattern);
        charMaps[3] = new CharacterPatternMap(' ', spacePattern);

        return charMaps;
    }

    // ==========================
    // Get Pattern for Character
    // ==========================
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null;
    }

    // ==========================
    // Print Banner Message
    // ==========================
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        message = message.toUpperCase();
        int height = 7; // pattern height

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < message.length(); j++) {

                String[] pattern = getCharacterPattern(message.charAt(j), charMaps);

                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                }
            }
            System.out.println();
        }
    }

    // ==========================
    // Main Method
    // ==========================
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        printMessage("OOPS", charMaps);
    }
}