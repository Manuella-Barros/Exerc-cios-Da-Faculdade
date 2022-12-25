#include <stdio.h>

int calculoPeso(float altura, char sexo[10]);

int main(void){
    float altura;
    char sexo[10];

    printf("Qual sua altura e sexo (masculino ou feminino)? ");
    scanf("%f %s", &altura, &sexo);

    //printf("altura = %f, sexo = %s\n", altura, sexo);

    calculoPeso(altura, sexo);
}

int calculoPeso(float altura, char sexo[10]){
    float peso;

    if (strcmp(sexo, "feminino") == 0){
        peso = (72.7 * altura) - 58;
        printf("Peso = %.2f\n", peso);

    } else if(strcmp(sexo, "masculino") == 0){
        peso = (62.1 * altura) - 44.7;
        printf("Peso = %.2f\n", peso);
    } else{
        main();
    }

}