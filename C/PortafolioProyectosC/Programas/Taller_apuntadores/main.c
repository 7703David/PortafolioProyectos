#include <stdio.h>
#include <stdlib.h>

void pro(int *a, int *b , int *c);
int aa, bb, cc, *apuntador1, *apuntador2, *apuntador3;
main(){
    apuntador1=&aa;
    apuntador2=&bb;
    apuntador3=&cc;
    printf("Introduce el valor de a:");
    scanf("%d",&aa);
    printf("Introduce el valor de b:");
    scanf("%d",&bb);
    printf("Introduce el valor de c:");
    scanf("%d",&cc);
    printf("\nVariables: \ta=%d, b=%d, c=%d",aa, bb, cc);
    pro(&aa,&bb,&cc);
    printf("\nAapuntadores: \ta=%d, b=%d, c=%d",*apuntador1,*apuntador2,*apuntador3);
    pro(apuntador1, apuntador2, apuntador3);
}

void pro(int *a, int *b, int *c){//funcion que ordena los números ingresados por el usuario de menor a mayor
    printf("\nOrdenado:");
    if(*a<*b && *b<*c){
        printf("%d,%d,%d",*apuntador1,*apuntador2,*apuntador3);
    }
    else if(*a<*c && *c<*b){
        printf("%d,%d,%d",*apuntador1,*apuntador3,*apuntador2);
    }
    else if(*b<*a && *a<*c){
        printf("%d,%d,%d",*apuntador2,*apuntador1,*apuntador3);
    }
    else if(*b<*c && *c<*a){
        printf("%d,%d,%d",*apuntador2,*apuntador3,*apuntador1);
    }
    else if(*c<*a&& *a<*b){
        printf("%d,%d,%d",*apuntador3,*apuntador1,*apuntador2);
    }
    else if(*c<*b&& *b<*a){
        printf("%d,%d,%d",*apuntador3,*apuntador2,*apuntador1);
    }
    printf("\n");
}
