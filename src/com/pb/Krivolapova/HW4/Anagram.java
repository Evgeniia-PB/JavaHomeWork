package com.pb.Krivolapova.HW4;
import java.util.Scanner;
public class Anagram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String a = new String();
        String b = new String();
        System.out.println("Введите первую фразу ");
        a = scanner.nextLine().toLowerCase();
        a = removePunct(a);
        System.out.println("Введите вторую фразу ");
        b = scanner.nextLine().toLowerCase();
        b = removePunct(b);
        a = sort(a);
        b = sort(b);
        boolean result = false;
        result = permutation(a,b);
        if (result == true) {
            System.out.println("Слова являются анаграммой");
        }
        else {
            System.out.println("Слова не являются анаграммой");
        }

    }
        public static String sort(String s) {
            char[] content = s.toCharArray();
            java.util.Arrays.sort(content);
            return new String(content);
        }

        public static boolean permutation (String s,String t) {
            if (s.length() != t.length()) {
                return false;
            }
            return sort(s).equals(sort(t));
        }
      public static String removePunct(String str) {
        StringBuilder result = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isAlphabetic(c) || Character.isDigit(c) || Character.isSpaceChar(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    }