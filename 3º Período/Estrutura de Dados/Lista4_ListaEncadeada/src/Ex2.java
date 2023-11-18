import java.util.Scanner;

// Complexidade de O(n) porque utilizo um for para preencher a lista um for para ler os elementos da lista

public class Ex2 {
    public static void main(String[] args) {
        ListaGenerica<Integer> lista1 = new ListaGenerica<>();
        ListaGenerica<Integer> lista2 = new ListaGenerica<>();
        ListaGenerica<Integer> listaTotal = new ListaGenerica<>();
        int opc;
        Scanner scanner = new Scanner(System.in);

        for(int i = 6; i> 0; i--){ // só para preencher as filas // O(n)
            if(i%2 == 0){ // O(1)
                insereLista(lista1, i); // O(1)
            } else{
                insereLista(lista2, i); // O(1)
            }
        }

        imprimeLista(lista1, "Elementos da lista 1"); // O(1)
        imprimeLista(lista2, "Elementos da lista 2"); // O(1)

        Elo l1 = lista1.prim, l2 = lista2.prim;
        System.out.println();
        for(int n = 0; n < lista1.tamanho + lista2.tamanho ; n++){ // O(n)
            if(l1 != null && l2!= null){ // O(1)
                if( (int) l1.elem < (int) l2.elem ){ // O(1)
                    insereLista(listaTotal, (int)l1.elem); // O(1)
                    l1 = l1.prox;  // O(1)
                } else {
                    insereLista(listaTotal, (int)l2.elem);  // O(1)
                    l2 = l2.prox;  // O(1)
                }
            } else if(l1 == null && l2!= null){ // O(1)
                insereLista(listaTotal, (int)l2.elem); // O(1)
                l2 = l2.prox; // O(1)
            } else if(l1 != null && l2 == null){ // O(1)
                insereLista(listaTotal, (int)l1.elem); // O(1)
                l1 = l1.prox; // O(1)
            }
        }

        imprimeLista(listaTotal, "Elementos da junção das listas"); // O(n)
    }

    public static void insereLista(ListaGenerica lista, int elemento){
        lista.insere(elemento); // O(1)
    }

    public static void imprimeLista(ListaGenerica lista, String texto){
        lista.imprime(texto);
    } //O(n)
}