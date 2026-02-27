import java.util.Scanner;

class PalindromeCheckerhello {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
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
            System.out.println("It is a palindrome!");
        } else {
            System.out.println("It is NOT a palindrome.");
        }

        scanner.close();
    }
}