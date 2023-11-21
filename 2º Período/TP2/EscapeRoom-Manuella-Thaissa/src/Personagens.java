import java.util.*;

public abstract class Personagens implements Personagem
{
    //atributos
    protected String nome="";
    protected int idade=0;
    protected int paciencia=10;
    protected String história="";
    protected HashMap<Integer, String> poder_especial= new HashMap<>();//dica
    protected String poder;
    protected ArrayList<String> inventario= new ArrayList<String>();

    //////////construtor
    public Personagens(String nome, int idade, String história, String poder) {
        this.nome = nome;
        this.idade = idade;
        this.história = história;
        this.poder = poder;
    }


    ///////////////////////////////////metodos
    public void poderEspecial(int chave)
    {
        System.out.println(poder_especial.get(chave));
    }
    public void contarHistoria() //gethistoria
    {
        System.out.println("\n\nA história de "+nome+", "+idade+" anos:\n");
        System.out.println(história);
        System.out.println("Dentro da caixa existe um convite com a seguinte mensagem:\n\n"
                +"❝Prazer eu sou a sorte e bati a sua porta! \nJunto comigo trouxe uma oportunidade de resolver " +
                "todas as suas necessidades financeiras, um prêmio de 2 mil dólares!\uD83E\uDD11 \nPara" +
                " isso você " +
                "apenas " +
                "precisa assinar o contrato que está na caixa para " +
                "aceitar o desafio que colocará em teste \nsuas habilidades intelectuais e seu nivel de sorte.\n" +
                "Está interessado em solucionar os enigmas do nosso escape room?❞");
    }

    ///////////////////////////inventario
    public void adicionarItemInventario(String item)
    {
        this.inventario.add(item);
    }
    public void removerItemInventario(String item)
    {
        this.inventario.remove(item);
    }
    public ArrayList<String> getInventario() {return inventario;}
    public void exibir_Inventario()
    {
        System.out.println("\nItens do inventário:");
        for (int i=0;i<inventario.size();i++)
        {
            System.out.println("- "+ inventario.get(i));
        }
    }
    ////////////////// gets
    public String getNome() {return nome;}
    public int getIdade() {return idade;}
    public String getPoder() {return poder;}
    public int getPaciencia() {
        return paciencia;
    }

    ////////////////// sets
    public boolean setPaciencia(int paciencia) {
        this.paciencia = paciencia;

        if(paciencia > 0){
            System.out.println("Paciencia atual: "+ getPaciencia()+"/10\n");
            return true;
        } else{
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("\nPaciencia zerada! \nBoa sorte da próxima vez! \uD83D\uDE1F ");
            return false;
        }
    }

    /////////////////////////////////// ações em comum de maria e joao
    public boolean confereContrato()
    {
        Scanner teclado = new Scanner(System.in);
        String opc="";
        do{
            try
            {
                System.out.println("\nDeseja assinar o contrato? \n\n1- Sim, com certeza! \n2- Não, nem pensar!");
                System.out.printf("> ");
                opc = teclado.nextLine();

                switch (opc)
                {
                    case "1":
                        System.out.println("\nAgora vamos lá!\nDevemos saber que iniciamos essa missão com:"+
                                "\nPaciencia: 10/10\nMas perdemos um pouco dela em cada erro!\nAlém disso, podemos " +
                                "utilizar os poderes especiais apenas uma vez em cada sala!\n\nDito isso, vamos " +
                                "começar!\n");
                        return true;

                    case "2":
                        System.out.println("\nAté a próxima!\n");
                        return false;

                    default:
                        System.out.println(
                                "--------------------------------------------------------------------------------\n");
                        System.out.println("\nValor inválido! Insira números!\n");
                }
            }
            catch(Exception e)
            {   System.out.println(
                    "--------------------------------------------------------------------------------\n");
                System.out.println("\nValor inválido!\n");
            }
        } while ( !opc.equals("1") &&  !opc.equals("2"));

        return true;

    }
    public void pegarPrimeiroItem()
    {
        Scanner teclado = new Scanner(System.in);
        String opc="";
        do{
            try
            {

                System.out.println("Você tem o direito de levar um objeto de casa: \n1 - Canivete\n2 - Pé de cabra");
                System.out.printf("> ");
                opc = teclado.nextLine();
                switch (opc)
                {
                    case"1":
                        adicionarItemInventario("canivete");
                        break;
                    case"2":
                        adicionarItemInventario("pe de cabra");
                        break;
                    default:
                      System.out.println("--------------------------------------------------------------------------------\n");
                      System.out.println("Valor inválido! \nInsira numeros correspondentes as opções!");
                }
            }
            catch(Exception e)
            {   System.out.println("--------------------------------------------------------------------------------\n");

                System.out.println("\nValor inválido!\n");
            }
        } while (!opc.equals("1") &&  !opc.equals("2"));
    }
}
