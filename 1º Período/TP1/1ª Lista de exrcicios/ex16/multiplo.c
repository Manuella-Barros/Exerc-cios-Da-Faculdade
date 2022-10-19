#include <stdio.h>
#include <locale.h>

int multiplo(int x, int y);

int main(void){
    setlocale(LC_ALL,"Portuguese");
    int x, y;

    printf("Escolha 2 varoles para as variaveis inteiras x e y, respectivamente, sendo x menor ou igual a y: ");

    scanf("%i %i", &x, &y);
    multiplo(x, y);
}

int multiplo(int x, int y){
    int contador = 1;
    if (x <= y){
        
        //for (contador; contador <= y; i++){
        //    /* code */
        //}
        

    } else{
        main();
    }
}