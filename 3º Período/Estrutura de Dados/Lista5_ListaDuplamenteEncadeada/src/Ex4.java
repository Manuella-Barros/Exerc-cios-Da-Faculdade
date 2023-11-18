// A complexidade do código custa O(n) pois é o gasto do loop utilizado para imprimir os elementos da lista, e o gasto do loop utilizado para
// identificar os 2 elos de acordo com o indice

import java.util.Scanner;

public class Ex4 {
    public static void main(String[]args){
        ListaEncadeadaDupla<Integer> lista = new ListaEncadeadaDupla<>();
        int indiceElo1, indiceElo2;
        Scanner scanner = new Scanner(System.in);

        lista.insere(10); // O(1)
        lista.insere(20); // O(1)
        lista.insere(30); // O(1)
        lista.insere(40); // O(1)
        lista.insere(50); // O(1)

        System.out.println("Lista atual");
        imprimirComIndices(lista);  // O(n)

        System.out.println("Insira 2 indices que deseja trocar");
        indiceElo1 = scanner.nextInt();
        indiceElo2 = scanner.nextInt();

        //lista.trocaElos(indiceElo1, indiceElo2);
        lista.trocaElos(2, 3);
        System.out.println("\n");

        System.out.println("Lista nova");
        imprimirComIndices(lista);
    }

    public static void imprimirComIndices(ListaEncadeadaDupla lista){
        int i = 0;
        for(Elo p = lista.prim; p != null; p = p.prox){
            System.out.println(i + " - " + p.elem);
            i++;
        }
    }
}
