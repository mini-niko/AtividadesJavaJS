package javaFiles;

import java.util.Scanner;

public class DesafioUm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int idade;

        System.out.printf("Insira a sua idade em dias: ");
        
        idade = scan.nextInt();
        
        int idadeEmAnos = (int) Math.floor(idade / 365);
        int idadeEmMeses = (int) Math.floor((idade % 365)/30);
        int idadeEmDias = (int) Math.floor((idade % 365) % 30);

        System.out.printf("");
        System.out.printf("Você tem: " + idadeEmAnos + " ano(s), " + idadeEmMeses + " mes(es) e " + idadeEmDias + " dia(s) de vida!");
    }
}
