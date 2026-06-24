import java.util.List;
import java.util.ArrayList;

public class majority_element {
    public static void maj_count(int[] nums) {
        int n = nums.length;

        int e1 = 0, e2 = 0;
        int c1 = 0, c2 = 0;

        for (int val : nums) {
            if (c1 == 0 && val != e2) {
                e1 = val;
                c1 = 1;
            } else if (c2 == 0 && val != e1) {
                e2 = val;
                c2 = 1;
            } else if (val == e1) {
                c1++;
            } else if (val == e2) {
                c2++;
            } else {
                c1--;
                c2--;
            }
        }

        List<Integer> ls = new ArrayList<>();
        c1 = 0;
        c2 = 0;

        for (int val : nums) {
            if (val == e1)
                c1++;
            if (val == e2)
                c2++;
        }

        if (c1 > n / 3)
            ls.add(e1);
        if (c2 > n / 3)
            ls.add(e2);

        System.out.println(ls);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2 };
        maj_count(arr);
    }
}
