// Complexidade de (n) pelo for usado pra preencher as listas e juntar as listas

public class Ex1 {
    public static void main(String[]args){
        ListaEncadeadaDupla<Integer> l1 = new ListaEncadeadaDupla<>();
        ListaEncadeadaDupla<Integer> l2 = new ListaEncadeadaDupla<>();
        ListaEncadeadaDupla<Integer> l3 = new ListaEncadeadaDupla<>();

        preencheLista(l1, l2); // O(n) pois tem um for para preencher as listas
        juntaListas(l1, l2, l3); // O(n) pois tem um for para juntar as listas

        System.out.println("ELEMENTOS LISTA 1");
        l1.imprime();
        System.out.println();
        System.out.println("ELEMENTOS LISTA 2");
        l2.imprime();
        System.out.println();
    }

    public static void preencheLista(ListaEncadeadaDupla l1, ListaEncadeadaDupla l2){
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                l1.insere(i); // numeros pares
            } else {
                l2.insere(i); // numeros impares
            }
        }
    }

    public static void juntaListas(ListaEncadeadaDupla l1, ListaEncadeadaDupla l2, ListaEncadeadaDupla l3){
        Elo p1 = l1.prim, p2 = l2.prim;

        while (p1 != null || p2 != null){
            if(p1 != null){
                l3.insere(p1.elem);
                p1 = p1.prox;
            }

            if(p2 != null){
                l3.insere(p2.elem);
                p2 = p2.prox;
            }
        }

        System.out.println("ELEMENTOS LISTA 3");
        l3.imprime();
        System.out.println();
    }
}
