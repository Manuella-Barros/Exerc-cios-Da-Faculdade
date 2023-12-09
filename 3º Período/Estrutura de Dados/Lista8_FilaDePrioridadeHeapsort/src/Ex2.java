// COMPLEXIDADE O(log n) para refazer a heap

public class Ex2 {
    public static void main(String[] args) {
        int vetor[] = { 2, 8, 5, 3, 9, 1 };
        HeapBinariaMaxima binMax = new HeapBinariaMaxima(6, vetor);
        System.out.println("\nHeap maximo\n");
        binMax.imprime();

        HeapBinariaMinima binMin = new HeapBinariaMinima(binMax);
        System.out.println("\nHeap minimo\n");
        binMin.imprime();

    }
}
