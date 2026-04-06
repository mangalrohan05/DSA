public class Q13 {

    public static int peak(int nums[]){
        int st = 0, en = nums.length-1;

        while (st < en) {
            int mid = (st+en)/2;

            if(nums[mid] < nums[mid+1]){
                st = mid+1;
            } else {
                en = mid;
            }
        }

        return st;
    }
    public static void main(String[] args) {
        int nums[] = {
            1,2,1,3,5,6,4
        };

        int sol = peak(nums);
        System.out.println(sol);
    }
}
