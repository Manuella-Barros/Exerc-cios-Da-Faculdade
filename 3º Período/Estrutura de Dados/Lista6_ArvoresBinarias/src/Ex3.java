// Complexidade O(h)
//
// O método constroiArvore chama o método constroiArvoreRecursivamente que gasta O(n) pra construir a arvore pois precisa
// percorrer todos os valores de um vetor de tamanho n para faze-la
//
// O método imprimePreOrdem chama o método imprimePreOrdemRecursiva gasta O(h) pra imprimir a arvore pois precisa percorrer
// todos os elementos da arvore que tem altura h
//
// O método eSimilar chama o método eSimilarRecursiva que gasta O(h) pra comparar as duas arvores pois para comparar as arvores
// ela precisa percorrer todos os elementos da arvore que tem altura h

public class Ex3 {
    public static void main(String[] args) {
        ArvBinBusca<Integer> arv1 = new ArvBinBusca<>();
        ArvBinBusca<Integer> arv2 = new ArvBinBusca<>();
        ArvBinBusca<Integer> arv3 = new ArvBinBusca<>();
        int vet1[] = { 5, 3, 2, 4, 6 }; // arvore base que será comparada
        int vet2[] = { 8, 6, 5, 7, 9 }; // arvore similar
        int vet3[] = { 8, 6, 5, 9 }; // arvore não similar

        arv1.constroiArvore(vet1); // O(n)
        arv2.constroiArvore(vet2); // O(n)
        arv3.constroiArvore(vet3); // O(n)

        imprimeResposta(arv1, arv2); // O(h)
        imprimeResposta(arv1, arv3); // O(h)
    }

    public static void imprimeResposta(ArvBinBusca arvore, ArvBinBusca arvoreComparada){
        System.out.printf("\nA arvore -> ");
        arvore.imprimePreOrdem(); // O(h)
        System.out.printf(" e a arvore -> ");
        arvoreComparada.imprimePreOrdem(); // O(h)

        if(arvore.eSimilar(arvoreComparada)){ // O(h)
            System.out.printf(" são similares");
        } else{
            System.out.printf(" não são similares");
        }
    }
}
