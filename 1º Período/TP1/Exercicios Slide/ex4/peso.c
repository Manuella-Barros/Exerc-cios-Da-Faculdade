#include <stdio.h>

int calculoPeso(float altura, char sexo[10]);

int main(void){
    float altura;
    char sexo[10];

    printf("Qual sua altura e sexo (masculino ou feminino)? ");
    scanf("%f %c", &altura, &sexo);

    printf("altura = %f, sexo = %c\n", altura, sexo);

    //calculoPeso( altura, sexo);
}

int calculoPeso(float altura, char sexo[10]){
    int peso;

    if (sexo == "feminino"){
        peso = (72.7 * altura) - 58;
        printf("sexo = %c, altura = %i, peso = %i\n", sexo, altura, peso);
    }

}