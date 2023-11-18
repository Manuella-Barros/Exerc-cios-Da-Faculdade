public class ListaCircularEncadeadaDupla<T> extends Elo<T> {
    protected Elo<T> prim, ult;
    public int tamanho = 0;
    public ListaCircularEncadeadaDupla(){ // inicializa a pilha vazia
        prim = null;
    }

    public boolean isVazia(){ return prim == null; } // retorna true se estiver vazia

    public void insere(T elem){
        Elo elo = new Elo(elem); // cria o elo e passa o valor

        if(isVazia()){
            ult = elo;
            elo.prox = elo;
            elo.ant = elo;
        } else {
            elo.prox = prim; // o prox do elo novo será o prim anterior
            elo.ant = ult; // o ant do novo elo aponta para o ultimo
            elo.prox.ant = elo;

            if(tamanho == 1){
                elo.prox.prox = elo;
            }

        }

        tamanho++;
        prim = elo;
        ult.prox = prim;
    }

    public void imprime(){
        if(!isVazia()){
            Elo p = prim;
            do{
                System.out.println(p.elem);
                p = p.prox;
            } while (p != prim);

        } else{
            System.out.println("A lista está vazia");
        }
    }

    // EXERCICIO 3
    public ListaCircularEncadeadaDupla inverteLista(){
        ListaCircularEncadeadaDupla<T> listaInvertida = new ListaCircularEncadeadaDupla<>();
        Elo<T> p = prim;

        do{
            listaInvertida.insere(p.elem);

            p = p.ant;
        } while (p != prim); // esse loop le a lista invertida

        return  listaInvertida;
    }

    public ListaCircularEncadeadaDupla merge(ListaCircularEncadeadaDupla lista2){
        ListaCircularEncadeadaDupla l3 = new ListaCircularEncadeadaDupla<>();
        Elo l1 = prim, l2 = lista2.prim;

        do {
            l3.insere(l1.elem);
            l1 = l1.prox;

            l3.insere(l2.elem);
            l2 = l2.prox;

        } while (l1 != prim && l2 != lista2.prim) ;

        return l3;
    }

}
