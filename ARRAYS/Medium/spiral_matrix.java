import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    public static List<Integer> spiral(int[][] matrix) {
        ArrayList<Integer> ls = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0, top = 0;
        int right = n - 1, bottom = m - 1;

        while (left <= right && top <= bottom) {

            for (int j = left; j <= right; j++) {
                ls.add(matrix[top][j]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ls.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ls.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ls.add(matrix[i][left]);
                }
                left++;
            }

        }

        return ls;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        System.out.println(spiral(arr));
    }
}
