var lista = [
    '<img src="imagens/png/Meu projeto.png" alt="Hinata" id="img2Hinata">',
    '<img src="imagens/png/Haikyuu-PNG-Image.png" alt="Hinata" id="img3Hinata">',
    '<img src="imagens/png/Meu projeto (1).png" alt="Hinata" id="Img1Hinata">'
]


if (typeof(Storage) !== "undefined"){//é pra saber se o navegador suporta web storage                
    if (localStorage.num){
        localStorage.num = Number(localStorage.num) + 1;  //aqui ta somando 1 quando recarrega
    } else{
        localStorage.num = 0;    
    }

    if(localStorage.num > 2){
        localStorage.num = 0;// quando a contagem chegar a 2 volta pra 0
    }
                        
    document.getElementById("imagensInicio").innerHTML = lista[localStorage.num];
} else{
    document.getElementById("imagensInicio").innerHTML = "Seu navegador não suporta Web Storage";
}                                                      