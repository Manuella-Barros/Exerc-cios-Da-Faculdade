#include <stdio.h>

int main(void){
    int n, m;

    printf("Insira a quantidade de linhas e colunas => ");
    scanf("%i %i", &n, &m);

    int matriz[n][m];

    for(int i = 0; i < n; i++){ //AQUI LE AS LINHAS
        for(int j = 0; j < m; j++){ //AQUI LE AS COLUNAS
            printf("Insira o valor => ");
            scanf("%i", &matriz[i][j]);
        }
    }

    for(int i = 0; i < m; i++){ //AQUI PRINTA AS LINHAS
        for(int j = 0; j < n ; j++){ //AQUI PRINTA AS COLUNAS
            printf("%i ", matriz[j][i]); //so inverti aqui e nos for e pronto
        }
        printf("\n");
    }
/*
    for(int i = 0; i < n; i++){ //AQUI PRINTA AS LINHAS
        for(int j = 0; j < m ; j++){ //AQUI PRINTA AS COLUNAS
            printf("%i ", matriz[i][j]);
        }
        printf("\n");
    }
*/    
}