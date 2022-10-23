#include <stdio.h>
#include <locale.h>

int calculoMultiplo(int x, int y);

int main(void){
    setlocale(LC_ALL,"Portuguese");
    int x, y;

    printf("Escolha 2 varoles para as variaveis inteiras x e y, respectivamente, sendo x menor ou igual a y: ");

    scanf("%i %i", &x, &y);
    calculoMultiplo(x, y);
}

int calculoMultiplo(int x, int y){
  int multiplo;
  int contador = 1;
  
  if (x <= y){
    for (int i = 0; i <= y; i++){
      multiplo = x * i;
      printf("i = %i\n", i);
      
      if (y - multiplo <= y){
          break;
      }      
    }

    printf("multiplo = %i\n", multiplo);
    
  } else{
    main();
    }
}


    

    
    //printf("o maior multiplo de %i ,menor ou igual a %i, é %i\n", x, y, multiplo);