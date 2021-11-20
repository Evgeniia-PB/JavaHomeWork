package com.pb.Krivolapova.HW8;

public class WrongLoginException extends Exception {
    private String detaillog;

    public WrongLoginException() {
        detaillog = "Не верный логин";
    }

    public WrongLoginException(String message) {
        super(message);
        detaillog = message;
    }

    @Override
    public String toString() {
        return "Ошибка: " + detaillog;
    }
}