package edu.portoaz.terceirasemana;
public class RetornaNome {

    public static void main(String[] args) {
        String primeiroNome = "José Francisco";
        String segundoNome = "Azevedo da Silva";

        String nomeCompleto = NomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String NomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
    
}
