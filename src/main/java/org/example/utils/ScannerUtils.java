package org.example.utils;

import java.util.Scanner;

public class ScannerUtils {
    static Scanner SCANNER = new Scanner(System.in);
    public static int nextIntAndNextLine() {
        int integer = SCANNER.nextInt();
        SCANNER.nextLine();
        return integer;
    }
    public static String nextLine() {
        return SCANNER.nextLine();
    }
 }
