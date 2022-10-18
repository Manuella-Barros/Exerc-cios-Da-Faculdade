#include <stdio.h>
#include <locale.h>

convertendoTemperatura(int temperaturaCelsius);

int main(void){
    setlocale(LC_ALL,"Portuguese");
    int temperaturaCelsius;

    printf("Qual é a temperatura em celsius? ");
    scanf("%d", &temperaturaCelsius);

    convertendoTemperatura(temperaturaCelsius);
    printf("A temperatura em Fahrenheit será de %d\n", convertendoTemperatura(temperaturaCelsius));
}

int convertendoTemperatura(int temperaturaCelsius){
    return 32 + 1.8 * temperaturaCelsius;
}