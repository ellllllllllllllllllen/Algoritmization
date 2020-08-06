package by.zavadskaya.model.oneDimensionalArrays;

//ƒана последовательность целых чисел a1, a2, ..., an
//образовать новую последовательность, выбросив из исходной те члены, которые равны
//min(a1, a2, ... , an)

public class EighthTask {

    public static int findMin(int[] array) {
        int min = 0;
        for(int i = 0; i < array.length; i++) {

            if (array[i] < array[min]) {
                min = i;
            }
        }
        return array[min];
    }

    public static int countNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == findMin(array)) {
                count++;
            }
        }
        return count;
    }
    public static int[] createNewArray(int[] array) {
        int[] newArray  = new int[array.length - countNumbers(array)];
        int j = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] != findMin(array)) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }
}
