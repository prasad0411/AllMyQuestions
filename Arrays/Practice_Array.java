
package ARRAYS;

//import java.util.Scanner;

public class Practice_Array {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // PRACTICE 1
        // SUM OF AN ARRAY
        // float arr[] = new float[5];
        // System.out.println("Enter 5 float array values ");
        // for (int i = 0; i < 5; i++) {
        // arr[i] = sc.nextFloat();
        // }
        // float sum = 0.f;
        // for (int i = 0; i < 5; i++) {
        // sum = sum + arr[i];
        // }
        // System.out.println("Sum of the 5 float values is : " + sum);

        // PRACTICE 2
        // TO CHECK IF AN ELEMENT EXISTS IN THE ARRAY OR NOT
        // float arr[] = new float[5];
        // System.out.println("Enter 5 int array values ");
        // for (int i = 0; i < 5; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("Enter a long value that you want to search in array");
        // int input = sc.nextInt();
        // int flag = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == input) {
        // flag = 1;
        // System.out.println("Element exists in the given array at index : " + i);
        // break;
        // } else {
        // flag = 0;
        // }
        // }
        // if (flag == 0)
        // System.out.println("Element does not exist in the given array");

        // PRACTISE 3
        // AVG OF 5 STUDENTS IN AN ARRAY
        // int students[] = new int[5];
        // int sum = 0;
        // System.out.println("Enter marks of 5 students :");
        // for (int i = 0; i < students.length; i++) {
        // students[i] = sc.nextInt();
        // sum += students[i];
        // }

        // float average = sum / 5;
        // System.out.println("Dsiplaying average marks of 5 students in Physics
        // subject: = " + average);

        // PRACTICE 4
        // ADDING THE TWO ARRAYS
        // int array1[][] = new int[2][3];
        // int array2[][] = new int[2][3];
        // System.out.println("Enter elements for array 1: = ");

        // // TAKING USER INPUT FOR ARRAY ELEEMTS
        // // ROW
        // for (int i = 0; i < array1.length; i++) {
        // // COLUMN
        // System.out.println("Row number : " + i);
        // for (int j = 0; j < array1[i].length; j++) {
        // array1[i][j] = sc.nextInt();
        // }
        // }
        // System.out.println("\nEnter elements for array 2: = ");
        // for (int i = 0; i < array2.length; i++) {
        // System.out.println("Row number : " + i);
        // for (int j = 0; j < array2[i].length; j++) {
        // array2[i][j] = sc.nextInt();
        // }
        // }

        // // ADDING THE TWO ARRAYS
        // System.out.println("\nAddition of the two arrays is: ");
        // for (int i = 0; i < array1.length; i++) {
        // for (int j = 0; j < array1[i].length; j++) {
        // System.out.print(array1[i][j] + array2[i][j] + " ");
        // }
        // System.out.println(" ");
        // }
        // String arr[] = {"",""};

        // PRACTICE 6
        // FINDING LARGEST ELEMENT IN THE ARRAY
        // int arr1[] = new int[10];
        // System.out.println("Enter elements of array :");
        // for (int i = 0; i < arr1.length; i++) {
        // arr1[i] = sc.nextInt();
        // }
        // int max = arr1[0];
        // for (int i = 0; i < arr1.length; i++) {
        // if (arr1[i] > max)
        // max = arr1[i];
        // }
        // System.out.println("Largest element in this array is : " + max);

        // PRACTICE 7
        // FINDING SMALLEST ELEMENT IN THE ARRAY
        // int arr1[] = new int[5];
        // System.out.println("Enter elements of array :");
        // for (int i = 0; i < arr1.length; i++) {
        // arr1[i] = sc.nextInt();
        // }
        // int min = arr1[0];
        // for (int i = 0; i < arr1.length; i++) {
        // if (arr1[i] < min) {
        // min = arr1[i];
        // }
        // }
        // System.out.println("Smallest element in this array is : " + min);

        // PRACTICE 8
        // FINDING IF ARRAY IS SORTED OR NOT
        // int arr1[] = new int[5];
        // boolean flag = true;
        // System.out.println("Enter elements of array :");
        // for (int i = 0; i < arr1.length; i++) {
        // arr1[i] = sc.nextInt();
        // }
        // for (int i = 0; i < arr1.length - 1; i++) {
        // if (arr1[i] > arr1[i + 1]) {
        // flag = false;
        // break;
        // }
        // }
        // if (flag) {
        // System.out.println("Array is sorted.");
        // }

        // else {
        // System.out.println("Array isn't sorted.");
        // }

        int i = 0;
        int j = 1;
        int count, num, sum;
        num = 10;
        System.out.print(i + " ");
        System.out.print(j);
        for (count = 2; count < num; count++) {
            sum = i + j;
            i = j;
            j = sum;
            System.out.print(" " + sum);
        }
    }

}
