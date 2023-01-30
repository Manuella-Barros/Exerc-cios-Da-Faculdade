function clicou(){
    var texto = document.getElementById('textoUsuario').value;

    document.getElementById('listaUsuario').innerHTML += '<li>' + texto + '</li>';
}
