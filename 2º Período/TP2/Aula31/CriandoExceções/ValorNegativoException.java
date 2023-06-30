package TP2.Aula31.CriandoExceções;

public class ValorNegativoException extends IllegalArgumentException{
    public ValorNegativoException(String s) {
        super(s);
    }
}
