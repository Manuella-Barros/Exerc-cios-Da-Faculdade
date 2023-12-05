public class HeapBinariaMaxima {
    private int n;
    private int tam;
    private int[] vetor;

    public HeapBinariaMaxima(int tamanho) {
        this.n = 0;
        this.tam = tamanho;
        this.vetor = new int[tamanho + 1];
    }

    public HeapBinariaMaxima(int tamanho, int[] v) {
        this.tam = tamanho;
        this.vetor = new int[tamanho + 1];
        this.n = tamanho;

        for(int i = 0; i < tamanho; ++i) {
            this.vetor[i + 1] = v[i];
        }

        this.constroiHeap();
    }


    /**************** EXERCICIO 3 ****************/
    public HeapBinariaMaxima(HeapBinariaMinima heapMinima){
        this.n = 0;
        this.tam = heapMinima.getTam() + 1;
        this.vetor = new int[tam];


        while (!heapMinima.isVazia()){
            this.vetor[n + 1] = heapMinima.removeMin();
            n++;
        }

        this.constroiHeap();
    }

    /**************** EXERCICIO 4 ****************/
    public boolean verificaPropriedadeHeap(int[] v){
        for(int i = 0; i <= (vetor.length / 2) - 1; i++){
            if(v[i] < v[2 * i] || v[i] < v[(2 * i) + 1 ]){
                return false;
            }
        }

        return true;
    }

    /**************** EXERCICIO 5 ****************/
    // troco o item a ser removido pelo ultimo, diminuo o tamanho e chamo o refaz. Parecido com o heapsort
    public boolean remove(int i){
        int ultItem = vetor[n];
        vetor[n] = vetor[i];
        vetor[i] = ultItem;

        this.n--;
        refaz(i);
        return true;
    }

    public boolean isVazia() {
        return this.n == 0;
    }

    public void fazVazia() {
        this.n = 0;
    }

    public void imprime() {
        for(int i = 1; i <= this.n; ++i) {
            System.out.print(this.vetor[i] + " ");
        }

        System.out.println();
    }

    public void imprimeTamanho() {
        for(int i = 1; i <= this.tam; ++i) {
            System.out.print(this.vetor[i] + " ");
        }

        System.out.println();
    }

    public int max() {
        if (this.isVazia()) {
            System.out.println("Fila de prioridades vazia!");
            return Integer.MIN_VALUE;
        } else {
            return this.vetor[1];
        }
    }

    public int removeMax() {
        if (this.isVazia()) {
            System.out.println("Fila de prioridades vazia!");
            return Integer.MIN_VALUE;
        } else {
            int itemMax = this.vetor[1];
            this.vetor[1] = this.vetor[this.n];
            --this.n;
            this.refaz(1);
            return itemMax;
        }
    }

    private void constroiHeap() {
        for(int i = this.n / 2; i > 0; --i) {
            this.refaz(i);
        }

    }

    private void refaz(int i) {
        int x;
        int maiorFilho;
        for(x = this.vetor[i]; 2 * i <= this.n; i = maiorFilho) {
            int filhoEsq = 2 * i;
            int filhoDir = 2 * i + 1;
            maiorFilho = filhoEsq;
            if (filhoDir <= this.n && this.vetor[filhoDir] > this.vetor[filhoEsq]) {
                maiorFilho = filhoDir;
            }

            if (this.vetor[maiorFilho] <= x) {
                break;
            }

            this.vetor[i] = this.vetor[maiorFilho];
        }

        this.vetor[i] = x;
    }

    public void insere(int x) {
        if (this.tam == this.n) {
            System.out.println("Fila de prioridades cheia!");
        } else {
            ++this.n;
            int pos = this.n;

            for(this.vetor[0] = x; x > this.vetor[pos / 2]; pos /= 2) {
                this.vetor[pos] = this.vetor[pos / 2];
            }

            this.vetor[pos] = x;
        }
    }

    public void heapsort() {
        int resta = this.n;
        int raiz = 1;
        this.constroiHeap();

        while(resta > 1) {
            int x = this.vetor[raiz];
            this.vetor[raiz] = this.vetor[resta];
            this.vetor[resta] = x;
            --resta;
            --this.n;
            this.refaz(raiz);
        }

    }

    public int getTam(){
        return tam;
    }

}
