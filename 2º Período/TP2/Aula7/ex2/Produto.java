package TP2.Aula7.ex2;

public class Produto {
    private int id, qntd;
    private String nome;
    private float preco;

    public Produto(int id, int qntd, String nome, float preco){
        setId(id);
        setQntd(qntd);
        setNome(nome);
        setPreco(preco);
    }

    public boolean setId(int id){
        if(id >= 1 && id <= 9999){
            this.id = id;
            return true;
        } else{
            return false;
        }
    }

    public boolean setQntd(int qntd){
        if(qntd >= 0){
            this.qntd = qntd;
            return true;
        } else{
            return false;
        }
    }

    public boolean setNome(String nome){
        if(nome != " "){
            this.nome = nome;
            return true;
        } else{
            return false;
        }
    }

    public boolean setPreco(float preco){
        if(preco >= 0){
            this.preco = preco;
            return true;
        } else{
            return false;
        }
    }

    public int getId(int id){
        return id;
    }
    public int getQntd(int qntd){
        return qntd;
    }
    public String getNome(String nome){
        return nome;
    }
    public float getPreco(float preco){
        return preco;
    }

    public void imprime(){
        System.out.printf("\nInformações desse produto: \nNome: %s \nId: %d \nPreço: %.2f \nQuantidade: %d\n", nome, id, preco, qntd);
    }
}

