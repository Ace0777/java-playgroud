package br.com.ace;

public class Cpf {
    public static void main(String[] args) {
        System.out.println(removeNonDigits("874.092.172-93"));
    }

    public static String removeNonDigits(String str){
        return str.replaceAll("\\D", "");
    }
}
