package br.com.ace;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Literals {
    public static void main(String[] args) {

        String name = "Alice";
        int age = 31;
        double points = 8.347;

        // Simple literal
        String str1 = "Olá, mundo!";

        // Concatenation
        String str2 = "Cliente " + name + " tem idade " + age + " anos e fez " + points + " pontos.";

        // Escape characters
        String str3 = "Cliente: " + name + "\nIdade: " + age; // using to break line

        String str4 = "c:\\Program Files\\Windows"; // using \ to print another \

        String str5 = "Senha = \"carro123\""; // Using / bar to print ""

        String str6 = "<html>\n" // /n using to break line and \t to tab
                + "\t<body>\n"
                + "\t\t<p>Hello, World!</p>\n"
                + "\t</body>\n"
                + "</html>\n";



        //Training Immutability and how to "break" this...

        String str = "Hello world";
        char [] array = str.toCharArray();
        System.out.println(array);
        array [2] = 'e';
        String newStr = new String(array);
        System.out.println(newStr);


    }
}