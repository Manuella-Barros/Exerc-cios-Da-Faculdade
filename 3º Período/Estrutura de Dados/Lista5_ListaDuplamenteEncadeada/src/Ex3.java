// A complexidade do código custa O(n) pois é o gasto do loop utilizado para imprimir os elementos da lista, e o gasto do loop utilizado para
// ler os elementos da lista ao contrário e inserir na outra lista

public class Ex3 {
    public static void main(String[]args){
        ListaCircularEncadeadaDupla<Integer> lista = new ListaCircularEncadeadaDupla<>();

        lista.insere(10); // O(1)
        lista.insere(9); // O(1)
        lista.insere(8); // O(1)
        lista.insere(7); // O(1)
        lista.insere(6); // O(1)

        System.out.println("Lista atual");
        lista.imprime(); // O(n)

        lista = lista.inverteLista();

        System.out.println("\nlista invertida");
        lista.imprime();
    }


}
