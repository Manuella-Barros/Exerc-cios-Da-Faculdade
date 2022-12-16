                                    // JS PARAGRAFO
var contador = 0;

function clicouParagrafo(){
    document.getElementById("1").style.color = "blue";
    document.getElementById("2").style.color = "red";
    document.getElementById("3").style.color = "violet";
    
    if(contador % 2 != 0){
        //Quero depois mudar isso para um class só
        document.getElementById("1").style.color = "black";
        document.getElementById("2").style.color = "black";
        document.getElementById("3").style.color = "black";    
    }

    contador++;
}

                                    //JS EX2 A
var lista = [
    "https://almeidajunior-prod1.s3.amazonaws.com/prod/uploads/news/5d81505ac6770.jpg",
    "https://peru21.pe/resizer/yNu6EZADMOnCY-YGevBD84tCoSM=/1200x1200/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/6RDFP4F6QNCN7FYPLOTLM2IQ5M.jpg",
    "https://depor.com/resizer/-cdgL4Zc0NBFZiYAF5B8kdSq1qk=/620x0/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/4LZ2CNAAAZBDTEAFPVC6N3OMGQ.jpg",
    "https://depor.com/resizer/LyX4qks1rzSUjgTw28-SuJn6ijo=/1200x800/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/GWPQ6ECINNGJ3GKSBYILKO5QTE.jpg",
    "https://classic.exame.com/wp-content/uploads/2016/09/size_960_16_9_bob-esponja5.jpg?quality=70&strip=info&w=960"
]

var i = 0;

function mudarFotoA(){
    i++

    if (i == 5){
        i = 0;
    }  

    document.getElementById('fotoA').src = lista[i];
}

                                    // JS EX2 B
var i = 0;

function mudarFotoB(){
    i = Math.floor(Math.random() * 5); //multiplica pelo valor maximo do numero que vc quer, esse por exemplo vai de 0 a 5

    console.log(i);

    if (i == lista.length){
        i = 0;
    }  

    document.getElementById('fotoB').src = lista[i];
}

                                    //JS EX2 C
var i = 0;
var aux = [0, 0, 0, 0, 0]; //array auxiliar para verificar quais elementos da lista principal ja foram usados
var quantidade = 0;

function mudarFotoC(){
    i = Math.floor(Math.random() * 5); //multiplica pelo valor maximo do numero que vc quer, esse por exemplo vai de 0 a 5
    quantidade++

    if (aux[i] == 0){
        document.getElementById('fotoC').src = lista[i];
        aux[i] = 1;
        
    } else{
        do {
            i = Math.floor(Math.random() * 5); //multiplica pelo valor maximo do numero que vc quer, esse por exemplo vai de 0 a 5

        } while(aux[i] == 1);
    
        document.getElementById('fotoC').src = lista[i];
    }
    
    if (quantidade == 5){
        aux.fill(0);
        quantidade = 0;
    }

    console.log("i = " + i);
    console.log("quantidade = " + quantidade);

}

                                    //JS EX 3
//Resolver o erro pq as vezes da um numero fora da array, por exemplo se o dia de hj for sexta ondomingo da como undefined

var dias = ["Domingo", "2ª Feira", "3ª Feira", "4ª Feira", "5ª Feira", "6ª Feira", "Sabado"]; //aqui ta criando uma string com os dias da semana
var i = 0;
var data = new Date();
var diaSemana = dias[data.getDay()]; //dia da semana
var dia = data.getDate(); //data
var mes = data.getMonth() + 1; //mes
var ano = data.getFullYear(); //ano
var hoje = `${dia}/${mes}/${ano}`;
var amanha = `${dia + 1}/${mes}/${ano}`;
var depoisDeAmanha = `${dia + 1}/${mes}/${ano}`;
var diaSemanaAmanha = dias[data.getDay() + 1]; //dia da semana
var diaSemanaDepoisDeAmanha = dias[data.getDay() + 2]; //dia da semana

document.getElementById('tabela').innerHTML += `<tr> <td>${hoje}</td> <td>${amanha}</td> <td>${depoisDeAmanha}</td></tr>`;
document.getElementById('tabela').innerHTML += `<tr> <td>${diaSemana}</td> <td>${diaSemanaAmanha}</td> <td>${diaSemanaDepoisDeAmanha}</td></tr>`;