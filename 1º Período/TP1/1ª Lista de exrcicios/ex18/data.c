#include <stdio.h>
#include <locale.h>

int calculoData(int num, int dia, int mes, int ano);

int main(void){
    setlocale(LC_ALL,"Portuguese");
    int num, dia, mes, ano;

    printf("Escolha 1 número com 8 digitos: ");
    scanf("%i", &num);

    calculoData(num, dia, mes, ano);


}

int calculoData(int num, int dia, int mes, int ano){

    dia = num/1000000;
    mes = (num - (dia * 1000000)) / 10000;
    ano = num % 10000;

    if (dia <= 31 && dia >= 1 && mes <= 12 && mes >= 1){
        printf("data inserida: %i/ %i/ %i", dia, mes, ano);    
    } else{
        main();
    }
}