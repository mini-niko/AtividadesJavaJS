var positivo = 0;
var negativo = 0;
var pares = 0;
var impares = 0;

for(let i = 1; i <= 5; i++) {
    let value = prompt(`Digite o valor ${i + 5}:`)

    if(value % 2 == 0) {
        pares++
    }
    else {
        impares++
    }

    if(value > 0) {
        positivo++
    }
    else if(value < 0) {
        negativo++
    }

}

alert(positivo + " números positivos")
alert(negativo + " números negativos")
alert(pares + " números pares")
alert(impares + " números impares")