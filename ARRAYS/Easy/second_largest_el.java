public class second_largest_el {
    public static void sec_larg_el(int arr[]) {
        int larg = -1, s_l = -1;

        for (int i : arr) {
            if (i > larg) {
                larg = i;
            }
        }
        for (int i : arr) {
            if (i > s_l && i < larg) {
                s_l = i;
            }
        }
        System.out.println(s_l);
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        sec_larg_el(arr);
    }
}
