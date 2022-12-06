#include <stdio.h>

int main(void){
    int n, m, k;

    do{
        printf("Insira os valores de n, m e k => ");
        scanf("%i %i %i", &n, &m, &k);      

        if(n > m){
            printf("n deve ser menor ou igual a m\n");
        }  
        if(k < 1){
            printf("k deve ser maior ou igual a 1\n");
        }
    } while(n > m || k < 1);
    printf("%i %i %i\n", n, m, k);


    for(int i = n; i <= m; i = i + k){
        printf("%i ", i);
    }

}