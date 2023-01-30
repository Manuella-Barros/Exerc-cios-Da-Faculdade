function clicouData(){
    var dia = Number(document.getElementById('diaNascimento').value);
    var mes = Number(document.getElementById('mesNascimento').value);
    var ano = Number(document.getElementById('anoNascimento').value);
    
    if(ano > 1947){
        document.getElementById('escrevaDataNascimento').innerHTML = `Você nasceu ${ano - 1947} anos depois, `
    } else if(ano < 1947){
        document.getElementById('escrevaDataNascimento').innerHTML = `Você nasceu ${1947 - ano} anos antes, `
    } else{
        document.getElementById('escrevaDataNascimento').innerHTML = `Você nasceu no mesmo ano, `
    }
    
    if(mes > 4){
        document.getElementById('escrevaDataNascimento').innerHTML += `${mes - 4} meses depois, `
    } else if(mes < 4){
        document.getElementById('escrevaDataNascimento').innerHTML += `${4 - mes} meses antes, `
    } else{
        document.getElementById('escrevaDataNascimento').innerHTML += `no mesmo mes, `
    }

    if(dia > 20){
        document.getElementById('escrevaDataNascimento').innerHTML += `${dia - 20} dias depois da criação da federação de vôlei, na França, a FIVB`
    } else if(mes < 4){
        document.getElementById('escrevaDataNascimento').innerHTML += `${20 - dia} dias antes da criação da federação de vôlei, na França, a FIVB`
    } else{
        document.getElementById('escrevaDataNascimento').innerHTML += `no mesmo dia  da criação da federação de vôlei, na França, a FIVB`
    }


}//depois da criação da federação de vôlei, na França, a FIVB