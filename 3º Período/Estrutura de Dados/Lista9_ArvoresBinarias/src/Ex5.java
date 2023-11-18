import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        ArvBinBusca<Integer> arvBinBusca = new ArvBinBusca<>();
        Scanner scanner = new Scanner(System.in);
        int raiz1Input, raiz2Input;
        int vetor[] = { 15, 4, 20, 17, 19 };    // <15<4<><>><20<17<><19<><>>><>>>
        //int vetor[] = { 10, 9, 8, 7, 6, 5 };    // <10<9<8<7<6<5<><>><>><>><>><>><>>

        // constroi e mostra arvore
        arvBinBusca.constroiArvore(vetor);
        System.out.println("\nArvore");
        arvBinBusca.imprimePreOrdem();

        // pega input das raizes do usuario
        System.out.println("\n\nInsira 2 valores da arvore para encontrar seu menor ancestral comum");

        try { // caso insira letra no input
            raiz1Input = scanner.nextInt();
            raiz2Input = scanner.nextInt();

            // instanciando as raizes de acordo com o input do usuario
            Raiz raiz1 = new Raiz(raiz1Input);
            Raiz raiz2 = new Raiz(raiz2Input);

            // pegando o menor ancestral das raizes inseridas pelo usuario
            Raiz menor_ancestral_comum = arvBinBusca.obtemAncestralComum(raiz1, raiz2);

            if(menor_ancestral_comum == null){ // se as raizes inseridas não estiverem na arvore
                System.out.println("\n\nPorfavor insira elementos presentes na arvore");

            } else{
                System.out.println("\n\n" + menor_ancestral_comum.elem +
                        " é o menor ancestral em comum dos elementos " + raiz1.elem + " e " + raiz2.elem);
            }
        } catch(Exception e){
            System.out.println("\nInsira numeros");
        }
    }
}
