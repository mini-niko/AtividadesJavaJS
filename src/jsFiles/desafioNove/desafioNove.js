
var nome, idade, estudantePHP, tipoIngresso

console.log(
    "--------------------------------------\n" +
    "Reserva de Ingressos - Clube PHP Night\n" +
    "--------------------------------------\n"
)

nome = prompt("Digite seu nome: ")

idade = prompt("Digite a sua idade: ")

let value = prompt("Você é estudante de PHP? (S ou N): ")
estudantePHP = value.toLowerCase() == "s" ? true : false

value = prompt("Você deseja o ingresso VIP? (S ou N): ")
tipoIngresso = value.toLowerCase() == "s" ? "VIP" : "padrão"


if(idade < 18) {
    alert("Você não poderá reservar, apenas com mais de 18 anos :(")
}
else {
    let valorDoIngresso = tipoIngresso == "VIP" ? 50.0 : 20.0
    valorDoIngresso = estudantePHP ? valorDoIngresso * 0.5 : valorDoIngresso

    alert(
        "----------------------------------\n" +
        "Comprovante de Reserva de Ingresso\n" +
        "----------------------------------\n" +
        "\n" +
        `${nome}, seu ingresso ${tipoIngresso} foi reservado\n` +
        "com sucesso!\n"
    )

    if(estudantePHP) {
        alert(
            "----------------------------------\n" +
            "Comprovante de Reserva de Ingresso\n" +
            "----------------------------------\n" +
            "\n" +
            "Por ser estudante de PHP, você\n" +
            "ganha 50%% de desconto!\n" +
            "\n" +
            `Valor com desconto: R$${valorDoIngresso}` +
            "\n" +
            "Pague no local da festa!"
        )
    }
    else {
        alert(
            "----------------------------------\n" +
            "Comprovante de Reserva de Ingresso\n" +
            "----------------------------------\n" +
            "\n" +
            `Valor total: R$${valorDoIngresso}` +
            "\n" +
            "Pague no local da festa!"
        )
    }
}