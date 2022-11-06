#include <stdio.h>
#include <locale.h>

int calculoInvertido(int num);

int main(void){
    setlocale(LC_ALL,"Portuguese");
    int num;

    printf("Escolha um número de 4 digitos: ");
    scanf("%i", &num);
    printf("%i \n", num);        

    calculoInvertido(num);
}

int calculoInvertido(int num){
    int unidade, dezena, centena, milhar;
    milhar = num / 1000;
    centena = (num - (milhar*1000)) / 100;
    dezena = (num - ((milhar * 1000) + (centena * 100))) / 10;
    unidade = num % 10;
    printf("Número invertido %i%i%i%i \n", unidade, dezena, centena, milhar);

}