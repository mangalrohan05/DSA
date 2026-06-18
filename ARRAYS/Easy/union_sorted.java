import java.util.ArrayList;
import java.util.List;

public class union_sorted {
    public static void Union(int arr1[], int arr2[]) {
        int m = arr1.length, n = arr2.length;

        List<Integer> ls = new ArrayList<>();

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                if (ls.isEmpty() || ls.get(ls.size() - 1) != arr1[i])
                    ls.add(arr1[i]);
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (ls.isEmpty() || ls.get(ls.size() - 1) != arr2[j])
                    ls.add(arr2[j]);
                j++;
            } else {
                if (ls.isEmpty() || ls.get(ls.size() - 1) != arr1[i])
                    ls.add(arr1[i]);
                i++;
                j++;
            }
        }
        while (i < m) {
            if (ls.isEmpty() || ls.get(ls.size() - 1) != arr1[i])
                ls.add(arr1[i]);
            i++;
        }
        while (j < n) {
            if (ls.isEmpty() || ls.get(ls.size() - 1) != arr2[j])
                ls.add(arr2[j]);
            j++;
        }
        System.out.println(ls);
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 3, 4, 4, 5 };

        Union(arr1, arr2);
    }
}
