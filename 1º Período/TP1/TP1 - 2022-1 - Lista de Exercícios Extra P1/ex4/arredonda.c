#include <stdio.h>

int arredonda(float nFloat);

int main(void){
    float nFloat;

    printf("Insira o valor de n => ");
    scanf("%f", &nFloat);

    arredonda(nFloat);
}

int arredonda(float nFloat){
    int nInt;
    float res;
    nInt = nFloat;
    res = nFloat - nInt;

    if(res == 0){
        printf("n arredondado = %i\n", nInt);
    } else{
        printf("n arredondado = %i\n", nInt + 1);
    }
}