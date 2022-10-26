#include <stdio.h>

int main(void){
    int x, y;

    printf("Escolha 2 numeros, um divisor e um dividendo respectivamente ");
    scanf("%i %i", &x, &y);

    if (x >= y && y != 0){
        printf("%i/%i = %i", x, y, x/y);
    } else{
        main();
    }
}