import java.util.ArrayList;
import java.util.HashMap;
// import java.util.Map;

public class sort_char_by_freq {
    // public static String frequencySort(String s) {

    // HashMap<Character, Integer> map = new HashMap<>();

    // for (char c : s.toCharArray()) {
    // map.put(c, map.getOrDefault(c, 0) + 1);
    // }

    // ArrayList<Character> ls = new ArrayList<>(map.keySet());
    // ls.sort((a, b) -> Integer.compare(map.get(b), map.get(a)));

    // StringBuilder sb = new StringBuilder();

    // for (char ch : ls) {
    // int freq = map.get(ch);
    // for (int i = 0; i < freq; i++)
    // sb.append(ch);
    // }

    // return sb.toString();
    // }

    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        ArrayList<Character> bucket[] = new ArrayList[s.length() + 1];

        for (char ch : map.keySet()) {
            int freq = map.get(ch);

            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();

            bucket[freq].add(ch);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = s.length(); i >= 1; i--) {
            if (bucket[i] == null)
                continue;

            for (char ch : bucket[i]) {
                for (int j = 0; j < i; j++)
                    sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Aabb";
        System.out.println(frequencySort(s));
    }
}