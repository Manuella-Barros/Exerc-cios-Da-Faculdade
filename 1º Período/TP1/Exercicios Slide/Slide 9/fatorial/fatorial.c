#include <stdio.h>

int calculoFatorial(int n);

int main(void){
    int n, fatorial;

    printf("Insira um numero para ver o fatorial dele => ");
    scanf("%i", &n);

    fatorial = calculoFatorial(n);

    printf("fatorial = %i\n", fatorial);

}

int calculoFatorial(int n){
    int fat;

    if(n <= 1){
        return 1;

    } else{
        fat = n * calculoFatorial(n-1);
        return fat;

    }
}