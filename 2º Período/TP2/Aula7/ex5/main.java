package TP2.Aula7.ex5;

public class main {
    public static void main(String[] args)
    {
        // vetores criados simplesmente para testar a classe
        double[] chuva = { 5.34, 2.34, 0.0, 0.0, 3.23, 0.0, 2.42 };
        double[] pressao = { 99.3, 95.34, 101.3, 98.42, 103.4, 100.0, 102.87 };
        ClimaTempo ct = new ClimaTempo();
        ct.SetPluviosidade(chuva);
        ct.SetPressao(pressao);

        // deve resultar 5.35
        System.out.printf("Máxima pluvial: %.2f\n", ct.CalcularMaximaPluvial(chuva));
        // deve resultar ~ 1.904
        System.out.printf("Média pluvial: %.3f\n", ct.CalcularMediaPluvial(chuva));
        // deve resultar 95.34
        System.out.printf("Pressão mínima: %.2f\n" + ct.CalcularPressaoMinima(pressao));
    }

}
