package hashmap;

import java.util.*;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        System.out.println(map.size());

        map.put(1, "A");
        map.put(22, "V");
        map.put(66663, "B");
        map.put(24, "D");
        map.put(-15, "BF");
        map.put(-15, "BBF");

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("BasBF"));

        System.out.println(map);
        System.out.println("\n" + map.size());

        int arr[] = { 1, 2, 3 };
        System.out.println("Printing array values");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // for (int i : map) {

        // }

        // System.out.println(map.);

        // System.out.println(map.);

        // System.out.println(map.);

        // System.out.println(map.);

        // System.out.println(map.);

        // System.out.println(map.);
        System.out.println("\n\nPrinting hash map values");
        System.out.println(map + " ");
    }
}
