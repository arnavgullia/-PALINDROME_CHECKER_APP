import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean checkUsingReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static boolean checkUsingTwoPointer(String str) {
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

    public static boolean checkUsingLoop(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return str.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        long start1 = System.nanoTime();
        boolean result1 = checkUsingReverse(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        long start2 = System.nanoTime();
        boolean result2 = checkUsingTwoPointer(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        long start3 = System.nanoTime();
        boolean result3 = checkUsingLoop(input);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        System.out.println("\nResults:");
        System.out.println("Reverse Method: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Two Pointer Method: " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Loop Reverse Method: " + result3 + " | Time: " + time3 + " ns");

        scanner.close();
    }
}