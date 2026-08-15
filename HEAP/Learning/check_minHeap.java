public class check_minHeap {

    public static boolean checkMin(int[] nums){
        int n = nums.length;

        for(int i = 0; i < n; i++){
            
            int left = i * 2 + 1;
            if(left < n && nums[left] < nums[i])
                return false;
            
            int right = i * 2 + 2;
            if(right < n && nums[i] > nums[right])
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 21, 23};

        System.out.println(checkMin(nums));
    }
}
