public class Ex5 {
    public static void main(String[] args) {
        char palavra[] = {'E', 'A', 'S', 'Y', 'Q', 'U', 'T', 'I', 'O', 'N'};

        for(char letra: palavra){
            transformaIndice11(letra);
            transformaIndice17(letra);
        }


    }

    public static void transformaIndice11(char letra){
        SeparateChainingHashST sch = new SeparateChainingHashST<>(3);

        int i = (11 * letra) % 3;
        System.out.println("lista 11 ->" + i);

        sch.colocaNaLista(letra, letra, i);
    }

    public static void transformaIndice17(char letra){
        SeparateChainingHashST sch = new SeparateChainingHashST<>(3);

        int i = (17 * letra) % 3;
        System.out.println("lista 17 ->" + i);
        sch.colocaNaLista(letra, letra, i);
    }
}
