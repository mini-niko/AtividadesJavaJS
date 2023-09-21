package javaFiles;

import java.util.Scanner;

public class DesafioDois {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        Double nota1, nota2, nota3, nota4, nota5;

        System.out.printf("Digite a 1ª nota do aluno: ");
        nota1 = scan.nextDouble();

        System.out.printf("Digite a 2ª nota do aluno: ");
        nota2 = scan.nextDouble();

        System.out.printf("Digite a 3ª nota do aluno: ");
        nota3 = scan.nextDouble();

        System.out.printf("Digite a 4ª nota do aluno: ");
        nota4 = scan.nextDouble();

        System.out.printf("Digite a 5ª nota do aluno: ");
        nota5 = scan.nextDouble();

        Double notaTotal = nota1 + nota2 + nota3 + nota4 + nota5;
        String conceito;

        //modifiquei a verificação das notas, para fechar
        if(notaTotal == 0) {
            conceito = "E";
        }
        else if(notaTotal > 0 && notaTotal <= 25) {
            conceito = "D";
        }
        else if(notaTotal > 25 && notaTotal <= 50) {
            conceito = "C";
        }
        else if(notaTotal > 50 && notaTotal <= 75) {
            conceito = "B";
        }
        else if(notaTotal > 75 && notaTotal <= 100) {
            conceito = "A";
        }
        else if(notaTotal > 100) {
            conceito = "S+";
        }
        else {
            conceito = "F";
        }

        System.out.println("");

        System.out.println("Com nota total " + notaTotal + ", você possui conceito " + conceito + ".");

        switch (conceito) {
            case "E":
                System.out.printf("Você reprovou :(");
                break;
            case "S+":
                System.out.printf("Você foi super aprovado! :D");
                break;
            case "F":
                System.out.printf("Você reprovou feio :((((");
                break;
            default:
                System.out.printf("Você foi aprovado! :)");
                break;
        }

    }
}
