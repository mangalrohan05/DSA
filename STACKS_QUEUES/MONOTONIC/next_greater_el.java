import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class next_greater_el {
    public static int[] checkNext(int[] nums) {

        Stack<Integer> st = new Stack<>();
        int[] res = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }

            if(st.isEmpty())
                res[i] = -1;
            else
                res[i] = st.peek();

            st.push(nums[i]);

        }

        return res;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 4 };

    System.out.println(Arrays.toString(checkNext(nums)));
    }
}