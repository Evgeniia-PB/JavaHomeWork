package com.pb.Krivolapova.HW8;

public class WrongPasswordException extends Exception {
    private String detailpass;

    public WrongPasswordException() {
        detailpass = "Не верный пароль";
    }

    public WrongPasswordException(String message) {
        super(message);
        detailpass = message;
    }

    @Override
    public String toString() {
        return "Ошибка: " + detailpass;
    }
}