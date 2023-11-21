import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
    Scanner teclado = new Scanner(System.in);
    String opc = "";
    Maria maria = new Maria();
    Joao joao = new Joao();
    boolean passouSala1=false,passouSala2=false;

        do{
            try
            {  System.out.println(
                    "--------------------------------------------------------------------------------\n");
                System.out.println("Escolha um personagem para iniciar:" +
                            "\n\nInsira 1 para Personagem 1: " +
                            "\n Nome: "+ maria.getNome() +
                            "\n Idade: "+ maria.getIdade() +
                            "\n Poder especial: "+ maria.getPoder() +
                            "\n\nInsira 2 para Personagem 2: " +
                            "\n Nome: "+ joao.getNome() +
                            "\n Idade: "+ joao.getIdade() +
                            "\n Poder especial: "+ joao.getPoder());
            System.out.printf("> ");
            opc = teclado.nextLine();
            opc = opc.trim();
            switch (opc)
            {
                case "1":  ///////////////////////////////MARIA
                    maria.contarHistoria();
                    if (maria.confereContrato())
                    {
                        System.out.println("--------------------------------------------------------------------------------\n");
                        maria.pegarPrimeiroItem();

                        System.out.println("--------------------------------------------------------------------------------\n");
                        Sala1 s1 = new Sala1();
                        passouSala1 = s1.obstaculo(maria, maria.getNome());

                        if(passouSala1) //passou na 1? sim
                        {
                            System.out.println("--------------------------------------------------------------------------------\n");
                            Sala2 s2 = new Sala2();
                            passouSala2 = s2.obstaculo(maria, maria.getNome());

                            if(passouSala2)//passou na 2? sim! Entao vai p 3
                            {
                                System.out.println("--------------------------------------------------------------------------------\n");
                                Sala3 s3 = new Sala3();
                                s3.obstaculo(maria, maria.getNome());
                            }
                        }
                    }
                    break;

                case "2":   ///////////////////////////////JOAO
                    joao.contarHistoria();
                    if (joao.confereContrato())
                    {
                        System.out.println("--------------------------------------------------------------------------------\n");
                        joao.pegarPrimeiroItem();

                        System.out.println("--------------------------------------------------------------------------------\n");
                        Sala1 s1 = new Sala1();
                        passouSala1 = s1.obstaculo(joao, joao.getNome());

                        if(passouSala1) //passou na 1? sim
                        {
                            System.out.println("--------------------------------------------------------------------------------\n");
                            Sala2 s2 = new Sala2();
                            passouSala2 = s2.obstaculo(joao, joao.getNome());

                            if(passouSala2)//passou na 2? sim! Entao vai p 3
                            {
                                System.out.println("--------------------------------------------------------------------------------\n");
                                Sala3 s3 = new Sala3();
                                s3.obstaculo(joao, joao.getNome());
                            }
                        }
                    }
                    break;
                default:
                System.out.println(
                        "--------------------------------------------------------------------------------\n");
                    System.out.println("Valor incorreto, insira os números correspondentes as opções!");
            }}
            catch(Exception e)
            {
                System.out.println(
                        "--------------------------------------------------------------------------------\n");
                System.out.println("Valor inválido!\n");
            }
        } while ( !opc.equals("1") &&  !opc.equals("2"));
    }
}