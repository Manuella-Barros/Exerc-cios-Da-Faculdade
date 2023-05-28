package TP2.Aula22.Bomberman;

public class main {
    public static void main(String[] args) {
        Bomberman whiteBomber = new Bomberman(10, 5, "branco", 0, 0);
        Bomberman blackBomber = new Bomberman(10, 5, "preto", 10, 5);
        Bomberman blueBomber = new Bomberman(10, 5, "azul", 2, 3);

        System.out.println(whiteBomber.colocarBomba());
        System.out.println(blackBomber.colocarBomba());
        System.out.println(blueBomber.colocarBomba());

        FireBomber fireBomber = new FireBomber(20, 6, "vermelho", 10, 10);
        fireBomber.colocarBomba();
        fireBomber.explodir();

    }
}
