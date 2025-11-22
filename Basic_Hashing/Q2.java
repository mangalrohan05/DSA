import java.util.*;

class Main{
    public static void main(String args[]){
        int arr1[] = {10, 5, 10, 15, 10, 5};
        HashMap<Integer, Integer> map1 = new HashMap<>();
        
        int high = 0, low = arr1.length, highVal = -1, lowVal = -1;
        
        for(int i = 0; i < arr1.length; i++){

            int key = arr1[i];
            int freq = 0;
            if(map1.containsKey(key)) freq = map1.get(key);

            freq++;

            if (freq > high){

                high = freq;
                highVal = key;
            }
            else if (freq < low){

                low = freq;
                lowVal = key;
            }
            map1.put(key, freq);
        }

        System.out.println("Highest Frequency Element in arr1: " + highVal + " with frequency " + high);
        System.out.println("Lowest Frequency Element in arr1: " + lowVal + " with frequency " + low);  
    }
}