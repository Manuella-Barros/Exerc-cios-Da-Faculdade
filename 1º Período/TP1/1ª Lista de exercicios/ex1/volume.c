#include <stdio.h>
#include <locale.h>

int calculoVolume();

int main (){
    setlocale(LC_ALL,"Portuguese");
    int lado;

    printf("Qual o valor do lado do cubo? ");
    scanf("%d", &lado);

    calculoVolume(lado);

    printf("O volume será %d\n", calculoVolume(lado));

}

int calculoVolume(int lado){
    return lado*lado*lado;

}

/*
int calculoVolume(int lado){
    int volume;
    volume = lado*lado*lado;
    printf("O volume ser�%d\n", volume);
}
*/