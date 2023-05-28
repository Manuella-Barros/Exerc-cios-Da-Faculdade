package TP2.Aula22.Bomberman;
public class Bomberman {
    private int vida = 10;
    private int velocidade = 5;
    private String cor = "branco";
    protected Ponto ponto;

    public Bomberman(int vida, int velocidade, String cor, double x, double y)
    {
        setVida(vida);
        setVelocidade(velocidade);
        setCor(cor);
        ponto.setPonto(x, y);
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVida() {return vida;}

    public int getVelocidade() {return velocidade;}

    public String getCor() {return cor;}

    public String colocarBomba()
    {
        return "Colocando bomba na posição " + this.ponto.x +
                ", " + this.ponto.y;
    }
}