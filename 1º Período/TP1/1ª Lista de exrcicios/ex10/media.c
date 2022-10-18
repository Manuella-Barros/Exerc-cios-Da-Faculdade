#include <stdio.h>
#include <locale.h>

float media(float nota1, float nota2, float nota3, int peso1, int peso2, int peso3);

int main(void){
    setlocale(LC_ALL,"Portuguese");
    float nota1, nota2, nota3;
    int peso1, peso2, peso3;

    printf("Qual as 3 notas dos 3 alunos? ");
    scanf("%f %f %f", &nota1, &nota2, &nota3);
    printf("Escreva o peso de cada nota respectivamente ");
    scanf("%d %d %d", &peso1, &peso2, &peso3);

    media(nota1, nota2, nota3, peso1, peso2, peso3);
    printf("A média dessas notas será igual a %.1f\n", media(nota1, nota2, nota3, peso1, peso2, peso3));
}

float media(float nota1, float nota2, float nota3, int peso1, int peso2, int peso3){
    return ((nota1 * peso1)  + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
}