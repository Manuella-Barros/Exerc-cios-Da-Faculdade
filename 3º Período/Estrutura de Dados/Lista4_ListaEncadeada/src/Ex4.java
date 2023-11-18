// Complexidade O(n), pois usei um for para ler e preencher a lista

public class Ex4 {
    public static void main(String[]args){
        String frase = "How u doing?";
        ListaGenerica<String> listaDesorganizada = new ListaGenerica<>();
        ListaGenerica<String> listaOrganizada = new ListaGenerica<>();

        preecheLista(frase, listaDesorganizada); // O(n)
        String fraseDesorganizada = elementosLista(listaDesorganizada); // O(n)

        preecheLista(fraseDesorganizada, listaOrganizada); // O(n)
        System.out.println(elementosLista(listaOrganizada)); // O(n)
    }

    public static void preecheLista(String frase, ListaGenerica lista){ // O(n)
        String palavra = "";
        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) != ' '){
                palavra += frase.charAt(i);
            }

            if(frase.charAt(i) == ' ' || i == frase.length() - 1){
                lista.insere(palavra);
                palavra = "";
            }
        }
    }
    public static String elementosLista(ListaGenerica lista){ // O(n)
        String frase = "";
        if(!lista.isVazia()){
            // copia o primeiro elemento e faz um for nele
            for(Elo i = lista.prim; i != null; i = i.prox){
                frase += i.elem;
                frase += " ";
            }
        } else{
            System.out.println("A lista está vazia");
        }

        return frase;
    }
}
