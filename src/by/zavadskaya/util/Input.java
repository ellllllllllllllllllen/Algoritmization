package by.zavadskaya.util;

import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static double input(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }
}
