package strings;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = null;
        System.out.println("String 1 is: " + s1 + "\nString 2 is: " + s2);
        System.out.println("Are both the strings isomorphic?: " + isIsomorphic(s1, s2));
    }

    public static boolean isIsomorphic(String s, String t) {
        if ((s == null && t == null) || (s.length() != t.length())) {
            return false;
        }

        if (s.isBlank() && t.isBlank()) {
            return true;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentString1Char = s.charAt(i);
            char currentString2Char = t.charAt(i);

            map1.put(currentString1Char, map1.getOrDefault(currentString1Char, 0) + 1);
            map2.put(currentString2Char, map2.getOrDefault(currentString2Char, 0) + 1);
        }

        return map1.size() == map2.size();
    }
}
