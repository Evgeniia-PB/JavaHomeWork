package com.pb.Krivolapova.HW4;
import java.util.Scanner;
public class CapitalLetter {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String a = new String();
        System.out.println("Введите фразу ");
        a = scanner.nextLine().trim();
        a = UpperLine(a);
        System.out.println(a);
    }
    public static String UpperLine(String str1) {
        String str2 = "";
        str2 = str2 + str1.substring(0, 1).toUpperCase();
        for (int i = 1; i < str1.length(); i++) {
            if (" ".equals(str1.substring(i-1, i)))
                str2 = str2 + str1.substring(i, i+1).toUpperCase();
            else
                str2 = str2 + str1.substring(i, i+1);
        }
        return str2;
    }
}


