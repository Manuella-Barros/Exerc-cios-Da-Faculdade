public class Ex4 {
    public static void main(String[] args) {
        int vetor1[] = { 9, 8, 5, 3, 2, 1 };
        int vetor2[] = { 2, 8, 5, 3, 9, 1 };
        //int vetor[] = { 22, 4, 35, 12, 3, 18, 12, 55 };

        HeapBinariaMaxima binMax = new HeapBinariaMaxima(6);

        imprimeResposta(binMax, vetor1);
        imprimeResposta(binMax, vetor2);
    }

    public static void imprimeResposta(HeapBinariaMaxima binMax, int[] v){
        if(binMax.verificaPropriedadeHeap(v)){
            System.out.println("É uma Heap Máxima");
        } else{
            System.out.println("Não é uma Heap Máxima");
        }
    }

}
