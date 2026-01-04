import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        int arr[] = { 1, 0, -1, 0, -2, 2 };
        int t = 0, n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (j != i + 1 && arr[j] != arr[j - 1])
                    continue;

                int k = j + 1;
                int l = n - 1;

                while (k < l) {
                    int sum = arr[i];
                    sum += arr[j] + arr[k] + arr[l];

                    if (sum == t) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);

                        res.add(temp);
                        k++;
                        l--;

                        while (k < l && arr[k] == arr[k - 1])
                            k++;
                        while (k < l && arr[l] == arr[l + 1])
                            l--;
                    }

                    else if (sum < t)
                        k++;
                    else
                        l--;
                }
            }
        }

    }
}
