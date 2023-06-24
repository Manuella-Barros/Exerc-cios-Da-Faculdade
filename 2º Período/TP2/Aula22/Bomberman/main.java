package TP2.Aula22.Bomberman;

public class main {
    public static void main(String[] args) {
        //BOMBERMAN
        Bomberman whiteBomber = new Bomberman(10, 5, "branco", 0, 0);
        Bomberman blackBomber = new Bomberman(10, 5, "preto", 10, 5);
        Bomberman blueBomber = new Bomberman(10, 5, "azul", 2, 3);

        System.out.println(whiteBomber.colocarBomba());
        System.out.println(blackBomber.colocarBomba());
        System.out.println(blueBomber.colocarBomba());

        //FIREBOMBER
        FireBomber fireBomber = new FireBomber(20, 6, "vermelho", 10, 10);
        fireBomber.colocarBomba();
        System.out.println(fireBomber.explodir());

        //AQUABOMBER
        AquaBomber aquaBomber = new AquaBomber(10, 2, "roxo", 1, 2);
        System.out.println(aquaBomber.nadar());

        //CYCLONEBOMBER
        CycloneBomber cycloneBomber = new CycloneBomber(20, 4, "vermelho", 2, 4);
        System.out.println(cycloneBomber.voar());

        //EARTHBOMBER
        EarthBomber earthBomber = new EarthBomber(40, 8, "Azul", 4, 16);
        System.out.println(earthBomber.rolar());
    }
}
