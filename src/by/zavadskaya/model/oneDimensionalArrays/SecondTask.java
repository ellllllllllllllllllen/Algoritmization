package by.zavadskaya.model.oneDimensionalArrays;

// Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

public class SecondTask {

    public static int countSubstitutions(double[] array, double z) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > z) {
                array[i] = z;
                count++;
            }
        }
        return count;

    }
}
