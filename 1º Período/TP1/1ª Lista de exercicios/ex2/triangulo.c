#include <stdio.h>
#include <locale.h>

int calculoArea(int base, int altura);

int main (void){
    setlocale(LC_ALL,"Portuguese");

    int base, altura;
    printf("Qual a base do tri�ngulo? ");
    scanf("%d", &base);

    printf("Qual a altura do tri�ngulo? ");

    scanf("%d", &altura);

    calculoArea(base, altura);

    printf("O valor da �rea do tri�ngulo � = %d\n", calculoArea(base, altura));
}

int calculoArea(int base, int altura){
    return base*altura/2;
}