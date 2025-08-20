package br.com.ace;

public class Data {
    public static void main(String[] args) {

        Data data = new Data();

        System.out.println(data.formatData("18/01/2004"));
    }

    public String formatData(String data){

        String formatted = data.replaceAll("[^0-9]", "");

        return "Dia: " + formatted.substring(0,2)  +
                "\nMes: " + formatted.substring(2,4)  +
                "\nAno: " + formatted.substring(4,8);

    }
}
