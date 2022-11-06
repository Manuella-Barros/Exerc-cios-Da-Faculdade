#include <stdio.h>

int calculoDivisao(int n,  int k);

int main(void){
  int n, k;

  printf("digite um divisor e o dividendo: ");
  scanf("%i %i", &n, &k);

  calculoDivisao(n, k);
}

int calculoDivisao(int n, int k){
  if (n % k == 0){
    printf("%i e divisivel por %i\n", n, k);
  } else{
    printf("%i nao e divisivel por %i\n", n, k);
  }
}