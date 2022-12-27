#include <stdio.h>
const int TAM = 10;

int main(void){
    float idade[TAM], media;
    int soma = 0, quantidade = 0;

    for(int i = 0; i < TAM; i++){ //esse for pega a nota de cada aluno
        printf("insira a idade do aluno %i ", i + 1);
        scanf("%f", &idade[i]);

        soma = soma + idade[i];
    }

    media = soma/TAM;

    for(int i = 0; i < TAM; i++){ //esse for pega a nota de cada aluno
        if(idade[i] > media){
            quantidade++;
        }
    }

    printf("Sao %i alunos acima da media\n", quantidade);
}