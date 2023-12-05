// A complexidade é O(log n) pois
// O método put gasta O(log n) para inserir o elemento pois n precisa percorrer todos os itens
// O método getUltimoAcesso gasta O(1) pois só devolve o valor de um atributo

public class Ex4 {
    public static void main(String [] args){
        RedBlackBST bst = new RedBlackBST<>();
        preencheBST(bst); // preenchi a arvore igual ao exemplo da pag 20 do slide

    }

    public static void preencheBST(RedBlackBST bst){
        bst.put('m', 'm');
        bst.put('j', 'j');
        bst.put('r', 'r');
        bst.put('e', 'e');
        System.out.println(bst.getUltimoAcesso());
        bst.put('l', 'l');
        bst.put('p', 'p');
        bst.put('x', 'x');
        bst.put('c', 'c');
        System.out.println(bst.getUltimoAcesso());
        bst.put('h', 'h');
        bst.put('a', 'a');
        bst.put('s', 's');
        System.out.println(bst.getUltimoAcesso());
    }
}
