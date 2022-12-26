// TENTANDO USAR CONSTANTES COMO TAMANHO
#include <stdio.h>

int main(void){
    int n, aux;  
    
    printf("Insira o tamanho do vetor => ");
    scanf("%i", &n);// PARA PEGAR O TAMANHO

    int v[n];

    for(int i = 0; i < n; i++){// PARA PEGAR OS VALORES
        printf("Insira o valor %i => ", i + 1);
        scanf("%i", &v[i]);
    }

    for(int i = 0; i < n/2; i++){ // AQUI INVERTE
        aux = v[i];
        v[i] = v[n - (1 + i)];
        v[n - (1 + i)] = aux;

    }

    for(int i = 0; i < n; i++){
        printf("O valor %i => %i\n", i + 1, v[i]);
    }  
}