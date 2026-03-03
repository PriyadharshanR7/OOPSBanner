import java.util.HashMap;

public class UC8 {

    // ===============================
    // Method to Create Character Map
    // ===============================
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

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

        // Put patterns into HashMap
        charMap.put('O', oPattern);
        charMap.put('P', pPattern);
        charMap.put('S', sPattern);
        charMap.put(' ', spacePattern);

        return charMap;
    }

    // ===============================
    // Method to Display Banner
    // ===============================
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        message = message.toUpperCase();
        int patternHeight = 7;

        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.get(ch);

                if (pattern != null) {
                    sb.append(pattern[line]).append("  ");
                }
            }

            System.out.println(sb.toString());
        }
    }

    // ===============================
    // Main Method
    // ===============================
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        displayBanner("OOPS", charMap);
    }
}