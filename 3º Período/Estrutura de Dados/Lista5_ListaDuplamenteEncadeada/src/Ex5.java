// A complexidade do código custa O(n) pois é o gasto do loop utilizado para ler as duas listas as mesmo tempo
public class Ex5 {
    public static void main(String[]args){
        ListaEncadeadaDupla<Integer> l1 = new ListaEncadeadaDupla<>();
        ListaEncadeadaDupla<Integer> l3 = new ListaEncadeadaDupla<>();
        ListaEncadeadaDupla<Integer> l2 = new ListaEncadeadaDupla<>();

        preencheListas(l1, l2, l3); // O(1)

        System.out.println("A lista 1 é igual a lista 2?");
        imprimeIsIgual(l1.verificaIgualdade(l2)); // O(1)
        System.out.println();

        System.out.println("A lista 3 é igual a lista 2?");
        imprimeIsIgual(l3.verificaIgualdade(l2)); // O(n)
        System.out.println();
    }

    public static void preencheListas(ListaEncadeadaDupla l1, ListaEncadeadaDupla l2, ListaEncadeadaDupla l3){
        l1.insere(1);
        l2.insere(1);

        l1.insere(2);
        l2.insere(2);

        l1.insere(3);
        l2.insere(3);

        l3.insere(1);
        l3.insere(1);
        l3.insere(3);
    }

    public static void imprimeIsIgual(boolean isIgual){
        if(isIgual){
            System.out.println("- Sim");
        } else{
            System.out.println("- Não ");
        }
    }
}
