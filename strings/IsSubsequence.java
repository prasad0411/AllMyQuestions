package strings;

public class IsSubsequence {
    public static boolean bruteForce(String s, String t) {
        int i, j;
        i = j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j))
                i++;
            j++;
        }

        return i == s.length();
    }

    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println("S1: " + s);
        System.out.println("S2: " + t);
        System.out.println("Is subsequence? " + bruteForce(s, t));
    }

}
