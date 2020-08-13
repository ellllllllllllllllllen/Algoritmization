package by.zavadskaya.controller.arraysOfArrays;

import by.zavadskaya.model.arraysOfArrays.*;
import by.zavadskaya.view.Printer;

public class ArraysOfArrays {

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++) {
            Printer.print(" " + array[i]);
        }
    }

    public static void printMatrix(int[][] array){
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
                Printer.print("" + array[i][j] + "\t");
            }
            Printer.print("\n");

        }
    }
    public static void printDoubleMatrix(double[][] array){
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
                Printer.print("" + array[i][j] + "\t");
            }
            Printer.print("\n");

        }
    }
    public static void main(String[] args) {

        int[][] matrix = {{3, 2, 1}, {4, 5, 6, 7}, {8, 9}};
//        printMatrix(matrix);
//        Printer.print("Result: ");
//        printMatrix(FirstTask.findColumn(matrix));
//
        int[][] squareMatrix = {{1, 2, 3}, {4, -5, 6}, {7, 8, 9}};
//        printMatrix(squareMatrix);
//        Printer.print("Result: ");
//        printArray(SecondTask.findDiagonalElements(squareMatrix));
//
//        printMatrix(squareMatrix);
//        Printer.print("String: ");
//        printArray(ThirdTask.findString(squareMatrix, 1));
//
//        Printer.print("\nColumn: ");
//        printArray(ThirdTask.findColumn(squareMatrix, 1));
//
//        printMatrix(FourthTask.createMatrix(10));
//
//        printMatrix(FifthTask.createMatrix(10));
//
//        printMatrix(SixthTask.createMatrix(8));
//
//
//        printDoubleMatrix(SeventhTask.createMatrix(8));
//        Printer.print("Number of positive elements: " + SeventhTask.countPositiveNums(8));
//
//        printMatrix(squareMatrix);
//        Printer.print("Result: ");
//        printMatrix(EighthTask.swapColumn(squareMatrix,0,2));
//
//        printMatrix(squareMatrix);
//        printArray(NinthTask.findSum(squareMatrix));
//        Printer.print("\nColumn with maximum sum: " + NinthTask.findMaxSum(NinthTask.findSum(squareMatrix)));
//
//        Printer.print("Positive elements: ");
//        printArray(TenthTask.findPositiveElements(squareMatrix));
//
//
//        int[][] newMatrix = EleventhTask.createMatrix();
//        printMatrix(newMatrix);
//        Printer.print("Number of strings: " + EleventhTask.findStringNums(newMatrix));
    }
}
