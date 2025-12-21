public class Q3 {
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        int count = 0, curr = 0;

        for(int val : arr){
            if(count == 0) curr = val;

            count += (val == curr) ? 1 : -1;
        }
        System.out.println(curr);
    }

}
