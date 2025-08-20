package br.com.ace;

public class Password {

    public static void main(String[] args) {

        Password password = new Password();

        System.out.println(password.validatePassword("amerca1"));

    }

    public boolean validatePassword(String password){
        return password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@#&]).{8,}$");
    }

}
