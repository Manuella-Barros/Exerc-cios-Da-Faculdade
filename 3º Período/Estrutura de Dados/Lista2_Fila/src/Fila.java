public class Fila {
    protected int tamanho;
    protected int[] vetor;
    protected int inicio;
    protected int qntElementos;

    public Fila(int tam){
        tamanho = tam;
        vetor = new int[tamanho];
        inicio = 0;
        qntElementos = 0;
    }

    public boolean isVazia() {
        return (qntElementos == 0);
    }

    public boolean isCheia() {
        return (qntElementos == tamanho);
    }

    public int remove() {
        int elemento = Integer.MIN_VALUE;

        if (!this.isVazia()) {
            elemento = vetor[inicio];
            inicio = (inicio + 1) % tamanho;
            qntElementos--;
        }

        return elemento;
    }

    //Inserimos o elemento no final da fila
    public boolean insere(int elemento) {
        int fim;

        if ( !isCheia() ) {
            fim = (inicio + qntElementos) % tamanho;
            vetor[fim] = elemento;
            qntElementos++;
            return true;
        } else {
            return false;
        }
    }

    public static FilaDupla FilaCircularDupla(Fila filaCircular){
        int tamanho = filaCircular.qntElementos;
        FilaDupla filaCircularDupla = new FilaDupla(tamanho);

        // PREENCHE A FILA CIRCULAR DUPLA
        for (int i = 0; i < tamanho; i++){
            filaCircularDupla.insere(filaCircular.remove());
        }

        return filaCircularDupla;
    }
}
