package basic;

import java.util.Arrays;

// Problem understanding: Given a list of numbers, i want to find the largest element from that list.
// for output, i need to return a single number

// constaints: can there be -ve numbers, if so, then initialization changes
// is the list sorted? 
// are there duplicates? 
// for eg: 10, -100, 1, 2, -3 

// dry run: 
// input: 1,10, 2
// output: 10

// input: -112, -20, 0
// output: 0

// bruteForce

public class Practise {
    public static void main(String[] args) {
        int originalArr[] = new int[] { -1, -11, 0, 11, 2, 3 };
        System.out.println("Largest element in the array is: " + optimalApproach(originalArr));
    }

    public static int bruteForce(int[] originalArr) {
        Arrays.sort(originalArr);
        return originalArr[originalArr.length - 1];
    }

    public static int optimalApproach(int[] originalArr) {
        int largestNum = originalArr[0];
        for (int i = 1; i < originalArr.length; i++) {
            if (originalArr[i] > largestNum)
                largestNum = originalArr[i];
        }
        return largestNum;
    }
}
