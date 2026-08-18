import java.util.Arrays;

public class min_platforms {
    public static int minPlatform(int arr[], int dep[]) {
        int n = arr.length;

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 0, j = 0;

        int platforms = 0, maxPlat = 0;

        while (i < n && j < n) {
            if(arr[i] <= dep[j]){
                platforms++;
                maxPlat = Math.max(platforms, maxPlat);
                i++;
            } else {
                platforms--;
                j++;
            }
        }

        return maxPlat;
    }

    public static void main(String[] args) {
        int arr[] = { 1114, 825, 357, 1415, 54 };
        int dept[] = { 1740, 1110, 2238, 1535, 2323 };

        System.out.println(minPlatform(arr, dept));
    }
}
