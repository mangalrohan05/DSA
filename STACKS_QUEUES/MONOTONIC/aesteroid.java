import java.util.Stack;

public class aesteroid {

    public static int[] findVals(int arr[]) {
        int n = arr.length;
        if (n <= 1)
            return arr;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            boolean alive = true;

            while (!st.isEmpty() && curr < 0 && st.peek() > 0) {
                if (-curr > st.peek())
                    st.pop();
                else if(st.peek() == -curr){
                    st.pop();
                    alive = false;
                    break;
                } else {
                    alive = false;
                    break;
                }
                    
            }
            if(alive)
                st.push(curr);
        }

        int res[] = new int[st.size()]; 
        for(int i = st.size() -1; i >= 0; i--)
            res[i] = st.pop();

        return res;

    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, -10 };
        System.out.println(findVals(arr));
    }
}