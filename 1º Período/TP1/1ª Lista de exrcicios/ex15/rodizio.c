#include <stdio.h>
#include <locale.h>

int rodizio(int a, int b, int c);

int main(void){
    setlocale(LC_ALL,"Portuguese");
    int a, b, c;

    printf("Escolha 3 varoles para as variáveis inteiras a, b e c, respectivamente: ");

    scanf("%i %i %i", &a, &b, &c);
    rodizio(a, b, c);
}

int rodizio(int a, int b, int c){
    int x, y;
    x = b;
    y = c;
    b = a;
    c = x;
    a = y;
    printf("b = %i \nc = %i \na = %i", b,c,a);

}