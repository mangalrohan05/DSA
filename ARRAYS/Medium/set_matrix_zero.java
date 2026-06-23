public class set_matrix_zero {
    public static void set_zero(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean frowz = false;
        boolean fcolz = false;

        for (int i = 0; i < m; i++)
            if (matrix[i][0] == 0)
                fcolz = true;

        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0)
                frowz = true;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
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

        if(fcolz){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
        if(frowz){
            for(int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        set_zero(arr);
    }
}
