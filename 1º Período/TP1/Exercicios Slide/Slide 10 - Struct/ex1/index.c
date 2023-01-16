#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

typedef struct dados_pessoas {// aqui eu crio a struct com o nome de dados_pessoas
    char nome[100];
    float peso;
    float altura;
} pessoas; //pessoas é o tipo q eu dei pra ela, um tipo como char, int e float

pessoas calculoIMC(pessoas p[]);

int main(void){
    pessoas p[5];

    for(int i = 0; i < 5; i++){
        printf("\n\nInsira os dados do funcionario %i: \n", i+1);

        printf("Nome: ");
        scanf("%s", &p[i].nome); 
        printf("Peso: ");
        scanf("%f", &p[i].peso);
        printf("Altura: ");
        scanf("%f", &p[i].altura);
    }

    calculoIMC(p);
}

pessoas calculoIMC(pessoas p[]){
   for(int n = 0; n < 5; n++){
        printf("\n\nNome: %s\n", p[n].nome);
        printf("IMC: %.2f\n", p[n].peso / (p[n].altura * p[n].altura));//calculo imc
    }
}