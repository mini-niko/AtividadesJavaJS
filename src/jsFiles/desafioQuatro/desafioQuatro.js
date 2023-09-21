var nota1 = prompt("Insira a primeira nota: ");
var nota2 = prompt("Insira a segunda nota: ");
var nota3 = prompt("Insira a terceira nota: ");

var nota1comPeso = (2.0 * nota1);
var nota2comPeso = (3.0 * nota2);
var nota3comPeso = (5.0 * nota3);

var notaTotal = (nota1comPeso + nota2comPeso + nota3comPeso) / 10;

alert(`A sua nota foi: ${notaTotal}`);