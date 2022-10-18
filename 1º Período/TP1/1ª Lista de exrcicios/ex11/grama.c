#include <stdio.h>
#include <locale.h>

int calculoArea(int comprimento, int largura, int area, float preco);
float calculoCusto(float preco, int area);

int main(void){
    setlocale(LC_ALL,"Portuguese");
    int comprimento, largura, area;
    float preco;

    printf("Qual o comprimento e a largura do terreno retangular? ");
    scanf("%d %d", &comprimento, &largura);
    printf("Qual o preço do metro quadrado de grama? ");
    scanf("%f", &preco);

    calculoArea(comprimento, largura, area, preco);
}

int calculoArea(int comprimento, int largura, int area, float preco){
    area = comprimento * largura;
    printf("A area do terreno retangular é de %dm² ", area);
    calculoCusto(preco, area);
}

float calculoCusto(float preco, int area){
    float custo = preco * area;
    printf("e o custo total de grama para gramar o terreno será de R$%.2f", custo);
}