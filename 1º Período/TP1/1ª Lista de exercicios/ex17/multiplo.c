#include <stdio.h>
#include <locale.h>
//NÃO TERMINEI
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
  //int contador = 1;
  
  if (x <= y){
    for (int i = 0; i <= y; i++){
      int comparacao;
      multiplo = x * i;
      printf("i = %i\n", i);
      comparacao = y - multiplo;
      printf("comparacao = %i\n", comparacao);

      if (comparacao < y){
        printf("multiplo = %i\n", multiplo);
          //break;
      }      
    }

    
    
  } else{
    main();
    }
}


    

    
    //printf("o maior multiplo de %i ,menor ou igual a %i, � %i\n", x, y, multiplo);