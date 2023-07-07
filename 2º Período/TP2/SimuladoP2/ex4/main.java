package TP2.SimuladoP2.ex4;

import java.util.Collections;

public class main {
    public static void main(String[]args){
        //Disciplina d1 = new Disciplina("TP2", 5);
        Curso cu = new Curso("BSI");

        cu.addDisciplina("TP2");
        cu.addDisciplina("Calculo");
        cu.addDisciplina("Algebra");

        cu.imprime();
    }
}
