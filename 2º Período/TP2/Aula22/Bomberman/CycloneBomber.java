package TP2.Aula22.Bomberman;

public class CycloneBomber extends Bomberman{
    public CycloneBomber(int vida, int velocidade, String cor, double x, double y) {
        super(vida, velocidade, cor, x, y);
    }

    public String voar()
    {
        return "Voou para a posição " + this.ponto.x + ", " + this.ponto.y;
    }
}
