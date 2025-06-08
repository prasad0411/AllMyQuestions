package ARRAYS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {
    public static void main(String[] args) {
        int arr1[] = { 4, 5, 6, 99, 6666 };
        System.out.print("Original array 1 is: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.print("\nOriginal array 2 is: ");

        int arr2[] = { 2, 3, 4, 5, 99 };
        for (int num : arr2) {
            System.out.print(num + " ");
        }

        System.out.println("\nUnion of 2 sorted arrays is: " + bruteForce(arr1, arr2));
    }

    // TC: O(M + N + K log K)
    // M + N TO ADD ELEMENTS FROM 2 ARRAYS TO SET
    // K LOG K TO SORT UNIQUE ELEMENTS FROM ARRAY LIST

    // SC: O(M + N)
    // SIZE OF ARRAYS M AND N

    private static ArrayList<Integer> bruteForce(int[] arr1, int[] arr2) {
        ArrayList<Integer> arraylist = new ArrayList<>(); // maintain dynamic size of array
        Set<Integer> set = new HashSet<>(); // maintains unique elements from both arrays
        int leftP = 0;
        int rightP = 0;

        while (leftP < arr1.length && rightP < arr2.length) {
            if (arr1[leftP] < arr2[rightP]) {
                if (!(set.contains(arr1[leftP]))) {
                    set.add(arr1[leftP]);
                    leftP++;
                }
            } else if (arr2[rightP] < arr1[leftP]) {
                if (!(set.contains(arr2[rightP]))) {
                    set.add(arr2[rightP]);
                }
                rightP++;
            } else {
                if (!(set.contains(arr1[leftP]))) {
                    set.add(arr1[leftP]);
                }
                leftP++;
                rightP++;
            }
        }

        while (leftP < arr1.length) { // traverse elements that are left from array 1
            if (!(set.contains(arr1[leftP]))) {
                set.add(arr1[leftP]);
            }
            leftP++;
        }

        while (rightP < arr2.length) { // traverse elements that are left from array 2
            if (!(set.contains(arr2[rightP]))) {
                set.add(arr2[rightP]);
            }
            rightP++;
        }

        for (int num : set) { // add all unique elements from HashSet to arraylist
            arraylist.add(num);
        }

        Collections.sort(arraylist); // sort the array list as hashset does not store elements in order of insertion
        return arraylist;
    }
}