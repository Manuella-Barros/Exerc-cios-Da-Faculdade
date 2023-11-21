import java.util.*;
public class Sala2 extends Sala implements Obstaculo
{
    public boolean obstaculo(Object o, String n)
    {
        if(o instanceof Maria)
            return confere_maria ((Maria) o);
        else
            return confere_joao((Joao) o);
    }

    public boolean confere_maria(Maria m)
    {
        Scanner teclado = new Scanner(System.in);
        boolean lock = true, lock_inventario=true, lock_poder=true;
        String opc;
        int cont_poder=0;

        System.out.printf("Você entra na segunda sala e percebe que existe um teclado acoplado da próxima porta\n" +
                "Pelo visto algo precisa ser digitado para passar para a próxima sala\n" +
                "Hora de explorar a sala e ir atrás do próximo desafio...");
        do {
            System.out.println("\n--------------------------------------------------------------------------------\n");
            System.out.println("Aonde deseja procurar? \n1 - Aquário \n2 - Quadro \n3 - Sofá ");
            if (m.getInventario().size() != 0) {
                System.out.printf("4 - Inventário\n>");
            }
            opc = teclado.nextLine();

            switch (opc)
            {
                case "1":
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Ao lado esquerdo da sala existe um aquario sem peixes \n" +
                            "Você mergulha o braço atrás de alguma chave mas... \n" +
                            "Que pena! nada aqui!");
                    m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                    break;

                case "2":
                    System.out.println(
                            "--------------------------------------------------------------------------------\n");
                    System.out.println("Na parede a sua direita existe um quadro que está de cabeça pra baixo,\n" +
                            "Isso chama sua atenção, e quando vai até lá tirar ele do lugar... opa!\n" +
                            "Caiu um pedaço de papel no chão com a seguinte mensagem: \n");
                    do
                    {
                        System.out.println("\n❝ JFMAMJJASOND ❞\nSolucione o enigma e a porta se abrirá!");
                        System.out.println("\n-Digite 0 para usar poder especial");
                        System.out.printf("> ");
                        opc = teclado.next();
                        if(opc.toLowerCase().equalsIgnoreCase("os meses")||opc.toLowerCase().equalsIgnoreCase("meses"))
                        {
                            System.out.println("Nossa, você é inteligente! \uD83D\uDE32 Partiu próxima sala!");
                            lock = false;
                            return true;
                        }
                        else if(opc.equals("0"))
                        {
                            if(cont_poder==1)
                            {
                                System.out.println("Preste mais atenção nas regras \nO poder especial só pode ser usado uma vez por sala!");
                                m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                            }
                            else
                            {
                                m.poderEspecial(2);
                                cont_poder=1;
                            }
                        }
                        else
                        {
                            m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                            System.out.println("Valor inválido, tente novamente!\n");
                        }
                    }while(lock_poder && m.setPaciencia(m.getPaciencia()));
                    break;
                case "3":
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("No meio da sala existe um sofá com muitas almofadas\n" +
                            "Parece intrigante e você vai até elas\n" +
                            "Você retira todas as almofadas atrás de alguma pista e ops... \n" +
                            "Nada por aqui, mas não desista! \n");
                    m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                    break;
                case "4":
                    if (m.getInventario().size() != 0) //se tiver itens no inventario
                    {
                        do {
                            m.exibir_Inventario();
                            System.out.println("Digite 0 para sair do inventário");
                            System.out.println("Escreva o nome do item que deseja utilizar!");
                            System.out.printf(">");
                            opc = teclado.nextLine();
                            //canivete, pe de cabra e agua// voltara
                            System.out.println(
                                    "--------------------------------------------------------------------------------\n");

                            if (opc.toLowerCase().equalsIgnoreCase("canivete") && m.getInventario().contains("canivete"))
                            {
                                System.out.println("Você notou um parafuso solto na porta tecnológica e tentou " +
                                        "desenrosca-lo com o canivete!\nInfelizmente, apenas serviu para  " +
                                        "gastar energia e deixa-lo cego e inutilizado!\nUma pena!\n");
                                m.removerItemInventario("canivete");
                                m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                            }
                            else if (opc.toLowerCase().equalsIgnoreCase("agua") && m.getInventario().contains("agua"))
                            {
                                System.out.println("Beleza, deu pra dar uma " +
                                        "acalmada!\nPaciencia completamente restaurada!");
                                m.setPaciencia(10);
                                m.removerItemInventario("agua");
                            }
                            else if (opc.toLowerCase().equalsIgnoreCase("0")) {
                                System.out.println("\nVoltando ao jogo...\n");
                                lock_inventario = false;
                            }
                            else if (opc.toLowerCase().equalsIgnoreCase("pe de cabra")&& m.getInventario().contains("pe de cabra")) {
                                System.out.println("\nAcabou gastando muita energia, quebrou o pé de cabra batendo na" +
                                        " porta e ainda assim,\n não a moveu um centímetro sequer!\n");
                                m.removerItemInventario("pe de cabra");
                                lock_inventario = false;
                                m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                            } else {
                                System.out.println("\nValor inválido, tente novamente!\n");
                                lock_inventario=true;
                            }
                        }
                        while (lock_inventario && m.getInventario().size() != 0);
                    } else // se nao tiver itens no inventario
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("Opção inválida, tente novamente!\n");
                    }
                    break;
                default:
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Opção inválida, tente novamente!\n");

            }
        }while (lock && m.setPaciencia(m.getPaciencia()));
        return false;
    }
    public boolean confere_joao(Joao m)
    {
        Scanner teclado = new Scanner(System.in);
        boolean lock = true, lock_inventario=true, lock_poder=true;
        String opc;
        int cont_poder=0;

        System.out.printf("Você entra na segunda sala e percebe que existe um teclado acoplado da próxima porta\n" +
                "Pelo visto algo precisa ser digitado para passar para a próxima sala\n" +
                "Hora de explorar a sala e ir atrás do próximo desafio...");
        do {
            System.out.println("\n--------------------------------------------------------------------------------\n");
            System.out.println("Aonde deseja procurar? \n1 - Aquário \n2 - Quadro \n3 - Sofá ");
            if (m.getInventario().size() != 0) {
                System.out.printf("4 - Inventário\n>");
            }
            opc = teclado.nextLine();

            switch (opc)
            {
                case "1":
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Ao lado esquerdo da sala existe um aquario sem peixes \n" +
                            "Você mergulha o braço atrás de alguma chave mas... \n" +
                            "Que pena! nada aqui!");
                    m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                    break;

                case "2":
                    System.out.println(
                            "--------------------------------------------------------------------------------\n");
                    System.out.println("Na parede a sua direita existe um quadro que está de cabeça pra baixo,\n" +
                            "Isso chama sua atenção, e quando vai até lá tirar ele do lugar... opa!\n" +
                            "Caiu um pedaço de papel no chão com a seguinte mensagem: \n");
                    do
                    {
                        System.out.println("\n❝ JFMAMJJASOND ❞\nSolucione o enigma e a porta se abrirá!");
                        System.out.println("\n-Digite 0 para usar poder especial");
                        System.out.printf("> ");
                        opc = teclado.nextLine();
                        //opc = teclado.nextLine();
                        if(opc.toLowerCase().equalsIgnoreCase("os meses")||opc.toLowerCase().equalsIgnoreCase("meses"))
                        {
                            System.out.println("Nossa, você é inteligente! \uD83D\uDE32 Partiu próxima sala!");
                            lock = false;
                            return true;
                        }
                        else if(opc.equals("0"))
                        {
                            if(cont_poder==1)
                            {
                                System.out.println("Preste mais atenção nas regras \nO poder especial só pode ser usado uma vez por sala!");
                                m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                            }
                            else
                            {
                                m.poderEspecial(2);
                                cont_poder=1;
                            }
                        }
                        else
                        {
                            m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                            System.out.println("Valor inválido, tente novamente!\n");
                        }
                    }while(lock_poder && m.setPaciencia(m.getPaciencia()));
                    break;
                case "3":
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("No meio da sala existe um sofá com muitas almofadas\n" +
                            "Parece intrigante e você vai até elas\n" +
                            "Você retira todas as almofadas atrás de alguma pista e ops... \n" +
                            "Nada por aqui, mas não desista! \n");
                    m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                    break;
                case "4":
                    if (m.getInventario().size() != 0) //se tiver itens no inventario
                    {
                        do {
                            m.exibir_Inventario();
                            System.out.println("Digite 0 para sair do inventário");
                            System.out.println("Escreva o nome do item que deseja utilizar!");
                            System.out.printf(">");
                            opc = teclado.nextLine();
                            //canivete, pe de cabra e agua// voltara
                            System.out.println(
                                    "--------------------------------------------------------------------------------\n");

                            if (opc.toLowerCase().equalsIgnoreCase("canivete") && m.getInventario().contains("canivete"))
                            {
                                System.out.println("Você notou um parafuso solto na porta tecnológica e tentou " +
                                        "desenrosca-lo com o canivete!\nInfelizmente, apenas serviu para  " +
                                        "gastar energia e deixa-lo cego e inutilizado!\nUma pena!\n");
                                m.removerItemInventario("canivete");
                                m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                            }
                            else if (opc.toLowerCase().equalsIgnoreCase("agua") && m.getInventario().contains("agua"))
                            {
                                System.out.println("Beleza, deu pra dar uma " +
                                        "acalmada!\nPaciencia completamente restaurada!");
                                m.setPaciencia(10);
                                m.removerItemInventario("agua");
                            }
                            else if (opc.toLowerCase().equalsIgnoreCase("0")) {
                                System.out.println("\nVoltando ao jogo...\n");
                                lock_inventario = false;
                            }
                            else if (opc.toLowerCase().equalsIgnoreCase("pe de cabra")&& m.getInventario().contains("pe de cabra")) {
                                System.out.println("\nAcabou gastando muita energia, quebrou o pé de cabra batendo na" +
                                        " porta e ainda assim,\n não a moveu um centímetro sequer!\n");
                                m.removerItemInventario("pe de cabra");
                                lock_inventario = false;
                                m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                            } else {
                                System.out.println("\nValor inválido, tente novamente!\n");
                                lock_inventario=true;
                            }
                        }
                        while (lock_inventario && m.getInventario().size() != 0);
                    } else // se nao tiver itens no inventario
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("Opção inválida, tente novamente!\n");
                    }
                    break;
                default:
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Opção inválida, tente novamente!\n");

            }
        }while (lock && m.setPaciencia(m.getPaciencia()));
        return false;
    }
}
