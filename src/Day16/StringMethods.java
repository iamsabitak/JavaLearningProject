package Day16;

public class StringMethods {
    public static void main(String[] args) {
        String str = " Hello, World! ";

        System.out.println("1. Length: " + str.length());

        System.out.println("2. Character at index 1: " + str.charAt(1));

        System.out.println("3. Substring from index 7: " + str.substring(7));

        System.out.println("4. Substring from index 2 to 5: " + str.substring(2, 5));

        System.out.println("5. Lowercase: " + str.toLowerCase());

        System.out.println("6. Uppercase: " + str.toUpperCase());

        System.out.println("7. Trimmed: '" + str.trim() + "'");

        System.out.println("8. Replace 'l' with 'p': " + str.replace('l', 'p'));

        System.out.println("9. Replace all 'l' with 'x': " + str.replaceAll("l", "x"));

        System.out.println("10. Equals ' Hello, World! ': " + str.equals(" Hello, World! "));
        System.out.println("10. Equals ' sabita ': " + str.equals("sabita"));

        System.out.println("11. Equals ignore case ' hello, world! ': " + str.equalsIgnoreCase(" hello, world! "));

        System.out.println("12. Starts with ' H': " + str.startsWith(" H"));

        System.out.println("13. Ends with 'd! ': " + str.endsWith("d! "));

        System.out.println("14. Index of 'l': " + str.indexOf('l'));

        System.out.println("15. Last index of 'l': " + str.lastIndexOf('l'));

        String emptyStr = "";
        System.out.println("16. Is string empty: " + emptyStr.isEmpty());

        System.out.println("17. Concatenate with ' Java': " + str.concat(" Java"));

        String[] parts = str.split(",");
        System.out.print("18. Split by ',': ");
        for (String part : parts) {
            System.out.print("'" + part + "' ");
        }
        System.out.println();

        int number = 10;
        System.out.println("19. Value of number 10: " + String.valueOf(number));

        System.out.println("20. Contains 'World': " + str.contains("World"));
    }
}
