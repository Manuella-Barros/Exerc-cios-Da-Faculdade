#include <stdio.h>

int main(void){
    int x, y;

    printf("Digite dois numeros: ");
    scanf("%i %i", &x, &y);

    if (x != 0 && y != 0){
        printf("Valores sao validos \n");
        
    } else{
        printf("Valores invalidos \n");
    }
}