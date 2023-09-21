package javaFiles;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioCinco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double horasTrabalhadas = 43.5;
        Double salarioHora = 40.5;
        Double salario = horasTrabalhadas * salarioHora;

        System.out.printf("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println();

        System.out.println(String.format("Olá %s!", nome));
        System.out.println(String.format("Horas trabalhadas: %.0fh", horasTrabalhadas));
        System.out.println(String.format("Salário hora: R$%.2f", salarioHora));
        System.out.println(String.format("Salário do mês R$%.2f", salario));

    }
}
