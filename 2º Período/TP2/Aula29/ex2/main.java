package TP2.Aula29.ex2;
import java.util.*;
public class main {
    public static void main(String[]args){
        HashMap rnaMapa = new HashMap<>();
        Scanner teclado = new Scanner(System.in);
        String rna = "UUU";

        rnaMapa.put("UUU", "Phe");
        rnaMapa.put("CUU", "Leu");
        rnaMapa.put("UUA", "Loa");
        rnaMapa.put("AAG", "Lisina");
        rnaMapa.put("UCU", "Ser");
        rnaMapa.put("UAU", "Tyr");
        rnaMapa.put("CAA", "Gin");

        System.out.println(rnaMapa.get(rna));
    }
}
