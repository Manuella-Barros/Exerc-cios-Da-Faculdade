#include <stdio.h>
#include <string.h>
#include <locale.h>

int calculoMultiplicacao(int num);

int main (){
    setlocale(LC_ALL,"Portuguese");

    int num;
    printf("Digite um número de 4 digitos:");
    scanf("%i", &num);

    calculoMultiplicacao(num);
}

int calculoMultiplicacao(int num){
    int p1, p2, multiplicacao;
    
    p1 = num / 100;
    p2 = num % 100;
    multiplicacao = p1 * p2;

    printf("Primeira parte = %i \nSegunda parte = %i \n %i * %i = %i", p1, p2, p1, p2, multiplicacao);


    //printf("%zu\n", strlen(num));
    /*if (strlen(num) == 4){
        int p1, p2, multiplicacao;
        
        p1 = num / 100;
        p2 = num % 100;
        multiplicacao = p1 * p2;

        printf("Primeira parte = %i \nSegunda parte = %i \n %i * %i = %i", p1, p2, p1, p2, multiplicacao);
    } else{
        main();
    }*/
}