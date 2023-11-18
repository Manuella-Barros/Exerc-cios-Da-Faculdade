// A complexidade do código custa O(n) pois é o gasto do loop utilizado para imprimir os elementos da lista, e o gasto do loop utilizado para
// ler os elementos das duas listas e inserir na terceira

public class Ex2 {
    public static void main(String[] args){
        ListaCircularEncadeadaDupla l1 = new ListaCircularEncadeadaDupla<>();
        ListaCircularEncadeadaDupla l2 = new ListaCircularEncadeadaDupla<>();
        ListaCircularEncadeadaDupla l3 = new ListaCircularEncadeadaDupla<>();

        preencheLista(l1, l2); // O(1)

        System.out.println("\nElementos da lista 1");
        l1.imprime(); // 3 2 1 // O(n)

        System.out.println("\nElementos da lista 2");
        l2.imprime(); // 6 4 5 // O(n)

        l3 = l1.merge(l2);// O(n)
        System.out.println("\nElementos da lista 3");
        l3.imprime(); // 1 5 2 4 3 6 // O(n)
    }

    public static void preencheLista(ListaCircularEncadeadaDupla l1, ListaCircularEncadeadaDupla l2){
        l1.insere(1);
        l1.insere(2);
        l1.insere(3);

        l2.insere(4);
        l2.insere(5);
        l2.insere(6);
    }
}
