import java.util.ArrayList;
import java.util.List;

public class pascal_triangle {
    public static void p_trianlge(int numRows) {
        List<List<Integer>> ls = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    temp.add(ls.get(i - 1).get(j) + ls.get(i - 1).get(j - 1));
                }
            }
            ls.add(temp);
        }

        System.out.println(ls);
    }

    public static void main(String[] args) {
        int n = 5;
        p_trianlge(n);
    }
}