import java.util.Vector;

public class FilaGenerica<T> {
    protected int tamanho;
    protected Vector<T> vetor;
    protected int inicio;
    protected int qntElementos;

    public FilaGenerica(int tam) {
        tamanho = tam;
        vetor = new Vector<>(tamanho);
        inicio = 0;
        qntElementos = 0;
    }

    public boolean isVazia()
    {
        return (qntElementos == 0);
    }

    public boolean isCheia()
    {
        return (qntElementos == tamanho);
    }

    public T remove() {
        T elemento = null;

        if (!this.isVazia()) {
            elemento = vetor.get(inicio);
            inicio = (inicio + 1) % tamanho;
            qntElementos--;
        }

        return elemento;
    }

    public boolean insere(T elemento)
    {
        int fim;

        if ( !isCheia() ) {
            fim = (inicio + qntElementos) % tamanho;
            vetor.add(fim, elemento);
            qntElementos++;
            return true;
        } else {
            return false;
        }
    }
}
