#include <stdio.h>
#include <locale.h>

int calculoVelocidade(int quantidadeDeBytes, int velocidadeDeTransmissao);

int main(void){
    setlocale(LC_ALL,"Portuguese");
    int quantidadeDeBytes, velocidadeDeTransmissao;

    printf("Qual a quantidade de bytes do arquivo? ");
    scanf("%d", &quantidadeDeBytes);
    printf("Qual a velocidade de transmissão do arquivo? ");
    scanf("%d", &velocidadeDeTransmissao);

    calculoVelocidade(quantidadeDeBytes, velocidadeDeTransmissao);

    printf("Irá demorar %d segundos para fazer o dowload\n", calculoVelocidade(quantidadeDeBytes, velocidadeDeTransmissao));

}

int calculoVelocidade(int quantidadeDeBytes, int velocidadeDeTransmissao){
    return quantidadeDeBytes/velocidadeDeTransmissao;
}