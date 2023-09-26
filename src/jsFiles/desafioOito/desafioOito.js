const isPedestre = prompt(
    "SEGURANÇA NA RUA\n\n" +
    "Você é pedestre ou motorista?\n\n" +
    "1- Pedestre\n" +
    "2- Motorista\n"
)

let respostaUm, respostaDois, respostaTres

switch (isPedestre) {
    case "1":
        respostaUm = prompt(
            "Responda com S [sim] ou N [não]:\n\n" +
            "Você está na faixa de pedestre?"
        )

        respostaDois = prompt(
            "O sinal está fechado para os carros?"
        )

        if(respostaUm == "s" && respostaDois == "s") {
            alert("Você pode atravessar com segurança!");
        }
        else {
            alert("Tá loco cara! Você vai morrer cara, espera um pouco aí.");
        }

        break;
    case "2":

        respostaUm = prompt(
            "Responda com S [sim] ou N [não]:\n\n" +
            "Você está usando cinto de segurança?\n" +
            "Resposta: "
        )

        respostaDois = prompt(
            "Você bebeu alguma bebida alcoólica recentemente?\n" +
            "Resposta: "
        )

        System.out.printf(
            "O sinal está aberto para os carros?\n" +
            "Resposta: "
        )

        if(respostaUm =="s" && respostaDois == "n" && respostaTres == "s") {
            alert("Você pode dirigir com segurança!");
        }
        else {
            alert("Calma lá amigo, melhor esperar um pouco para dirigir.");
        }

        break;
}