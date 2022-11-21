#include <stdio.h>

int calculoIdade(int m1, int m2, int h1, int h2);

int main(void){
    int m1, m2, h1, h2;

    do{
        printf("Insira a idade das duas mulheres ");
        scanf("%i %i", &m1, &m2);
        printf("Insira a idade dos dois homens ");
        scanf("%i %i", &h1, &h2);

        if(m1 == m2 && m1 == h1 && m1 == h2){
            printf("Nao pode dar a mesma idade para todos\n");
        }
    }while(m1 == m2 && m1 == h1 && m1 == h2);

    calculoIdade(m1, m2, h1, h2);
}

int calculoIdade(int m1, int m2, int h1, int h2){
    int soma, produto, maisVelho, maisNovo, maisVelha, maisNova;

    if(m1 < m2){
        maisVelha = m2;
        maisNova = m1;
    } else{
        maisVelha = m1;
        maisNova = m2;
    }
    if(h1 < h2){
        maisVelho = h2;
        maisNovo = h1;
    } else{
        maisVelho = h1;
        maisNovo = h2;
    }

    soma = maisVelho + maisNova;
    produto = maisNovo * maisVelha;
    
    printf("Soma = %i \nProduto = %i\n", soma, produto);
}