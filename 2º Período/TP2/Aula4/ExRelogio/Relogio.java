package TP2.Aula4.ExRelogio;

public class Relogio {
    public int horas;
    public int min;
    public int seg;
    public int totalSeg;

    public void mostraRelogio(){
        System.out.printf("%d:%d:%d\n", horas, min, seg);
    }

    public int totalizarSegundos(){
        totalSeg = seg;
        totalSeg += horas * 3600;
        totalSeg += min * 60;
        System.out.printf("Total de segundos é de %d", totalSeg);
        return 0;
    }
}
