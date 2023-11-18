import java.util.Scanner;

// Complexidade O(n^2) pois o metodo de inserir na lista custa O(n) e ele roda cada vez que o do while roda, sendo n*n

public class Ex3 {
    public static void main(String[] args){
        ListaGenerica<String> listaNomes = new ListaGenerica<>();
        Scanner scanner = new Scanner(System.in);
        int opc;
        String nome;

        do{// O(n)
            System.out.printf("\n1 - Adicionar nome da lista \n2 - Imprimir lista \n0 - Parar \n> ");
            opc = scanner.nextInt();

            switch (opc){
                case 1:
                    System.out.println("\nQual nome deseja adicionar na lista?");
                    nome = scanner.next();
                    insereLista(listaNomes, nome); // O(n)
                    break;
                case 2:
                    imprimeLista(listaNomes, "\nElementos na lista de nomes"); // O(n)
                    break;
                default:
                    break;
            }
        } while(opc != 0);
    }

    public static void insereLista(ListaGenerica lista, String elem){ // O(n)
        boolean foiInserido = false;

        if(lista.isVazia()){
            lista.insere(elem); // O(1)
        } else{
            Elo l = lista.prim; // O(1)

            do{ // O(n)
                // se for menor que o primeiro insere na primera posição
                if((toLetraMinuscula((int)elem.charAt(0)) < toLetraMinuscula((int)l.elem.toString().charAt(0)) )&& lista.prim == l) {
                    lista.insere((elem)); // O(1)
                    foiInserido = true; // O(1)

                } else if(l.prox != null){ // se for menor que o prox elemento desde que não seja o primeiro
                    if(toLetraMinuscula((int)elem.charAt(0)) < toLetraMinuscula((int)l.prox.elem.toString().charAt(0))){
                        Elo eloNovo = lista.insereMeio(elem, l.prox);  // O(1)
                        l.prox = eloNovo; // O(1)

                        foiInserido = true; // O(1)
                    }

                } else{ // se for o ultimo
                    l.prox = lista.insereNoFinal(elem); // O(1)
                    foiInserido = true; // O(1)
                }

                l = l.prox; // O(1)
            } while (foiInserido == false);
        }
    }

    public static void imprimeLista(ListaGenerica lista, String texto){
        lista.imprime(texto); // O(n)
    }

    public static int toLetraMinuscula(int letra){
        if(letra >= 65 && letra <= 90){
            return letra + 32; // O(1)
        }
        return letra;
    }
}
