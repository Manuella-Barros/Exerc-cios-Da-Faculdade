//DOMContentLoaded => É chamada quando a pagina carrega, menos os src
document.addEventListener("DOMContentLoaded", function(){
    //-------------------------------- VARIÁVEIS ----------------------------------------------
    const meses = ["janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"];   
    var data = new Date();
    var ano = data.getFullYear();
    var mes = data.getMonth();
    var dia = data.getDate();
    //Descobre o primeiro e ultimo dia do mes
    var primeiroDiaMes = new Date(ano, mes, 1).getDate(); //dia 1 do mes atual
    var ultimoDiaMes = new Date(ano, mes + 1, 0).getDate(); // dia 0 do prox mes, se o dia 1 ta na posição 1, o dia 0 do mes atual é o ultimo dia do mes anterior
    var diaAnteriorAoPrimeiro = new Date(ano, mes, 0).getDate();// pega o ultimo dia do mes aterior

    //--------------------------------- FUNÇÕES ------------------------------------------------
    //Essa função poe o mes e o ano no calendario
    function atualizaData(mes, ano, dia){
        document.getElementById("mes").innerHTML = meses[mes];
        document.getElementById("ano").innerHTML = ano;
    }

    //chama a função
    atualizaData(mes, ano, dia);

    //---------------------------- Escreve no calendario -----------------------------------------------
    //esceve dia do mes anterior
    document.getElementById('diasMes').innerHTML += `<div class="diasMesNumAnterior">${diaAnteriorAoPrimeiro}</div>`;

    //escreve os dias do mes
    for(var i = primeiroDiaMes; i <= ultimoDiaMes; i++){
        if(i == dia){
            document.getElementById('diasMes').innerHTML += `<div class="diaAtual">${i}</div>`;
        } else{
            document.getElementById('diasMes').innerHTML += `<div class="diasMesNum">${i}</div>`;
        }
    }

    //escreve os dias do prox mes
    for(var i = primeiroDiaMes; i <= (35 - (ultimoDiaMes + 1)); i++){
        document.getElementById('diasMes').innerHTML += `<div class="diasMesNumSeguinte">${i}</div>`;
    } 

})