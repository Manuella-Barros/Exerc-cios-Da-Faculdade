#include <stdio.h>

int main(void){
    int vetor[10], contador = 0;

    for(int i = 0; i < 10; i++){
        contador++;
        printf("insira o valor %i => ", contador);
        scanf("%i", &vetor[i]);
    }

    contador = 10;

    for(int i = 9; i >= 0; i--){ 
        printf("O valor %i e => %i\n", contador, vetor[i]);
        contador--;
    }
}