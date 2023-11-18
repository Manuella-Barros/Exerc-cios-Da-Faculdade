import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Fila filaCircular = new Fila(6);
        int opc, elemento;

        do{
            System.out.println("\n1 - Inserir elemento na fila circular \n0 - Parar");
            opc = scanner.nextInt();

            if(opc == 1){
                System.out.println("\nQual elemento deseja inserir?");
                elemento = scanner.nextInt();
                filaCircular.insere(elemento);
            }
        } while (opc != 0);

        FilaDupla filaCircularDupla = filaCircular.FilaCircularDupla(filaCircular);

        System.out.println("\nConteúdo da fila circular dupla");
        imprimeFila(filaCircularDupla);
    }

    public static void imprimeFila(Fila fila){
        if(!fila.isVazia()){
            for (int i = fila.inicio, j = 1; j <= fila.qntElementos; i = (i + 1) % fila.tamanho, j++){
                System.out.println(j + " - " + fila.vetor[i]);
            }
        } else{
            System.out.println("\nNão há elementos na fila");
        }
    }
}
