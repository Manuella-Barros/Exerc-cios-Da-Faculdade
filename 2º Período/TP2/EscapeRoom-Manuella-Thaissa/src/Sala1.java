import java.util.ArrayList;
import java.util.Scanner;

public class Sala1 extends Sala implements Obstaculo
{
    Scanner teclado = new Scanner(System.in);
    ArrayList<String>objetos = new ArrayList<String>() ;

     public boolean obstaculo(Object o, String n)
     {
         objetos.add("Uma garrafa de agua");
         objetos.add("Uma chave");
         objetos.add("Uma caixa pequena");
         if (o instanceof Maria)
             return confere_opc_maria((Maria) o);
         else
            return  confere_opc_joao((Joao) o);
     }
     public boolean confere_opc_maria(Maria m)
     {
         String opc="";
         boolean lock=true, agua=false, bebeu=false, lock_inventario=true, lock_poder=true;
         int cont_poder=0;

         //para visualizar a organização das coisas, só fechar os metodos e acompanhar o raciocinio
         //////////////////////////////////////////////////////////////////SELECIONA ITENS
         System.out.println("Ao chegar no local você abre a porta e ao dar os primeiros passos dentro da sala,\n" +
                 "Escuta o barulho da porta trancando atrás de você.\n" +
                 "Agora já era, não tem como voltar atrás!\n" +
                 "Você começa a explorar a sala e poucos passos depois esbarra em uma mesa de metal pesado, nela se " +
                 "encontram três objetos, são eles:");

         while (lock && m.setPaciencia(m.getPaciencia()))
         {
             try {
                 System.out.println(
                         "--------------------------------------------------------------------------------\n");
                 for (int i = 0; i < objetos.size(); i++) //printa os 3 itens
                 {
                     System.out.println((i + 1) + "-" + objetos.get(i));
                 }
                 System.out.println("4-Usar Poder Especial");
                 System.out.printf("\nQual deles deseja conferir?\n>");
                 opc = teclado.nextLine();
                 //switch
                 //case 1: adiciona agua no inventario
                 //case 2: tenta usar chave e confere inventario pra tentar abrir porta
                 //case 3: abre caixa
                 //case 4: poder especial
                 //default

                 //confere opc
                 switch (opc)
                 {
                     case "1":
                         if (!m.getInventario().contains("agua") && !bebeu)//nao tem agua e nao bebeu
                         {
                             System.out.println(
                                     "--------------------------------------------------------------------------------\n");
                             System.out.println("Item adicionado no inventário!\nQue bom que achou essa " +
                                     "garrafinha, pois no fim das contas, " +
                                     "\nquando estiver precisando de paciência, beba água!\n");
                             m.adicionarItemInventario("agua");
                             agua = true;
                         } else {
                             if (bebeu == false) //se ainda nao bebeu
                             {
                                 System.out.println(
                                         "--------------------------------------------------------------------------------\n");
                                 System.out.printf("Deseja beber agora?\n1-sim\n2-não\n>");
                                 opc = teclado.nextLine();
                                 if (opc.equals("1"))  //se beber agora
                                 {
                                     System.out.println("Nossa, que alívio! Estava mesmo com sede!");
                                     m.setPaciencia(10);
                                     m.removerItemInventario("agua");
                                     agua = false;
                                     bebeu = true;
                                 } else // se nao beber
                                 {
                                     System.out.println(
                                             "--------------------------------------------------------------------------------\n");
                                     System.out.println("Melhor guardar pra depois mesmo...\n");
                                 }
                             }
                             else// se ja bebeu, tira paciencia
                             {
                                 System.out.println("--------------------------------------------------------------------------------\n" +
                                         "Você já bebeu a água toda, da proxima vez, poupe!\n");
                                 m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                             }
                         }
                         break;
                     case "2":
                         //////////////////////////////////////////////////////////////////SELECIONA ITENS INVENTARIO
                         System.out.println(
                                 "--------------------------------------------------------------------------------\n");
                         System.out.println("Droga! Essa chave não abre a porta!");
                         m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));

                         if(m.getInventario().size()!=0) {
                             System.out.println("Será que tem algo no " +
                                     "inventário que possa ajudar?\nVamos conferir!\n");
                             do {
                                 m.exibir_Inventario();
                                 System.out.println("Digite 0 para sair do inventário");
                                 System.out.println("Escreva o nome do item que deseja utilizar!");
                                 System.out.printf(">");
                                 opc = teclado.nextLine();
                                 //canivete, pe de cabra e agua// voltara
                                 System.out.println(
                                         "--------------------------------------------------------------------------------\n");

                                 if (opc.toLowerCase().equalsIgnoreCase("canivete") && m.getInventario().contains(
                                         "canivete")) {
                                     System.out.println("A ideia é boa!\n" +
                                             "Mas infelizmente, na tentativa de abrir a porta, \n" +
                                             "o canivete simplesmente quebrou!");
                                     m.removerItemInventario("canivete");
                                     m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                                 } else if (opc.toLowerCase().equalsIgnoreCase("agua") && m.getInventario().contains(
                                         "agua")) {
                                     System.out.println("Beleza, deu pra dar uma " +
                                             "acalmada!\nPaciencia completamente restaurada!");
                                     m.setPaciencia(10);
                                     m.removerItemInventario("agua");
                                     bebeu = true;
                                 } else if (opc.toLowerCase().equalsIgnoreCase("0")) {
                                     System.out.println("\nVoltando ao jogo...\n");
                                     lock_inventario = false;
                                     // break;
                                 } else if (opc.toLowerCase().equalsIgnoreCase("pe de cabra")&& m.getInventario().contains(
                                         "pe de cabra")) {
                                     System.out.println("A ideia é boa!\n" +
                                             "E com um pouco de força, foi possivel sair da sala!\n" +
                                             "Vamos para a próxima sala! \uD83D\uDCAA\n");
                                     lock_inventario = false;
                                     return true;
                                 } else {
                                     System.out.println("\nValor inválido, tente novamente!\n");
                                     lock_inventario=true;
                                 }
                             }
                             while (lock_inventario && m.getInventario().size() != 0);
                         }
                         break;
                     ////////////////////////////////////////////////////////////////////////////////////////////
                     case "3":
                         System.out.println(
                                 "--------------------------------------------------------------------------------\n");

                         System.out.println("A caixa está fechada!");
                         m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                         break;
                     case "4":
                         System.out.println(
                                 "--------------------------------------------------------------------------------\n");

                         if(cont_poder==1)
                         {
                             System.out.println("Preste mais atenção nas regras \nO poder especial só pode ser usado uma vez por sala!");
                             m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                         }
                         do {
                             cont_poder=1;
                             System.out.println("\nSolucione o enigma e a porta se abrirá!");
                             m.poderEspecial(1);
                             System.out.println("Digite 0 para voltar as opçoes anteriores...");
                             System.out.printf(">");
                             opc = teclado.nextLine();
                             if (opc.toLowerCase().equalsIgnoreCase("relogio")) {
                                 System.out.println("Isso mesmo! Partiu próxima sala! \uD83D\uDE1C ");
                                 lock = false;
                                 return true;
                             } else if (opc.equals("0"))
                             {
                                 System.out.println("\nVoltando as opções anteriores...");
                                 lock_poder = false;
                             }
                             else
                             {
                                 m.setPaciencia(interageComPersonagem(m, m.getNome(), "subtrai"));
                                 System.out.println("\nTente novamente!\nTalvez ajude se pensar em uma palavra...\n");
                                 lock_poder=true;
                             }
                         } while (lock_poder == true);
                         break;
                     default:
                         System.out.println(
                                 "--------------------------------------------------------------------------------\n");

                         System.out.println("Valor inválido, insira números para selecionar uma opção!");
                 }}
             catch( Exception e)
             {
                 System.out.println("Valor inválido!\nTente novamente!");
             }
         }
         return false;
     }

    public boolean confere_opc_joao(Joao j)
    {
        String opc="";
        boolean lock=true, agua=false, bebeu=false, lock_inventario=true, lock_poder=true;
        int cont_poder=0;

        //para visualizar a organização das coisas, só fechar os metodos e acompanhar o raciocinio
        //////////////////////////////////////////////////////////////////SELECIONA ITENS
        System.out.println("Ao chegar no local você abre a porta e ao dar os primeiros passos dentro da sala,\n" +
                "Escuta o barulho da porta trancando atrás de você.\n" +
                "Agora já era, não tem como voltar atrás!\n" +
                "Você começa a explorar a sala e poucos passos depois esbarra em uma mesa de metal pesado, nela se " +
                "encontram três objetos, são eles:");

        while (lock && j.setPaciencia(j.getPaciencia()))
        {
            try {
                System.out.println(
                        "--------------------------------------------------------------------------------\n");
                for (int i = 0; i < objetos.size(); i++) //printa os 3 itens
                {
                    System.out.println((i + 1) + "-" + objetos.get(i));
                }
                System.out.println("4-Usar Poder Especial");
                System.out.printf("\nQual deles deseja conferir?\n>");
                opc = teclado.nextLine();
                //switch
                //case 1: adiciona agua no inventario
                //case 2: tenta usar chave e confere inventario pra tentar abrir porta
                //case 3: abre caixa
                //case 4: podr especial
                //default

                //confere opc
                switch (opc)
                {
                    case "1":
                        if (!j.getInventario().contains("agua") && !bebeu)//nao tem agua e nao bebeu
                        {
                            System.out.println(
                                    "--------------------------------------------------------------------------------\n");
                            System.out.println("Item adicionado no inventário!\nQue bom que achou essa " +
                                    "garrafinha, pois no fim das contas, " +
                                    "\nquando estiver precisando de paciência, beba água!\n");
                            j.adicionarItemInventario("agua");
                            agua = true;
                        } else {
                            if (bebeu == false) //se ainda nao bebeu
                            {
                                System.out.println(
                                        "--------------------------------------------------------------------------------\n");
                                System.out.printf("Deseja beber agora?\n1-sim\n2-não\n>");
                                opc = teclado.nextLine();
                                if (opc.equals("1"))  //se beber agora
                                {
                                    System.out.println("Nossa, que alívio! Estava mesmo com sede!");
                                    j.setPaciencia(10);
                                    j.removerItemInventario("agua");
                                    agua = false;
                                    bebeu = true;
                                } else // se nao beber
                                {
                                    System.out.println(
                                            "--------------------------------------------------------------------------------\n");
                                    System.out.println("Melhor guardar pra depois mesmo...\n");
                                }
                            }
                            else// se ja bebeu, tira paciencia
                            {
                                System.out.println("--------------------------------------------------------------------------------\n" +
                                        "Você já bebeu a água toda, da proxima vez, poupe!\n");
                                j.setPaciencia(interageComPersonagem(j, j.getNome(), "subtrai"));
                            }
                        }
                        break;
                    case "2":
                        //////////////////////////////////////////////////////////////////SELECIONA ITENS INVENTARIO
                        System.out.println(
                                "--------------------------------------------------------------------------------\n");
                        System.out.println("Droga! Essa chave não abre a porta!");
                        j.setPaciencia(interageComPersonagem(j, j.getNome(), "subtrai"));

                        if(j.getInventario().size()!=0) {
                            System.out.println("Será que tem algo no " +
                                    "inventário que possa ajudar?\nVamos conferir!\n");
                            do {
                                j.exibir_Inventario();
                                System.out.println("Digite 0 para sair do inventário");
                                System.out.println("Escreva o nome do item que deseja utilizar!");
                                System.out.printf(">");
                                opc = teclado.nextLine();
                                //canivete, pe de cabra e agua// voltara
                                System.out.println(
                                        "--------------------------------------------------------------------------------\n");

                                if (opc.toLowerCase().equalsIgnoreCase("canivete") && j.getInventario().contains(
                                        "canivete")) {
                                    System.out.println("A ideia é boa!\n" +
                                            "Mas infelizmente, na tentativa de abrir a porta, \n" +
                                            "o canivete simplesmente quebrou!");
                                    j.removerItemInventario("canivete");
                                    j.setPaciencia(interageComPersonagem(j, j.getNome(), "subtrai"));
                                } else if (opc.toLowerCase().equalsIgnoreCase("agua") && j.getInventario().contains(
                                        "agua")) {
                                    System.out.println("Beleza, deu pra dar uma " +
                                            "acalmada!\nPaciencia completamente restaurada!");
                                    j.setPaciencia(10);
                                    j.removerItemInventario("agua");
                                    bebeu = true;
                                } else if (opc.toLowerCase().equalsIgnoreCase("0")) {
                                    System.out.println("\nVoltando ao jogo...\n");
                                    lock_inventario = false;
                                    // break;
                                } else if (opc.toLowerCase().equalsIgnoreCase("pe de cabra")&& j.getInventario().contains(
                                        "pe de cabra")) {
                                    System.out.println("A ideia é boa!\n" +
                                            "E com um pouco de força, foi possivel sair da sala!\n" +
                                            "Vamos para a próxima sala! \uD83D\uDCAA\n");
                                    lock_inventario = false;
                                    return true;
                                } else {
                                    System.out.println("\nValor inválido, tente novamente!\n");
                                    lock_inventario=true;
                                }
                            }
                            while (lock_inventario && j.getInventario().size() != 0);
                        }
                        break;
                    ////////////////////////////////////////////////////////////////////////////////////////////
                    case "3":
                        System.out.println(
                                "--------------------------------------------------------------------------------\n");

                        System.out.println("A caixa está fechada!");
                        j.setPaciencia(interageComPersonagem(j, j.getNome(), "subtrai"));
                        break;
                    case "4":
                        System.out.println(
                                "--------------------------------------------------------------------------------\n");

                        if(cont_poder==1)
                        {
                            System.out.println("Preste mais atenção nas regras \nO poder especial só pode ser usado uma vez por sala!");
                            j.setPaciencia(interageComPersonagem(j, j.getNome(), "subtrai"));
                        }
                        do {
                            cont_poder=1;
                            System.out.println("\nSolucione o enigma e a porta se abrirá!");
                            j.poderEspecial(1);
                            System.out.println("Digite 0 para voltar as opçoes anteriores...");
                            System.out.printf(">");
                            opc = teclado.nextLine();
                            if (opc.toLowerCase().equalsIgnoreCase("relogio")) {
                                System.out.println("Isso mesmo! Partiu próxima sala! \uD83D\uDE1C ");
                                lock = false;
                                return true;
                            } else if (opc.equals("0"))
                            {
                                System.out.println("\nVoltando as opções anteriores...");
                                lock_poder = false;
                            }
                            else
                            {
                                j.setPaciencia(interageComPersonagem(j, j.getNome(), "subtrai"));

                                if(j.setPaciencia(j.getPaciencia())){
                                    System.out.println("\nTente novamente!\nTalvez ajude se pensar em uma palavra...\n");
                                    lock_poder=true;
                                }
                            }
                        } while (lock_poder == true && j.setPaciencia(j.getPaciencia()));
                        break;
                    default:
                        System.out.println(
                                "--------------------------------------------------------------------------------\n");

                        System.out.println("Valor inválido, insira números para selecionar uma opção!");
                }}
            catch( Exception e)
            {
                System.out.println("Valor inválido!\nTente novamente!");
            }
        }
        return false;
    }
}
