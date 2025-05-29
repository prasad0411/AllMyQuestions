package ARRAYS;

//CHECK IF THERE ARE DUPLICATE ARRAY ELEMENTS
//TC: 0(n^2)
//SC: 1
//SUBMITTED ON LEETCODE

//import java.util.*;

public class ArrayDuplicate {
    static boolean containsDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int arr[] = new int[] { 1, 21,1, 5 };
        // ArrayDuplicate obj = new ArrayDuplicate();
        // System.out.println(obj.containsDuplicate(arr));

        if (containsDuplicate(arr) == true)
            System.out.println("Duplicate elements exist");
        else
            System.out.println("Duplicate elements do not exist");

    }

}