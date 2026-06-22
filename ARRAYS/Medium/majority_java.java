public class majority_java {
    public static void maj_el(int nums[]) {
        int count = 0, el = 0;
        for (int val : nums) {
            if (count == 0) {
                el = val;
            }
            if (el == val) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(el);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        maj_el(arr);
    }
}