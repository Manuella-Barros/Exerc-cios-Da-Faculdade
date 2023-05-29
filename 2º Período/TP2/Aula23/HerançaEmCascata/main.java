package TP2.Aula23.HerançaEmCascata;

public class main {
    public static void main(String [] args){
        Empregado em = new Empregado("Marcia", "Maça", 56, 2000);
        Aluno al = new Aluno("m", "B", 14, 2022221000);
        Graduado gr = new Graduado("m", "B", 14, 2006);
        Funcionarios func = new Funcionarios("C", "C", 66, 1200, 25);
        CorpoDocente cp = new CorpoDocente("C", "C", 66, 1200, "Psicologia");
        Administrador adm = new Administrador("Julia", "Banana", 45, 1500, "Pedagogia", 20);
        Professor prof = new Professor("Julia", "Banana", 45, 1500, "Biologia marinha", "Biologia");

        em.exibir_detalhes();
        al.exibir_detalhes();
        gr.exibir_detalhes();
        func.exibir_detalhes();
        cp.exibir_detalhes();
        adm.exibir_detalhes();
        prof.exibir_detalhes();
    }
}
