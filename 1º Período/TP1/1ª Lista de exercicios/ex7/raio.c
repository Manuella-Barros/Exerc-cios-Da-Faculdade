#include <stdio.h>
#include <locale.h>

float calculoVolume(float raio);

int main (void){
    setlocale(LC_ALL,"Portuguese");
    float raio;

    printf("Qual o raio da esfera? ");
    scanf("%f", &raio);

    printf("%f", raio);

    printf("O volume da esfera é de %f\n", calculoVolume(raio));
}

float calculoVolume(float raio){
    return (4 * 3.14 * (raio*raio*raio))/3;
}