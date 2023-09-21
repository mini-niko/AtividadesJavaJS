package javaFiles;

import java.util.ArrayList;
import java.util.Scanner;

public class DesafioSeis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int pares = 0;
        int impares = 0;

        for(int i = 1; i <= 5; i++) {
            System.out.printf(String.format("Digite o %dº número: ", i));
            int valor = scan.nextInt();

            if(valor > 0) {
                positivos++;
            }
            else if(valor < 0) {
                negativos++;
            }
            if(valor % 2 == 0) {
                pares++;
            }
            else if(valor % 2 == 1 || valor % 2 == -1) {
                impares++;
            }
        }

        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);

    }
}
