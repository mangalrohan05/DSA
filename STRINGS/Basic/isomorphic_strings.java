public class isomorphic_strings {
    // public static boolean isIsomorphic(String s, String t) {

    // if (s.length() != t.length())
    // return false;

    // HashMap<Character, Character> map1 = new HashMap<>();
    // HashMap<Character, Character> map2 = new HashMap<>();

    // for (int i = 0; i < s.length(); i++) {
    // char sCurr = s.charAt(i);
    // char tCurr = t.charAt(i);

    // if (map1.containsKey(sCurr)) {
    // if (map1.get(sCurr) != tCurr)
    // return false;
    // else
    // map1.put(sCurr, tCurr);
    // } else {
    // map1.put(sCurr, tCurr);
    // }

    // if (map2.containsKey(tCurr)) {
    // if (map2.get(tCurr) != sCurr)
    // return false;
    // else
    // map2.put(tCurr, sCurr);

    // } else {
    // map2.put(tCurr, sCurr);
    // }
    // }

    // return true;

    // }

    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] CS = new int[256];
        int[] CT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char sCurr = s.charAt(i);
            char tCurr = t.charAt(i);

            if (CS[sCurr] != CT[tCurr])
                return false;

            CS[sCurr] = i + 1;
            CT[tCurr] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}
