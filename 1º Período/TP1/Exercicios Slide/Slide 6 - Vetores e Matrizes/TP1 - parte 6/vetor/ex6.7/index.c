// TENTANDO USAR CONSTANTES COMO TAMANHO
#include <stdio.h>

int main(void){
    int tam, k, verifica = 0;  
    
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
            verifica = 1; //se o valor estiver na array essa variavel muda de valor
        }
    }  

    if(verifica == 0){//se o valor não estiver na array essa variavel não muda de valor e entra aqui
        printf("O valor %i nao esta no vetor\n", k);
    }
}