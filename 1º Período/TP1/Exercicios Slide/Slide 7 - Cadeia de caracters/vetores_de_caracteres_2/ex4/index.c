#include <stdio.h>
#include <string.h>

int contaVogais(char texto[]);

int main(void){
    char texto[100];

    printf("Escreva algo ");
    fgets(texto, 100, stdin);

    int contagem = contaVogais(texto);

    printf("Existem %i vogais no texto\n", contagem);
}

int contaVogais(char texto[]){
    int contagemVogal = 0;
    
    for(int i = 0; i <= strlen(texto); i++){
        if(texto[i] == 'a' || texto[i] == 'A' || texto[i] == 'e' || texto[i] == 'E' || texto[i] == 'i' || texto[i] == 'I' || texto[i] == 'o' || texto[i] == 'O' || texto[i] == 'u' || texto[i] == 'U'){
            contagemVogal++;
        }
    }

    return contagemVogal;
}