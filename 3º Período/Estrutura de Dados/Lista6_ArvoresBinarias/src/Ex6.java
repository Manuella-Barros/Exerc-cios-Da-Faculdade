// Complexidade O(h)
//
// O método constroiArvore chama o método constroiArvoreRecursivamente que gasta O(n) pra construir a arvore pois precisa
// percorrer todos os valores de um vetor de tamanho n para faze-la
//
// O método imprimePreOrdem chama o método imprimePreOrdemRecursiva gasta O(h) pra imprimir a arvore pois precisa percorrer
// todos os elementos da arvore que tem altura h
//
// O método eBalanceada chama o método eBalanceadaRecursiva gasta O(h) pra saber se a arvore é balanceada pois percorrer
// todos os elementos da arvore que tem altura h

public class Ex6 {
    public static void main(String[] args) {
        ArvBinBusca<Integer> arvBinBusca = new ArvBinBusca<>();
        // int vetor[] = { 4, 1, 7, 3 };    Balanceada, esq = 2 e dir = 1
        int vetor[] = { 6, 2, 1, 5, 3, 4, 9, 7, 8 };    // Não balanceada, esq = 2 e dir =3

        arvBinBusca.constroiArvore(vetor); // O(n)
        System.out.println("\nArvore");
        arvBinBusca.imprimePreOrdem(); // O(h)

        if(arvBinBusca.eBalanceada()){ // O(h)
            System.out.println("\n\nA arvore está balanceada");
        } else{
            System.out.println("\n\nA arvore não está balanceada");
        }
    }
}
