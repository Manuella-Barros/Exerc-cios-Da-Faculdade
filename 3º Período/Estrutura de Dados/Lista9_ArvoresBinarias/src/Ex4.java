import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        ArvBinBusca<Integer> arvBinBusca = new ArvBinBusca<>();
        //int vetor[] = { 4, 1, 7, 3 };    // <4<1<><3<><>>><7<><>>>
        int vetor[] = { 6, 2, 8, 1, 4, 3 };    // <4<1<><3<><>>><7<><>>>
        Scanner scanner = new Scanner(System.in);
        int min, max;

        arvBinBusca.constroiArvore(vetor);
        System.out.println("\nArvore");
        arvBinBusca.imprimePreOrdem();

        System.out.println("\nDigite um intervalo a ser retirado, minimo e maximo");
        min = scanner.nextInt();
        max = scanner.nextInt();
        arvBinBusca.removeForaIntervalo(min, max);
        System.out.printf("\nArvore sem o intervalo %d e %d\n", min, max);
        arvBinBusca.imprimePreOrdem();
    }
}
