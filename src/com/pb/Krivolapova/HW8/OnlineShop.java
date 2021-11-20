package com.pb.Krivolapova.HW8;
import java.util.Scanner;


public class OnlineShop extends Auth{
    static Scanner scanner = new Scanner(System.in);

    public OnlineShop(String login, String password) {
        super(login, password);
    }

    public static void main(String[] args) throws WrongPasswordException, WrongLoginException {
        String loginReg;
        String passwordReg;
        String confpassword;
        String loginIn;
        String passwordIn;
        Auth User;
        System.out.println("Вы хотите зарегистрироваться?(0-нет)");
        if (scanner.nextLine().equals("0")){
            System.exit(0);
        };
        System.out.println("Регистрация");
        System.out.println("Введите логин:");
        loginReg = new String(scanner.nextLine());
        System.out.println("Введите пароль:");
        passwordReg = new String(scanner.nextLine());
        System.out.println("Повторите пароль:");
        confpassword = new String(scanner.nextLine());
        signUp(loginReg, passwordReg,confpassword);
        User = new Auth(loginReg,passwordReg);
        System.out.println("Вы хотите авторизироваться?(0-нет)");
        if (scanner.nextLine().equals("0")){
            System.exit(0);
        };
        System.out.println("Авторизация");
        System.out.println("Введите логин:");
        loginIn = new String(scanner.nextLine());
        System.out.println("Введите пароль:");
        passwordIn = new String(scanner.nextLine());
        SignIn(loginIn,passwordIn,User);
    }
}
