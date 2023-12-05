public class HeapBinariaMinima {
    private int n;
    private int tam;
    private int[] vetor;

    public HeapBinariaMinima(int tamanho) {
        this.n = 0;
        this.tam = tamanho;
        this.vetor = new int[tamanho + 1];
    }

    public HeapBinariaMinima(int tamanho, int[] v) {
        this.tam = tamanho;
        this.vetor = new int[tamanho + 1];
        this.n = tamanho;

        for(int i = 0; i < tamanho; ++i) {
            this.vetor[i + 1] = v[i];
        }

        this.constroiHeap();
    }

    /**************** EXERCICIO 2 ****************/
    public HeapBinariaMinima(HeapBinariaMaxima heapMaxima){
        this.n = 0;
        this.tam = heapMaxima.getTam() + 1;
        this.vetor = new int[tam];


        while (!heapMaxima.isVazia()){
            this.vetor[n + 1] = heapMaxima.removeMax();
            n++;
        }

        this.constroiHeap();
    }

    public boolean isVazia() {
        return this.n == 0;
    }

    public void fazVazia() {
        this.n = 0;
    }

    public void imprime() {
        System.out.print("Conteúdo da heap: ");

        for(int i = 1; i <= this.n; ++i) {
            System.out.print(this.vetor[i] + " ");
        }

        System.out.println();
    }

    public int min() {
        if (this.isVazia()) {
            System.out.println("Fila de prioridades vazia!");
            return Integer.MAX_VALUE;
        } else {
            return this.vetor[1];
        }
    }

    public int removeMin() {
        if (this.isVazia()) {
            System.out.println("Fila de prioridades vazia!");
            return Integer.MAX_VALUE;
        } else {
            int itemMin = this.vetor[1];
            this.vetor[1] = this.vetor[this.n];
            --this.n;
            this.refaz(1);
            return itemMin;
        }
    }

    private void constroiHeap() {
        for(int i = this.n / 2; i > 0; --i) {
            this.refaz(i);
        }

    }

    private void refaz(int i) {
        int x;
        int menorFilho;
        for(x = this.vetor[i]; 2 * i <= this.n; i = menorFilho) {
            int filhoEsq = 2 * i;
            int filhoDir = 2 * i + 1;
            menorFilho = filhoEsq;
            if (filhoDir <= this.n && this.vetor[filhoDir] < this.vetor[filhoEsq]) {
                menorFilho = filhoDir;
            }

            if (this.vetor[menorFilho] >= x) {
                break;
            }

            this.vetor[i] = this.vetor[menorFilho];
        }

        this.vetor[i] = x;
    }

    public void insere(int x) {
        if (this.tam == this.n) {
            System.out.println("Fila de prioridades cheia!");
        } else {
            ++this.n;
            int pos = this.n;

            for(this.vetor[0] = x; x < this.vetor[pos / 2]; pos /= 2) {
                this.vetor[pos] = this.vetor[pos / 2];
            }

            this.vetor[pos] = x;
        }
    }

    public int getTam(){
        return tam;
    }

}
