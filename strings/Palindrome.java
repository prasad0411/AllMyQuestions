package strings;

// CHECK IF A STRING IS PALINDROME, WHEN CONSISTING OF NON ALPHANUMERIC CHARACTERS

public class Palindrome {
    public static void main(String[] args) {
        String s1 = "Ard^&#^  ";
        if (s1 == null || s1.length() == 0) {
            System.out.println("Invalid array");
            return;
        }
        System.out.println("Brute Force => String is Palindrome? " + bruteForce(s1));
    }

    // TC: O(n). Traversing through the entire array once to remove unnecesary
    // characters
    // Traversing through the result array to check if Palindrome
    // SC: O(n). Creating a new result array

    public static boolean bruteForce(String s1) {
        s1 = s1.trim().toLowerCase();
        char resultString[] = new char[s1.length()];
        int resultStringPointer = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (!Character.isLetterOrDigit(s1.charAt(i))) {
                continue;
            }
            resultString[resultStringPointer++] = s1.charAt(i);
        }

        for (int left = 0, right = resultStringPointer - 1; left < right; left++, right--) {
            if (resultString[left] != resultString[right]) {
                return false;
            }
        }
        return true;
    }

    // TC: O(n). Traversing through the entire array once to remove unnecesary
    // characters
    // Traversing through the result array to check if Palindrome
    // SC: O(n). Creating a new result array

    public static boolean optimalApproach(String s1) {
        // String s1 = "aabbaa";
        s1 = s1.trim().toLowerCase();
        int leftPointer = 0;
        int rightPointer = s1.length() - 1;

        while (leftPointer < rightPointer) {
            while (!Character.isLetterOrDigit(s1.charAt(leftPointer)) && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (!Character.isLetterOrDigit(s1.charAt(rightPointer)) && leftPointer < rightPointer) {
                rightPointer--;
            }
            if (s1.charAt(leftPointer) != s1.charAt(rightPointer))
                return false;
            leftPointer++;
            rightPointer--;
        }
        return true;
    }
}
