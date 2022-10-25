#include <stdio.h>
#include <string.h>
#include <locale.h>

int calculoAceleracao(int tempo);

int main (){
    setlocale(LC_ALL,"Portuguese");

    int tempo;
    printf("Quanto tempo o carro demorou para percorrer a pista de 1 km? ");
    scanf("%i", &tempo);

    calculoAceleracao(tempo);
}

int calculoAceleracao(int tempo){
    int aceleracao = 1000 / tempo; //1km = 1000m
    printf("A aceleração será de %.2i m/s", aceleracao);
}