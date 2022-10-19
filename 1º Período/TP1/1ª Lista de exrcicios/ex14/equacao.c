#include <stdio.h>
#include <locale.h>

int equacao(int a, int b);

int main(void){
    setlocale(LC_ALL,"Portuguese");
    int a, b;

    printf("Insira um valor para a e um para b, respectivamente: ");

    scanf("%i %i", &a, &b);
    equacao(a, b);
}

int equacao(int a, int b){
    int x = -b / a;
    printf("%i\n", x);
}