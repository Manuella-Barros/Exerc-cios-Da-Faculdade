package TP2.SimuladoP2.ex4;

import java.util.ArrayList;
import java.util.Collections;

public class Curso implements Comparable {
    String nome;
    ArrayList disciplinas = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public void addDisciplina(String disciplina){
        disciplinas.add(disciplina);
    }

    @Override
    public int compareTo(Object o) {
        Disciplina d = (Disciplina) o;
        //System.out.println(this.nome.compareTo(d.nome));
        if (this.nome.compareTo(d.nome) == 1){
            return 1;
        } else if(this.nome.equals(d.nome)){
            return 0;
        } else {
            return 1;
        }
    }

    public void imprime(){
        Collections.sort(disciplinas);

        for (int i = 0; i < disciplinas.size(); i++) {
            System.out.println(disciplinas.get(i));
        }
    }
}
