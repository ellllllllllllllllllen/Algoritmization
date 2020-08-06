package by.zavadskaya.model.oneDimensionalArrays;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class FirstTask {

    public static int findSum(int[] array, int k) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % k == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}
