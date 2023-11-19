public class ArvBinBusca<T extends Comparable<T>> extends Raiz<T> {
    private Raiz raiz;

    private int tamanho = -1;

    public ArvBinBusca(){
        raiz = null;
    }

    public boolean isVazia(){ return this.raiz == null; }

    public void imprimePreOrdem(){
        imprimePreOrdemRecursiva(this.raiz);
    }

    private void imprimePreOrdemRecursiva(Raiz raiz){
        System.out.printf("<");

        if(raiz != null){
            System.out.printf("%s", raiz.elem);
            imprimePreOrdemRecursiva(raiz.esq);
            imprimePreOrdemRecursiva(raiz.dir);
        }

        System.out.printf(">");
    }

    public boolean isElemNaArvore(T elem){ // O(1)
        return isElemNaArvoreRecursiva(elem, this.raiz, false);
    }

    private boolean isElemNaArvoreRecursiva(T elem, Raiz raiz, boolean isIn){ // O(h)
        if(raiz != null){
            if(raiz.elem == elem){
                return true;
            }

            if(raiz.esq != null){
                isIn = isElemNaArvoreRecursiva(elem, raiz.esq, isIn);
            }

            if(raiz.dir != null){
                isIn = isElemNaArvoreRecursiva(elem, raiz.dir, isIn);
            }
        }

        return  isIn;
    }

    public void remove(T elem){
        removeRecursiva(this.raiz, elem);
    }
    private Raiz removeRecursiva(Raiz raiz, T elem){ // O(h)
        if(raiz == null){
            return null;
        }

        int cmp = raiz.elem.compareTo(elem);

        if(cmp == 0){ // achou o elemento que ta procurando
            if(raiz.esq == null && raiz.dir == null){ // não tem filhos
                return null; // o ponteiro que apontava pra esse elemento agora aponta pra nulo
            }

            if(raiz.esq == null || raiz.dir == null){ // se só tem um filho
                if(raiz.esq != null){
                    return raiz.esq;
                } else{
                    return raiz.dir;
                }
            }

            // se chegou aqui tem 2 filhos
            // troca a raiz que vai ser eliminada pela raiz mais a direita da raiz a esquerda dela
            Raiz raizSubstituta = raiz.esq; // guarda a raiz que vai substituir a raiz que será eliminada

            while(raizSubstituta.dir != null){
                raizSubstituta = raizSubstituta.dir;
            }

            raiz.elem = raizSubstituta.elem; // apaga o elemento pelo emento novo
            raiz.esq = removeRecursiva(raiz.esq, (T)raiz.elem);

            return raiz;

        } else if(cmp > 0){
            raiz.esq = removeRecursiva(raiz.esq, elem);
        } else {
            raiz.dir = removeRecursiva(raiz.dir, elem);
        }

        return raiz;
    }

    // EX 2 ------------------------------------------------------------------------------------------------------------
    public void constroiArvore(int[] vetor){ // O(n)
        if(vetor.length > 0){
            for(int i = 0; i < vetor.length; i++){ // [ 4, 1, 7, 3 ]
                this.raiz = constroiArvoreRecursivamente(vetor[i], raiz);
            }
        }
    }

    private Raiz constroiArvoreRecursivamente(int valor, Raiz raiz){ // O(n)
        if(raiz == null){
            return new Raiz(valor);
        } else{
            int comp = raiz.elem.compareTo(valor);

            if(comp > 0){
                raiz.esq = constroiArvoreRecursivamente(valor, raiz.esq);
            } else if(comp < 0){
                raiz.dir = constroiArvoreRecursivamente(valor, raiz.dir);
            } else{
                raiz.elem = valor;
            }

            return raiz;
        }
    }

    // EX 3 ------------------------------------------------------------------------------------------------------------
    public boolean eSimilar(ArvBinBusca<T> arvore){ // O(1)
        return eSimilarRecursiva(this.raiz, arvore.raiz, true);
    }
    private boolean eSimilarRecursiva(Raiz raiz1, Raiz raiz2, boolean isSimilar){ // O(h)
        if((raiz1 == null && raiz2 != null) || (raiz1 != null && raiz2 == null)){
            isSimilar = false;

        }

        if(raiz1 != null && raiz2 != null){
            isSimilar = eSimilarRecursiva(raiz1.esq, raiz2.esq, isSimilar);
            isSimilar = eSimilarRecursiva(raiz1.dir, raiz2.dir, isSimilar);
        }

        return isSimilar;
    }

    // EX 4 ------------------------------------------------------------------------------------------------------------
    public boolean removeForaIntervalo(T elemMin, T elemMax){ //O(h)
        if(elemMin.compareTo(elemMax) > 0){
            System.out.println("\nO valor minimo deve ser menor do que o valor máximo");
            return false;
        }

        if(!isElemNaArvore(elemMin) || !isElemNaArvore(elemMax)){ // O(h)
            System.out.println("\nInsira valores presentes na árvore");
            return false;
        }

        removeForaIntervaloRecursiva(elemMin, elemMax, this.raiz);

        return true;
    }

    private Raiz removeForaIntervaloRecursiva(T elemMin, T elemMax, Raiz raiz){// O(h^2)
        if(raiz == null){
            return raiz;
        }

        removeForaIntervaloRecursiva(elemMin, elemMax, raiz.esq);
        removeForaIntervaloRecursiva(elemMin, elemMax, raiz.dir);

        if(raiz.elem.compareTo(elemMin) > 0 && raiz.elem.compareTo(elemMax) < 0) { // elemMin < elem < elemMax
            System.out.println("\nentrou aqui -> " + (T) raiz.elem);
            this.raiz = removeRecursiva(this.raiz, (T) raiz.elem); //O(h)
            return null;
        }

        return raiz;
    }

    // EX 5 ------------------------------------------------------------------------------------------------------------
    public Raiz obtemAncestralComum(Raiz primeiraRaiz, Raiz segundaRaiz){ // O(h)
        Raiz menor_acestral = this.raiz;

        if(!isElemNaArvore((T)primeiraRaiz.elem) && !isElemNaArvore((T)segundaRaiz.elem)){
            System.out.println("\nInsira elementos presentes na arvore");
            return null;
        }

        if(primeiraRaiz.elem == this.raiz.elem || segundaRaiz.elem == this.raiz.elem ){
            System.out.println("\nNão possuem acestral comum");
            return null;
        }

        return obtemAncestralComumRecursiva(primeiraRaiz, segundaRaiz, this.raiz, menor_acestral);
    }

    private Raiz obtemAncestralComumRecursiva(Raiz primeiraRaiz, Raiz segundaRaiz, Raiz raiz, Raiz menor_acestral){ // O(h)
        if(raiz != null){
            if(raiz.elem == primeiraRaiz.elem || raiz.elem == segundaRaiz.elem ){
                return raiz;
            }

            Raiz esq = obtemAncestralComumRecursiva(primeiraRaiz, segundaRaiz, raiz.esq, menor_acestral);
            Raiz dir = obtemAncestralComumRecursiva(primeiraRaiz, segundaRaiz, raiz.esq, menor_acestral);

            if((esq.elem == primeiraRaiz.elem || esq.elem == segundaRaiz.elem) &&
                    (dir.elem == primeiraRaiz.elem || dir.elem == segundaRaiz.elem) ){
                if(raiz.elem.compareTo(menor_acestral.elem) < 0){
                    menor_acestral.elem = raiz.elem;
                }
            }
        }

        return menor_acestral;
    }

    // EX 6 ------------------------------------------------------------------------------------------------------------
    public boolean eBalanceada(){ // O(1)
        if(eBalanceadaRecursiva(this.raiz) == -2){
            return false;
        }

        return true;
    }
    private int eBalanceadaRecursiva(Raiz raiz){  // O(h)
        if(raiz == null){
            return - 1;
        } else{
            int esq = eBalanceadaRecursiva(raiz.esq);
            int dir = eBalanceadaRecursiva(raiz.dir);

            if(esq - dir > 1 || esq == -2 || dir != -2){
                return -2; // vou usar esse valor para dizer que não está balanceada
            }

            if(esq > dir){
                return esq + 1;
            } else{
                return  dir + 1;
            }
        }
    }

}
