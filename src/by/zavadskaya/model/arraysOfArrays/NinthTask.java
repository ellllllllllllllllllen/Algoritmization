package by.zavadskaya.model.arraysOfArrays;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.

public class NinthTask {

    public static int[] findSum(int[][] array) {
        int sum = 0;
        int n = array.length;
        int m = array[0].length;
        int s, col = 0;
        int[] result = new int[array.length];
        for (int j = 0; j < m; j++) {
            s = 0;
            for (int i = 0; i < n; i++) {
                s += array[i][j];
                result[j] += array[i][j];
                if (s > sum) {
                    sum = s;
                    col = j;
                }
            }
        }
        return result;
    }

    public static int findMaxSum(int[] array) {
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
