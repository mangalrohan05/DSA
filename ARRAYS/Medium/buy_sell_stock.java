public class buy_sell_stock {
    public static int max_profit(int prices[]) {
        int prof = 0;
        int min_pr = Integer.MAX_VALUE;

        for (int val : prices) {
            if(val < min_pr){
                min_pr = val;
            }

            if(val - min_pr > prof){
                prof = (val - min_pr);
            }
        }

        return prof;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(max_profit(arr));
    }
}
