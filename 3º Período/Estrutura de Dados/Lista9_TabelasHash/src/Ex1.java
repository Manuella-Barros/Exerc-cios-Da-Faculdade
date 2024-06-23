public class Ex1 {
    public static void main(String[] args) {
        char palavra[] = {'E', 'A', 'S', 'Y', 'Q', 'U', 'T', 'I', 'O', 'N'};

        for(char letra: palavra){
            transformaIndice(letra);
        }

    }

    public static void transformaIndice(char letra){
        SeparateChainingHashST sch = new SeparateChainingHashST<>(5);

        int i = (11 * letra) % 5;
        sch.colocaNaLista(letra, letra, i);
    }
}