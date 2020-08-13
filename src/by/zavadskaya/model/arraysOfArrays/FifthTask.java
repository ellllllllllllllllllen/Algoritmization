package by.zavadskaya.model.arraysOfArrays;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//            1 1 1 1 ... 1 1
//            2 2 2 2 ... 2 0
//            3 3 3 3 ... 0 0
//            ...............
//            n 0 0 0 ... 0 0

public class FifthTask {

    public static int[][] createMatrix(int n) {
        int[][] matrix = new int[n][n];
        int zero = 0;
        for (int i = 0; i < n; i++) {
            ++zero;

            for(int j = 0; j <= n - zero; j++){
                matrix[i][j] = i + 1;

            }
        }
        return matrix;
    }

}
