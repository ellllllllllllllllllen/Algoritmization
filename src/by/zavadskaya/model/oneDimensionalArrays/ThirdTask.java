package by.zavadskaya.model.oneDimensionalArrays;

//дан массив действительных чисел, размерность которого N. ѕодсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

public class ThirdTask {

    public static int countNegativeElements(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0) {
                count++;
            }
        }
        return count;
    }

    public static int countPositiveElements(double[] array) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static int countZeroElements(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0) {
                count++;
            }
        }
        return count;
    }
}
