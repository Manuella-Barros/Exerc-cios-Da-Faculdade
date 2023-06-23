package TP2.Aula29.IP;
import java.util.*;
public class main {
    public static void main(String[]args){
        HashMap mapa = new HashMap<>();

        // ADICIONANDO OS IPS E URLS NO MAPA
        mapa.put("localhost", "127.0.0.1");
        mapa.put("www.uva.br", "187.12.201.162");
        mapa.put("www.google.com", "74.125.228.81");
        mapa.put("www.globo.com", "186.192.90.5");

        // IMPRIME CHAVE E VAÇPR
        System.out.println(mapa.entrySet());

        // IMPRIME AS CHAVES
        System.out.println(mapa.keySet());

        // IMPRIME OS VALORES
        System.out.println(mapa.values());
    }
}
