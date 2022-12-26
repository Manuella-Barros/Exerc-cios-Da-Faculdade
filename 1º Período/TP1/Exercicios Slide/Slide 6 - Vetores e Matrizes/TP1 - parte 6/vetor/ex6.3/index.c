// TENTANDO USAR CONSTANTES COMO TAMANHO
#include <stdio.h>
const int TAM = 10;

int main(void){
    int vetor[TAM];

    for(int i = 0; i < TAM; i++){// PARA PEGAR OS VALORES
        printf("Insira o valor %i => ", i + 1);
        scanf("%i", &vetor[i]);
    }

    printf("Os valores pares do vetor sao:\n");
    for(int i = 0; i < TAM; i++){// PARA PEGAR OS VALORES PARES

        if(vetor[i] % 2 == 0){
            printf("%i\n", vetor[i]);
        }
    }
    printf(" ");

    printf("Os valores impares do vetor sao:\n");
    for(int i = 0; i < TAM; i++){// PARA PEGAR OS VALORES IMPARES

        if(vetor[i] % 2 != 0){
            printf("%i\n", vetor[i]);
        }
    }
}