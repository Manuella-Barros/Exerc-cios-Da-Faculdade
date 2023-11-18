public class Elo<T> {
    protected Elo ant;
    protected Elo prox;
    protected T elem;

    public Elo(){ // inicializa as variaveis
        ant = null;
        prox = null;
    }

    public Elo(T elem){ // pra adicionar o primeiro elemento
        this.elem = elem;
        ant = null;
        prox = null;
    }

    public Elo(T elem, Elo ant, Elo prox){ // adiciona um elemento, não sendo o primeiro
        this.ant = ant;
        this.prox = prox;
        this.elem = elem;
    }

}
