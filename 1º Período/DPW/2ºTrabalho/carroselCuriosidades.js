var carrosel = document.getElementById('carrosel');
const fotos = [
    'imagens/carrosel/7dcd159d64e2c364f2818712a7f0dafe.jpeg', //0
    'imagens/carrosel/Vôlei.jpg', //1
    'imagens/carrosel/WhatsApp-Image-2021-08-04-at-11.43.17-AM.png' //2
]
var i = 0;

carrosel.addEventListener("mouseover", function mouseover(){
    document.getElementById('img2CarroselCuriosidades').src = fotos[2-i];//2    //0 //1  //2
    if(i == 2){
        i = 0;
    }else{
        i++;
    }
    document.getElementById('img1CarroselCuriosidades').src = fotos[2-i];//1   //2  //0  //1
    if(i == 2){
        i = 0;
    }else{
        i++;
    }
    document.getElementById('img3CarroselCuriosidades').src = fotos[2-i]; //0  //1  //2  //0
});

