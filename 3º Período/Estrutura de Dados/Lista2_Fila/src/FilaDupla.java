public class FilaDupla extends Fila {
    public FilaDupla(int tam)
    {
        super(tam);
    }

    public boolean insereInicio(int elemento) {
        int prec;

        if (!isCheia()) {
            /* Insere na posi��o precedente ao in�cio */
            prec = (inicio - 1 + tamanho) % tamanho;
            vetor[prec] = elemento;
            inicio = prec; /* Atualiza �ndice para in�cio */
            qntElementos++;
            return true;
        }
        else
            return false;
    }

    public int removeFim() {
        int elemento = Integer.MIN_VALUE;
        int ult;

        if (!this.isVazia()) {
            ult = (inicio + qntElementos - 1) % tamanho;
            elemento = vetor[ult];
            qntElementos--;
        }

        return elemento;
    }
}
