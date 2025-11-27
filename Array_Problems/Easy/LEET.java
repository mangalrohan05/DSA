public class LEET {
    // 1752

    public static boolean check(int arr[]) {

        if(arr == null || arr.length <= 2) return true;

        int drops = 0;

        for(int i = 0; i < arr.length; i++){
            int next = (i+1)% arr.length;
            if(arr[i] > arr[next]) {
                drops++;
                
                if(drops>1) return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1, 2 };

        System.out.println(check(arr));
    }
}
