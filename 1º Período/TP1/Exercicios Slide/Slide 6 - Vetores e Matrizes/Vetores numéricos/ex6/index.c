#include <stdio.h>
const int TAM = 10;

int calcularQuantidade(float media, float idade[TAM], int quantidade);

int main(void){
    float idade[TAM], media;
    int soma = 0, quantidade = 0;

    for(int i = 0; i < TAM; i++){ //esse for pega a nota de cada aluno
        printf("insira a idade do aluno %i ", i + 1);
        scanf("%f", &idade[i]);

        soma = soma + idade[i];
    }
    media = soma/TAM;
    calcularQuantidade(media, idade[TAM], quantidade);

    printf("Sao %i alunos acima da media\n", quantidade);
}

int calcularQuantidade(float media, float idade[TAM], int quantidade){
    for(int i = 0; i < TAM; i++){ //esse for pega a nota de cada aluno
        if(idade[i] > media){
            quantidade++;
        }
    }
    
    return quantidade;
}