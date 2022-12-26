#include <stdio.h>

int main(void){
    int n, m;

    printf("insira a quantidade de linhas e colunas => ");
    scanf("%i %i", &n, &m);

    int  matriz[n][m];

    for(int i = 0; i < n; i++){ //AQUI LE AS LINHAS
        for(int x = 0; x < m; x++){ //AQUI LE AS COLUNAS
            printf("Insira o valor => ");
            scanf("%i", &matriz[n][m]);
        }
    }

    for(int j = 0; j < m; j++){ //AQUI PRINTA AS QNT DE COLUNAS
        for(int i = 0; i < n; i++){ //AQUI PRINTA AS QNT DE LINHAS
            printf("%i ", matriz[i][j]);
            
        }
        printf("\n");
    }


}