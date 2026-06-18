public class missing_number {
    public static void missing(int arr[]) {
        int sum = 0, larg = -1;
        for(int val : arr){
            sum += val;
            if(val > larg)  larg = val;
        }
        int tSum = larg*(larg+1)/2;
        int res = tSum - sum;
        System.out.println(res);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5 };
        missing(arr);
    }
}