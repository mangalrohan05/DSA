public class find_sinlge_num {
    public static void find_single(int nums[]) {
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            res ^= nums[i];
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 2, 1, 2 };
        find_single(arr);
    }
}
