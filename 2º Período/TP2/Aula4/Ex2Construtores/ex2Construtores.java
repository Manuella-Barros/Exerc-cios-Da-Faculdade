//Modifique as classes do ex2 utilizando construtores, setters e getters para validação dos parâmetros.
package TP2.Aula4.Ex2Construtores;
import java.util.Scanner;
public class ex2Construtores {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        Data data = new Data(1,1,1000,'/');
        System.out.println("Insira o dia:");
        data.setDia(teclado.nextInt()); //O valor do prompt já entra como parametro pra função set e se torna valor do atributo
        System.out.println("Insira o mes:");
        data.setMes(teclado.nextInt());
        System.out.println("Insira o ano:");
        data.setAno(teclado.nextInt());
        System.out.println("Insira um separador:");
        data.setSeparador(teclado.next().charAt(0));

        if (data.ehValida() == true){
            data.imprime();
        }
    }
}
