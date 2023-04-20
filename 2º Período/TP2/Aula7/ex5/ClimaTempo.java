package TP2.Aula7.ex5;

public class ClimaTempo {
    public double[] Pluviosidade, Pressao;

    public boolean SetPluviosidade(double[] pl) {
        if(pl.length <= 7)
        {
            this.Pluviosidade = pl;
            return true;
        } else {
            return false;
        }
    }
    public boolean SetPressao(double[] pr) {
        if(pr.length <= 7)
        {
            this.Pressao = pr;
            return true;
        } else {
            return false;
        }
    }
    public double CalcularMediaPluvial(double[] chuva) {
        double media = 0;
        for(int i = 0; i < 7; i++)
        {
            media += chuva[i];
        }
        media = media / 7;
        return media;
    }
    public double CalcularMaximaPluvial(double[] chuva) {
        double max = 0;
        for (int i = 0; i < 7; i++)
        {
            if (chuva[i] > max)
            {
                max = chuva[i];
            }
        }
        return max;
    }
    public double CalcularPressaoMinima(double[] pressao) {
        double min = 1000;
        for (int i = 0; i < 7; i++)
        {
            if(pressao[i] < min)
            {
                min = pressao[i];
                System.out.printf("min = %f\n", min);
            }
        }
        return min;
    }
}
