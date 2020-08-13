package by.zavadskaya.model.arraysOfArrays;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class FirstTask {


    public static int count(int[][] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if (i % 2 != 0){
                for(int j = 0; j < array[i].length; j++){
                    if(array[i][0] > array[i][array[i].length]){
                        count++;

                    }
                }
            }
        }

        return count;
    }
    public static int[][] findColumn(int[][] array){
        int size = FirstTask.count(array);
        int[][] newArray = new int[size][];
        int k = 0, l = 0;
        for(int i = 0; i < array.length; i++){

                for(int j = 0; j < array[i].length; j+=2){
                    if(array[0][j] > array[array.length - 1][j]){
                        newArray[k][l] = array[i][j];
                        k++;
                    }
                }
        }
        return newArray;

    }
}
