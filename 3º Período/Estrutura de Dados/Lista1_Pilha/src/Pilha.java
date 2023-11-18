public class Pilha {
    public int n;
    public char[] vetor;
    public int topo = -1;
    public int tamanhoMaximoOcupado = 0, tamanhoAtual = 0;

    public Pilha(){ // se não inserir um tamanho, o vetor terá tamanho = 13
        n = 13;
        vetor = new char[n];
    }

    public Pilha(int tamanho){ // se inserir um tamanho, o vetor terá esse tamanho
        n = tamanho;
        vetor = new char[n];
    }

    public boolean isVazia(){
        if(topo == -1){ // se o valor que foi inicializado não mudar, a pilha ainda ta zerada
            return true;
        } else{
            return  false;
        }
    }

    public boolean isCheia(){
        if(topo == n - 1){ // n-1 é o index da ultima posição
            return true;
        } else{
            return false;
        }
    }

    public void push(char letra){
        if(isCheia()) { // se estiver cheia
            System.out.println("Está cheia");

        } else { //se não estiver cheia, e não for c, insere
            this.vetor[++topo] = letra;
            tamanhoMaximoOcupado++;
            tamanhoAtual++;
        }
    }

    public char pop(){
        char valorTopo = 0;

        if(!isVazia()){
            valorTopo = vetor[topo--];
            tamanhoAtual--;
        } else{
            System.out.println("Pilha vazia!");
        }

        return valorTopo;
    }

    public void esvaziaPilha(){
        topo = -1;
    }
}
