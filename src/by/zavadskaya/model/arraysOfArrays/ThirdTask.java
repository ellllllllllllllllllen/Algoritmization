package by.zavadskaya.model.arraysOfArrays;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы

public class ThirdTask {

    public static int[] findString(int[][] array, int string){
        int[] result = new int[array.length];
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(i == string){

                for(int j = 0; j < array[i].length; j++){
                    result[index] = array[i][j];
                    index++;
                }
            }
        }
        return result;
    }

    public static int[] findColumn(int[][] array, int column){

        int[] result = new int[array.length];
        int index = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(column == j){
                    result[index] = array[i][j];
                    index++;

                }
            }
        }
        return result;
    }
}
