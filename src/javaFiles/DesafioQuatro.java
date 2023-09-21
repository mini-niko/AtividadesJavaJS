package javaFiles;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioQuatro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira a primeira nota: ");
        Double nota1 = scan.nextDouble();

        System.out.printf("Insira a segunda nota: ");
        Double nota2 = scan.nextDouble();

        System.out.printf("Insira a terceira nota: ");
        Double nota3 = scan.nextDouble();

        Double nota1comPeso = (2.0 * nota1);
        Double nota2comPeso = (3.0 * nota2);
        Double nota3comPeso = (5.0 * nota3);

        Double notaTotal = (nota1comPeso + nota2comPeso + nota3comPeso) / 10;

        System.out.print("A sua nota foi: " + notaTotal);

    }
}
