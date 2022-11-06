#include <stdio.h>
#include <locale.h>

int volume(int raio, int altura);

int main(void){
    setlocale(LC_ALL,"Portuguese");
    int raio, altura;

    printf("Escolha o raio e a altura de um cilindro que será enchido de água para um espetáculo de mágica ");
    scanf("%d %d", &raio, &altura);

    printf("O volume do cilindo será de %d\n", volume(raio, altura));
}

int volume(int raio, int altura){
    return 3.14 * (raio * raio) * altura;
}