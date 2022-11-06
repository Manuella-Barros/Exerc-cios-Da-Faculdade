#include <stdio.h>

int calculoDivisao(int n);

int main(void){
  int n;

  printf("digite um valor: ");
  scanf("%i", &n);

  calculoDivisao(n);
}

int calculoDivisao(int n){
  if (n % 6 == 0){
    printf("E divisivel por 6\n");
  } else{
    printf("Nao e divisivel por 6\n");
  }
}