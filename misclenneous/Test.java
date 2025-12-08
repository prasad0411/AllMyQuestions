package misclenneous;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.println("F");
                break;
            }
            if (i % 5 == 0) {
                System.out.println("B");
                break;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("xyz");
                break;
            }

        }

        String array[] = new String[] { "a", "b", "c" };
        Arrays.sort(array);

        String newArray[] = Arrays.copyOf(array, array.length);

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        // System.out.println(("\n"+Arrays.equalsIgnoreCase(array, newArray)));

        String a = "bfg ";
        String b = "asa";
        boolean c = a.equalsIgnoreCase(b);
        System.err.println(a.charAt(0));
        System.out.println(c);
    }
} 