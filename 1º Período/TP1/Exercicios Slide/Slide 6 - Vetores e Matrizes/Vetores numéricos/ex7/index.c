#include <stdio.h>
const int TAM = 20;

int main(){
    int valores[TAM], menor = 0, posicao;

    for(int i = 0; i < TAM; i++){ //esse for pega o input
        printf("insira o valor %i => ", i + 1);
        scanf("%i", &valores[i]);
    }

    for(int i = 0; i < TAM; i++){ //esse for imprime o vetor
        if(i != TAM - 1){ //essa logica para no penultimo
            if(valores[i] < valores[i+1]){ //o valor da casinha i é menor do q a proxima?
                menor = valores[i]; //se sim, esse é o menor valor
                posicao = i; //se sim, essa é a posição
            }
        } else if(valores[i-1] >= valores[i]){ //logica para o ultimo valor
            menor = valores[i];
            posicao = i;
        }
    }

    printf("O menor numero e => %i\n esta na posicao %i\n", menor, posicao);
}