function calcular(){
    var data = new Date(); // aqui ta pegando Tue Dec 06 2022 17:59:32 GMT-0300 (Horário Padrão de Brasília) CERTO
    var hora = data.getHours();
    var dia = data.getDate(); 
    var min = data.getMinutes();
    var mes = data.getMonth() + 1; // O mes ta errado n sei pq, então adicionei 1, n sei oq ta errado
    var segundos = data.getSeconds();
    var ano = data.getFullYear();
    var paragrafo = document.getElementById('calculos'); //Aqui eu tenhoa acesso a tag com o id paragrafo

    // printando com o innerHTML
    document.getElementById("calculos").innerHTML = "hora + dia = " + (hora + dia);
    document.getElementById("calculos").innerHTML += "<br> minuto + mês = " + (min + mes);
    document.getElementById("calculos").innerHTML += "<br> segundos + ano = " + (segundos + ano);  

    //PRINTS NOS CONSOLES
    console.log("hora + dia = " + (hora + dia));    
    console.log("minuto + mês = " + (min + mes));    
    console.log("segundos + ano = " + (segundos + ano));    
}