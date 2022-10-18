#include <stdio.h>
#include <locale.h>

int calculoIMC(float peso, float altura);

int main (void){
    setlocale(LC_ALL,"Portuguese");
    float peso, altura;

    printf("Escolha uma altura ");
    scanf("%f", &altura);

    printf("Escolha um peso ");
    scanf("%f", &peso);

    calculoIMC(peso, altura);
    printf("IMC = %d\n", calculoIMC(peso, altura));
}

int calculoIMC(float peso, float altura){
    return peso/(altura*altura);
}
