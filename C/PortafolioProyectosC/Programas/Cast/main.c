#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a=3,b=7;
    int c[5]={10,15,20,25,30};
    printf("Arreglo:{");
    for(int i=0;i<5;i++){
        printf("%d,",c[i]);
    }
    printf("}");
    intercambiar(&a,&b);
    printf("\nArreglo:{");
    for(int i=0;i<5;i++){
        printf("%d,",c[i]);
    }
    printf("}",);
    return 0;
}
void intercambiar(int *x,int *y){
    int aux;
    aux=*x;
    *x=*y;
    *y=aux;
}
