

import java.util.ArrayList;
import java.util.HashSet;

public class Basics {
    public static void main(String[] args) {
        int arr[] = new int[] {};
        HashSet<String> hashSet = new HashSet<>();
        System.out.println("HashSet size: " + hashSet.size());
        System.out.println("Array size: " + arr.length);
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add(0, "a");
        arrayList.add(1, "b");
        System.out.println(arrayList);
        System.out.println();
        System.out.println(arrayList.get(1));

        System.out.println(arrayList.contains("a"));
    }
}
