public class longest_common_pref {

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";

        String st = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(st)) {
                st = st.substring(0, st.length() - 1);

                if (st.isEmpty())
                    return "";
            }
        }

        return st;

    }

    public static void main(String[] args) {
        String words[] = { "abc", "abcde", "abcdef" };
        System.out.println(longestCommonPrefix(words));
    }
}
