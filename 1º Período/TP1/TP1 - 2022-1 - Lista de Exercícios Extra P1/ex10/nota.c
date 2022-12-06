#include <stdio.h>

int main(void){
    float n1, n2;

    do{
        printf("Insira as duas notas do aluno = > ");
        scanf("%f %f", &n1, &n2);        
    } while(n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10);

    printf("Media = %.2f\n", (n1 + n2) / 2);
}