// é responsável por guardar o dado desse elo e o ponteiro para o prox elo
public class Elo<T> {
    protected T elem;
    protected Elo<T> prox;

    // inicializando vazio, para não precisar de super
    public Elo(){
        this.prox = null;
    }

    // inserindo primeiro elemento, a ultima posição
    public Elo(T elem){
        this.elem = elem;
        this.prox = null;
    }

    // inserindo outros elementos, na primeira posição
    public Elo(T elem, Elo prox){
        this.elem = elem;
        this.prox = prox;
    }
}
