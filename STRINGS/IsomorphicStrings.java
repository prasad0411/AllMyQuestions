package STRINGS;

import java.util.HashMap;

// CHECK IF IN THE GIVEN STRINGS, CHARACTERS OF 'S' CAN BE REPLACED TO GET 'T' 

public class IsomorphicStrings {
    public static void main(String[] args) {
        String string1 = "egg";
        String string2 = "add";
        System.out.println("String 1: " + string1 + "\nString 2: " + string2);
        System.out.println(checkIsomorphic(string1, string2));
    }

    public static boolean checkIsomorphic(String string1, String string2) {
        if (string1 == null || string2 == null || string1.length() != string2.length())
            return false;

        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i < string1.length(); i++) {
            hashMap1.put(string1.charAt(i), hashMap1.getOrDefault(string1.charAt(i), 0) + 1);
            hashMap2.put(string2.charAt(i), hashMap2.getOrDefault(string2.charAt(i), 0) + 1);
        }

        if (!hashMap1.equals(hashMap2))
            return false;
        return true;
    }
}
