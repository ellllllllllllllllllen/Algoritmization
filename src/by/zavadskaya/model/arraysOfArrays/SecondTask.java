package by.zavadskaya.model.arraysOfArrays;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class SecondTask {
    public static int[] findDiagonalElements(int[][] array){
        int[] result  = new int[array.length];
        int index = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(i == j){
                    result[index] = array[i][j];
                    index++;
                }
            }
        }
        return result;
    }
}
