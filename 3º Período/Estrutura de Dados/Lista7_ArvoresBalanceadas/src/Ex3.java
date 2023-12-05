// A complexidade é O(n) pois
// O método put gasta O(log n) para inserir o elemento pois n precisa percorrer todos os itens
// O método alturaNegra gasta O(n) pois percorre todas as alturas da arvore atras da maior

public class Ex3 {
    public static void main(String [] args){
        RedBlackBST bst = new RedBlackBST<>();
        preencheBST(bst); // preenchi a arvore igual ao exemplo da pag 20 do slide

        System.out.println("A alura da arvore é = " + bst.alturaNegra());
    }

    public static void preencheBST(RedBlackBST bst){
        bst.put('m', 'm');
        bst.put('j', 'j');
        bst.put('r', 'r');
        bst.put('e', 'e');
        bst.put('l', 'l');
        bst.put('p', 'p');
        bst.put('x', 'x');
        bst.put('c', 'c');
        bst.put('h', 'h');
        bst.put('a', 'a');
        bst.put('s', 's');
    }
}
