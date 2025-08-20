package br.com.ace;

import java.util.Arrays;

public class Email {
    public static void main(String[] args) {



        Email email = new Email();
        System.out.println((email.extractEmailInformation("Luishhasantosbr@gmail.com.br")));


    }

    public String extractEmailInformation(String email){

        String [] parts  =  email.split("@");
        String username = parts[0];
        String domain = parts[1];
        String isBrazilian = email.endsWith(".br")?"sim":"nao";

        return "Usuario: " + username + "\nDominio: " + domain + "\nbrasilerio:"  + isBrazilian;

    }

}


