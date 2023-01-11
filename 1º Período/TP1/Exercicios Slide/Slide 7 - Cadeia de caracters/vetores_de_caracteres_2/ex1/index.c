//inicializando um vetor (array)
#include <stdio.h>
#include <string.h>

int contaEspaco(char texto[100]);

int main(void){
    char texto[100];

    printf("Insira um texto\n");
    fgets(texto, 100, stdin);
    //printf("\n%s\n", texto); não entendi pq não coloca o [100]

    int contagemEspaco = contaEspaco(texto);// não entendi pq não coloca o [100]

    printf("Existem %i espacos nesse texto\n", contagemEspaco);

}

int contaEspaco(char texto[100]){
    int contador = 0;
    for(int i = 0; i <= strlen(texto); i++){
        if(texto[i] == ' '){
        contador++;
        }
    }

    return contador;
}