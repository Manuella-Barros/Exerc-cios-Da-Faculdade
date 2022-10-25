#include <stdio.h>
#include <locale.h>

int soma(int num);

int main(void){
    setlocale(LC_ALL,"Portuguese");
    int num;

    printf("Digite 1 número inteiro de 100 a 999: ");
    scanf("%i", &num);
    soma(num);

}

int soma(int num){
  int unidade, dezena, centena;
  
  if (num >= 100 && num <= 999){
    unidade = num % 10;
    dezena = ((num % 100) - unidade) / 10;
    centena = num / 100 ;
    
    //printf("centena = %i; dezena = %i; unidade = %i\n", centena, dezena, unidade);
    printf("A soma dos digitos será de = %i\n", centena + dezena + unidade);
    
  } else{
    main();
  }
}