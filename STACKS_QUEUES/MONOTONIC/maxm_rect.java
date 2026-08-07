import java.util.Stack;

public class maxm_rect {

    public static int CalcArea(int arr[]) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() && (i == n || arr[st.peek()] >= arr[i])) {
                int height = arr[st.pop()];

                int width = i - (st.isEmpty() ? -1 : st.peek()) - 1;

                maxArea = Math.max(maxArea, height * width);
            }
            if (i < n)
                st.push(i);
        }

        return maxArea;
    }

    public static int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) 
            return 0;
        
        int m = matrix[0].length;
        int[] height = new int[m];
        int maxArea = 0;

        for (char[] row : matrix) {
            for (int i = 0; i < m; i++) {
                if (row[i] == '1')
                    height[i]++;
                else
                    height[i] = 0;
            }
            maxArea = Math.max(maxArea, CalcArea(height));
        }

        return maxArea;
    }

    public static void main(String[] args) {
        char arr[][] = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
                { '1', '0', '0', '1', '0' } };

        System.out.println(maximalRectangle(arr));
    }
}
