package TP2.Aula18;

import java.util.ArrayList;

public class Turma {
    public String nome;
    public ArrayList alunos = new ArrayList();

    public Turma(String nome) {
        this.nome = nome;
    }

    public void adicionar_aluno(Aluno a) {
        this.alunos.add(a);
    }

    public void exibir_alunos() {
        for(int i = 0; i < this.alunos.size(); ++i) {
            Aluno a = (Aluno)this.alunos.get(i);
            a.exibir_informacoes();
        }

    }
}

