package edu.portoaz.segundasemana;
public class ClassificaAluno {
    public static void main(String[] args) {
        int mediaAluno = 5;

        if (mediaAluno < 6) {
            System.out.println("Reprovado");
        } else 
            if (mediaAluno == 6) {
                System.out.println("Prova de Minerva");
            } else {
                System.out.println("Aprovado");
        }
    }
}
