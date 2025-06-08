public class StringConditionExample {
    public static void main(String[] args) {
        String sentence = "I am proud vritian";

        // 1. Check if sentence contains the word "proud"
        if (sentence.contains("proud")) {
            System.out.println("You are proud!");
        }

        // 2. Check if sentence starts with "I"
        if (sentence.startsWith("I")) {
            System.out.println("The sentence starts with 'I'.");
        } else {
            System.out.println("The sentence does not start with 'I'.");
        }

        // 3. Check if the word "vritian" is present
        if (sentence.endsWith("vritian")) {
            System.out.println("You are a VRITIAN!");
        } else {
            System.out.println("You are not a VRITIAN.");
        }

        // 4. Use switch on each word
        String[] words = sentence.split(" ");
        for (String word : words) {
            switch (word.toLowerCase()) {
                case "i":
                    System.out.println("Found word: I");
                    break;
                case "am":
                    System.out.println("Found word: am");
                    break;
                case "proud":
                    System.out.println("Found word: proud");
                    break;
                case "vritian":
                    System.out.println("Found word: vritian");
                    break;
                default:
                    System.out.println("Other word: " + word);
            }
        }
    }
}