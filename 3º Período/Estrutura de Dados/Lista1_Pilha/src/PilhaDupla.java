public class PilhaDupla {
    public int n;
    public char[] vetor;
    public int topo1, topo2;
    public int tamanhoMaximoOcupado = 0, tamanhoAtual = 0;

    public PilhaDupla(){ // se não inserir um tamanho, o vetor terá tamanho = 13
        n = 13;
        vetor = new char[n];

        topo1 = -1;
        topo2 = n;
    }
    public PilhaDupla(int tamanho){ // se não inserir um tamanho, o vetor terá tamanho = 13
        n = tamanho;
        vetor = new char[n];

        topo1 = -1;
        topo2 = n;
    }
    public boolean isVazia(){
        if(isVaziaPilha1() && isVaziaPilha2()){
            return true;
        } else{
            return  false;
        }
    }

    public boolean isVaziaPilha1(){
        if(topo1 == -1){
            return true;
        } else{
            return  false;
        }
    }

    public boolean isVaziaPilha2(){
        if(topo2 == n){
            return true;
        } else{
            return  false;
        }
    }

    public boolean isCheia(){
        if(topo1 == topo2 - 1){
            return true;
        } else{
            return false;
        }
    }

    public void pushPilha1(char letra){
        if(isCheia()){
            System.out.println("Está cheia");
        } else{
            this.vetor[++topo1] = letra;
        }
    }
    public void pushPilha2(char letra){
        if(isCheia()){
            System.out.println("Está cheia");
        } else{
            this.vetor[--topo2] = letra;
        }
    }

    public char popPilha1(){
        char valorTopo = 0;

        if(isVaziaPilha1()){
            System.out.println("Pilha 1 está vazia!");
        } else{
            valorTopo = vetor[topo1--];
        }

        return valorTopo;
    }
    public char popPilha2(){
        char valorTopo = 0;

        if(isVaziaPilha2()){
            System.out.println("Pilha 2 está vazia!");
        } else{
            valorTopo = vetor[topo2++];
        }

        return valorTopo;
    }
}
