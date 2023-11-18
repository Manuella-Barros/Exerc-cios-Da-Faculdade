import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        ArvBinBusca<Integer> arvBinBusca = new ArvBinBusca<>();
        // int vetor[] = { 4, 1, 7, 3 };    Balanceada, esq = 2 e dir = 1
        int vetor[] = { 6, 2, 1, 5, 3, 4, 9, 7, 8 };    // Não balanceada, esq = 2 e dir =3

        arvBinBusca.constroiArvore(vetor);
        System.out.println("\nArvore");
        arvBinBusca.imprimePreOrdem();

        if(arvBinBusca.eBalanceada()){
            System.out.println("\n\nA arvore está balanceada");
        } else{
            System.out.println("\n\nA arvore não está balanceada");
        }
    }
}
