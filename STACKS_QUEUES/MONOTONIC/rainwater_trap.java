import java.util.Stack;

public class rainwater_trap {
    public static int calcArea(int height[]) {

        Stack<Integer> st = new Stack<>();
        int res = 0;

        for (int i = 0; i < height.length; i++) {

            if (st.isEmpty())
                st.push(i);

            else {
                while (height[i] > height[st.peek()]) {
                    int bottom = st.pop();
                    if (st.isEmpty())
                        break;

                    int left = st.peek();

                    int width = i - left - 1;

                    res += width * (Math.min(height[left], height[i]) - height[bottom]);
                }

                st.push(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(calcArea(height));
    }
}
