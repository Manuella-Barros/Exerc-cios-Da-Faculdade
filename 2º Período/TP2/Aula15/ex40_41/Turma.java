package TP2.Aula15.ex40_41;

import java.util.ArrayList;
import java.util.Collections;

public class Turma implements Comparable{
    int codigo;
    String descrição;
    ArrayList nomeAlunos = new ArrayList();
    ArrayList matriculaAlunos = new ArrayList();
    ArrayList nomeDuplicado = new ArrayList();
    ArrayList matriculaDuplicado = new ArrayList();

    public Turma(int codigo, String descrição) {
        this.codigo = codigo;
        this.descrição = descrição;
    }

    public void inserirAluno(String nome, int matricula){
        nomeAlunos.add(nome);
        matriculaAlunos.add(matricula);
        matriculaDuplicado.add(matricula);
    }

    public void exibirAlunos(){
        Collections.sort(matriculaDuplicado);
        for(int i = 0; i < matriculaDuplicado.size(); i++){
            for(int j = 0; j < matriculaAlunos.size(); j++){
                if(matriculaDuplicado.get(i) == matriculaAlunos.get(j)){
                    nomeDuplicado.add(nomeAlunos.get(j));
                }
            }
        }

        System.out.println("Alunos da turma\n" + codigo);


        for (int i = 0; i < nomeAlunos.size(); i++){
            System.out.printf("Nome do aluno: %s \nMatricula do aluno: %s \n\n", nomeDuplicado.get(i), matriculaDuplicado.get(i));
        }

        System.out.println("Mensagem especial dos professores para vocês: " + descrição);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
