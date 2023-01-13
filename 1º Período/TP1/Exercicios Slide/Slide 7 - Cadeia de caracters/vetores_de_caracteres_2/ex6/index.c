#include <stdio.h>
#include <string.h>

int contaA(char texto[]);

int main(void){
    char texto[100];

    fgets(texto, 100, stdin);

    int contagem = contaA(texto);
    printf("\n%i\n", contagem);

    for(int i = 0; i <= strlen(texto); i++){//le cada elemento do char
        if(texto[i] == 'a'){
            texto[i] = 'b';
        }
    }    

    printf("\n%s\n", texto);
}

int contaA(char texto[]){

    int contagemA = 0;

    for(int i = 0; i <= strlen(texto); i++){//le cada elemento do char
        if(texto[i] == 'a'){
            contagemA++;
        }
    }

    return contagemA;
}