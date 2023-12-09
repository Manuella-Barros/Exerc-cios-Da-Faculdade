// COMPLEXIDADE O(log n) para refazer a heap

public class Ex3 {
    public static void main(String[] args) {
        int vetor[] = { 1, 2, 5, 3, 8, 9  };
        HeapBinariaMinima binMin = new HeapBinariaMinima(6, vetor);
        System.out.println("\nHeap minimo\n");
        binMin.imprime();

        HeapBinariaMaxima binMax = new HeapBinariaMaxima(binMin);
        System.out.println("\nHeap maximo\n");
        binMax.imprime();
    }
}
