#include <stdio.h>

int main(void){
    int vetor[10], contador = 0, soma = 0;

    for(int i = 0; i < 10; i++){
        contador++;
        printf("Insira o valor %i => ", contador);
        scanf("%i", &vetor[i]);

        soma = soma + vetor[i];
    }

    printf("A soma dos valores e => %i\n", soma);

}