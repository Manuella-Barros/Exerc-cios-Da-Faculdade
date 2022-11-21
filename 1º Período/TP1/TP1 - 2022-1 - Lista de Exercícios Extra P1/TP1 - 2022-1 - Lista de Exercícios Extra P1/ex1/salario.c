#include <stdio.h>

float calculoSalario(int *ganhoH, int *hTrabalhada, float *salarioLiquido, float *salarioBruto, float *INSS, float *IR, float *sindicato);

int main(void){
    int ganhoH, hTrabalhada;
    float salarioLiquido, salarioBruto, INSS, IR, sindicato;

    printf("Quanto por hora o funcionario ganha? ");
    scanf("%i", &ganhoH);
    printf("Quantas horas esse funcionario trabalhou no mes? ");
    scanf("%i", &hTrabalhada);
    
    calculoSalario(&ganhoH, &hTrabalhada, &salarioLiquido, &salarioBruto, &INSS, &IR, &sindicato);

    printf("salarioBruto = %.2f\n", salarioBruto);
    printf("Inss = %.2f\n", INSS);
    printf("IR = %.2f\n", IR);
    printf("sindicato = %.2f\n", sindicato);
    printf("salarioLiquido = %.2f\n", salarioLiquido);
    

}

float calculoSalario(int *ganhoH, int *hTrabalhada, float *salarioLiquido, float *salarioBruto, float *INSS, float *IR, float *sindicato){
    *salarioBruto = *ganhoH * *hTrabalhada;
    *INSS = 0.08 * *salarioBruto;
    *IR = 0.15 * (*salarioBruto - *INSS);
    *sindicato = 0.02 * (*salarioBruto - *INSS);
    *salarioLiquido = *salarioBruto - (*INSS + *IR + *sindicato);
}