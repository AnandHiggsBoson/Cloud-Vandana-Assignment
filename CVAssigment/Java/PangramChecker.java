import java.util.Scanner;

public class PangramChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase();
        sc.close();
        boolean isPangram = checkPangram(sentence);
        System.out.println("Is a Pangram: " + isPangram);
    }

    private static boolean checkPangram(String sentence) {
        // Assuming the sentence contains only alphabets
        boolean[] alphabetPresent = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            if (Character.isLetter(currentChar)) {
                int index = currentChar - 'a';
                alphabetPresent[index] = true;
            }
        }

        // Check if all alphabets are present
        for (boolean isPresent : alphabetPresent) {
            if (!isPresent) {
                return false; // If any alphabet is not present, it's not a pangram
            }
        }

        return true; // All alphabets are present, it's a pangram
    }
}
