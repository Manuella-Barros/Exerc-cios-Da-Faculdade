#include <stdio.h>

int tintaCusto(int area, float pLata);

int main(void){
    int ;
    float area, pLata;

    printf("Insira o tamanho em metros quadrados da area a ser pintada (valor inteiro) e o valor da lata de tinta => ");
    scanf("%f %f", &area, &pLata);

    tintaCusto(area, pLata);
}

int tintaCusto(int area, float pLata){
    int latas, litrosInt;
    float custo, litrosFloat;   

    litrosFloat = area / 6;
    latas = litrosFloat / 12;

    if(area < 6){
        litrosFloat = 1;
    }
    if(litrosFloat < 12){
        latas = 1;
    }
    //Para adicionar uuma lata a mais caso o litro seja quebrado
    //if(litrosFloat > 12 && (litrosFloat - litrosInt) != 0){
    //    latas = latas + 1;
    //}

    printf("usou %.2f litros\n", litrosFloat);
    printf("usou %i latas\n", latas);
    custo = pLata * latas;

    printf("usou %.2f litros, %i latas e custou R$%.2f\n", litrosFloat, latas, custo);
}