function apertou() {
    //VAR8IAVEIS
    var fonteCuriosidades = document.getElementById("fonteCuriosidades").value;
    var corLetraCuriosidades = document.getElementById("corLetraCuriosidades").value;
    var corBackgroundCuriosidades = document.getElementById("corBackgroundCuriosidades").value;
    var p = document.getElementsByTagName("p");
    var li = document.getElementsByTagName("li");
    var html = document.getElementsByTagName("html");

    //MUDA O TAMANHO DA FONTE
    for (var i = 0; i < p.length; i++) {
        p[i].style.fontSize = fonteCuriosidades + "vw";
    }
    for (var i = 0; i < li.length; i++) {
        li[i].style.fontSize = fonteCuriosidades + "vw";
    }

    //MUDA A COR DA LETRA
    for (var i = 0; i < p.length; i++) {
        p[i].style.color = corLetraCuriosidades;
    }
    for (var i = 0; i < li.length; i++) {
        li[i].style.color = corLetraCuriosidades;
    }

    //MUDA A COR DA BACKGROUND
    for (var i = 0; i < html.length; i++) {
        html[i].style.background = corBackgroundCuriosidades;
    }
}