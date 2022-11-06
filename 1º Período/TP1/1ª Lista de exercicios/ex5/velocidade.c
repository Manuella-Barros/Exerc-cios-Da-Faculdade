#include <stdio.h>
#include <locale.h>

int calculoVelocidade(int quantidadeDeBytes, int velocidadeDeTransmissao);

int main(void){
    setlocale(LC_ALL,"Portuguese");
    int quantidadeDeBytes, velocidadeDeTransmissao;

    printf("Qual a quantidade de bytes do arquivo? ");
    scanf("%d", &quantidadeDeBytes);
    printf("Qual a velocidade de transmiss�o do arquivo? ");
    scanf("%d", &velocidadeDeTransmissao);

    calculoVelocidade(quantidadeDeBytes, velocidadeDeTransmissao);

    printf("Ir� demorar %d segundos para fazer o dowload\n", calculoVelocidade(quantidadeDeBytes, velocidadeDeTransmissao));

}

int calculoVelocidade(int quantidadeDeBytes, int velocidadeDeTransmissao){
    return quantidadeDeBytes/velocidadeDeTransmissao;
}