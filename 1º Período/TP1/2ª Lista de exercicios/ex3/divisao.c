#include <stdio.h>

int calculoDivisao(int n);

int main(void){
  int n;

  printf("digite um valor: ");
  scanf("%i", &n);

  calculoDivisao(n);
}

int calculoDivisao(int n){
  if (n % 3 == 0 && n % 7 == 0){
    printf("E divisivel por 3 e por 7\n");
  } else if (n % 3 == 0){
    printf("E divisivel por 3, mas nao por 7 \n");
    
  } else if ( n % 7 == 0){
    printf("E divisivel por 7, mas nao por 3\n");
    
  } else{
    printf("Nao e divisivel por 3 e 7\n");
    
  }
}