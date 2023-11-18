import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        pilhaDeFilas(scanner);
        filaDePilhas(scanner);
        filaDeFilas(scanner);
    }

    public static void filaDePilhas(Scanner scanner){ // FILA DE PILHAS
        System.out.println("======================================");
        System.out.println("\nImplementando a fila de pilhas");
        PilhaGenerica<Integer> f2 = new PilhaGenerica<>(3);
        PilhaGenerica<Integer> f1 = new PilhaGenerica<>(3);
        FilaGenerica<PilhaGenerica> filaGenerica;
        int qntTotalElementos = f1.qntElementos + f2.qntElementos, elemento, opc;

        do{
            System.out.printf("\n1 - Inserir elemento na fila 1 \n2 - Inserir elemento na fila 2 \n0 - Sair \n> ");
            opc = scanner.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Qual elemento deseja inserir na pilha 1?");
                    elemento = scanner.nextInt();
                    if(!f1.push(elemento)){
                        System.out.println("Não foi possivel adicionar, a pilha está cheia");
                    }
                    break;

                case 2:
                    System.out.println("Qual elemento deseja inserir na pilha 2?");
                    elemento = scanner.nextInt();
                    if(!f2.push(elemento)){
                        System.out.println("Não foi possivel adicionar, a pilha está cheia");
                    }
                    break;
                default:
                    break;
            }
        } while (opc != 0);

        filaGenerica = new FilaGenerica<>(2);

        filaGenerica.insere(f1);
        filaGenerica.insere(f2);

        for(int i = 0; i < filaGenerica.tamanho; i++){
            imprimePilhaGenerica(filaGenerica.remove(), "Elementos da pilha dentro da fila");
        }

        System.out.println("======================================");
    }

    public static void pilhaDeFilas(Scanner scanner){ // PILHA DE FILAS
        System.out.println("======================================");
        System.out.println("\nImplementando a pilha de filas");
        Fila f2 = new Fila(3);
        Fila f1 = new Fila(3);
        PilhaGenerica<Fila> pilhaGenerica;
        int qntTotalElementos = f1.qntElementos + f2.qntElementos, elemento, opc;

        do{
            System.out.printf("\n1 - Inserir elemento na fila 1 \n2 - Inserir elemento na fila 2 \n0 - Sair \n> ");
            opc = scanner.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Qual elemento deseja inserir na fila 1?");
                    elemento = scanner.nextInt();
                    if(!f1.insere(elemento)){
                        System.out.println("Não foi possivel adicionar, a fila está cheia");
                    }
                    break;

                case 2:
                    System.out.println("Qual elemento deseja inserir na fila 2?");
                    elemento = scanner.nextInt();
                    if(!f2.insere(elemento)){
                        System.out.println("Não foi possivel adicionar, a fila está cheia");
                    }
                    break;
                default:
                    break;
            }
        } while (opc != 0);

        pilhaGenerica = new PilhaGenerica(2);

        pilhaGenerica.push(f1);
        pilhaGenerica.push(f2);

        for(int i = 0; i < 2; i++){
            imprimeFila(pilhaGenerica.pop(), "Elementos da fila dentro da pilha");
        }

        System.out.println("======================================");
    }

    public static void filaDeFilas(Scanner scanner){ // FILA DE FILAS
        System.out.println("======================================");
        System.out.println("\nImplementando a fila de filas");
        Fila f2 = new Fila(3);
        Fila f1 = new Fila(3);
        FilaGenerica<Fila> fila;
        int qntTotalElementos = f1.qntElementos + f2.qntElementos, elemento, opc;

        do{
            System.out.printf("\n1 - Inserir elemento na fila 1 \n2 - Inserir elemento na fila 2 \n0 - Sair \n> ");
            opc = scanner.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Qual elemento deseja inserir na fila 1?");
                    elemento = scanner.nextInt();
                    if(!f1.insere(elemento)){
                        System.out.println("Não foi possivel adicionar, a fila está cheia");
                    }
                    break;

                case 2:
                    System.out.println("Qual elemento deseja inserir na fila 2?");
                    elemento = scanner.nextInt();
                    if(!f2.insere(elemento)){
                        System.out.println("Não foi possivel adicionar, a fila está cheia");
                    }
                    break;
                default:
                    break;
            }
        } while (opc != 0);

        fila = new FilaGenerica<>(2);

        fila.insere(f1);
        fila.insere(f2);

        for(int i = 0; i < fila.tamanho; i++){
            imprimeFila(fila.remove(), "Elementos da fila dentro da fila");
        }

        System.out.println("======================================");
    } // FILA DE FILAS

    public static void imprimeFila(Fila f, String texto){
        if(!f.isVazia()){
            System.out.println("\n" + texto);
            for(int i = f.inicio, j = 1; j <= f.qntElementos; i = (i + 1) % f.tamanho, j++){
                System.out.println(j + " - " + f.vetor[i]);
            }
        }
    }

    public static void imprimePilhaGenerica(PilhaGenerica f, String texto){
        int tamanho = f.qntElementos;

        if(!f.isVazia()){
            System.out.println("\n" + texto);
            for(int i = 0; i < tamanho; i++){
                System.out.println(i+1 + " - " + f.pop());
            }
        }
    }
}
