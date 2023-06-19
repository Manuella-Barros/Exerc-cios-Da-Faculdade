package TP2.Aula26.exSlide;

import java.util.*;

public class Lista implements Printable{
    ArrayList listaArmazena = new ArrayList<>();

    @Override
    public void print(){
        System.out.println("Elementos armazenados");

        for(int i = 0; i < listaArmazena.size(); i++){
            System.out.println("- " + listaArmazena.get(i));
        }
    }
}
