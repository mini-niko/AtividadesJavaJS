package javaFiles;

import java.util.Scanner;

public class DesafioTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira um valor: ");
        int valor = scan.nextInt();
        System.out.println();

        for(int i = 1; i <= valor; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
