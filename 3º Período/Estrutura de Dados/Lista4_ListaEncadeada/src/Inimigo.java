public class Inimigo {
    private String nome;
    private int vida;
    private double danoPorSegundo;

    public Inimigo(int vida, String nome){
        setVida(vida);
        setNome(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }
    public String getNome() {
        return nome;
    }

    public void setDanoPorSegundo(double danoPorSegundo) {
        this.danoPorSegundo = danoPorSegundo;
    }

    public double getDanoPorSegundo() {
        return danoPorSegundo;
    }
}