#include <stdio.h>
const int TAM = 20;

int main(){
    int valores[TAM], menor, posicao;

    for(int i = 0; i < TAM; i++){ //esse for pega o input
        printf("insira o valor %i => ", i + 1);
        scanf("%i", &valores[i]);
    }

    for(int i = 0; i < TAM; i++){ //esse for imprime o vetor
        if(valores[i] < valores[i + 1]){
            menor = valores[i];
            posicao = i;
        }
    }

    printf("O menor numero e => %i\n esta na posicao %i\n", menor, posicao);
}