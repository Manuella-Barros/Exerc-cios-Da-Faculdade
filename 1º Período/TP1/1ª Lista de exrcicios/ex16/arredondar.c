#include <stdio.h>
//o input tem que ser com . tipo 3.5 ao invés de 3,5

int main(void){
    float xFloat;

    printf("Escolha um falor com virgula para ser arredondado: ");
    scanf("%f", &xFloat);

    int xInt = xFloat;
    float xIntFloat = xInt;
    float a = xFloat - xIntFloat;
    //ex: input = 3.5 as respostas serão xInt = 3, xIntFloat = 3.000000, xFloat = 3.500000, a = 0.500000

    if (a >= 0.5){
        int arredondado = xInt + 1;
        printf("x arrendodado = %i\n", arredondado);

    } else{
        printf("x arrendodado = %i\n", xInt);
    }

/*
    int yInt = int(x);
    float yFloat = yInt;
    float z = x - yFloat;

    //if(x%y)
    printf("x arrendodado = %i\n", yInt);
*/
}