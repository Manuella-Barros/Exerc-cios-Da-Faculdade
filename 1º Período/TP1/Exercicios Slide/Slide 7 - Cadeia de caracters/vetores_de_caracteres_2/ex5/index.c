#include <stdio.h>
#include <string.h>

int main(void){
    char texto[100];

    fgets(texto, 100, stdin);

    texto[0] = texto[0] - 32; //colocando a primeira letra em maiusculo


    for(int i = 0; i <= strlen(texto); i++){//le cada elemento do char
        if(texto[i] == ' '){
            texto[i + 1] = texto[i + 1] - 32;
        }

    }
        printf("\n%s\n", texto);
}