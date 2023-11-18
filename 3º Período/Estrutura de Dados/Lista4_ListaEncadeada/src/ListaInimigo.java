public class ListaInimigo {
    public Elo prim;
    private Elo<Inimigo> elo;
    int tamanho = 0;

    public ListaInimigo(){
        this.prim = null;
    }
    public boolean isVazia(){ // ve se a lista está vazia
        if(prim == null){ return true; }
        return false;
    }

    public void removeInimigo(Inimigo inimigo){
        if(prim.elem == inimigo){
            prim = prim.prox;
        }

        for(Elo i = prim; i != null; i = i.prox){
            if(i.prox.elem == inimigo){
                i.prox = i.prox.prox;
            }
        }
    }

    public void inserirInimigo(Inimigo inimigo){
        if(isVazia()){ // adicionando o primeiro elemento da lista
            // se estiver vazia o prox será null
            elo = new Elo<>(inimigo);
        } else{
            // se não estiver vazia o prox será prim
            elo = new Elo<>(inimigo, prim);
        }

        tamanho++;
        prim = elo;
    }

    public Inimigo localizarInimigo(Inimigo inimigo){
        for(Elo i = prim; i != null; i = i.prox){
            if(i.elem == inimigo){
                return inimigo;
            }
        }
        return null;
    }

    public int efetuarDanoInimigo(Inimigo inimigo, int dano){
        int vidaAtual = inimigo.getVida() - dano;

        if(vidaAtual >= 0){
            System.out.println("\nInimigo possui " + vidaAtual + " de vida");
            inimigo.setVida(vidaAtual);
            return vidaAtual;
        } else{
            System.out.println("\nInimigo Eliminado");
            removeInimigo(inimigo);
        }
        return 0;
    }

    public void imprimirInimigos(){
        if(!isVazia()){
            System.out.println("\nInimigos");

            for(Elo i = prim; i != null; i = i.prox){
                Inimigo inimigo = localizarInimigo((Inimigo)i.elem);
                System.out.println("\nNome: " + inimigo.getNome() +
                        "\nVida: " + inimigo.getVida());
            }
        } else{
            System.out.println("A lista está vazia");
        }
    }
}