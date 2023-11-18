// Complexidade O(n) pois utilizo um for para imprimir os inimigos

public class Ex7 {
    public static void main(String[] args){
        Inimigo antonio = new Inimigo(10 , "antonio");
        Inimigo antonella = new Inimigo(10 , "antonella");
        Inimigo ricardinho = new Inimigo(10 , "ricardinho");
        Inimigo jujubinha = new Inimigo(10 , "jujubinha");
        ListaInimigo listaInimigos = new ListaInimigo();

        // ADICIONANDO INIMIGOS
        listaInimigos.inserirInimigo(antonio); // O(1)
        listaInimigos.inserirInimigo(antonella); // O(1)
        listaInimigos.inserirInimigo(ricardinho); // O(1)
        listaInimigos.inserirInimigo(jujubinha); // O(1)

        //MOSTRANDO TODOS OS INIMIGOS
        listaInimigos.imprimirInimigos(); // O(n)

        listaInimigos.efetuarDanoInimigo(antonella, 10);  // O(1)
        listaInimigos.efetuarDanoInimigo(antonio, 5); // O(1)
        listaInimigos.efetuarDanoInimigo(ricardinho, 10); // O(1)
        listaInimigos.efetuarDanoInimigo(jujubinha, 9); // O(1)

        listaInimigos.imprimirInimigos();
    }
}