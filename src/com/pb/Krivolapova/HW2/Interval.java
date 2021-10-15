package com.pb.Krivolapova.HW2;

import java.util.Scanner;

public class Interval {
    private static Scanner in;
    public static void main(String[] args) {
        byte a = 0, b = 14, c = 15, d = 35, e = 36, f = 50, g = 51, h = 100;
        System.out.println("Проверка попадания числа в интервал от 0 до 100" + "\n" + "Введите число: ");
        in = new Scanner(System.in);
        byte i = in.nextByte();
        if (a <= i && i <= b) {
            System.out.print("Ваше число " + i + "попадает в интервал от " + a + " до " + b + "\n");
        } else if (c <= i && i <= d) {
            System.out.print("Ваше число " + i + "попадает в интервал от " + c + " до " + d + "\n");
        } else if (e <= i && i <= f) {
            System.out.print("Ваше число " + i + "попадает в интервал от " + e + " до " + f + "\n");
        } else if (g <= i && i <= h) {
            System.out.print("Ваше число " + i + "попадает в интервал от " + g + " до " + h + "\n");
        } else if (h <= i ) {
            System.out.print("Ваше число " + i + "не попадает ни в один интервал");
        } else if (a <= -i && -i <= h) {
            System.out.print("Ваше число " + i + " является отрицательным");
        }
    }
}
