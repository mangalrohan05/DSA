public class Q11 {

    /*
     * public static void M2(int matrix[][], int m, int n) {
     * 
     * Set<Integer> setRow = new HashSet<>();
     * Set<Integer> setCol = new HashSet<>();
     * 
     * for(int i = 0; i < m; i++){
     * for(int j = 0; j < n; j++){
     * if(matrix[i][j] == 0){
     * setRow.add(i);
     * setCol.add(j);
     * }
     * }
     * }
     * 
     * for(int i = 0; i < m; i++){
     * for(int j = 0; j < n; j++){
     * if(setRow.contains(i) || setCol.contains(j)){
     * matrix[i][j] = 0;
     * }
     * }
     * }
     * 
     * for(int val[] : matrix){
     * for(int v : val){
     * System.out.print(v+"|");
     * }
     * System.out.println();
     * }
     * 
     * }
     */

    public static void finalRes(int[][] matrix, int m, int n) {
        boolean Rflag = false, Cflag = false;

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                Rflag = true;
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (matrix[0][i] == 0) {
                Cflag = true;
                break;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (Rflag) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }

        if (Cflag) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        for (int val[] : matrix) {
            for (int v : val)
                System.out.print(v + "|");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

        int m = matrix.length, n = matrix[0].length;

        // M2(matrix, m, n);

        finalRes(matrix, m, n);
    }
}
