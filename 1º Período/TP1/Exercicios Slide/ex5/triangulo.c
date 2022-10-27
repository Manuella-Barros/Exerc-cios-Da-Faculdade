#include <stdio.h>

int calculoTriangulo(int x, int y, int z);

int main(void){
    int x, y, z;

    printf("Digite 3 numeros para lados de triangulos: ");
    scanf("%i %i %i", &x, &y, &z);

    //printf("x = %i, y = %i, z = %i\n", x, y, z);
    calculoTriangulo(x, y, z);
}

int calculoTriangulo(int x, int y, int z){
    if(x != 0 && y != 0 && z != 0){
        if(x < (y + z) && y < (x + z) && z < (x + y)){
            printf("E um triangulo");

        } else{
            printf("Nao e um triangulo");
        }

    } else {
        main();
    }
}