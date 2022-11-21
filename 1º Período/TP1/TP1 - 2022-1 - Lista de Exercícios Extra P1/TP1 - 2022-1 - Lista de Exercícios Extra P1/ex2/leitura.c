#include <stdio.h>

calculoTempo(int *m, int d);
calculoVelocidade(int *m, int d, int v);

int main(void){
    int m, d, v;

    printf("Insira quantos minutos por/dia e dias/semana uma pessoa dedica a leitura = ");
    scanf("%i %i", &m, &d);
    calculoTempo(&m, d);

    printf("Quantas paginas uma pessoa le por minuto = ");
    scanf("%i", &v);
    calculoVelocidade(&m, d, v);
}

int calculoTempo(int *m, int d){
    int h;
    h = (*m / 60) * d * 52;
    *m = (*m % 60) * d * 52;
    printf("Essa pessoa gasta %ihrs %imin lendo por ano\n", h, *m);
}

calculoVelocidade(int *m, int d, int v){
    int paginasTotal;
    paginasTotal = v * *m;
    printf("O total de paginas lidas por ano e de = %i\n", paginasTotal);
}