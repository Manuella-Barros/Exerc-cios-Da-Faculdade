#include <stdio.h>
const int TAM_LINHA = 4;
const int TAM_COLUNA = 4;

int main(void){
    int matriz[TAM_LINHA][TAM_COLUNA];

    for(int i = 0; i < TAM_LINHA; i++){ //AQUI LE AS LINHAS
        for(int n = 0; n < TAM_COLUNA; n++){ //AQUI LE AS COLUNAS
            printf("Insira o valor => ");
            scanf("%i", &matriz[i][n]);
        }
    }

    // IMPRIMINDO A DIAGONAL PRINCIPAL
    printf("\nImpriminddo a diagonal principal:\n");
    for(int i = 0; i < TAM_LINHA; i++){ //AQUI PRINTA AS LINHAS
        if(i == 0){
            printf("%i\n", matriz[i][i]); //A POSIÇÃO 0 NAO TEM ESPAÇO ANTES
        } else{ //LOGICA PARA COLOCAR OS ESPAÇOS DA MATRIZ
            for(int n = 0; n < i; n++){ //A QNT DE ESPAÇOS É A POSIÇÃO DO VALOR, EX LINHA 1 TEM 1 ESPAÇO
                printf(" ");
            }
            printf("%i\n", matriz[i][i]); //AQUI POSTA O VALOR ESSA LINHA E PULA PRA PROX
        }
    }

    // IMPRIMINDO A DIAGONAL SECUNDARIA
    printf("\nImpriminddo a diagonal secundaria:\n");
    for(int i = TAM_LINHA - 1; i >= 0; i--){ //AQUI PRINTA AS LINHAS
        if(i == 0){
            printf("%i\n", matriz[i][(TAM_COLUNA - 1) - i]); //A POSIÇÃO 0 NAO TEM ESPAÇO ANTES
        } else{ //LOGICA PARA COLOCAR OS ESPAÇOS DA MATRIZ
            for(int n = i; n >= 0; n--){ //A QNT DE ESPAÇOS É A POSIÇÃO DO VALOR, EX LINHA 1 TEM 1 ESPAÇO
                printf(" ");
            }
            printf("%i\n", matriz[i][(TAM_COLUNA - 1) - i]); //AQUI POSTA O VALOR ESSA LINHA E PULA PRA PROX
        }
    }
}