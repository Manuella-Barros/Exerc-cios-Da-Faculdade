package TP2.Aula26.exSlide;
import java.util.*;

public class main {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        Lista listaObj = new Lista();

        // EXEMPLO PREENCHENDO A LISTA DIRETAMENTE
        listaObj.listaArmazena.add("Maria");
        listaObj.listaArmazena.add("Julia");
        listaObj.listaArmazena.add("Beth");
        listaObj.print();

        // EXEMPLO PREENCHENDO A LISTA POR INPUT
        System.out.printf("Insira 3 nomes \n");
        for(int i = 0; i < 3; i++ ){
            listaObj.listaArmazena.add(teclado.next());
        }
        listaObj.print();
    }

}
