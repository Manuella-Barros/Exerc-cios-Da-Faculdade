#include <stdio.h>
#include <locale.h>

int calculoPa(int a1, int n, int r);

int main(void){
    setlocale(LC_ALL,"Portuguese");
    int a1, n, r;

    printf("Digite qual o valor do primeiro termo, a quantidade de termos e a raz�o deles, respectivamente ");
    scanf("%d %d %d", &a1, &n, &r);
    printf("O %d� termo da pa ser� igual a %d\n", n, calculoPa(a1, n, r));
}

int calculoPa(int a1, int n, int r){
    return a1 + (n - 1) * r;

}