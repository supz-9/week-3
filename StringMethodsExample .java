public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "I AM PROUD VRITIAN";

        // Length of the string
        System.out.println("Length: " + str.length());

        // Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Trim spaces
        System.out.println("Trimmed: " + str.trim() + ".");

        // Character at index 5
        System.out.println("Character at index 5: " + str.charAt(5));

        // Index of "PROUD"
        System.out.println("Index of 'PROUD': " + str.indexOf("PROUD"));

        // Last index of "I"
        System.out.println("Last index of 'I': " + str.lastIndexOf("I"));

        // Substring from index 5 to 10
        System.out.println("Substring (5 to 10): " + str.substring(5, 10));

        // Replace "VRITIAN" with "STUDENT"
        System.out.println("Replace 'VRITIAN' with 'STUDENT': " + str.replace("VRITIAN", "STUDENT"));

        // Check if it contains "AM"
        System.out.println("Contains 'AM': " + str.contains("AM"));

        // Check if the string is empty
        System.out.println("Is empty: " + str.isEmpty());

        // Compare with another string
        System.out.println("Equals 'I AM PROUD VRITIAN': " + str.equals("I AM PROUD VRITIAN "));

        // Split into words
        String[] words = str.trim().split(" ");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}