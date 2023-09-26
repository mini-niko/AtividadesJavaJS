package javaFiles;

import java.util.Scanner;

public class DesafioOito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf(
                "SEGURANÇA NA RUA\n\n" +
                        "Você é pedestre ou motorista?\n\n" +
                        "1- Pedestre\n" +
                        "2- Motorista\n\n" +
                        "Resposta: "
        );

        int isPedestre = scan.nextInt();
        System.out.println();

        String respostaUm, respostaDois, respostaTres;
        respostaUm = "";

        switch (isPedestre) {
            case 1:
                System.out.printf(
                        "\nResponda com S [sim] ou N [não]:\n\n" +
                                "Você está na faixa de pedestre?\n" +
                                "Resposta: "
                );

                scan.nextLine();
                respostaUm = scan.nextLine();

                System.out.printf(
                        "\nO sinal está fechado para os carros?\n" +
                                "Resposta: "
                );

                respostaDois = scan.nextLine();
                System.out.println();

                if(respostaUm.equals("s") && respostaDois.equals("s")) {
                    System.out.println("Você pode atravessar com segurança!");
                }
                else {
                    System.out.println("Tá loco cara! Você vai morrer cara, espera um pouco aí.");
                }

                break;
            case 2:

                System.out.printf(
                        "Responda com S [sim] ou N [não]:\n\n" +
                                "Você está usando cinto de segurança?\n" +
                                "Resposta: "
                );

                scan.nextLine();
                respostaUm = scan.nextLine();
                System.out.println();

                System.out.printf(
                        "Você bebeu alguma bebida alcoólica recentemente?\n" +
                                "Resposta: "
                );

                respostaDois = scan.nextLine();
                System.out.println();

                System.out.printf(
                        "O sinal está aberto para os carros?\n" +
                                "Resposta: "
                );

                respostaTres = scan.nextLine();
                System.out.println();

                if(respostaUm.equals("s") && respostaDois.equals("n") && respostaTres.equals("s")) {
                    System.out.println("Você pode dirigir com segurança!");
                }
                else {
                    System.out.println("Calma lá amigo, melhor esperar um pouco para dirigir.");
                }

                break;
        }

    }
}
