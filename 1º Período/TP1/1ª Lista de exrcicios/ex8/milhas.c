#include <stdio.h>
#include <locale.h>

float conversao(float km);

int main(void){
    setlocale(LC_ALL,"Portuguese");
    float km;

    printf("Escolha um valor em km para converter para milhas: ");
    scanf("%f", &km);

    printf("%f km em milhas será %f milhas\n", km, conversao(km));

}

float conversao(float km){
    return km * 0.621371 ;
}