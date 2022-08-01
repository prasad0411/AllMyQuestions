public class ArrayBuySellStock {
    public int buySell(int[] arr) {

        int minSoFar = arr[0];
        int maxProfit = 0;
        int profit;

        for (int i = 0; i < arr.length; i++) {
            minSoFar = Math.min(minSoFar, arr[i]);
            profit = arr[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 8 };
        ArrayBuySellStock obj = new ArrayBuySellStock();
        System.out.println("\nMax profit is: ");
        System.out.println(obj.buySell(arr));
    }

}
