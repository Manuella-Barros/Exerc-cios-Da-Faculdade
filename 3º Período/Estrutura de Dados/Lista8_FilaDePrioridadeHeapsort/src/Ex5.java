// Complexidade O(log n)
// O método imprime custa O(log n) pois vai até a metade do vetor para imprimir tudo
// O método remove custa O(log n) pois precisa refazer o vetor depois de remover

public class Ex5 {
    public static void main(String[] args) {
        int vetor[] = { 2, 8, 5, 3, 9, 1 };

        HeapBinariaMaxima binMax = new HeapBinariaMaxima(6, vetor);
        binMax.imprime(); // O(log n)
        binMax.remove(6); // O(log n)
        binMax.imprime();

    }
}
