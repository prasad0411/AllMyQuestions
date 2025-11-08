package strings;

// REMOVE DUPLICATES FROM A STRING

// INPUT: abbaca
// OUTPUT: ca

// INPUT: azxxzy
// OUTPUT: az

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String s = "abbaca";
        if (s.length() == 0 || s == null)
            return;
        System.out.println(bruteForce(s));
    }

    public static String bruteForce(String s) {
        System.out.println("Brute force approach: ");
        StringBuilder s1 = new StringBuilder();
        // abbaca
        // aaca
        // ca

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1))
                s1.append(s.charAt(i));
        }
        return s1.toString();
    }
}
