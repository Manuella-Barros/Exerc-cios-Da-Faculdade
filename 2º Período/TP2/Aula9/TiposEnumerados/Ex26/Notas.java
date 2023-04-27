package TP2.Aula9.TiposEnumerados.Ex26;

public enum Notas {
    PESSIMO(0.0, 2.9, "Péssimo"),
    RUIM(3.0, 4.9, "Ruim"),
    REGULAR(5.0, 6.9, "Regular"),
    BOM(7.0, 8.9, "Bom"),
    MUITO_BOM(9.0, 10.0, "Muito Bom");

    public double min, max;
    public String conceito;

    private Notas(double min, double max, String conceito) {
        setMin(min);
        setMax(max);
        setConceito(conceito);
    }

    public void setMin(double min) {
        this.min = min;
    }
    public void setMax(double max) {
        this.max = max;
    }
    public void setConceito(String conceito) {
        this.conceito = conceito;
    }
}
