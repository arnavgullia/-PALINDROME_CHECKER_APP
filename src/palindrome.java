import java.util.Scanner;
class PalindromeChecker {

    // Method to check if a string is palindrome
    public static boolean isPalindrome(String input) {
        // Remove spaces and convert to lowercase
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App ===");
        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("✅ It is a palindrome!");
        } else {
            System.out.println("❌ It is NOT a palindrome.");
        }

        scanner.close();
    }
}