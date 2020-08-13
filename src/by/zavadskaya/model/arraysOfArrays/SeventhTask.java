package by.zavadskaya.model.arraysOfArrays;

// Сформировать квадратную матрицу порядка N по правилу: A[I,J] = sin(I^2 + J^2/N) и подсчитать количество положительных элементов в ней

public class SeventhTask {

    public static double[][] createMatrix(int n) {
        int k = 0;
        double[][] result = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = Math.sin((i * i + j * j ) / n);

            }
        }
        return result;
    }

    public static int countPositiveNums(int n) {
        int k = 0, count = 0;
        double[][] result = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = Math.sin((i * i + j * j) / n);
                if (result[i][j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
