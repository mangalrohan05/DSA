public class maxm_cards {

    public static int findMax(int cardPoints[], int k) {
        int n = cardPoints.length;
        int totalSum = 0;

        for (int val : cardPoints)
            totalSum += val;

        if (n - k == 0)
            return totalSum;

        int sum = 0;

        for (int i = 0; i < n - k; i++)
            sum += cardPoints[i];

        int minSum = sum;

        for (int right = n - k; right < n; right++) {

            sum += cardPoints[right];
            sum -= cardPoints[right - (n - k)];

            minSum = Math.min(minSum, sum);

        }

        return totalSum - minSum;
    }

    public static void main(String[] args) {
        int cardPoints[] = { 1, 2, 3, 4, 5, 6, 1 };
        int k = 3;

        System.out.println(findMax(cardPoints, k));
    }
}
