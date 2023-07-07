package TP2.SimuladoP2.ex4;

public class Professor extends Pessoa{
    int cargaHoraria;

    public Professor(String nome, String curso, int cargaHoraria) {
        super(nome, curso);
        this.cargaHoraria = cargaHoraria;
    }
}
