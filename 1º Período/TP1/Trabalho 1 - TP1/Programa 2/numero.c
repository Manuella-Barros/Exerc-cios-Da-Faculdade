#include <stdio.h>
#include <string.h>
#include <math.h>

int calculoD(int *num, char operacao, long long int *k, int contador, int *dTamanho);
int calculoE(int *num, char operacao, long long int *k, int contador, int *eTamanho);
int calculoI(int *num, char operacao, long long int *k, int contador, int *iTamanho);
int calculoF(int *num, char operacao, long long int *k, int contador, int *fTamanho);

int main(void){
    long long int k, kTamanho;
    int contador = 0, dTamanho, eTamanho, iTamanho, fTamanho;
    int num;
    char operacao;
    
    do {
        printf("Insira o valor de K (3 a 10 digitos): ");
        scanf("%lld", &k);

        // O kTamanho SERVER SÓ PRA USAR O VALOR DE K SEM ALTERAR O VALOR DE K
        kTamanho = k;

        //CALCULO PRA SABER O TAMANHO DE K
        if (kTamanho >= 0){
            contador = 0;

            if (kTamanho == 0){
                contador = 1;
            } else{
                while (kTamanho > 0){
                    contador++;
                    kTamanho = kTamanho / 10;
                }
            }
        }
        
        // VALIDAÇÃO DO TAMANHO DE K
        if(contador < 3 || contador > 10){
            printf("Quantidade errada de digitos \n");
        }
    } while (contador < 3 || contador > 10);
    
    do {
        do{
            printf("Insira a letra da operacao e o numero: ");
            scanf("%s", &operacao);
            if(operacao != 't' && operacao != 'T'){
                scanf("%i", &num);
            }
            
        } while(num < 0 || num > 9);

        //CHAMANDO AS FUNÇÕES COM O INPUT DO USUÁRIO
        if(operacao == 'd' || operacao == 'D'){
            calculoD(&num, operacao, &k, contador, &dTamanho);
            if(dTamanho < contador){
                printf("k = 000%i\n", k);
            } else{
                printf("k = %i\n", k);
            }
            
        } else if (operacao == 'e' || operacao == 'E'){
            calculoE(&num, operacao, &k, contador, &eTamanho);
            if(eTamanho < contador){
                printf("k = 000%i\n", k);
            } else {
                printf("k = %i\n", k);
            }
            
        } else if (operacao == 'i' || operacao == 'I'){
            calculoI(&num, operacao, &k, contador, &iTamanho);
            if(iTamanho < contador){
                printf("k = 000%i\n", k);
            } else{
                printf("k = %i\n", k);
            }

        } else if (operacao == 'f' || operacao == 'F'){
            calculoF(&num, operacao, &k, contador, &fTamanho);
            if(fTamanho < contador){
                printf("k = 000%i\n", k);
            } else{
                printf("k = %i\n", k);
            }           

        } else if(operacao != 't' && operacao != 'T') {
            printf("Entrada invalida\n");

        }

    } while(operacao != 't' && operacao != 'T');
}

// FAZ A ROTAÇÃO DO NUMERO (K) À DIREITA EM NUM DIGITOS
int calculoD(int *num, char operacao, long long int *k, int contador, int *dTamanho){
    int invertido, kReserva = *k, contadorD = 0, x = 1;
    //PEGO O MULTIPLO DE 10 PARA TRANSFORMAR O ULTIMO NÚMERO NO PRIMEIRO
    for(int j = 1; j < contador; j++){
        x = x * 10;
    }

    //FAÇO ESSA CONTA A QUANTIDADE DE VEZES Q A PESSOA COLOCOU
    do{
        invertido = (kReserva % 10) * x;
        kReserva = kReserva/ 10;
        kReserva = invertido + kReserva;   
        contadorD++;     
    } while(contadorD < *num);

    *k = kReserva;
    //CALCULO PRA SABER O TAMANHO DE D
    if (kReserva >= 0){
        contadorD = 0;

        if (kReserva == 0){
            contadorD = 1;
        } else{
            while (kReserva > 0){
                contadorD++;
                kReserva = kReserva / 10;
            }
            *dTamanho = contadorD;
        }
    }
    return 1;
}

// FAZ A ROTAÇÃO DO NUMERO (K) À ESQUERDA EM NUM DIGITOS
int calculoE(int *num, char operacao, long long int *k, int contador, int *eTamanho){
    int invertido, kReserva = *k, contadorE = 0, x = 1;

    //PEGO O MULTIPLO DE 10 PARA TRANSFORMAR O ULTIMO NÚMERO NO PRIMEIRO
    for(int j = 1; j < contador; j++){
        x = x * 10;
    }

    //FAÇO ESSA CONTA A QUANTIDADE DE VEZES Q A PESSOA COLOCOU
    do{
        invertido = kReserva / x;
        kReserva = kReserva % x;
        kReserva = (kReserva * 10) + invertido;
        contadorE++;     
    } while(contadorE < *num);

    *k = kReserva;
    //CALCULO PRA SABER O TAMANHO DE E
    if (kReserva >= 0){
        contadorE = 0;

        if (kReserva == 0){
            contadorE = 1;
        } else{
            while (kReserva > 0){
                contadorE++;
                kReserva = kReserva / 10;
            }
            *eTamanho = contadorE;
        }
    }
    return 1;
}

// INSERE O DIGITO NUM NO INICIO DO NUMERO (K), O DIGITO MAIS A DIREITA É PERDIDO
int calculoI(int *num, char operacao, long long int *k, int contador, int *iTamanho){
    int x = 1, contadorI = 0, kReserva;

    //printf("char = %d", operacao);

    if(*num >= 0 && *num <= 9){
        // AQUI EXCLUI O ULTIMO DIGITO
        *k = *k/10;

        //AQUI EU TO GERANDO UM MULTIPLO DE 10 AONDE A QUANTIDADE DE 0 É O TAMANHO DO VALOR K DPS DE DIVIDIDO
        for(int i = 0; i < contador - 1; i++){
            x = x * 10;
        }

        // AQUI EU SOMO O VALOR NOVO(MULTIPLICADO PELO MULTIPLO DE 10) AO VALOR ANTIGO
        *k = (x * *num) + *k;

    } else{
        return 0;
    }

    kReserva = *k;
    //CALCULO PRA SABER O TAMANHO DE I
    if (kReserva >= 0){
        contadorI = 0;

        if (kReserva == 0){
            contadorI = 1;
        } else{
            while (kReserva > 0){
                contadorI++;
                kReserva = kReserva / 10;
            }
            *iTamanho = contadorI;
        }
    }
    
    return 1;
}

// INSERE O DIGITO NUM NO FIM DO NUMERO (K), O DIGITO MAIS A ESQUERDA É PERDIDO
int calculoF(int *num, char operacao, long long int *k, int contador, int *fTamanho){
    int x = 1, contadorF = 0, kReserva;

    if(*num >= 0 && *num <= 9){
        for(int i = 0; i < contador - 1; i++){
            x = x * 10;
        }

        // AQUI EU ME LIVRO DO PRIMEIRO DIGITO A ESQUERDA E ADICIONO UM A DIREITA
        *k = ((*k - ((*k / x) * x)) * 10) + *num;

    } else{
        return 0;
    }

    kReserva = *k;
    //CALCULO PRA SABER O TAMANHO DE F
    if (kReserva >= 0){
        contadorF = 0;

        if (kReserva == 0){
            contadorF = 1;
        } else{
            while (kReserva > 0){
                contadorF++;
                kReserva = kReserva / 10;
            }
            *fTamanho = contadorF;
        }
    }
    
    return 1;
}