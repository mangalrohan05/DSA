import java.util.HashMap;

public class frts_into_basket {

    public static int findDiffs(int[] fruits) {
        int i = 0, maxLen = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < fruits.length; j++) {

            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

            while (map.size() > 2) {
                int cnt = map.get(fruits[i])-1;
                
                if (cnt == 0)
                    map.remove(fruits[i]);
                else
                    map.put(fruits[i], cnt);
                i++;
            }

            maxLen = Math.max(maxLen, j - i + 1);

        }

        return maxLen;
    }

    public static void main(String[] args) {
        int fruits[] = { 3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4 };
        System.out.println(findDiffs(fruits));

    }
}
