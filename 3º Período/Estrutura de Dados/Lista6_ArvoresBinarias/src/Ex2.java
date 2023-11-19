// Complexidade O(h)
//
// O método constroiArvore chama o método constroiArvoreRecursivamente que gasta O(n) pra construir a arvore pois precisa
// percorrer todos os valores de um vetor de tamanho n para faze-la
//
// O método imprimePreOrdem chama o método imprimePreOrdemRecursiva gasta O(h) pra imprimir a arvore pois precisa percorrer
// todos os elementos da arvore que tem altura h
//
public class Ex2 {
    public static void main(String[] args) {
        ArvBinBusca<Integer> arvBinBusca = new ArvBinBusca<>();
        //int vetor[] = { 4, 1, 7, 3 };    // <4<1<><3<><>>><7<><>>>
        int vetor[] = { 15, 4, 20, 17, 19 };    // <15<4<><>><20<17<><19<><>>><>>>

        arvBinBusca.constroiArvore(vetor); // O(n)
        arvBinBusca.imprimePreOrdem(); // O(h)
    }
}