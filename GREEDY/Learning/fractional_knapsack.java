import java.util.Arrays;

public class fractional_knapsack {

    int value;
    int weight;

    fractional_knapsack(int a, int b) {
        value = a;
        weight = b;
    }

    public static double fractionalKnapsack(int cap, int val[], int wt[]) {
        fractional_knapsack[] fraction = new fractional_knapsack[val.length];
        for (int i = 0; i < val.length; i++)
            fraction[i] = new fractional_knapsack(val[i], wt[i]);

        Arrays.sort(fraction, (a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));

        int currW = 0;
        double res = 0.0;

        for (int i = 0; i < fraction.length; i++) {
            if (currW + fraction[i].weight <= cap) {
                currW += fraction[i].weight;
                res += fraction[i].value;
            } else {
                int rem = cap - currW;
                res += (fraction[i].value / (double) fraction[i].weight) * (double) rem;
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int wt[] = { 10, 20, 30 };
        int cap = 50;

        System.out.println(fractionalKnapsack(cap, val, wt));

    }
}
