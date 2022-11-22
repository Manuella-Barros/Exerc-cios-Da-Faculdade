#include <stdio.h>

int calculoValor(float litrosVendidos, char combustivel);

int main(void){
    float litrosVendidos;
    char combustivel;

    printf("Insira quantos litros foram vendidos e qual a gasolinha => ");
    scanf("%f %s", &litrosVendidos, &combustivel); 
    calculoValor(litrosVendidos, combustivel);
}

int calculoValor(float litrosVendidos, char combustivel){
    float custo;

    //CALCULANDO O PREÇO SEM DESCONTO
    if(combustivel == 'g' || combustivel == 'G'){    
        //CALCULANDO O DESCONTO
        if(litrosVendidos <= 20){
            custo = litrosVendidos * 3.168; //desconto de 4% por litro
        } else{
            custo = litrosVendidos * 3.102; //desconto de 6% por litro
        }

    } else if(combustivel == 'a' || combustivel == 'A'){
        //CALCULANDO O DESCONTO
        if(litrosVendidos <= 20){
            custo = litrosVendidos * 2.813; //desconto de 3% por litro
        } else{
            printf("foi");
            custo = litrosVendidos * 2.755; //desconto de 5% por litro
        }
    }

    printf("Custo = %.2f", custo);
}