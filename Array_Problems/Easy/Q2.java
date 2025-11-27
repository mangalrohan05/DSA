public class Q2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 7, 7, 5};

        if (arr == null || arr.length < 2) {
            System.out.println("Second smallest: -1");
            System.out.println("Second largest: -1");
            return;
        }

        int s = Integer.MAX_VALUE;
        int ss = Integer.MAX_VALUE;
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < s) {
                ss = s;
                s = num;
            } else if (num > s && num < ss) {
                ss = num;
            }

            if (num > l) {
                sl = l;
                l = num;
            } else if (num < l && num > sl) {
                sl = num;
            }
        }

        if (ss == Integer.MAX_VALUE) {
            System.out.println("Second smallest: -1");
        } else {
            System.out.println("Second smallest: " + ss);
        }

        if (sl == Integer.MIN_VALUE) {
            System.out.println("Second largest: -1");
        } else {
            System.out.println("Second largest: " + sl);
        }
    }
}
