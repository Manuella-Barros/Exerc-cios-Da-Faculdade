package TP2.Aula22.Bomberman;

public class AquaBomber extends Bomberman{
    public AquaBomber(int vida, int velocidade, String cor, double x, double y) {
        super(vida, velocidade, cor, x, y);
    }

    public String nadar()
    {
        return "Nadou para a posição " + this.ponto.x + ", " + this.ponto.y;
    }
}
