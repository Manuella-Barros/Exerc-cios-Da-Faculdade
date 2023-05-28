package TP2.Aula22.ex1_slide;

public class main {
    public static void main(String[] args) {
        CD objCd = new CD("JC e aleluias", "Hino incrivelmente maravilhoso", 000, 10000, 0.5);
        Livro objLivro = new Livro("JC", "Escritoras do jovem", 000, 20000, 1.5);
        Software objSoftware = new Software("Celular", "Util", 001, 50000, 0.7);

        objCd.calculaFrete();
        objLivro.calculaFrete();
        objSoftware.calculaFrete();
    }
}
