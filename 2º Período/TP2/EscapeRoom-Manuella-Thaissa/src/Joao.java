public final class Joao extends Personagens implements Personagem {
    public Joao() {
        super("Joao", 27, "Você é um rapaz muito alegre e que está sempre de bem com a vida."+
                "\nEntretanto anda cabisbaixo atualmente visto que está sem dinheiro para realizar a tão sonhada " +
                        "\nviagem com seus amigos de infância!" +
                        "\nPara sua surpresa, em uma tarde de domingo, as crianças da rua decidiram brincar de tocar " +
                        "capanhia e sair correndo." +
                        "\n❝Brincadeira boba, coisa de criança❞ pensou.\n" +
                        "Ainda assim, depois de ouvir repetidas vezes sua campainha tocar e muitas gargalhadas" +
                        "\ndecidiu reagir para reclamar com as crianças de seu bairro, " +
                        "porém quando chegou a porta, quase tropeçou em um pequeno item em sua porta. \nUma caixa!",
                "Habilidade em Charadas.");
        adicionaDica();
    }

    @Override
    public void adicionaDica()
    {
//        poder_especial.put(1, "Sem dedos eu aponto, \nsem braços eu golpeio, \nsem pés eu corro. \nO que sou?");
//        poder_especial.put(2, "Uma mensagem surge na parede com a seguinte charada: \n❝Posso ser qualquer letra, mas " +
//                "no ínicio sempre estou,\nSeja 4 vezes a meia duzia,\nO numero total de quem eu sou❞");
//        poder_especial.put(3, "Você encontrou no verso do quadro da sala a seguinte frase escrita:\n ❝Possuo 26 " +
//                "componentes e tem apenas 4 de mim em dente.❞");

        poder_especial.put(1, "❝Comigo dez e dez não são vinta, e com mais cinquenta vira onze❞ \nO que sou?");
        poder_especial.put(2, "Uma mensagem surge na parede com a seguinte charada: \n❝Posso ser qualquer letra, mas " +
                "no ínicio sempre estou,\nSeja 2 vezes a meia duzia,\nO numero total de vezes que apareço por ano❞");
        poder_especial.put(3, "Você encontrou no verso do quadro da sala a seguinte frase escrita: \n❝Possuo 26 " +
                "componentes e tem apenas 4 de mim em dente❞");
    }
}