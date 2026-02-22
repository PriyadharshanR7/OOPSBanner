public class  OOPSBannerApp_4 {
    public static void main(String[] args) {

        // Declare array (size = 7 lines)
        String[] banner = new String[7];

        // Initialize each line using index
        banner[0] = String.join(" ", "  *****  ", "  *****  ", " ******* ", " ******* ");
        banner[1] = String.join(" ", " *     * ", " *     * ", " *     * ", " *     * ");
        banner[2] = String.join(" ", " *     * ", " *     * ", " *     * ", " *       ");
        banner[3] = String.join(" ", " *     * ", " *     * ", " ******  ", "  *****  ");
        banner[4] = String.join(" ", " *     * ", " *     * ", " *       ", "       * ");
        banner[5] = String.join(" ", " *     * ", " *     * ", " *       ", " *     * ");
        banner[6] = String.join(" ", "  *****  ", "  *****  ", " *       ", "  *****  ");

        // Print banner using for-each loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}