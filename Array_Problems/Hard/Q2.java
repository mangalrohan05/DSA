import java.util.*;

public class Q2 {
    public static void main(String[] args) {

        int arr[] = { 1, 1, 1, 2, 2, 3, 3, 3 };
        int n = arr.length;
        int c1 = 0, c2 = 0, e1 = 0, e2 = 0;

        List<Integer> ls = new ArrayList<>();

        for (int val : arr) {

            if (c1 == 0 && val != e2) {
                c1 = 1;
                e1 = val;
            } else if (c2 == 0 && val != e1) {
                c2 = 1;
                e2 = val;
            } else if (e1 == val)
                c1++;
            else if (e2 == val)
                c2++;
            else {
                c1--;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;
        for (int val : arr) {
            if (val == e1)
                c1++;
            if (val == e2)
                c2++;
        }

        if (c1 > n / 3) {
            ls.add(e1);
        }
        if(c2 > n/3){
            ls.add(e2);
        }

        ls.sort(null);
        System.out.println(ls);
    }
}
