package com.dest.calculation.utils;

import java.util.Scanner;

public class inputUtils {

    private static Scanner scanner = new Scanner(System.in);

    public static Number inputNum(String s) {
        System.out.print(s + " : ");
        return scanner.nextDouble();
    }

}
