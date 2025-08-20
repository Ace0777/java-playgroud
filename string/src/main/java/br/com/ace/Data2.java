package br.com.ace;

public class Data2 {

    public static void main(String[] args) {

        Data2 data = new Data2();

        System.out.println(data.formateDate("7", "7", "2025"));
    }


    public String formateDate(String day, String month, String year){
       var i = String.format("%02d", Integer.parseInt(day));
       var y = String.format("%02d", Integer.parseInt(month));

        return i + "/" + y + "/" + year;
    }
}



