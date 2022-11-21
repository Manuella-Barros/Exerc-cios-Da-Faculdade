#include <stdio.h>

int custoFruta(int morangoKG, int macaKG);

int main(void){
    int morangoKG, macaKG;

    printf("Qual a quantidade em KG de morango e maca => ");
    scanf("%i %i", &morangoKG, &macaKG);

    custoFruta(morangoKG, macaKG);
}

int custoFruta(int morangoKG, int macaKG){
    float custo = 0;
    //CUSTO MORANGO
    if(morangoKG <= 5){
        custo += morangoKG * 2.5;        
    } else{
        custo += morangoKG * 2.2;      
    }
    //CUSTO MAÇÃ    
    if(macaKG <= 5){
        custo += macaKG * 1.8;        
    } else{
        custo += macaKG * 1.5;      
    }
    
    if((morangoKG > 8 && macaKG == 0) || (macaKG > 8 && morangoKG == 0) || (custo > 25)){
        custo = 0.9 * custo;
    }

    printf("custo = %.2f", custo);
}