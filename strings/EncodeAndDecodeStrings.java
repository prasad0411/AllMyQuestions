package strings;

// GIVEN STRINGS, NEED TO ENCODE THEM AS WELL AS DECODE THEM
// BRUTE FORCE APPROACH IS PENDING

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {
    public static void main(String[] args) { 
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Test");
        arrayList.add("Book");
        arrayList.add("Dummy");
        arrayList.add("Bottle");
        if (arrayList.size() < 1) {
            System.out.println("Input is too small");
        }
        decode(encode(arrayList));
    }

    public static String encode(ArrayList<String> inputString) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputString.size(); i++) {
            sb.append(inputString.get(i).length()).append("#").append(inputString.get(i));
        }
        return sb.toString();
    }

    public static List<String> decode(String str) {
        // 4#neet4#code4#love3#you
        ArrayList<String> decodedArrayList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);
            int currentSize = (int) currentCharacter;
            decodedArrayList.add(str.substring(i + 2, currentSize));
        }
        return decodedArrayList;
    }
}
