package by.zavadskaya.model.arraysOfArrays;

//Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

public class EleventhTask {

    public static int[][] createMatrix() {
        int[][] matrix = new int[10][20];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
            }
        }
        return matrix;
    }

    public static String findStringNums(int[][] matrix) {
        String str = "";
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                }
                if (count >= 3) {
                    str += i + " ";
                    count = 0;
                };
            }
        }
        return str;
    }

}
