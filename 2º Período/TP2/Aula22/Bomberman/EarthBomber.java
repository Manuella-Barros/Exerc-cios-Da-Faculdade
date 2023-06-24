package TP2.Aula22.Bomberman;

public class EarthBomber extends Bomberman{
    public EarthBomber(int vida, int velocidade, String cor, double x, double y) {
        super(vida, velocidade, cor, x, y);
    }

    public String rolar()
    {
        return "Rolou para a posição " + this.ponto.x + ", " + this.ponto.y;
    }
}
