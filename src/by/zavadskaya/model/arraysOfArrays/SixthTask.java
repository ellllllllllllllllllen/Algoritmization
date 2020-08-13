package by.zavadskaya.model.arraysOfArrays;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//        1 1 1 ... 1 1
//        0 1 1 ... 1 0
//        0 0 1 ... 0 0
//        0 1 1 ... 1 0
//        1 1 1 ... 1 1


public class SixthTask {

    public static int[][] createMatrix(int n) {
        int[][] matrix = new int[n][n];
        int head = -1, tail = n/2;

        for(int i = 0; i < n/2; i++){
            ++head;
            for(int j = 0 + head; j < n - head; j++){
                matrix[i][j] = 1;
            }
        }
        for(int i = n/2; i < n; i++){
            --tail;
            for(int j = 0 + tail; j < n - tail; j++){
                matrix[i][j] = 1;
            }
        }
        return matrix;
    }
}
