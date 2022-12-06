#include <stdio.h>
#include <string.h>
#include <math.h>

int lerFuncionario(char *cargo, int *anosExperiencia, int *hContratadas, int *hTrabalhadas, int contador, int *hExtras);
int calcularSalario(char *cargo, int *anosExperiencia, int *hContratadas, int *hTrabalhadas, int contador, int *hExtras, float *salarioBruto, float *descontoINSS, float *descontoIR, float *salarioLiquido);
int imprimirFolhaPagamento(char *cargo, int *anosExperiencia, int *hContratadas, int *hTrabalhadas, int contador, int *hExtras, float *salarioBruto, float *descontoINSS, float *descontoIR, float *salarioLiquido);

int main(void){
    int quantidadeF, anosExperiencia, hContratadas, hTrabalhadas, contador = 0, hExtras;
    char cargo;
    float salarioBruto, descontoINSS, descontoIR, salarioLiquido;

    printf("Insira a quantidade de funcionarios: ");
    scanf("%d", &quantidadeF);

    // Chama as funções o msm número de vezes da quantidade de funcionarios
    do{
        contador++;
        lerFuncionario( &cargo, &anosExperiencia, &hContratadas, &hTrabalhadas, contador, &hExtras);
        calcularSalario(&cargo, &anosExperiencia, &hContratadas, &hTrabalhadas, contador, &hExtras, &salarioBruto, &descontoINSS, &descontoIR, &salarioLiquido);
        imprimirFolhaPagamento(&cargo, &anosExperiencia, &hContratadas, &hTrabalhadas, contador, &hExtras, &salarioBruto, &descontoINSS, &descontoIR, &salarioLiquido);
    } while( contador < quantidadeF);
}

// PEGA OS DADOS E CALCULA H EXTRA, SALARIO BRUTO E DESCONTOS INSS E IR
int lerFuncionario(char *cargo, int *anosExperiencia, int *hContratadas, int *hTrabalhadas, int contador, int *hExtras){
    // VALIDANDO AS ENTRADAS
    do{
        printf("Insira o cargo do funcionario %i (P, A ou G): ", contador);
        scanf("%s", &*cargo);        
    } while (*cargo != 'p' && *cargo != 'P' && *cargo != 'a' && *cargo != 'A' && *cargo != 'g' && *cargo != 'G');
    do{
        printf("Insira quantos anos de experiencia tem o funcionario %i: ", contador);
        scanf("%i", &*anosExperiencia);
    } while (*anosExperiencia < 0);
    do{
        printf("Insira quantas horas contratadas tem o funcionario %i: ", contador);
        scanf("%i", &*hContratadas);
    } while (*hContratadas < 0);
    do{
        printf("Insira quantas horas trabalhas tem o funcionario %i: ", contador);
        scanf("%i", &*hTrabalhadas);
    } while (*hTrabalhadas < 0);

    return 1;
}

//CALCULA SALARIO LIQUIDO
int calcularSalario(char *cargo, int *anosExperiencia, int *hContratadas, int *hTrabalhadas, int contador, int *hExtras, float *salarioBruto, float *descontoINSS, float *descontoIR, float *salarioLiquido){
    *hExtras = *hTrabalhadas - *hContratadas;
    
    // CALCULO DO SALÁRIO BRUTO
    if(*cargo == 'p' || *cargo == 'P'){
        // PROGRAMADOR
        if(*anosExperiencia >= 0 && *anosExperiencia <= 2){
            // CALCULANDO O SALARIO BRUTO
            if (*hTrabalhadas < *hContratadas){
                *salarioBruto = 25.00 * *hTrabalhadas;
            } else{
                *salarioBruto = 25.00 * *hContratadas;
            }

            //CALCULANDO HORAS EXTRAS
            if (*hExtras > 0 && *hExtras <= 13){
                *salarioBruto = *salarioBruto + (*hExtras * ( 25.00 * 1.23));

            } else if (*hExtras > 13 && *hExtras <= 22){
                *salarioBruto = *salarioBruto + (*hExtras * ( 25.00 * 1.37));
                
            } else if (*hExtras > 22){
                *salarioBruto = *salarioBruto + (*hExtras * ( 25.00 * 1.56));
            }

        } else if(*anosExperiencia >= 3 && *anosExperiencia <= 5){
            // CALCULANDO O SALARIO BRUTO
            if (*hTrabalhadas < *hContratadas){
                *salarioBruto = 30.00 * *hTrabalhadas;
            } else{
                *salarioBruto = 30.00 * *hContratadas;
            }
            
            //CALCULANDO HORAS EXTRAS
            if (*hExtras > 0 && *hExtras <= 13){
                *salarioBruto = *salarioBruto + (*hExtras * ( 30.00 * 1.23));

            } else if (*hExtras > 13 && *hExtras <= 22){
                *salarioBruto = *salarioBruto + (*hExtras * ( 30.00 * 1.37));
                
            } else if (*hExtras > 22){
                *salarioBruto = *salarioBruto + (*hExtras * ( 30.00 * 1.56));
            }

        } else if(*anosExperiencia > 5){
            // CALCULANDO O SALARIO BRUTO
            if (*hTrabalhadas < *hContratadas){
                *salarioBruto = 38.00 * *hTrabalhadas;
            } else{
                *salarioBruto = 38.00 * *hContratadas;
            }
            
           //CALCULANDO HORAS EXTRAS
            if (*hExtras > 0 && *hExtras <= 13){
                *salarioBruto = *salarioBruto + (*hExtras * ( 38.00 * 1.23));

            } else if (*hExtras > 13 && *hExtras <= 22){
                *salarioBruto = *salarioBruto + (*hExtras * ( 38.00 * 1.37));
                
            } else if (*hExtras > 22){
                *salarioBruto = *salarioBruto + (*hExtras * ( 38.00 * 1.56));
            }
        }

    } else if(*cargo == 'a' || *cargo == 'A'){
        // ANALISTA
        if(*anosExperiencia >= 0 && *anosExperiencia <= 2){
            // CALCULANDO O SALARIO BRUTO
            if (*hTrabalhadas < *hContratadas){
                *salarioBruto = 45.00 * *hTrabalhadas;
            } else{
                *salarioBruto = 45.00 * *hContratadas; 
            }
               
           //CALCULANDO HORAS EXTRAS
            if (*hExtras > 0 && *hExtras <= 13){
                *salarioBruto = *salarioBruto + (*hExtras * ( 45.00 * 1.23));

            } else if (*hExtras > 13 && *hExtras <= 22){
                *salarioBruto = *salarioBruto + (*hExtras * ( 45.00 * 1.37));
                
            } else if (*hExtras > 22){
                *salarioBruto = *salarioBruto + (*hExtras * ( 45.00 * 1.56));
            }
            
        } else if(*anosExperiencia >= 3 && *anosExperiencia <= 5){
            // CALCULANDO O SALARIO BRUTO
            if (*hTrabalhadas < *hContratadas){
                *salarioBruto = 55.00 * *hTrabalhadas;
            } else{
                *salarioBruto = 55.00 * *hContratadas;
            }
            
           //CALCULANDO HORAS EXTRAS
            if (*hExtras > 0 && *hExtras <= 13){
                *salarioBruto = *salarioBruto + (*hExtras * ( 55.00 * 1.23));

            } else if (*hExtras > 13 && *hExtras <= 22){
                *salarioBruto = *salarioBruto + (*hExtras * ( 55.00 * 1.37));
                
            } else if (*hExtras > 22){
                *salarioBruto = *salarioBruto + (*hExtras * ( 55.00 * 1.56));
            }
          
        } else if(*anosExperiencia > 5){
            // CALCULANDO O SALARIO BRUTO
            if (*hTrabalhadas < *hContratadas){
                *salarioBruto = 70.00 * *hTrabalhadas;
            } else{
                *salarioBruto = 70.00 * *hContratadas;
            }
            
           //CALCULANDO HORAS EXTRAS
            if (*hExtras > 0 && *hExtras <= 13){
                *salarioBruto = *salarioBruto + (*hExtras * ( 70.00 * 1.23));

            } else if (*hExtras > 13 && *hExtras <= 22){
                *salarioBruto = *salarioBruto + (*hExtras * ( 70.00 * 1.37));
                
            } else if (*hExtras > 22){
                *salarioBruto = *salarioBruto + (*hExtras * ( 70.00 * 1.56));
            }
          
        }
        
    } else if(*cargo == 'g' || *cargo == 'G'){
        //GERENTE
        if(*anosExperiencia >= 0 && *anosExperiencia <= 2){
            // CALCULANDO O SALARIO BRUTO
            if (*hTrabalhadas < *hContratadas){
                *salarioBruto = 85.00 * *hTrabalhadas;
            } else{
                *salarioBruto = 85.00 * *hContratadas;  
            }
              
           //CALCULANDO HORAS EXTRAS
            if (*hExtras > 0 && *hExtras <= 13){
                *salarioBruto = *salarioBruto + (*hExtras * ( 85.00 * 1.23));

            } else if (*hExtras > 13 && *hExtras <= 22){
                *salarioBruto = *salarioBruto + (*hExtras * ( 85.00 * 1.37));
                
            } else if (*hExtras > 22){
                *salarioBruto = *salarioBruto + (*hExtras * ( 85.00 * 1.56));
            }
                      
        } else if(*anosExperiencia >= 3 && *anosExperiencia <= 5){
            // CALCULANDO O SALARIO BRUTO
            if (*hTrabalhadas < *hContratadas){
                *salarioBruto = 102.00 * *hTrabalhadas;
            } else{
                *salarioBruto = 102.00 * *hContratadas;
            }
            
           //CALCULANDO HORAS EXTRAS
            if (*hExtras > 0 && *hExtras <= 13){
                *salarioBruto = *salarioBruto + (*hExtras * ( 102.00 * 1.23));

            } else if (*hExtras > 13 && *hExtras <= 22){
                *salarioBruto = *salarioBruto + (*hExtras * ( 102.00 * 1.37));
                
            } else if (*hExtras > 22){
                *salarioBruto = *salarioBruto + (*hExtras * ( 102.00 * 1.56));
            }
           
        } else if(*anosExperiencia > 5){
            // CALCULANDO O SALARIO BRUTO
            if (*hTrabalhadas < *hContratadas){
                *salarioBruto = 130.00 * *hTrabalhadas;
            } else{
                *salarioBruto = 130.00 * *hContratadas;
            }
            
           //CALCULANDO HORAS EXTRAS
            if (*hExtras > 0 && *hExtras <= 13){
                *salarioBruto = *salarioBruto + (*hExtras * ( 130.00 * 1.23));

            } else if (*hExtras > 13 && *hExtras <= 22){
                *salarioBruto = *salarioBruto + (*hExtras * ( 130.00 * 1.37));
                
            } else if (*hExtras > 22){
                *salarioBruto = *salarioBruto + (*hExtras * ( 130.00 * 1.56));
            }
          
        }
    }

    // CALCULANDO O DESCONTO DO INSS de 11%
    *descontoINSS = *salarioBruto * 0.11;

    // CALCULANDO O DESCONTO IR
    if(*salarioBruto > 0 && *salarioBruto <= 1500){
        *descontoIR = 0;

    } else if(*salarioBruto > 1500 && *salarioBruto <= 2700){
        *descontoIR = 0.15 * (*salarioBruto - *descontoINSS);

    } else if(*salarioBruto > 2700 && *salarioBruto <= 4200){
        *descontoIR = 0.20 * (*salarioBruto - *descontoINSS);

    } else if(*salarioBruto > 4200){
        *descontoIR = 0.30 * (*salarioBruto - *descontoINSS);

    }

    //CALCULANDO O SALARIO LIQUIDO
    *salarioLiquido = *salarioBruto - (*descontoINSS + *descontoIR);
}

//IMPRIME A FOLHA DE PAGAMENTO
int imprimirFolhaPagamento(char *cargo, int *anosExperiencia, int *hContratadas, int *hTrabalhadas, int contador, int *hExtras, float *salarioBruto, float *descontoINSS, float *descontoIR, float *salarioLiquido){
    if(*hExtras > 0){
        printf("Folha de Pagamento do Func. %i\n - Salario Bruto (R$): %.2f\n - Horas Excedentes (h): %ihr\n - Desconto INSS (R$): %.2f\n - Desconto IR (R$): %.2f\n - Salario Liquido (R$): %.2f\n", contador, *salarioBruto, *hExtras, *descontoINSS, *descontoIR, *salarioLiquido);        
    } else{
        printf("Folha de Pagamento do Func. %i\n - Salario Bruto (R$): %.2f\n - Desconto INSS (R$): %.2f\n - Desconto IR (R$): %.2f\n - Salario Liquido (R$): %.2f\n", contador, *salarioBruto, *descontoINSS, *descontoIR, *salarioLiquido);           
    }
}