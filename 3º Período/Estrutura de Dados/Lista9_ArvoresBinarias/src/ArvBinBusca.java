public class ArvBinBusca<T extends Comparable<T>> extends Raiz<T> {
    private Raiz raiz;

    private int tamanho = -1;

    public ArvBinBusca(){
        raiz = null;
    }

    public boolean isVazia(){ return this.raiz == null; }

    public void imprimePreOrdem(){
        imprimePreOrdemRecurssiva(this.raiz);
    }

    private void imprimePreOrdemRecurssiva(Raiz raiz){
        System.out.printf("<");

        if(raiz != null){
            System.out.printf("%s", raiz.elem);
            imprimePreOrdemRecurssiva(raiz.esq);
            imprimePreOrdemRecurssiva(raiz.dir);
        }

        System.out.printf(">");
    }

    public boolean isElemNaArvore(T elem){
        return isElemNaArvoreRecurssiva(elem, this.raiz, false);
    }

    private boolean isElemNaArvoreRecurssiva(T elem, Raiz raiz, boolean isIn){
        if(raiz != null){
            if(raiz.elem == elem){
                return true;
            }

            if(raiz.esq != null){
                isIn = isElemNaArvoreRecurssiva(elem, raiz.esq, isIn);
            }

            if(raiz.dir != null){
                isIn = isElemNaArvoreRecurssiva(elem, raiz.dir, isIn);
            }
        }

        return  isIn;
    }

    public void remove(T elem){
        removeRecursiva(this.raiz, elem);
    }
    private Raiz removeRecursiva(Raiz raiz, T elem){
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
//    public Raiz achaMenorRaiz(){
//        return achaMenorRaizRecurssiva(this.raiz, this.raiz);
//    }
//    private Raiz achaMenorRaizRecurssiva(Raiz atualRaiz, Raiz menorRaiz){
//        if(atualRaiz != null){
//            if(atualRaiz.elem.compareTo(menorRaiz.elem) < 0){
//                menorRaiz = atualRaiz;
//            } else {
//                return achaMenorRaizRecurssiva(raiz.esq, menorRaiz);
//            }
//        }
//
//        return menorRaiz;
//    }
//
//    public Raiz achaMaiorRaiz(){
//        return achaMaiorRaizRecurssiva(this.raiz, this.raiz);
//    }
//    private Raiz achaMaiorRaizRecurssiva(Raiz atualRaiz, Raiz maiorRaiz){
//        if(atualRaiz != null){
//            if(atualRaiz.elem.compareTo(maiorRaiz.elem) > 0){
//                maiorRaiz = atualRaiz;
//            } else {
//                return achaMaiorRaizRecurssiva(raiz.dir, maiorRaiz);
//            }
//        }
//
//        return maiorRaiz;
//    }

    // EX 2 ------------------------------------------------------------------------------------------------------------
    public void constroiArvore(int[] vetor){
        if(vetor.length > 0){
            for(int i = 0; i < vetor.length; i++){ // [ 4, 1, 7, 3 ]
                this.raiz = constroiArvoreRecursivamente(vetor[i], raiz); // 4
            }
        }
    }

    private Raiz constroiArvoreRecursivamente(int valor, Raiz raiz){
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


    // EX 4 ------------------------------------------------------------------------------------------------------------
    public boolean removeForaIntervalo(T elemMin, T elemMax){
        if(elemMin.compareTo(elemMax) > 0){
            System.out.println("\nO valor minimo deve ser menor do que o valor máximo");
            return false;
        }

        if(!isElemNaArvore(elemMin) || !isElemNaArvore(elemMax)){
            System.out.println("\nInsira valores presentes na árvore");
            return false;
        }

        removeForaIntervaloRecurssiva(elemMin, elemMax, this.raiz);

        return true;
    }

    private Raiz removeForaIntervaloRecurssiva(T elemMin, T elemMax, Raiz raiz){
        if(raiz == null){
            return raiz;
        }

        removeForaIntervaloRecurssiva(elemMin, elemMax, raiz.esq);
        removeForaIntervaloRecurssiva(elemMin, elemMax, raiz.dir);

        if(raiz.elem.compareTo(elemMin) > 0 && raiz.elem.compareTo(elemMax) < 0) { // elemMin < elem < elemMax
            System.out.println("\nentrou aqui -> " + (T) raiz.elem);
            this.raiz = removeRecursiva(this.raiz, (T) raiz.elem);
            return null;
        }

        return raiz;
    }


//    private Raiz removeForaIntervaloRecurssiva(T elemMin, T elemMax, Raiz raiz){
//        if(raiz != null){
//            if(raiz.elem.compareTo(elemMin) > 0 && raiz.elem.compareTo(elemMax) < 0){ // elemMin < elem < elemMax
//                System.out.println("\nentrou aqui -> " + (T)raiz.elem);
//                raiz.esq = removeForaIntervaloRecurssiva(elemMin, elemMax, raiz.esq);
//                raiz.dir = removeForaIntervaloRecurssiva(elemMin, elemMax, raiz.dir);
//                this.raiz = removeRecursiva(this.raiz, (T)raiz.elem);
//                return null;
//
//            } else if(raiz.elem.compareTo(elemMax) > 0 || raiz.elem.compareTo(elemMax) == 0){
//                return removeForaIntervaloRecurssiva(elemMin, elemMax, raiz.esq);
//
//            } else if(raiz.elem.compareTo(elemMin) < 0 || raiz.elem.compareTo(elemMin) == 0){
//                return removeForaIntervaloRecurssiva(elemMin, elemMax, raiz.dir);
//            }
//        }
//
//        return raiz;
//    }



//    private Raiz removeForaIntervaloRecurssiva(T elemMin, T elemMax, Raiz raiz){
//        if(raiz != null){
//            if(raiz.elem.compareTo(elemMax) == 0 ){ // raiz == elemMax?
//                raiz.esq = removeForaIntervaloRecurssiva(elemMin, elemMax, raiz.esq);
//                raiz.dir = removeForaIntervaloRecurssiva(elemMin, elemMax, raiz.dir);
//
//            } else if(raiz.elem.compareTo(elemMin) == 0){ // raiz == elemMin?
//                raiz.dir = null;
//                return raiz;
//
//            } else{
//                if(raiz.esq != null){
//                    return removeForaIntervaloRecurssiva(elemMin, elemMax, raiz.esq);
//                }
//                if(raiz.dir != null){
//                    return removeForaIntervaloRecurssiva(elemMin, elemMax, raiz.dir);
//                }
//            }
//        }
//
//        return raiz;
//    }


    // EX 5 ------------------------------------------------------------------------------------------------------------
    public Raiz obtemAncestralComum(Raiz primeiraRaiz, Raiz segundaRaiz){
        Raiz menor_acestral = this.raiz;

        if(isElemNaArvore((T)primeiraRaiz.elem) && isElemNaArvore((T)segundaRaiz.elem)){
            return obtemAncestralComumRecurssiva(primeiraRaiz, segundaRaiz, this.raiz, menor_acestral);
        } else{
            return null;
        }
    }

    private Raiz obtemAncestralComumRecurssiva(Raiz primeiraRaiz, Raiz segundaRaiz, Raiz raiz, Raiz menor_acestral){
        if(raiz != null){
            if(raiz.elem == primeiraRaiz.elem || raiz.elem == segundaRaiz.elem ){
                return raiz;
            }

            Raiz esq = obtemAncestralComumRecurssiva(primeiraRaiz, segundaRaiz, raiz.esq, menor_acestral);
            Raiz dir = obtemAncestralComumRecurssiva(primeiraRaiz, segundaRaiz, raiz.esq, menor_acestral);

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
    public boolean eBalanceada(){
        if(eBalanceadaRecurssiva(this.raiz) == -2){
            return false;
        }

        return true;
    }
    private int eBalanceadaRecurssiva(Raiz raiz){
        if(raiz == null){
            return - 1;
        } else{
            int esq = eBalanceadaRecurssiva(raiz.esq);
            int dir = eBalanceadaRecurssiva(raiz.dir);

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

//    private int eBalanceadaRecurssiva(Raiz raiz){
//        if(raiz == null){
//            return 0;
//        } else{
//            int esq = eBalanceadaRecurssiva(raiz.esq);
//            int dir = eBalanceadaRecurssiva(raiz.dir);
//
//            if(esq > dir){
//                return esq + 1;
//            } else{
//                return  dir + 1;
//            }
//        }
//    }

}
