package com.pb.Krivolapova.HW3;
import java.util.Arrays;

import com.sun.deploy.net.MessageHeader;

public class Array {


    public static void main(String[] args) {
        int[] array = new int[]{-1, -2, -3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int counter = 0;
        int sum = 0;
        for (int num : array) {
            sum = sum + num;
            counter ++;

        }

        System.out.println("Сумма элементов массива равна: " + sum);
        System.out.println("Количество положительных элементов массива = " + counter);


        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

        }



