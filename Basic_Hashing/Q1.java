import java.util.*;

class map{

    public static void main(String[] args){
        int arr_1[] = {10,5,10,15,10,5};
        int arr_2[] = {2, 2, 3, 4, 4, 2};

        HashMap<Integer, Integer> map_1 = new HashMap<>();
        HashMap<Integer, Integer> map_2 = new HashMap<>();

        for(int i = 0; i < arr_1.length; i++){
            int key = arr_1[i];
            int freq = 0;

            if(map_1.containsKey(key)) {
                freq = map_1.get(key);
            }

            freq++;
            map_1.put(key, freq);
        }

        for(int i = 0; i < arr_2.length; i++){
            int key = arr_2[i];
            int freq = 0;

            if(map_2.containsKey(key)) {
                freq = map_2.get(key);
            }

            freq++;
            map_2.put(key, freq);
        }

        System.out.println("Frequencies in array 1:");
        System.out.println("---------------------");

        for(Map.Entry<Integer, Integer> iterator: map_1.entrySet()){
            System.out.println(iterator.getKey() + " occurs " + iterator.getValue() + " times in the array");
        }

        System.out.println("\nFrequencies in array 2:");
        System.out.println("---------------------");

        for(Map.Entry<Integer, Integer> iterator: map_2.entrySet()){
            System.out.println(iterator.getKey() + " occurs " + iterator.getValue() + " times in the array");
        }
    }
}