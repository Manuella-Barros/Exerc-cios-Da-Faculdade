public class ListaGenerica<T> extends Elo<T> {
    public Elo prim;
    private Elo<T> elo;
    int tamanho = 0;

    public ListaGenerica(){
        this.prim = null;
    }
    public boolean isVazia(){ // ve se a lista está vazia
        if(prim == null){ return true; }
        return false;
    }

    public Elo insere(T elem){
        if(isVazia()){ // adicionando o primeiro elemento da lista
            // se estiver vazia o prox será null
            elo = new Elo<>(elem);
        } else{
            // se não estiver vazia o prox será prim
            elo = new Elo<>(elem, prim);
        }

        tamanho++;
        prim = elo;
        return elo;
    }

    public Elo insereMeio(T elem, Elo elo){
        System.out.println(elem);
        System.out.println(elo);
        return elo = new Elo<>(elem, elo);
    }
    public Elo insereNoFinal(T elem){
        return elo = new Elo<>(elem, null);
    }

    public void imprime(String texto){
        if(!isVazia()){
            System.out.println(texto);

            // copia o primeiro elemento e faz um for nele
            for(Elo i = prim; i != null; i = i.prox){
                System.out.println(i.elem);
            }
        } else{
            System.out.println("A lista está vazia");
        }
    }
}
