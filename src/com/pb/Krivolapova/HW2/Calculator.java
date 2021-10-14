package com.pb.Krivolapova.HW2;

import java.util.Scanner;

public class Calculator<result> {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int operand1 = getInt();
        int operand2 = getInt();
        char operation = getOperation();
        int result = calc(operand1, operand2, operation);
        System.out.println("Результат операции: " + result);
    }

    public static int getInt() {
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

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Допущена ошибка. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int operand1, int operand2, char operation) {
        int result=0;
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                //result = operand1 / operand2;
                try {
                    result = operand1 / operand2;
                } catch (ArithmeticException e) {
                    System.out.println("Математическая ошибка");
                }
                break;

        }

        return result;
    }
}