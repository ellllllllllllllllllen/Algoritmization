package by.zavadskaya.model.arraysOfArrays;

//Найти положительные элементы главной диагонали квадратной матрицы.

public class TenthTask {
    public static int countPositiveElements(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i == j){
                    if(array[i][j] > 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static int[] findPositiveElements(int[][] array) {
        int[] result = new int[countPositiveElements(array)];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i == j){
                    if(array[i][j] > 0) {
                        result[k] += array[i][j];
                        k++;
                    }
                }
            }
        }
        return result;
    }

}
