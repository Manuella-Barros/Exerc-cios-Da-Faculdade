#include <stdio.h>

int main(void){
    float p1, p2, p2ch, media, pf;

    printf("Insira a nota da p1 e p2 do aluno, se ele faltou digite -1 => ");
    scanf("%f", &p1);
    scanf("%f", &p2);

    if(p1 != -1 && p2 != -1){ //calculo para se n faltou nenhuma
        media = (p1 + p2) / 2; 
    
    } else if(p1 == -1 && p2 != -1){ //calculo para segunda chamada da p1
        printf("Insira a nota da segunda chamada da p1 desse aluno ");
        scanf("%f", &p2ch);
        
        if(p2ch != -1){ //calculo para caso tenha faltado a segunda chamada da p1
            media = (p2 + p2ch) / 2;
        } else{
            media = p2 / 2;
        }
        
    } else if(p2 == -1 && p1 != -1){ //calculo para segunda chamada da p2
        printf("Insira a nota da segunda chamada da p2 desse aluno ");
        scanf("%f", &p2ch);

        if(p2ch != -1){ //calculo para caso tenha faltado a segunda chamada da p2
            media = (p1 + p2ch) / 2;
        } else{
            media = p1 / 2;
        }
        
    } else if(p2 == -1 && p1 == -1){ // calculo caso tenha faltado as 2 provas
        printf("Insira a nota da segunda chamada desse aluno ");
        scanf("%f", &p2ch);

        if(p2ch != -1){
            media = p2ch / 2;    
        } else{
            media = 0; // calculo caso tenha faltado tudo
        }
    }

    // pra ver se passou ou nao
    if(media >= 7){
        printf("Aprovado");
    } else if(media < 4){
        printf("Reprovado");
    } else{
        printf("Insira a nota da pf desse aluno ");
        scanf("%f", &pf);
        media = (media + pf) / 2;

        if(media == -1){
            media = media / 2;
        }

        if(media >= 5){
            printf("Aprovado");
        } else{
            printf("Reprovado");
        }
    }
    printf("\nmedia = %.2f", media);
}