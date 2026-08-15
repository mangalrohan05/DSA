import java.util.HashMap;

public class min_wind_substring {

    public static String findMin(String s, String t) {
        int n = s.length();
        int[] res = new int[2];

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> seq = new HashMap<>();

        for (char c : t.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        int left = 0, allCount = 0;

        for (int right = 0; right < n; right++) {

            if(allCount == t.length()){
                if(res[1] - res[0] >= right - left){
                    res[0]

                }
            }

            while (allCount == t.length()) {
                
            }

            char curr = s.charAt(right);
            seq.put(curr, seq.getOrDefault(curr, 0) + 1);

            if (map.containsKey(curr))
                allCount++;

            while () {

            }
        }

        return "";
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(findMin(s, t));
    }
}
