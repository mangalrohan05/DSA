import java.util.ArrayList;

public class leaders {
    public static void find_leaders(int arr[]) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(arr[arr.length - 1]);
        int larg = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > larg) {
                larg = arr[i];
                ls.add(arr[i]);
            }
        }
        System.out.println(ls);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 7, 1, 0 };
        find_leaders(arr);
    }
}