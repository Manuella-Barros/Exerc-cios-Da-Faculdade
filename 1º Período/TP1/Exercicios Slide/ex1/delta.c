#include <stdio.h>
#include <locale.h>

int calculoDelta(int a, int b, int c);

int main(void){
    setlocale(LC_ALL,"Portuguese");
    int a, b, c;

    printf("Escolha valores para a, b e c, respectivamente: ");
    scanf("%i %i %i", &a, &b, &c);

    calculoDelta(a, b, c);
}

int calculoDelta(int a, int b, int c){
    int delta, x1, x2;

    delta = (b*b) - (4 * a *c);

    if (delta < 0){
        printf("Nao ha solucao real");

    } else{
        x1 = (-b + sqrt(delta)) / (2 * a);
        x2 = (-b - sqrt(delta)) / (2 * a);

        printf("X1 = %i, X2 = %i \n", x1, x2);
    }

}