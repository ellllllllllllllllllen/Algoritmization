package by.zavadskaya.model.oneDimensionalArrays;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы

public class FourthTask {

    public static double[] swap(double[] array) {
        int min = 0, max = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] < array[min]) {
                min = i;
            }
            if (array[i] > array[max]) {
                max = i;
            }
        }
        double temp = array[max];
        array[max] = array[min];
        array[min] = temp;

        return array;
    }
}
