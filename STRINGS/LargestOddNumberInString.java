package strings;

// RETURN THE LARGEST VALUED ODD INTEGER FROM THE STRING
// IF THERE IS NO SUCH NUMBER, RETURN ""

// Input: "52"
// Output: "5"

// Input: "4206"
// Output: ""

// Input: "35427"
// Output: "35427"

class LargestOddNumberInString {
    public static void main(String[] args) {
        String string = "35427";
        System.err.println("Original string is: " + string);
        System.err.println("Largest Odd number in the string is: " + largestOddNumber(string));
    }

    // APPROACH: Traverse entire array from the end to the string to check if
    // current digit is odd
    // If yes, return the substring from start till the current index
    // If no, keep decrementing the pointer

    // TC: O(n) - Linear search across the entire array
    // SC: O(1). No new data structure.
    public static String largestOddNumber(String num) {

        // EDGE CASE: string is null or blank (checks for whitespaces and empty string)
        if (num == null || num.isBlank())
            return "";

        // ALL OTHER CASES
        String ans = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return ans;
    }
}