import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Fila f1 = new Fila(3);
        Fila f2 = new Fila(3);
        Fila fila;

        int elemento, opc, qntTotalElementos;

        do{
            System.out.printf("\n1 - Inserir elemento na fila 1 \n2 - Inserir elemento na fila 2 \n0 - Sair \n> ");
            opc = scanner.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Qual elemento deseja inserir na pilha 1?");
                    elemento = scanner.nextInt();
                    if(!f1.insere(elemento)){
                        System.out.println("Não foi possivel adicionar, a pilha está cheia");
                    }
                    break;

                case 2:
                    System.out.println("Qual elemento deseja inserir na pilha 2?");
                    elemento = scanner.nextInt();
                    if(!f2.insere(elemento)){
                        System.out.println("Não foi possivel adicionar, a pilha está cheia");
                    }
                    break;
                default:
                    break;
            }
        } while (opc != 0);


        imprimeFila(f1, "Elementos na fila 1");
        imprimeFila(f2, "Elementos na fila 2");

        fila = new Fila(f1.qntElementos + f2.qntElementos);
        combinaFilas(fila, f1, f2);

        imprimeFila(fila, "Fila Mista");
    }


    public static void imprimeFila(Fila f, String texto){
        if(!f.isVazia()){
            System.out.println("\n" + texto);
            for(int i = f.inicio, j = 1; j <= f.qntElementos; i = (i + 1) % f.tamanho, j++){
                System.out.printf("%d ", f.vetor[i]);
            }
            System.out.println();
        }
    }

    public static void combinaFilas(Fila fila, Fila f1, Fila f2){
        int qntTotalElementos = f1.qntElementos + f2.qntElementos, elemento;

        for(int i = fila.inicio, j = 0; j <= qntTotalElementos; i = (i + 1) % fila.tamanho, j++){
            elemento = f1.remove();

            if(elemento != Integer.MIN_VALUE){
                fila.insere(elemento);
            }

            elemento = f2.remove();

            if(elemento != Integer.MIN_VALUE){
                fila.insere(elemento);
            }
        }
    }

}
