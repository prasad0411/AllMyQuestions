package ARRAYS;

// AN ARRAY IS GIVEN, NEED TO RETURN THE MINIMUM AND MAXIMUM ELEMENT FROM THE ARRAY  

// Input: [1, 5, 7, -1, 33, 444, 11]  
// Output: Minimum = -1, Maximum = 444  

// Input: [10, 20, 5, 40, 30]  
// Output: Minimum = 5, Maximum = 40 

public class MinimumAndMaximumNumber {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3 };

        if (array == null || array.length == 0) {
            System.out.println("Invalid array");
            return;
        }
        if (array.length < 2) {
            System.out.println("min and max number is :" + array[0]);
            return;
        }

        int[] min_max = optimalApproach(array);
        System.out.print("Mininum number is: " + min_max[0] + ". Maximum number is: " + min_max[1]);
    }

    // Time Complexity: O(n).
    // We are traversing through all elements from the array
    // Space Complexity: O(1).
    // No need to create a new data structure. Just 2 temp variables to store min
    // and max values

    public static int[] optimalApproach(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        int maxnumber = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxnumber)
                maxnumber = array[i];
            if (array[i] < minNumber)
                minNumber = array[i];
        }
        return new int[] { minNumber, maxnumber };
    }
}
