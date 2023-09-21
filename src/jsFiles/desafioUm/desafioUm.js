var idade = prompt("Insira sua idade:")

var idadeEmAnos = Math.floor(idade / 365)
var idadeEmMeses = Math.floor((idade % 365) / 30)
var idadeEmDias = (idade % 365) % 30

alert(`Você tem ${idadeEmAnos} anos, ${idadeEmMeses} meses e ${idadeEmDias} dias de vida!`)