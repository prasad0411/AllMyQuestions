package queues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class QueuesPractice {
    public static void main(String[] args) {

    }

    public static List<Integer> getSeatsAllocation(List<Integer> arr) {
        int size = arr.size();

        if (size == 0) {
            return new ArrayList<>();
        }

        if (size == 1) {
            return new ArrayList<>(arr);
        }

        int result[] = new int[size];
        Set<Integer> seatsOccupied = new HashSet<>();
        Queue<int[]> queue = new ArrayDeque<>();

        // process all records from the original List
        for (int i = 0; i < size; i++) {
            queue.add(new int[] { i, arr.get(i) });
        }

        while (!queue.isEmpty()) {
            int[] person = queue.poll();
            int personIndex = person[0];
            int seatPreference = person[1];

            if (!seatsOccupied.contains(seatPreference)) {
                result[personIndex] = seatPreference;
                seatsOccupied.add(seatPreference);
            } else {
                queue.add(new int[] { personIndex, seatPreference + 1 });
            }
        }

        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            resultList.add(result[i]);
        }
        return resultList;
    }

}
