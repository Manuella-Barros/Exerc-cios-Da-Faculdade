function calcularRaiz(){
    var n = []; //declarando uma array vazia ; array numeros
    var r = [] // array raizes
    var j = 0; // contador para o tamanho de n
    var l = 0; // contador para o tamanho de r

    for(var i = 1; i <= 100; i = i + 3){// Aqui ta contando os números de 1 a 100 com incremento de 3
        n[j] = i; // Aqui estou colocando cada elemento desse for dentro da array
        j++; // Aqui é um contador para determinar o tamanho da array
    }     

    for(var k = 0; k < j; k++){
        var raiz = Math.sqrt(n[k]); // calculando a raiz quadrada de cada elemento da array e salvando na variavel raiz
        r[l] = raiz; //adiciona cada raiz na nova variavel
        l++ // Aqui é um contador para determinar o tamanho da array
    }

    // printando com o innerHTML
    for(var k = 0; k < j; k++){
        document.getElementById("paragrafo").innerHTML += `<br> Raiz de ${n[k]} = ${r[k]}`;
    }


    // printando com o console
    console.log(r);    
}