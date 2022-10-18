#include <stdio.h>
#include <locale.h>

int calculoDesconto(int valor, int desconto);

int main (void){
    setlocale(LC_ALL,"Portuguese");
    float valor, desconto;

    printf("Qual o valor do produto? ");
    scanf("%f", &valor);
    printf("Qual o percentual de desconto desse produto? ");
    scanf("%f", &desconto);

    calculoDesconto(valor, desconto);


}

int calculoDesconto(int valor, int desconto){
    float novoValor, valorDescontado;

    novoValor = valor - ((valor*desconto)/100);
    printf("novoValor = %f\n", novoValor);

    valorDescontado = (valor*desconto)/100;
    printf("valorDescontado = %f\n", valorDescontado);

}