import java.util.Vector;

public class PilhaGenerica<T> {
    public int n;
    public Vector<T> vetor;
    public int topo = -1;
    public int tamanhoMaximoOcupado = 0, tamanhoAtual = 0;

    public PilhaGenerica(){
        n = 13;
        vetor = new Vector<>(n);
    }

    public PilhaGenerica(int tamanho){
        n = tamanho;
        vetor = new Vector<>(n);
    }

    public boolean isVazia(){
        if(topo == -1){
            return true;
        } else{
            return  false;
        }
    }

    public boolean isCheia(){
        if(topo == n - 1){
            return true;
        } else{
            return false;
        }
    }

    public void push(T letra){
        if(isCheia()) { // se estiver cheia
            System.out.println("Está cheia");

        } else { //se não estiver cheia, e não for c, insere
            this.vetor.add(++topo, letra);
            tamanhoMaximoOcupado++;
            tamanhoAtual++;
        }
    }

    public T pop(){
        if(!isVazia()){
            T valorTopo = vetor.get(topo--);
            tamanhoAtual--;
            return valorTopo;

        } else{
            System.out.println("Pilha vazia!");
            return null;
        }
    }

    public void esvaziaPilha(){
        topo = -1;
    }
}
