#include <stdio.h>

double calculoPotencia(int x, int n);

int main(void){
    int x, n;
    double potencia;

    printf("Insira a base e o expoente => ");
    scanf("%i %d", &x, &n);

    potencia = calculoPotencia(x, n);

    printf("Potencia = %1.f", potencia);
}

double calculoPotencia(int x, int n){
    double pot;
    if(n < 0){
        return -1;    

    } else if(n == 0){
        return 1;

    } else if (n > 0){
        while(n > 0){
            n--;
            return x * calculoPotencia(x, n);
        }        
    }
}