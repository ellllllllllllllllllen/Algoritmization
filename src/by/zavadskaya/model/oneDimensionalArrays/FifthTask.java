package by.zavadskaya.model.oneDimensionalArrays;

//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class FifthTask {

    public static int countNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > i) {
                count++;
            }
        }
        return count;
    }
    public static int[] findNumbers(int[] array) {
        int[] numbers  = new int[countNumbers(array)];
        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if(array[i] > i) {
                numbers[j] = array[i];
                j++;
            }
        }
        return numbers;
    }
}
