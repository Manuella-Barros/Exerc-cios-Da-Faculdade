// TENTANDO USAR CONSTANTES COMO TAMANHO
#include <stdio.h>

int main(void){
    int tam, k;  
    
    printf("Insira o tamanho do vetor => ");
    scanf("%i", &tam);// PARA PEGAR O TAMANHO

    int v[tam];

    for(int i = 0; i < tam; i++){// PARA PEGAR OS VALORES
        printf("Insira o valor %i => ", i + 1);
        scanf("%i", &v[i]);
    }

    printf("insira um numero => ");
    scanf("%i", &k);

    for(int i = 0; i < tam; i++){
        if(v[i] == k){
            printf("O valor %i esta na posicao %i\n", k, i);
        }
    }  
}