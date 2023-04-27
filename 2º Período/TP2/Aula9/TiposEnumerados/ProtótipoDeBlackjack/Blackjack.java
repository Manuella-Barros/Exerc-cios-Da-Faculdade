package TP2.Aula9.TiposEnumerados.ProtótipoDeBlackjack;

public class Blackjack {
    private int jog1, jog2;

    public Blackjack(int jog1, int jog2){
        setJog1(jog1);
        setJog2(jog2);
    }

    // SETTERS
    public void setJog1(int jog1) {this.jog1 = jog1;}
    public void setJog2(int jog2) {
        if(jog2 != jog1){ // se os valores forem diferentes só atribui
            this.jog2 = jog2;
        } else{ // se os valores forem iguais, gera novos valores para jog2 até serem diferentes
            do{
                this.jog2 = (int)Math.floor(Math.random() * (12 - 0) + 0);
            }while(jog2 == jog1);
        }
    }

    // METODOS
    public void imprime(){
        System.out.printf("A carta do Jogador 1 = %s \nA carta do Jogador 2 = %s \n", Cartas.values()[jog1],Cartas.values()[jog2]);

        if(jog1 < jog2){ // Menor posição = maior valor
            System.out.println("Vitória do jogador 1");
        } else{
            System.out.println("Vitória do jogador 2");
        }
    }

    // GETTERS
    public int getJog1() {return jog1;}
    public int getJog2() {return jog2;}
}
