#include <stdio.h>

int main(void){
    int soma = 0;
    int v1[] = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
    int v2[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

    for(int i = 0; i < 10; i++){
        soma = soma + v1[i] + v2[i];
    }

    printf("Soma total => %i\n", soma);
    
}