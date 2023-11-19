public class Raiz<T extends Comparable<T>> {
    protected T elem;
    protected Raiz esq, dir;

    public Raiz(){
        this.elem = null;
        this.esq = null;
        this.dir = null;
    }
    public Raiz(T elem){
        this.elem = elem;
        this.esq = null;
        this.dir = null;
    }
    public Raiz(T elem, ArvBinBusca esq, ArvBinBusca dir){
        this.elem = elem;
        this.esq = esq;
        this.dir = dir;
    }
}
