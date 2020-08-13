package by.zavadskaya.model.arraysOfArrays;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
//            1  2   3  ... n
//            n n-1 n-2 ... 1
//            1  2   3  ... n
//            n n-1 n-2 ... 1
//            ...............
//            n n-1 n-2 ... 1





public class FourthTask {

    public static int[][] createMatrix(int n) {

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = j + 1;

                }
            }
            if(i % 2 != 0){
                int k = n;
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = k;
                    k--;
                }
            }
        }
        return matrix;
    }
}
