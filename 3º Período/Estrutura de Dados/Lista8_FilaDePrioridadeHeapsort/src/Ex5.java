public class Ex5 {
    public static void main(String[] args) {
        int vetor[] = { 2, 8, 5, 3, 9, 1 };

        HeapBinariaMaxima binMax = new HeapBinariaMaxima(6, vetor);
        binMax.imprime();
        binMax.remove(6);
        binMax.imprime();

    }
}
