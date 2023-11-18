import java.util.Scanner;

public class MainEx8 {
    public static void main(String [] args){
        PilhaGenerica<Integer> pilhaGenerica = new PilhaGenerica<>();
        PilhaGenerica<Integer> paresUnicos = new PilhaGenerica<>();
        Scanner scanner = new Scanner(System.in);
        int num;
        String valorFinal = "";

        System.out.println("Insira um valor maior que 1");
        num = scanner.nextInt();

        System.out.println("Todas as sequencias de 1 a " + num);
        for(int i = num; i >= 1; i--){
            for(int n = 1; n <= i; n++){
                pilhaGenerica.push(n);
            }

            for(int n = i; n >= 1; n--){
                int valorPop = pilhaGenerica.pop();
                valorFinal += valorPop;
                System.out.println(valorFinal);

                if(valorFinal.length() <= 2 && i > 1){
                    paresUnicos.push(valorPop);
                }
            }

            valorFinal = "";
        }

        System.out.println("\n Pares Unicos ");
        for(int i = 0; i < paresUnicos.tamanhoMaximoOcupado/2; i++){
            System.out.printf( " ( " + paresUnicos.pop() );
            System.out.printf( paresUnicos.pop() + " )," );
        }

    }
}
