package TP2.SimuladoP2.ex4;

import java.util.HashMap;

public class Aluno extends Pessoa{
    int anoEntrada;
    HashMap notas = new HashMap();

    public Aluno(String nome, String curso, int anoEntrada) {
        super(nome, curso);
        this.anoEntrada = anoEntrada;
    }

    public void addNotas(String disciplina, int nota){
        notas.put(disciplina, nota);
    }
}
