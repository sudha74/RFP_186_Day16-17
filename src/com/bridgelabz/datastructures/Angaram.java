package com.bridgelabz.datastructures;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Angaram {
    public static boolean findAngaram(String str1, String str2) {
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        if (str1.length() != str2.length()) {
            return false;
        } else {
            Arrays.sort(array1);
            Arrays.sort(array2);
            if (Arrays.equals(array1, array2)) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        String str1, str2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String one");
        str1 = scanner.next();
        System.out.println("Enter String two");
        str2 = scanner.next();

        boolean result = findAngaram(str1, str2);
        if (result) {
            System.out.println("Two Strings are Angaram");
        } else {
            System.out.println("Two Strings are not Anagaram");
        }
    }
}
