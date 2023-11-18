// Complexidade O(n^2), pois dentro do meu metodo imprimeLista() eu tenho um for para percorrer a lista e dentro
// dele tem um for para printar os espacamentos, então esse método custa O(n^2)

public class Ex6 {
    public static void main(String[] args){
        ListaGenerica diretorio = preencheListas();

        System.out.println("Elementos da lista");
        imprimeLista(diretorio, 0); // O(n^2)
    }

    //Método recursivo para imprimir as listas de lista
    public static void imprimeLista(ListaGenerica lista, int espacamento){
        if(!lista.isVazia()){
            // copia o primeiro elemento e faz um for nele
            for(Elo i = lista.prim; i != null; i = i.prox){ // O(n)
                if(i.elem.toString().contains("ListaGenerica")){
                    imprimeLista((ListaGenerica) i.elem, espacamento + 4);
                } else {
                    for(int n = 0; n < espacamento; n++){ // O(n)
                        System.out.printf(" ");
                    }
                    System.out.println(i.elem);
                }
            }
        } else{
            System.out.println("A lista está vazia");
        }
    } // O(n^2)

    public static ListaGenerica preencheListas(){
        ListaGenerica diretorio = new ListaGenerica<>(); // Lista com as listas
        ListaGenerica arquivo1 = new ListaGenerica<>(); // Lista com o nome do arquivo e uma lista de jogos
        ListaGenerica lista1 = new ListaGenerica<>(); // Lista de jogos
        ListaGenerica arquivo2 = new ListaGenerica<>(); // Lista com o nome do arquivo e uma lista de materias da faculdade
        ListaGenerica lista2 = new ListaGenerica<>(); // Lista de materias e uma lista
        ListaGenerica diretorio2 = new ListaGenerica<>(); // Lista de materias
        ListaGenerica arquivo3 = new ListaGenerica<>();
        ListaGenerica lista3 = new ListaGenerica<>();
        ListaGenerica diretorio3 = new ListaGenerica<>(); // Marvel
        ListaGenerica diretorio3_2 = new ListaGenerica<>(); // DC
        ListaGenerica diretorio3_3 = new ListaGenerica<>(); // Brilho Eterno de Uma Mente Sem Lembranças
        ListaGenerica diretorio3_4 = new ListaGenerica<>(); // (Pasta Vazia)
        ListaGenerica lista3_2 = new ListaGenerica<>();

        diretorio3_4.insere("(Pasta Vazia)");
        lista3.insere(diretorio3_4);
        lista3.insere("Comédias Românticas");

        diretorio3_3.insere("Brilho Eterno de Uma Mente Sem Lembranças ");
        lista3.insere(diretorio3_3);
        lista3.insere("Drama");

        lista3_2.insere("Superman");
        diretorio3_2.insere(lista3_2);
        diretorio3_2.insere("DC");
        lista3.insere(diretorio3_2);
        lista3_2.insere("Vingadores");
        lista3_2.insere("Homem-Aranha ");
        diretorio3.insere(lista3_2);
        diretorio3.insere("Marvel");
        lista3.insere(diretorio3);
        lista3.insere("Super-heróicos");
        arquivo3.insere(lista3);
        arquivo3.insere("Filmes");
        diretorio.insere(arquivo3);


        lista2.insere("TPD");
        diretorio2.insere("ACE3");
        diretorio2.insere("ACE2");
        diretorio2.insere("ACE1");
        lista2.insere(diretorio2);// elementos -> [ACE1, ACE2, ACE3], TPD
        lista2.insere("ACEs");
        lista2.insere("AA");
        lista2.insere("EDD2");
        lista2.insere("EDD1");
        arquivo2.insere(lista2); // elementos -> EDD1, EDD2, AA, ACEs, [ACE1, ACE2, ACE3], TPD
        arquivo2.insere("Faculdade"); // elementos -> Faculdade, [EDD1, EDD2, AA, ACEs, [ACE1, ACE2, ACE3], TPD]
        diretorio.insere(arquivo2); // Insere no diretorio a Lista 2


        lista1.insere("World of Warcraft ");
        lista1.insere("Paciência");
        lista1.insere("Campo Minado");
        arquivo1.insere(lista1);
        arquivo1.insere("Jogos"); // elementos -> [Jogos], [World of Warcraft, Paciência, Campo Minado]
        diretorio.insere(arquivo1); // Insere no diretorio a Lista 1

        return diretorio;
    } // O(1)
}