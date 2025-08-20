package br.com.ace;

public class Regex {
    public static void main(String[] args) {

        //Regular expressions, useful to validate strings or writing pattern

        Regex regex = new Regex();

        System.out.println(regex.validateCep("12345-678"));

        System.out.println(regex.removeCrt("12345-678"));

        System.out.println(regex.verifyDomain("domain"));

        System.out.println(regex.ValidateEmail("teste@dominio.com"));

        System.out.println(regex.removeNonDigits("213-123-213,2321"));


    }

    public Boolean validateCep(String cep){
        return cep.matches("^\\d{5}-?\\d{3}$");
    }

    public String removeCrt(String cep){
        return cep.replaceAll("\\D", "");
    }

    public Boolean verifyDomain(String domain){
        return domain.matches(".*[br].*");
    }

    public boolean ValidateEmail(String email){
        return email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$");
    }

    public String removeNonDigits(String cpf){
        return cpf.replaceAll("\\D", "");
    }
}


