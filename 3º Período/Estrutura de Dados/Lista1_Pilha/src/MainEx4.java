import java.util.Scanner;

public class MainEx4  {
    public static void main(String args[])  {
        Scanner scanner = new Scanner(System.in);
        Pilha pilhaPrincipal = new Pilha();
        Pilha pilhaAux = new Pilha();
        String valor, retirarValor;
        int qntValoresRetirados = 0;

        System.out.println("Insira uma sequencia");
        valor = scanner.next();

        for (int i = 0; i < valor.length(); i++){
            pilhaPrincipal.push(valor.charAt(i));
        }

        System.out.println("qual elemento deseja retirar?");
        retirarValor = scanner.next();

        for(int i = 0; i < valor.length(); i++){
            char popValor = pilhaPrincipal.pop();

            if(retirarValor.compareTo(Character.toString(popValor)) != 0){
                pilhaAux.push(popValor);
                pilhaAux.topo++;
                qntValoresRetirados++;
            } else{
                pilhaAux.pop();
            }
        }

        pilhaPrincipal.esvaziaPilha();

        if(pilhaAux.isVazia()){
            System.out.println("Não existe esse valor na pilha");
        } else{
            System.out.println(valor.length());
            System.out.println(qntValoresRetirados);

            for(int i = 0; i < (valor.length() - qntValoresRetirados); i++){
                char popValor = pilhaAux.pop();
                pilhaPrincipal.push(popValor);
                System.out.println(popValor);
            }
        }
    }

}
