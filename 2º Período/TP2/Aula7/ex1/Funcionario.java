package TP2.Aula7.ex1;

public class Funcionario {
    private String nome, sobrenome;
    private float salMen;

    public Funcionario(String nome, String sobrenome, float salMen){
        setNome(nome);
        setSobrenome(sobrenome);
        setSalMen(salMen);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setSalMen(float salMen){
        if (salMen >= 0 && salMen < 20000){
            this.salMen = salMen;
        }else {
            System.out.println("Salario invalido");
        }
    }

    public String getNome(String nome){
        return nome;
    }
    public String getSobrenome(String sobrenome){
        return sobrenome;
    }
    public float getSalMen(float salMen){
        return salMen;
    }

    public void imprime(){
        System.out.printf("%s %s \nSalario anterior = %.2f \nSalario com aumento = %.2f\n", nome, sobrenome, salMen, salMen+=0.2*salMen);
    }
}
