package by.zavadskaya.model.arraysOfArrays;

// В числовой матрице поменять местами два любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры

public class EighthTask {

    public static int[][] swapColumn(int[][] array, int firstColumn, int secondColumn) {
        int temp;
        for (int i = 0; i < array.length; i++) {
        temp = array[i][firstColumn];
        array[i][firstColumn] = array[i][secondColumn];
        array[i][secondColumn] = temp;
        }
        return array;
    }
}
