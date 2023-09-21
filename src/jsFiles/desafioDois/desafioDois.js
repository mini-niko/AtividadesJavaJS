var nota1 = parseFloat(prompt("Digite a 1ª nota do aluno: "))
var nota2 = parseFloat(prompt("Digite a 2ª nota do aluno: "))
var nota3 = parseFloat(prompt("Digite a 3ª nota do aluno: "))
var nota4 = parseFloat(prompt("Digite a 4ª nota do aluno: "))
var nota5 = parseFloat(prompt("Digite a 5ª nota do aluno: "))

var notaTotal = nota1 + nota2 + nota3 + nota4 + nota5;
var conceito;

//modifiquei a verificação das notas, para fechar
if(notaTotal == 0) {
    conceito = "E";
}
else if(notaTotal > 0 && notaTotal <= 10) {
    conceito = "D";
}
else if(notaTotal > 10 && notaTotal <= 20) {
    conceito = "C";
}
else if(notaTotal > 20 && notaTotal <= 35) {
    conceito = "B";
}
else if(notaTotal > 35 && notaTotal <= 50) {
    conceito = "A";
}
else if(notaTotal > 50) {
    conceito = "S+";
}
else {
    conceito = "F";
}

alert("Com nota total " + notaTotal + ", você possui conceito " + conceito + ".");

switch (conceito) {
    case "E":
        alert("Você reprovou :(");
        break;
    case "S+":
        alert("Você foi super aprovado! :D");
        break;
    case "F":
        alert("Você reprovou feio :((((");
        break;
    default:
        alert("Você foi aprovado! :)");
        break;
}