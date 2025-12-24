import java.util.Arrays;

public class AppleRedistributionIntoBoxes {
    public static void main(String[] args) {
        int[] apple = { 1, 3, 2 };
        int[] capacity = { 1, 2, 3, 4, 5 };
        System.out.println("Apples capacity is: " + Arrays.toString(apple));
        System.out.println("Capacities are: " + Arrays.toString(capacity));
        System.out.println("Capacity count needed: " + minimumBoxes(apple, capacity));
    }

    public static int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);

        int sum = 0;
        for (int i = 0; i < apple.length; i++) {
            sum += apple[i];
        }

        int count = 0;
        int boxCapacity = 0;
        for (int i = capacity.length - 1; i >= 0; i--) {
            boxCapacity += capacity[i];
            count++;

            if (boxCapacity >= sum) {
                break;
            }
        }

        return count;
    }
}
