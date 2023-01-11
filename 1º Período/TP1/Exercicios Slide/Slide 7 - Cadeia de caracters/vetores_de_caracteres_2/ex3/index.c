#include <stdio.h>
#include <string.h>

int main(void){
    char texto[100];
    int contador = 0;

    printf("Insira um texto ");
    fgets(texto, 100, stdin);

    for(int i = 0; i <= strlen(texto); i++){
        if(texto[i] == 'a' || texto[i] == 'A' || texto[i] == 'e' || texto[i] == 'E' || texto[i] == 'i' || texto[i] == 'I' || texto[i] == 'o' || texto[i] == 'O' || texto[i] == 'u' || texto[i] == 'U'){
            contador++;
        }
    }

    printf("Exitem %i vogais\n", contador);
}