package by.zavadskaya.model.oneDimensionalArrays;

//задана последовательность N вещественных чисел. ¬ычислить сумму чисел, пор¤дковые номера которых
//являются простыми числами.

public class SixthTask {

    public static double findSum(double[] array) {
        double sum = 0;
        for (int i = 2; i < array.length; i++) {
            double d = 2;
            while (i % d != 0) {
                d += 1;
            }
            if (d == i) {
                sum += array[i];
                d += 1;
            }
        }
        return sum;
    }
}
