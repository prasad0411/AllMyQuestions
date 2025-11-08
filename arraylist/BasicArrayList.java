package arraylist;

import java.util.ArrayList;

public class BasicArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrL = new ArrayList<>();
        arrL.add(0, "10");
        arrL.add(1, "20");
        System.out.println(arrL);

        System.out.println("\n\nfor loop: =>");
        for (int i = 0; i < arrL.size(); i++) {
            System.out.print("\nith index is:: " + arrL.get(i));
        }

        System.out.println("\n\nfor each way: =>");
        for (String str : arrL) {
            System.out.print("\n\nith index is:: " + str);

        }
    }
}
