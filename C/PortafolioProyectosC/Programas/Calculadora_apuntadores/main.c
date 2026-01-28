#include <stdio.h>
#include <stdlib.h>

int main()
{
 //Calculadora
    int a,b,c;
    int *apuntador1,*apuntador2;

    printf("Digite un numero\n-->");
    scanf("%d",&a);
    printf("Digite otro numero\n-->");
    scanf("%d",&b);

    apuntador1=&a;
    apuntador2=&b;

    printf("\n");
    c=suma(*apuntador1,*apuntador2);
    printf("%d + %d = %d\n",*apuntador1,*apuntador2,c);

    c=resta(*apuntador1,*apuntador2);
    printf("%d - %d = %d\n",*apuntador1,*apuntador2,c);

    c=multiplicacion(*apuntador1,*apuntador2);
    printf("%d x %d = %d\n",*apuntador1,*apuntador2,c);

    if(*apuntador2==0){
        printf("No se puede dividir entre 0\n");
    }
    else{
        c=division(*apuntador1,*apuntador2);
        printf("%d / %d = %d\n",*apuntador1,*apuntador2,c);
    }

    return 0;
}

// implementa las funciones

int suma (int a, int b){
    int resultado=0;
    resultado = a + b;
    return resultado;
}

int resta(int a,int b){
    int resultado=0;
    resultado = a - b;
    return resultado;
}

int multiplicacion(int a,int b){
    int resultado=0;
    resultado = a * b;
    return resultado;
}
int division(int a,int b){
    int resultado=0;
    resultado = a / b;
    return resultado;
}
