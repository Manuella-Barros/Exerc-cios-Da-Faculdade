package TP2.Aula15.ex40_41;
//Exercício 41: altere o exercício dos alunos e turmas e imprima a lista de alunos ordenados por matrícula.
import java.util.*;

public class main {
    public static void main(String[] args) {
        Turma t1 = new Turma(111, "Melhor turma");
        Turma t2 = new Turma(222, "Turma do ano");

        t1.inserirAluno("Maria", 4);
        t1.inserirAluno("Joana", 7);
        t1.inserirAluno("Julia", 1);
        t2.inserirAluno("Mario", 4);
        t2.inserirAluno("Joao", 7);
        t2.inserirAluno("julio", 1);

        t1.exibirAlunos();
        t2.exibirAlunos();
    }
}