package com.pb.Krivolapova.HW8;

public class Auth {
    private String login;
    private String password;

    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void signUp (String logi, String pass, String confPass) throws WrongLoginException, WrongPasswordException {
        int lengthlog = logi.length();
        if ((lengthlog < 5) || (lengthlog > 20)) {
            throw new WrongLoginException("Логин должен быть больше 5 и меньше 20 символов");
        }
        if (logi.matches("^[a-zA-Z0-9]+$")) {
        } else throw new WrongLoginException("Логин может содержать только буквы латинского алфавита и цифры");


        int length = pass.length();
        if ((length < 5)) {
            throw new WrongPasswordException("Пароль должен быть больше 5 символов");
        }
        if (pass.matches("^[a-zA-Z0-9_]+$")) {
        } else
            throw new WrongPasswordException("Пароль может содержать только буквы латинского алфавита, цифры и знак подчеркивания");
        if (pass.equals(confPass)) {
        } else throw new WrongPasswordException("Пароли должны совпадать");
    }

    public static void SignIn (String Login, String Password, Auth user)  throws WrongLoginException, WrongPasswordException{
            if (Login.equals(user.getLogin())) {
            }
            else throw new WrongLoginException();
            if (Password.equals(user.getPassword())) {
            }
            else throw new WrongPasswordException();
        }

    }


