#include <stdio.h>

int calculoConta(int x, int y, char sinal[1]);

int main(void){
    int x, y;
    char sinal[1];

    printf("Digite 2 numeros: ");
    scanf("%i %i", &x, &y);
    printf("Digite o sinal da operação: ");
    scanf("%s", &sinal);

    printf("y = %i\n", y);
    //calculoConta(x, y, sinal);
}

int calculoConta(int x, int y, char sinal[1]){
    if(strcmp(sinal, "+") == 0){
        printf("%i + %i = %i\n", x, y, x+y);
    }
}