package TP2.Aula22.Bomberman;

public class FireBomber extends Bomberman
{
    public FireBomber(int vida, int velocidade, String cor, double x, double y) {
        super(vida, velocidade, cor, x, y);
    }

    public String explodir()
    {
        return "Explosão na posição " + this.ponto.x + ", " + this.ponto.y;
    }
}