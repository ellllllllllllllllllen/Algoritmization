package by.zavadskaya.model.oneDimensionalArrays;

//в массиве целых чисел с количеством элементов n найти наиболее часто встречающеес¤ число. ≈сли таких
//чисел несколько, то определить наименьшее из них.

public class NinthTask {

    public static int findMostFrequentNumber(int[] array) {
        int num, result = 0, count = 0, n = 1;
        for (int i = 0; i < array.length; i++) {
            num = array[i];
            for (int j = 1; j < array.length; j++) {
                if (num == array[j]) {
                    count++;
                }
                if (count > n) {
                    n = count;
                    result = array[i];
                }
                if (count == n && result > array[i]) {
                    result = array[i];

                }

            }
            count = 0;

        }
        return result;
    }
}
