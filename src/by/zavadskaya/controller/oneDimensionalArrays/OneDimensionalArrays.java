package by.zavadskaya.controller.oneDimensionalArrays;

import by.zavadskaya.model.oneDimensionalArrays.Array;
import by.zavadskaya.model.oneDimensionalArrays.EighthTask;
import by.zavadskaya.model.oneDimensionalArrays.FifthTask;
import by.zavadskaya.model.oneDimensionalArrays.FirstTask;
import by.zavadskaya.model.oneDimensionalArrays.FourthTask;
import by.zavadskaya.model.oneDimensionalArrays.NinthTask;
import by.zavadskaya.model.oneDimensionalArrays.SecondTask;
import by.zavadskaya.model.oneDimensionalArrays.SeventhTask;
import by.zavadskaya.model.oneDimensionalArrays.SixthTask;
import by.zavadskaya.model.oneDimensionalArrays.TenthTask;
import by.zavadskaya.model.oneDimensionalArrays.ThirdTask;
import by.zavadskaya.util.Input;
import by.zavadskaya.view.Printer;

public class OneDimensionalArrays {

    public static void main(String[] args) {

        int[] naturalArray = Array.createNatural(10);

        double[] realArray = Array.createReal(10);

        Printer.print("\nFirst task.");
        for(int i = 0; i < naturalArray.length; i++) {
            Printer.print(" " + naturalArray[i]);
        }
        Printer.print("Sum of elements that are multiples of k: " + FirstTask.findSum(naturalArray, (int)Input.input("\nInput k: ")));


        Printer.print("\nSecond task.");

        for(int i = 0; i < realArray.length; i++) {
            Printer.print(" " + realArray[i]);
        }
        Printer.print("Number of substitutions: " + SecondTask.countSubstitutions(realArray, Input.input("\nInput z: ")));

        Printer.print("\nThird task.");

        Printer.print("\nNumber of negative elements: " + ThirdTask.countNegativeElements(realArray)
                + "\nNumber of positive elements: " + ThirdTask.countPositiveElements(realArray)
                + "\nNumber of zero elements: " + ThirdTask.countZeroElements(realArray));


        Printer.print("\nFourth task.");

        for(int i = 0; i < realArray.length; i++) {
            Printer.print(" " + realArray[i]);
        }

        Printer.print("\nResult of swapping min and max values: " + FourthTask.swap(realArray));
        for(int i = 0; i < realArray.length; i++) {
            Printer.print(" " + realArray[i]);
        }

        Printer.print("\nFifth task.");

        for(int i = 0; i < naturalArray.length; i++) {
            Printer.print(" " + naturalArray[i]);
        }

        Printer.print("\nResult array: ");

        for(int i = 0; i < FifthTask.countNumbers(naturalArray); i++) {
            Printer.print(" " + FifthTask.findNumbers(naturalArray)[i]);
        }

        Printer.print("\nSixth task.");
        for(int i = 0; i < realArray.length; i++) {
            Printer.print(" " + realArray[i]);
        }
        Printer.print("\nThe sum of numbers whose ordinal number is a prime number: " + SixthTask.findSum(realArray));


        Printer.print("\nSeventh task.");

        for(int i = 0; i < realArray.length; i++) {
            Printer.print(" " + realArray[i]);
        }
        Printer.print("\nMax sum: " + SeventhTask.getMaxSum(realArray));

        Printer.print("\nEighth task.");

        for(int i = 0; i < naturalArray.length; i++) {
            Printer.print(" " + naturalArray[i]);
        }

        Printer.print("\nNew array: " );

        for(int i = 0; i < EighthTask.createNewArray(naturalArray).length; i++) {
            Printer.print(" " + EighthTask.createNewArray(naturalArray)[i]);
        }

        Printer.print("\nNinth task.");

        for(int i = 0; i < naturalArray.length; i++) {
            Printer.print(" " + naturalArray[i]);
        }

        Printer.print("\nMost frequent number: " + NinthTask.findMostFrequentNumber(naturalArray));

        Printer.print("\nTenth task.");
        for(int i = 0; i < naturalArray.length; i++) {
            Printer.print(" " + naturalArray[i]);
        }

        Printer.print("\nCompressed array: ");

        for(int i = 0; i < naturalArray.length; i++) {
            Printer.print(" " + TenthTask.compressArray(naturalArray)[i]);
        }

    }
}
