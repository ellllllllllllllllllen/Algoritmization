package by.zavadskaya.model.oneDimensionalArrays;

public class Array {

    public static int[] createNatural(int number) {
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * number);
        }
        return array;
    }
    public static double[] createReal(int number) {
        double[] array = new double[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * number;
        }
        return array;
    }
}
