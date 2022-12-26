// TENTANDO USAR CONSTANTES COMO TAMANHO
#include <stdio.h>

int main(void){
    int n;
    float soma = 0, media;  
    
    printf("Insira quantidade de notas => ");
    scanf("%i", &n);// PARA PEGAR O TAMANHO

    float notas[n];

    for(int i = 0; i < n; i++){// PARA PEGAR OS VALORES
        printf("Insira a nota %i => ", i + 1);
        scanf("%f", &notas[i]);

        soma = soma + notas[i]; // SOMA TD QUE TA NO VETOR
    }

    media = soma / n;
    printf("Media => %.1f", media);

    printf("Notas acima da media:\n");
    for(int i = 0; i < n; i++){
        if(notas[i] >= media){
            printf("Aluno %i => %.1f\n", i + 1, notas[i]);
        }
    }  
}