// Complexidade O(n), pois usei um for para ler e preencher a lista

public class Ex5 {
    public static void main(String[]args){
        String frase = "How u doing?";
        ListaGenerica<String> lista = new ListaGenerica<>();

        preecheLista(frase, lista); // O(n)
        System.out.println(elementosLista(lista)); // O(n)
    }

    public static void preecheLista(String frase, ListaGenerica lista){ // O(n)
        for(int i = 0; i < frase.length(); i++){
            lista.insere(frase.charAt(i));
        }
    }
    public static String elementosLista(ListaGenerica lista){ // O(n)
        String frase = "";
        if(!lista.isVazia()){
            // copia o primeiro elemento e faz um for nele
            for(Elo i = lista.prim; i != null; i = i.prox){
                frase += i.elem;
            }
        } else{
            System.out.println("A lista está vazia");
        }

        return frase;
    }


}
