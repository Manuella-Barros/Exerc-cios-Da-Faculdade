#include <stdio.h>
#include <string.h>

int main(void){
    int N, contador = 0;
    char numeros[11] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '9'};

    printf("Insira um valor N para ser as dimensoes da folha quadriculada ");
    scanf("%i", &N); //PEGA VALOR N

    if(N < 3 || N > 50){//VALIDA N
        printf("Nao aceito esse valor");
        return 0; //Uso isso pro programa parar
    }

    char lapis[N][N];

    //For pra pegar o scanf
    for(int i = 0; i < N; i++){//for pra quant de linhas
        for(int n = 0; n < N; n++){//for pra quant de linhas
            contador++; //Só pra por no print
            printf("Insira o valor %i=> ", contador);
            scanf("%s", &lapis[i][n]);
            if (lapis[i][n] != '0' && lapis[i][n] != '*') //verifica a entrada
            {
                printf("Nao aceito esse valor\n");
                return 0;//Uso isso pro programa parar
            }
            
        }
    }
    contador = 0; //zera pra reutilizar
    
    for(int j = 0; j < 11; j++){//roda 11 vezes, pra procurar os valores de 0 a 9, e o contador + 1
        for(int i = 0; i < N; i++){//for pra quant de linhas
            for(int n = 0; n < N; n++){//for pra quant de linhas
                if(lapis[i][n] == numeros[contador]){ //FOR PRA ACHAR O 0, dps 0 1 e assim vai...
                    if(n != 0){
                        if(lapis[i][n - 1] == '*'){//Adiciona esquerda
                            lapis[i][n - 1] = numeros[contador + 1];    
                        }                    
                    }
                    if(n != (N - 1)){
                        if(lapis[i][n + 1]  == '*'){//Adiciona direita
                            lapis[i][n + 1]  = numeros[contador + 1];
                        }                    
                    }
                    if(lapis[i - 1][n]  == '*'){ //Adiciona cima
                        lapis[i - 1][n]  = numeros[contador + 1];
                    }
                    if(lapis[i + 1][n]  == '*'){ //Adiciona baixo
                        lapis[i + 1][n] = numeros[contador + 1];
                    }           
                }
              
            }
        }    
        if(contador != '9'){// quando contador for 9, os * devem ser substituidos apenas por 9
          contador++; //ai para o contador
        }    
    }

    for(int i = 0; i < N; i++){//for pra quant de linhas
        for(int n = 0; n < N; n++){//for pra quant de linhas
            printf("%c", lapis[i][n]); //PRINT DO VETOR N MODIFICADO
        }
        printf("\n");
    }
}