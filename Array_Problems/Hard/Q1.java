import java.util.*;

class Q1 {
    public static void main(String[] args) {
        int n = 5;

        List<List<Integer>> nList = new ArrayList<>();
        List<Integer> val = new ArrayList<>();
        nList.add(val);
        val.add(1);
        System.out.println(nList);
        for (int i = 1; i < n; i++) {
            nList.add(new ArrayList<>());
            nList.get(i).add(1);
            for (int j = 1; j <= i - 1; j++) {
                nList.get(i).add(nList.get(i - 1).get(j - 1) + nList.get(i - 1).get(j));
            }

            nList.get(i).add(1);
        }

        System.out.println(nList);
    }
}