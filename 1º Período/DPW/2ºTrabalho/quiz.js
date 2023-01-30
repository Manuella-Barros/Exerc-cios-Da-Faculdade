let listaPerguntas = [
    {//1
        titulo: 'Qual foi o primeiro nome dado ao esporte?',
        alternativas: ['<input type="radio" name="nome" id="certo"> Mintonette ', '<input type="radio" name="nome" id="nome2"> Volei ', '<input type="radio" name="nome" id="nome3"> Biguette'],
        correta: 0
    },
    {//2
        titulo: 'Qual ano o volei foi criado?',
        alternativas: ['<input type="radio" name="publico" id="publico1"> 1958 ', '<input type="radio" name="publico" id="publico2"> 1985 ', '<input type="radio" name="publico" id="certo"> 1895'],
        correta: 2
    },
    {//3
        titulo: 'Em média, quantos pulos um jogador da por partida?',
        alternativas: ['<input type="radio" name="pulos" id="pulos1"> De 30 a 60', '<input type="radio" name="pulos" id="pulos2"> De 60 a 100', '<input type="radio" name="pulos" id="pulos3"> De 100 a 140'],
        correta: 0
    },
    {//4
        titulo: 'Qual era o material da bola de volei no inicio?',
        alternativas: ['<input type="radio" name="bola" id="bola1"> Pele de porco', '<input type="radio" name="bola" id="bola2"> Plástico', '<input type="radio" name="bola" id="bola3"> Uma câmara de borracha coberta de couro'],
        correta: 2
    },
    {//5
        titulo: 'Nos anos 80 houve uma regra de que não podia parar a partida para secar a quadra?',
        alternativas: ['<input type="radio" name="regra" id="regra1"> Falso', '<input type="radio" name="regra" id="regra2"> Verdade', '<input type="radio" name="regra" id="regra3"> Não sei'],
        correta: 1
    },
    {//6
        titulo: 'Marque a alternativa correta: ',
        alternativas: ['<input type="radio" name="marque" id="marque1"> A primeira quadra de Voleibol tinha as seguintes medidas: 40m de comprimento por 20m de largura', '<input type="radio" name="marque" id="marque2"> A rede tinha a largura de 0,61m', '<input type="radio" name="marque" id="marque4"> A bola era feita de pele de porco'],
        correta: 1
    },
    {//7
        titulo: 'É um tipo de saque que nada mais é que um Saque por cima combinado com uma corrida para ganhar impulsão, um salto e um golpe com potência na bola". Qual o nome desse saque?',
        alternativas: ['<input type="radio" name="saque" id="saque1">Saque por baixo', '<input type="radio" name="saque" id="saque2">Saque por cima', '<input type="radio" name="saque" id="saque3">Saque viagem'],
        correta: 2
    },
    {//8
        titulo: 'O voleibol é o único esporte olímpico que treina todos os músculos do corpo do jogador e mais cansa o jogador". Essa afirmativa está:',
        alternativas: ['<input type="radio" name="musculo" id="musculo1"> Falso', '<input type="radio" name="musculo" id="musculo2"> Verdade', '<input type="radio" name="musculo" id="musculo2"> Não sei'],
        correta: 0
    },
    {//9
        titulo: 'O jogo de voleibol com maior público da História foi em qual lugar?',
        alternativas: ['<input type="radio" name="maiorpublico" id="maiorpublico1"> Brasil', '<input type="radio" name="maiorpublico" id="maiorpublico2"> Russia', '<input type="radio" name="maiorpublico" id="maiorpublico3"> Inglaterra'],
        correta: 0
    },
    {//10
        titulo: 'A partida de voleibol mais demorada da História durou quantas horas?',
        alternativas: ['<input type="radio" name="horas" id="horas1"> 16 horas', '<input type="radio" name="horas" id="horas2"> 9 horas', '<input type="radio" name="horas" id="horas3"> 4 horas'],
        correta: 2
    },
    {//11
        titulo: 'Qual anime fala sobre vôlei?',
        alternativas: ['<input type="radio" name="anime" id="anime1"> Haikyuu', '<input type="radio" name="anime" id="anime2"> Dororo', '<input type="radio" name="anime" id="anime3"> Angel Beats'],
        correta: 0
    },
    {//12
        titulo: 'O objetivo do jogo é fazer com que a bola passe sobre a rede fazendo-a tocar no chão da quadra adversária, evitando que os adversários façam o mesmo',
        alternativas: ['<input type="radio" name="objetivo" id="objetivo1"> Verdade', '<input type="radio" name="objetivo" id="objetivo2"> Falso', '<input type="radio" name="objetivo" id="objetivo3"> Não sei'],
        correta: 0
    },
    {//13
        titulo: 'Um maleficio do vôlei é que ele é um exercício que não desenvolve a coordenação motora',
        alternativas: ['<input type="radio" name="maleficio" id="maleficio1"> Verdade', '<input type="radio" name="maleficio" id="maleficio2"> Falso', '<input type="radio" name="maleficio" id="maleficio3"> Não sei'],
        correta: 1
    },
    {//14
        titulo: 'Um beneficio do vôlei é ele é um exercício que aumenta a agilidade, a massa muscular, alivia o stress e emagrece',
        alternativas: ['<input type="radio" name="beneficio" id="beneficio1"> Verdade', '<input type="radio" name="beneficio" id="beneficio2"> Falso', '<input type="radio" name="beneficio" id="beneficio3"> Não sei'],
        correta: 0
    },
    {//15
        titulo: 'O Grand Prix é uma das principais competições do voleibol',
        alternativas: ['<input type="radio" name="competicao" id="competicao1"> Verdade', '<input type="radio" name="competicao" id="competicao2"> Falso', '<input type="radio" name="competicao" id="competicao3"> Não sei'],
        correta: 0
    },
    {//16
        titulo: 'A federação de vôlei, na França, a FIVB foi em 1997',
        alternativas: ['<input type="radio" name="federacao" id="federacao1"> Verdade', '<input type="radio" name="federacao" id="federacao2"> Falso', '<input type="radio" name="federacao" id="federacao3"> Não sei'],
        correta: 1
    },
    {//17
        titulo: 'A ação defensiva na qual um jogador, para defender uma bola, realiza um movimento semelhante ao de um mergulho se chama defesa de viagem.',
        alternativas: ['<input type="radio" name="viagem" id="viagem1"> Verdade', '<input type="radio" name="viagem" id="viagem2"> Falso', '<input type="radio" name="viagem" id="viagem3"> Não sei'],
        correta: 1
    },
    {//18
        titulo: 'No Brasil o vôlei é a uma das modalidades menos praticadas.',
        alternativas: ['<input type="radio" name="brasil" id="brasil1"> Verdade', '<input type="radio" name="brasil" id="brasil2"> Falso', '<input type="radio" name="brasil" id="brasil3"> Não sei'],
        correta: 1
    },
    {//19
        titulo: 'A partida de voleibol mais demorada da História ocorreu na final dos Jogos Olímpicos de Montreal (1976). O jogo entre União Soviética e Polônia.',
        alternativas: ['<input type="radio" name="demorada" id="demorada1"> Verdade', '<input type="radio" name="demorada" id="demorada2"> Falso', '<input type="radio" name="demorada" id="demorada3"> Não sei'],
        correta: 0
    },
    {//20
        titulo: 'O jogo de voleibol com maior público da História teve 95 mil espectadores.',
        alternativas: ['<input type="radio" name="publico" id="publico1"> Verdade', '<input type="radio" name="publico" id="publico2"> Falso', '<input type="radio" name="publico" id="publico3"> Não sei'],
        correta: 0
    },
];
var contador = 0;

//FUNÇÕES QUE MOSTRAM AS QUESTÕES
function mostraQuestao1(q){
    var questoes = document.getElementById('pergunta1');
    questoes.innerHTML = `<p>1 - ${q.titulo}</p>`;

    var opcoes = document.querySelectorAll('.alternativa1');
    opcoes.forEach(function(element, index){ //isso aqui le cada elemento das opcoes
        element.innerHTML = q.alternativas[index];
        element.addEventListener('click', function(){
            if(index == q.correta){//se o index da questão clicada for == o index da questão correta
                console.log("Acertou!");
                contador++;
            } else{
                console.log("Errou!");
            }
        })
    })
}
function mostraQuestao2(q){
    var questoes = document.getElementById('pergunta2');
    questoes.innerHTML = `<p>2 - ${q.titulo}</p>`;

    var opcoes = document.querySelectorAll('.alternativa2');
    opcoes.forEach(function(element, index){ //isso aqui le cada elemento das opcoes
        element.innerHTML = q.alternativas[index];
        element.addEventListener('click', function(){
            if(index == q.correta){//se o index da questão clicada for == o index da questão correta
                console.log("Acertou!");
                contador++;
            } else{
                console.log("Errou!");
            }
        })
    })
}
function mostraQuestao3(q){
    var questoes = document.getElementById('pergunta3');
    questoes.innerHTML = `<p>3 - ${q.titulo}</p>`;

    var opcoes = document.querySelectorAll('.alternativa3');
    opcoes.forEach(function(element, index){ //isso aqui le cada elemento das opcoes
        element.innerHTML = q.alternativas[index];
        element.addEventListener('click', function(){
            if(index == q.correta){//se o index da questão clicada for == o index da questão correta
                console.log("Acertou!");
                contador++;
            } else{
                console.log("Errou!");
            }
        })
    })
}
function mostraQuestao4(q){
    var questoes = document.getElementById('pergunta4');
    questoes.innerHTML = `<p>4 - ${q.titulo}</p>`;

    var opcoes = document.querySelectorAll('.alternativa4');
    opcoes.forEach(function(element, index){ //isso aqui le cada elemento das opcoes
        element.innerHTML = q.alternativas[index];
        element.addEventListener('click', function(){
            if(index == q.correta){//se o index da questão clicada for == o index da questão correta
                console.log("Acertou!");
                contador++;
            } else{
                console.log("Errou!");
            }
        })
    })
}
function mostraQuestao5(q){
    var questoes = document.getElementById('pergunta5');
    questoes.innerHTML = `<p>5 - ${q.titulo}</p>`;

    var opcoes = document.querySelectorAll('.alternativa5');
    opcoes.forEach(function(element, index){ //isso aqui le cada elemento das opcoes
        element.innerHTML = q.alternativas[index];
        element.addEventListener('click', function(){
            if(index == q.correta){//se o index da questão clicada for == o index da questão correta
                console.log("Acertou!");
                contador++;
            } else{
                console.log("Errou!");
            }
        })
    })
}

var pr = 0;//primeira questão
var se = 0;//segunda questão
var te = 0;//terceira questão
var qua = 0;//quarta questão
var qui = 0;//quinta questão

var aux = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]; //array auxiliar para verificar quais elementos da lista principal ja foram usados
var quantidade = 0;



randomQuestões()

function randomQuestões(){
    //PARA A PRIMEIRA QUESTÃO
    pr = Math.floor(Math.random() * 19); //multiplica pelo valor maximo do numero que vc quer, esse por exemplo vai de 0 a 5
    for(var n = 0; n < aux.length; n++){
        if(aux[n] == pr){
            do{
                pr = Math.floor(Math.random() * 19);
            } while(aux[n] == pr);
        }
    }
    mostraQuestao1(listaPerguntas[pr]);
    aux[pr] = pr;
    console.log("pr = " + pr);
    console.log("aux = " + aux);

    //PARA A SEGUNDA QUESTÃO
    se = Math.floor(Math.random() * 19); //multiplica pelo valor maximo do numero que vc quer, esse por exemplo vai de 0 a 5
    for(var n = 0; n < aux.length; n++){
        if(aux[n] == se){
            do{
                se = Math.floor(Math.random() * 19);
            } while(aux[n] == se);
        }
    }
    mostraQuestao2(listaPerguntas[se]);
    aux[se] = se;
    console.log("pr = " + se);
    console.log("aux = " + aux);

    //PARA A TERCEIRA QUESTÃO
    te = Math.floor(Math.random() * 19); //multiplica pelo valor maximo do numero que vc quer, esse por exemplo vai de 0 a 5
    for(var n = 0; n < aux.length; n++){
        if(aux[n] == te){
            do{
                te = Math.floor(Math.random() * 19);
            } while(aux[n] == te);
        }
    }
    mostraQuestao3(listaPerguntas[te]);
    aux[te] = te;
    console.log("pr = " + te);
    console.log("aux = " + aux);

    //PARA A QUARTA QUESTÃO
    qua = Math.floor(Math.random() * 19); //multiplica pelo valor maximo do numero que vc quer, esse por exemplo vai de 0 a 5
    for(var n = 0; n < aux.length; n++){
        if(aux[n] == qua){
            do{
                qua = Math.floor(Math.random() * 19);
            } while(aux[n] == qua);
        }
    }
    mostraQuestao4(listaPerguntas[qua]);
    aux[qua] = qua;
    console.log("pr = " + qua);
    console.log("aux = " + aux);

    //PARA A QUINTA QUESTÃO
    qui = Math.floor(Math.random() * 19); //multiplica pelo valor maximo do numero que vc quer, esse por exemplo vai de 0 a 5
    for(var n = 0; n < aux.length; n++){
        if(aux[n] == qui){
            do{
                qui = Math.floor(Math.random() * 19);
            } while(aux[n] == qui);
        }
    }
    mostraQuestao5(listaPerguntas[qui]);
    aux[qui] = qui;
    console.log("pr = " + qui);
    console.log("aux = " + aux);
}


if (pr == 4){
    aux.fill(0);
    pr = 0;
}

function clicou(){
    switch (contador) {
        case 0:
            document.getElementById("res").innerHTML = '<p> Você acertou <span style="color:red;">0%</span> das questões </p>'
            break;
        case 1:
            document.getElementById("res").innerHTML = '<p> Você acertou <span style="color:red;">20%</span> das questões </p>'
            break;
        case 2:
            document.getElementById("res").innerHTML = '<p> Você acertou <span style="color:red;">40%</span> das questões </p>'
            break;
        case 3:
            document.getElementById("res").innerHTML = '<p> Você acertou <span style="color:red;">60%</span> das questões </p>'
            break;
        case 4:
            document.getElementById("res").innerHTML = '<p> Você acertou <span style="color:red;">80%</span> das questões </p>'
            break;
        case 5:
            document.getElementById("res").innerHTML = '<p> Você acertou <span style="color:red;">100%</span> das questões </p>'
            break;
    
        default:
            break;
    }
    contador = 0; //Reseta o contador
    document.querySelector('form').reset(); //Limpa os checked dos inpu
}