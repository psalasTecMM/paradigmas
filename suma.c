#include<stdio.h>

int suma(int a, int b){
    return a + b;
}

int main(){
    char resultado=1;
    for(int i = 0; i<100; i++){
        resultado = suma(i,resultado);
    }
    printf("El resultado de la suma es: %d\n",resultado);
    return 0;
}