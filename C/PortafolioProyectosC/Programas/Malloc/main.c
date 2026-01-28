#include <stdio.h>
#include <stdlib.h>

int main()
{
    int cant;
    printf("Ingrese el tamanio del array\n-->");
    scanf("%d",&cant);//Variable para definir el tamaño del array
    int* arr;//Apuntador
    arr=(int*)malloc(cant*sizeof(int));//Se apunta al primer valor de un array con memoria reservada;
                                        //malloc para reservas memoria; sizeof para tamaño de...;
    for(int i=0;i<cant;i++){
        printf("Ingrese un valor para e espacio %d\n-->",i);
        scanf("%d",&arr[i]);
    }

    printf("\nArray:");
    for(int i=0;i<cant;i++){
        printf("\t%d",arr[i]);
    }

    return 0;
}
