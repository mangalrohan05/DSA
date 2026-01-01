public class Q9 {
/*
    public static void setApproach(int a[], int b[]){
    Set<Integer> st = new TreeSet();

    for(int n : a){
    st.add(n);
    }

    for(int n : b){
    st.add(n);
    }

    ArrayList<Integer> ls = new ArrayList<>(st);

    for(int v : ls){
    System.out.print(v + " ");
    }
    }
*/

/*
    public static void pointerApproach(int a[], int b[]) {
        int n1 = a.length, n2 = b.length;
        int i = 0, j = 0;

        ArrayList<Integer> union = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                if (union.size() == 0 || union.getLast() != a[i]) {
                    union.add(a[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.getLast() != b[j]) {
                    union.add(b[j]);
                }
                j++;
            }
        }

        while (i < n1) {
            if (union.getLast() != a[i] || union.size() == 0) {
                union.add(a[i]);
            }
            i++;
        }

        while (j < n2) {
            if (union.getLast() != b[j] || union.size() == 0) {
                union.add(b[j]);
            }
            j++;
        }

        for(int val : union){
            System.out.print(val+" ");
        }
    }
 */



    public static void main(String[] args) {
        // int a[] = { 1, 2, 3, 4, 5, 100 }, b[] = { 2, 3, 4, 4, 5, 6, 10 };

        // setApproach(a, b);
        // pointerApproach(a, b);

    }
}
