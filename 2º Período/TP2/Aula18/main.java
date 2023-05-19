package TP2.Aula18;


import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        new Scanner(System.in);
        Turma A = new Turma("Turma A");
        Aluno a1 = new Aluno("Jõao", 15);
        Aluno a2 = new Aluno("Maria", 16);
        A.adicionar_aluno(a1);
        A.adicionar_aluno(a2);
        A.exibir_alunos();
    }
}

