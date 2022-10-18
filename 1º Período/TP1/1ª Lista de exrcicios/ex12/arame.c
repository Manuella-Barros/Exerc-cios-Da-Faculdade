#include <stdio.h>
#include <locale.h>

int calculoCercamento(int comprimento, int largura, float preco);
float calculoCusto(int metragem, float preco);

int main(void){
    setlocale(LC_ALL,"Portuguese");
    int comprimento, largura;
    float preco;

    printf("Qual o comprimento e a largura do terreno retangular? ");
    scanf("%d %d", &comprimento, &largura);
    printf("Qual o preço do metro quadrado de grama? ");
    scanf("%f", &preco);
    calculoCercamento(comprimento, largura, preco);
}

int calculoCercamento(int comprimento, int largura, float preco){
    int metragem = ((comprimento * 2) + (largura * 2)) * 4;
    printf("A metragem de arame gasto para cercar o terreno será de %dm ", metragem);
    calculoCusto(metragem, preco);
}

float calculoCusto(int metragem, float preco){
    float custo = preco * metragem;
    printf("e o custo será de R$%.2f pra cercar o terreno\n", custo);
}

