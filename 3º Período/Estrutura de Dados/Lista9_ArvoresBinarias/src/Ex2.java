// A complexidade foi de O(n) porque o método constroiArvore possui um for que percorre os valores inseridos no vetor,
// Além disso o imprime ordem tambem é O(n) por percorrer todos os elementos da arvore

public class Ex2 {
    public static void main(String[] args) {
        ArvBinBusca<Integer> arvBinBusca = new ArvBinBusca<>();
        //int vetor[] = { 4, 1, 7, 3 };    // <4<1<><3<><>>><7<><>>>
        int vetor[] = { 15, 4, 20, 17, 19 };    // <15<4<><>><20<17<><19<><>>><>>>

        arvBinBusca.constroiArvore(vetor);
        arvBinBusca.imprimePreOrdem();
    }
}