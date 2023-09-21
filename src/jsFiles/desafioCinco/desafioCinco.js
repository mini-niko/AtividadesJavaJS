var horasTrabalhadas = 44.0;
var salarioHora = (40.0).toFixed(2);
var salario = (horasTrabalhadas * salarioHora).toFixed(2);

var nome = prompt("Digite seu nome: ")

alert(`Olá ${nome}!`)
alert(`Você teve ${horasTrabalhadas}h trabalhadas.`)
alert(`Você tem o salário hora de R$${salarioHora}`)
alert(`Você irá receber R$${salario} esse mês`)
