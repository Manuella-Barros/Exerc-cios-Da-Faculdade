// Complexidade O(n)
// para fazer a verificação da questão no método verificaPropriedadeHeap a complexidade foi O(log n)
// ja para imprimir o vetor na tela a complexidade foi de O(n)

public class Ex4 {
    public static void main(String[] args) {
        int vetor1[] = { 9, 8, 5, 3, 2, 1 };
        int vetor2[] = { 2, 8, 5, 3, 9, 1 };

        HeapBinariaMaxima binMax = new HeapBinariaMaxima(6);

        imprimeResposta(binMax, vetor1);
        imprimeResposta(binMax, vetor2);
    }

    public static void imprimeResposta(HeapBinariaMaxima binMax, int[] v){
        System.out.printf("\nO vetor " );

        for(int elem : v){ // O(n)
            System.out.printf("%d", elem);
        }

        if(binMax.verificaPropriedadeHeap(v)){ // O(log n)
            System.out.println(" é uma Heap Máxima");
        } else{
            System.out.println(" não é uma Heap Máxima");
        }
    }

}
