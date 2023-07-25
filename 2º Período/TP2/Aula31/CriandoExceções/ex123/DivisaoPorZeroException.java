package TP2.Aula31.CriandoExceções;

public class DivisaoPorZeroException extends IllegalArgumentException{
    public DivisaoPorZeroException(String s) {
        super(s);
    }
}
