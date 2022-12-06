#include <stdio.h>

int main(void){
    int n, m, mdc = 0, extra, mmc;

    printf("Insira o valor de n e m => ");
    scanf("%i %i", &n, &m);

    do{
        if(n == 0){
            mdc = m;
        } else if(n > m){
            extra = n;
            n = m;
            m = extra;
        } else if(n <= m){
            m = m % n;
        }
    } while(mdc == 0);

    mmc = (n * m) / mdc;

    printf("m = %i \nn = %i\n", m, n);
    printf("MDC = %i\nMMC = %i\n", mdc, mmc);
}