#include <stdio.h>
#include <locale.h>

int calculoArea(int base, int altura);

int main (void){
    setlocale(LC_ALL,"Portuguese");

    int base, altura;
    printf("Qual a base do triângulo? ");
    scanf("%d", &base);

    printf("Qual a altura do triângulo? ");

    scanf("%d", &altura);

    calculoArea(base, altura);

    printf("O valor da área do triângulo é = %d\n", calculoArea(base, altura));
}

int calculoArea(int base, int altura){
    return base*altura/2;
}