package by.zavadskaya.model.oneDimensionalArrays;

//Даны действительные числа a1, a2, ... ,an
//Найти max(a1 + a2n , a2 + a2n - 1, ... , an + an+1)

public class SeventhTask {

    public static double getMaxSum(double[] array) {
        double maxSum = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > maxSum) {
                maxSum = array[i] + array[array.length - i - 1];
            }

        }
        return maxSum;
    }
}
