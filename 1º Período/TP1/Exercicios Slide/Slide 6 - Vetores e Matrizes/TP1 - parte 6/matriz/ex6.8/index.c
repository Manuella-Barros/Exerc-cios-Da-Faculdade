#include <stdio.h>

int main(void){
    int matriz[2][3], somaLinha1 = 0, somaLinha2 = 0;

    for(int i = 0; i < 2; i++){ //AQUI LE AS LINHAS
        for(int n = 0; n < 3; n++){ //AQUI LE AS COLUNAS
            printf("Insira o valor => ");
            scanf("%i", &matriz[i][n]);

            if(i == 0){
                somaLinha1 = somaLinha1 + matriz[i][n];
            }
            if(i == 1){
                somaLinha2 = somaLinha2 + matriz[i][n];
            }
        }
    }

    for(int i = 0; i < 2; i++){ //AQUI PRINTA AS LINHAS
        for(int n = 0; n < 3; n++){ //AQUI PRINTA AS COLUNAS
            printf("%i ", matriz[i][n]);
        }
        printf("\n");
    }

    printf("Soma da linha 1 => %i\n", somaLinha1);
    printf("Soma da linha 2 => %i\n", somaLinha2);
    printf("Somtorio total => %i\n", somaLinha1 + somaLinha2);
}