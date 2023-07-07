package TP2.SimuladoP2.ex4;

public class Disciplina implements Comparable{
    String nome;
    int creditos;

    public Disciplina(String nome, int creditos) {
        this.nome = nome;
        this.creditos = creditos;
    }

    @Override
    public int compareTo(Object o) {
        Disciplina d = (Disciplina) o;

        if (this.nome.compareTo(d.nome) == 1){
            return 1;
        } else if(this.nome.equals(d.nome)){
            return 0;
        } else {
            return 1;
        }
    }
}
