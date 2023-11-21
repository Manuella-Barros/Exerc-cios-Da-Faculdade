import java.util.Scanner;

public class Sala3 extends Sala implements Obstaculo
{
    @Override
    public boolean obstaculo(Object o, String nome) {
        if(o instanceof Maria)
            return confere_maria((Maria) o);
       else
            return confere_joao((Joao) o);
    }

    public boolean confere_maria(Maria m)
    {
        Scanner teclado = new Scanner(System.in);
        boolean lock = true, lock_inventario=true, lock_poder=true;
        String opc;
        int cont_poder=0;

        System.out.println("\n--------------------------------------------------------------------------------\n");
        System.out.printf("Você entra na terceira sala e ela está completamente vazia!\n" +
                "Exceto por uma folha de papel com a seguinte mensagem escrita: ");
        do {
            System.out.println("\n❝ apbacldaevfrgah ❞\n\nSolucione o enigma e a porta se abrirá!");
            if (m.getInventario().size() != 0) {
                System.out.printf("\n\n0 - para abrir o Inventário");
            }
            System.out.println("\n1 - Poder especial");
            System.out.printf("\n>");
            opc = teclado.nextLine();

            if (m.getInventario().size() != 0 && opc.equals("0")) //se tiver itens no inventario e digitar zero
            {
                do {
                    m.exibir_Inventario();
                    System.out.println("Digite 0 para sair do inventário");
                    System.out.println("Escreva o nome do item que deseja utilizar!");
                    System.out.printf(">");
                    opc = teclado.nextLine();
                    //canivete, pe de cabra e agua// voltara
                    System.out.println("--------------------------------------------------------------------------------\n");

                    if (opc.toLowerCase().equalsIgnoreCase("canivete") && m.getInventario().contains("canivete")) {
                        System.out.println("Frustrado por não haver utilidade para o canivete, você o lança " +
                                "contra a parede branca e o quebra!" +
                                "\n");
                        m.removerItemInventario("canivete");
                        m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                    } else if (opc.toLowerCase().equalsIgnoreCase("agua") && m.getInventario().contains("agua")) {
                        System.out.println("Beleza, deu pra dar uma " +
                                "acalmada!\nPaciencia completamente restaurada!");
                        m.setPaciencia(10);
                        m.removerItemInventario("agua");
                    } else if (opc.toLowerCase().equalsIgnoreCase("0")) {
                        System.out.println("\nVoltando ao jogo...\n");
                        lock_inventario = false;
                    } else if (opc.toLowerCase().equalsIgnoreCase("pe de cabra") && m.getInventario().contains("pe de cabra")) {
                        System.out.println("\nFrustrado com a situação, arremessou o pé de cabra contra a " +
                                "parede e ele se entortou, se tornando inutil e te causando uma lesão no " +
                                "ombro!");
                        m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));

                        lock_inventario = false;
                    }
                }
                while (lock_inventario && m.getInventario().size() != 0);
            }
            else if (opc.toLowerCase().equalsIgnoreCase("palavra"))
            {
                System.out.println("Parabéns, você conseguiu! \uD83D\uDE04\n É o grande vencedor de 2 mil" +
                        " " +
                        "dólares! \uD83E\uDD11\n Agora poderá ficar tranquila, pois seu nome não irá ficar sujo! " +
                        "\uD83D\uDE0E ");
                lock = false;
                return true;
            } else if (opc.equals("1")) {
                if (cont_poder == 1) {
                    System.out.println("Preste mais atenção nas regras \nO poder especial só pode ser usado uma vez por sala!");
                    m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                } else {
                    m.poderEspecial(3);
                    cont_poder = 1;
                }
            } else {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Opção inválida, tente novamente!\n");
                m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
            }

        }
        while (lock_poder && m.setPaciencia(m.getPaciencia())) ;
        return false;
    }
    public boolean confere_joao(Joao m)
    {
        Scanner teclado = new Scanner(System.in);
        boolean lock = true, lock_inventario=true, lock_poder=true;
        String opc;
        int cont_poder=0;
        System.out.println("\n--------------------------------------------------------------------------------\n");
        System.out.printf("Você entra na terceira sala e ela está completamente vazia!\n" +
                "Exceto por uma folha de papel com a seguinte mensagem escrita: ");
        do {
            System.out.println("\n❝ apbacldaevfrgah ❞\n\nSolucione o enigma e a porta se abrirá!");
            if (m.getInventario().size() != 0) {
                System.out.printf("\n\n0 - para abrir o Inventário");
            }
            System.out.println("\n1 - Poder especial");

            System.out.printf("\n>");
            opc = teclado.nextLine();

            if (m.getInventario().size() != 0 && opc.equals("0")) //se tiver itens no inventario e digitar zero
            { do {
                m.exibir_Inventario();
                System.out.println("Digite 0 para sair do inventário");
                System.out.println("Escreva o nome do item que deseja utilizar!");
                System.out.printf(">");
                opc = teclado.nextLine();
                //canivete, pe de cabra e agua// voltara
                System.out.println("--------------------------------------------------------------------------------\n");

                if (opc.toLowerCase().equalsIgnoreCase("canivete") && m.getInventario().contains("canivete")) {
                    System.out.println("Frustrado por não haver utilidade para o canivete, você o lança " +
                            "contra a parede branca e o quebra!" +
                            "\n");
                    m.removerItemInventario("canivete");
                    m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                } else if (opc.toLowerCase().equalsIgnoreCase("agua") && m.getInventario().contains("agua")) {
                    System.out.println("Beleza, deu pra dar uma " +
                            "acalmada!\nPaciencia completamente restaurada!");
                    m.setPaciencia(10);
                    m.removerItemInventario("agua");
                } else if (opc.equals("0"))
                {
                    System.out.println("\nVoltando ao jogo...\n");
                    lock_inventario = false;
                } else if (opc.toLowerCase().equalsIgnoreCase("pe de cabra") && m.getInventario().contains("pe de cabra")) {
                    System.out.println("\nFrustrado com a situação, arremessou o pé de cabra contra a " +
                            "parede e ele se entortou, se tornando inutil e te causando uma lesão no " +
                            "ombro!");
                    m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));

                    lock_inventario = false;
                }
                else {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Opção inválida, tente novamente!\n");
                    m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                }
            }
            while (lock_inventario && m.getInventario().size() != 0);
            }
            else if (opc.toLowerCase().equalsIgnoreCase("palavra"))
            {
                System.out.println("Parabéns, você conseguiu! \uD83D\uDE04\n É o grande vencedor de 2 mil" +
                        " " +
                        "dólares! \uD83E\uDD11\n Agora poderá ficar tranquilo,\n poderá viajar com seus amigos sem a " +
                        "consciência pesada! \uD83D\uDE0E ");
                lock = false;
                return true;
            } else if (opc.equals("1")) {
                if (cont_poder == 1) {
                    System.out.println("Preste mais atenção nas regras \nO poder especial só pode ser usado uma vez por sala!");
                    m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                } else {
                    m.poderEspecial(3);
                    cont_poder = 1;
                }
            } else {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Opção inválida, tente novamente!\n");
                m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
            }

        }
        while (lock_poder && m.setPaciencia(m.getPaciencia())) ;
        return false;
    }


}
