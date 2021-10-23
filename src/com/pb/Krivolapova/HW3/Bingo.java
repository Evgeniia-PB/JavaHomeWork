package com.pb.Krivolapova.HW3;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Угадай загаданное число от 0 до 100");
        System.out.println("Для выхода с программы введите - 101.");


        final int MAX_ATTEMPT = 100;
        int attempt = 0;
        Random random = new Random();
        int x = random.nextInt(100);
        //System.out.println(x);

        while (attempt < 101) {
            attempt++;
            //System.out.println("Попытка " + attempt + ":");
            int y = getInt();

            if (y == 101) {
                break;
            }
            if (y > x) {
                System.out.println("Загаданное число меньше");
                continue;
            }
            if (y < x) {
                System.out.println("Загаданное число больше");
                continue;
            }

            System.out.println("Поздравляем, Вы угадали число с " + attempt + " попытки");
            break;

        }
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int operand;
        if (scanner.hasNextInt()) {
            operand = scanner.nextInt();
        } else {
            System.out.println("Допущена ошибка. Попробуйте еще раз.");
            scanner.next();
            operand = getInt();
        }
        return operand;

    }
}

