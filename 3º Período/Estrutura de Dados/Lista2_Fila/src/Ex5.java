import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n, count = 1;
        boolean terminou = false;
        String aux;

        System.out.println("De um valor a n, para gerar números binários de 1 a n");
        n = scanner.nextInt();

        FilaGenerica<String> filaAuxiliar = new FilaGenerica<>(n);

        System.out.println("\nRepresentações binárias dos números inteiros entre 1 e " + n);

        filaAuxiliar.insere("1");
        System.out.println("1");

        if(n > 1){
            do{
                aux = filaAuxiliar.remove();
                filaAuxiliar.insere(aux + '0');
                System.out.println(aux + '0');
                count++;

                if(count == n){
                    terminou = true;
                }

                if(!terminou){
                    filaAuxiliar.insere(aux + '1');
                    System.out.println(aux + '1');
                    count++;

                }

                if(count == n){
                    terminou = true;
                }
            } while (!terminou);
        }
    }
}
