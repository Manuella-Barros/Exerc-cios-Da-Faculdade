#include <stdio.h>

int main(void){
    int n;

    do{
        printf("Insira um valor para n => ");
        scanf("%i", &n);

        if(n < 0){
            printf("Insira um valor maior que zero\n");
        }
    } while(n <= 0);

    //PRINTA DO -N PRO 0
    for(int i = n * -1; i <= 0; i++){
        printf("%i, ", i);
    }
    //PRINTA DO 1 ATÉ O N
    for(int j = 1; j <= n; j++){
        if(j != n){
            printf("%i, ", j);
        } else{ // se j for igual a n, ñ printa com a virgula no final
            printf("%i", j);
        }
    }
}