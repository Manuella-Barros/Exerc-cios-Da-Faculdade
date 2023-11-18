public class ListaEncadeadaDupla<T> extends Elo<T> {
    protected Elo<T> prim;
    public int tamanho = 0;

    public ListaEncadeadaDupla(){ // inicializa a pilha vazia
        prim = null;
    }

    public boolean isVazia(){ return prim == null; } // retorna true se estiver vazia

    public void insere(T elem){
        Elo elo = new Elo(elem); // cria o elo e passa o valor

        // se estiver vazia n precisa add prox e ant, pq ja declaram como null
        // se não estiver vazia,
        if(!isVazia()){
            elo.prox = prim; // o prox será o prim anterior
            prim.ant = elo;
        }

        tamanho++;
        prim = elo;
    }

    // EXERCICIO 6
    public static void insereIntOrdenadamente(int elem, ListaEncadeadaDupla lista){
        // insere no inicio se estiver vazia ou se o elemento for menor que o primeiro
        if(lista.isVazia() || elem < (int)lista.prim.elem){
            lista.insere(elem);
        } else {
            Elo p = lista.prim, elo;

            while (p != null){
                if(p.prox == null){ // inserindo na ultima posição
                    elo = new Elo(elem);
                    elo.ant = p;
                    p.prox = elo;
                    break;
                } else if(elem < (int)p.elem){
                    elo = new Elo(elem);
                    elo.ant = p.ant;// apontando quem vem antes do novo elo
                    elo.prox = p; // apontando quem vem depois do novo elo

                    p.ant.prox = elo; // dizendo q o elo anterior apontará para o novo elo que vem depois dele
                    p.ant = elo; // dizendo q o elo atual apontará para o novo elo que vem antes dele
                    break;
                }

                p = p.prox;
            }
        }
    }

    public void imprime(){
        if(!isVazia()){
            for(Elo p = prim; p != null; p = p.prox){
                System.out.println(p.elem);
            }
        } else{
            System.out.println("A lista está vazia");
        }
    }

    // EXERCICIO 4
    public void trocaElos(int indiceElo1, int indiceElo2){
        Elo aux = new Elo(), elo1 = prim, elo2 = prim;

        if(indiceElo1 < tamanho && indiceElo2 < tamanho){ // verificando se tem esses indices
            for(int i = 0; i < indiceElo1; i++){
                elo1 = elo1.prox;
            }

            for(int i = 0; i < indiceElo2; i++){
                elo2 = elo2.prox;
            }

            aux.ant = elo1.ant; // guarda as infos do elo1
            aux.prox = elo1.prox; // guarda as infos do elo1

            // ALTERANDO ELO 1
            if(elo1.prox == elo2){ // se o elo2 logo após o elo1
                System.out.println("aaaaa");
                elo1.ant = elo2;
                elo1.prox = elo2.prox; // poe as infos do elo2 no elo1

                elo2.ant = aux.ant;  // poe as infos do elo1, guardadas no aux, no elo2
                elo2.prox = elo1;

            } else if(elo2.prox == elo1){ // se o elo1 logo após o elo2
                elo1.ant = elo2.ant;  // poe as infos do elo1, guardadas no aux, no elo2
                elo1.prox = elo2;

                elo2.ant = elo1;
                elo2.prox = aux.prox; // poe as infos do elo2 no elo1

            } else{
                System.out.println("ccccc");
                elo1.ant = elo2.ant; // poe as infos do elo2 no elo1
                elo1.prox = elo2.prox; // poe as infos do elo2 no elo1

                elo2.ant = aux.ant;  // poe as infos do elo1, guardadas no aux, no elo2
                elo2.prox = aux.prox; // poe as infos do elo1, guardadas no aux, no elo2

            }

            if(elo1.ant != null) {
                elo1.ant.prox = elo1; // dizendo q o elo que tava antes do elo1 velho agr ta antes do elo1 novo
            } else{ // então é o primeiro elemento
                prim = elo1;
            }
            if(elo1.prox != null){
                elo1.prox.ant = elo1; // dizendo q o elo que tava depois do elo1 velho agr ta depois do elo1 novo
            }

            if(elo2.ant != null) {
                elo2.ant.prox = elo2; // dizendo q o elo que tava antes do elo1 velho agr ta antes do elo1 novo
            } else{ // então é o primeiro elemento
                prim = elo2;
            }
            if(elo2.prox != null){
                elo2.prox.ant = elo2; // dizendo q o elo que tava depois do elo1 velho agr ta depois do elo1 novo
            }

        } else{
            System.out.println("Não tem esses indices");
        }
    }

    // EXERCICIO 5
    public boolean verificaIgualdade(ListaEncadeadaDupla lista2){
        if(verificaIgualdadeRecursiva(prim, lista2.prim)){ // envia o primeiro elemento das duas listas
            return true;
        } else{
            return false;
        }
    }

    // EXERCICIO 5
    public boolean verificaIgualdadeRecursiva(Elo eloL1, Elo eloL2){
        if(eloL1 != null && eloL2 != null){ // verifica se chegou no final da lista
            System.out.println(eloL1.elem);
            System.out.println(eloL2.elem);
            if(eloL1.elem != eloL2.elem){ // se o elemento for diferente, retorna falso e termina
                System.out.println("entrou aqui");
                return false; // algum elemento da lista é diferente, termina
            } else{
                return verificaIgualdadeRecursiva(eloL1.prox, eloL2.prox);
            }
        }

        return true; // lista igual pois não terminou
    }


}