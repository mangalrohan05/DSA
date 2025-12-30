import java.util.ArrayList;

public class Q13 {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int m = arr.length;
        int n = arr[0].length;
        int top = 0, left = 0, right = n - 1, bottom = m - 1;

        ArrayList<Integer> res = new ArrayList<>();

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                res.add(arr[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                res.add(arr[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(arr[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {

                for (int i = bottom; i >= top; i--) {
                    res.add(arr[i][left]);
                }
                left++;
            }
        }

        for(int val : res) System.out.print(val + " ");

    }
}
