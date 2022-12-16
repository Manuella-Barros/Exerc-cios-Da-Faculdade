function calculoTempo(){
    var data = new Date();
    var dia = data.getDate();
    var mes = data.getMonth() + 1; // O mes ta errado n sei pq, então adicionei 1, n sei oq ta errado
    var ano = data.getFullYear();
    var hora = data.getHours();
    var min = data.getMinutes();
    var seg = data.getSeconds();

    console.log(dia + "/" + mes + "/" + ano);
    console.log(hora + ":" + min + ":" + seg);
}