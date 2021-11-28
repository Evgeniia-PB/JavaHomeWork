package com.pb.Krivolapova.HW10;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();

        NumBox<Integer> integer = new NumBox<>(5);
        try {
            integer.add(random.nextInt());
            integer.add(random.nextInt());
            integer.add(random.nextInt());
            integer.add(random.nextInt());
            integer.add(random.nextInt());
        } catch(FullArrayException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Сумма значений элементов типа Integer: "+integer.sum());
        System.out.println("Максимальное значение элементов типа Integer: "+integer.max());
        System.out.println("Кол-во элементов типа Integer: "+integer.length());
        System.out.println("Среднее значение элементов типа Integer: "+integer.average());

        NumBox<Float> floats = new NumBox<>(7);
        try {
            floats.add(random.nextFloat());
            floats.add(random.nextFloat());
            floats.add(random.nextFloat());
            floats.add(random.nextFloat());
            floats.add(random.nextFloat());
            floats.add(random.nextFloat());
            floats.add(random.nextFloat());
        } catch (FullArrayException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Сумма значений элементов типа Float: "+floats.sum());
        System.out.println("Максимальное значение элементов типа Float: "+floats.max());
        System.out.println("Кол-во элементов типа Float: "+floats.length());
        System.out.println("Среднее значение элементов типа Float: "+floats.average());
    }
}