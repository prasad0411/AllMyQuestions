package ARRAYS;

import java.util.HashSet;

// REMOVE DUPLICATE NUMBERS FROM AN ARRAY, IN PLACE
// RETURN THE NUMBER OF UNIQUE ELEMENTS IN THE ARRAY

// Input: [1, 2, 2, 3];
// Output: 3

// Input: [ 0, 0, 0];
// Output: 1

public class RemoveDuplicates {
    public static void main(String[] args) {
        
        int nums[] = new int[] { 0, 0, 0 };
        if (nums == null || nums.length == 0) {
            System.out.println("Invalid input array");
            return;
        }
        if (nums.length < 2) {
            System.out.println("Size of valid array is: " + nums.length);
            return;
        }
        System.out.println((notInPlace(nums)));
    }

    // TC: O(n) Using 1 loop to traverse all elements.
    // SC: O(n) Creation of hashSet and extra array to store the unique elements

    public static int notInPlace(int[] nums) {
        System.out.print("Not in place approach. Size of valid array is: ");
        HashSet<Integer> hashSet = new HashSet<>(nums.length);
        int finalArray[] = new int[nums.length];
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!hashSet.contains(nums[i])) {
                hashSet.add(nums[i]);
                finalArray[j++] = nums[i];
            }
        }
        return j;
    }

    // TC: O(n) Using 1 loop to traverse all elements.
    // SC: O(n) Modifying the array in place

    public static int inPlace(int[] nums) {
        System.out.print("In place approach. Size of valid array is: ");
        int uniquePointer = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniquePointer]) {
                uniquePointer++;
                nums[uniquePointer] = nums[i];
            }
        }
        return uniquePointer + 1; // number of unique elements
    }

    public static int inPlace2(int[] nums) {
        System.out.print("In place approach. Size of valid array is: ");
        // 1,1,2,2,3,3,4

        for (int i = 0; i < nums.length; i++) {

        }
        return 0;
    }
}
