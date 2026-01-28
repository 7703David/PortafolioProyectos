#include <stdio.h>
#include <stdlib.h>

int main()
{
    int f;
    printf("Ingrese cuantos numeros desea guardar en el arreglo: ");//Ingresa el tamaño del array
    scanf("%d",&f);
    int A[f];

    //ingresa las variables para cada espacio en el array
    for(int i=0;i<f;i++){
        printf("Ingrese numero para la posicion A[%d]:\n--> ",i);
        scanf("%d",&A[i]);
    }

    printf("\n");

    //Imprime el array
    for(int j=0;j<f;j++){
        printf("En la posicion A[%d] se guardo el numero= %d\n",j,A[j]);
    }

    // ORDENAMIENTO BURBUJA
    for (int j = 0; j < f - 1; j++) {
        for (int i = 0; i < f - 1 - j; i++) { // El -1 evita que el programa "explote"
            if (A[i] < A[i+1]) {
                int x = A[i];
                A[i] = A[i+1];
                A[i+1] = x;
            }
        }
    }
    printf("\nORDENADO DE MAYOR A MENOR: \n");
    //Imprime el array organizado
    for(int i=0;i<f;i++){
        printf("En la posicion A[%d] se guardo el numero= %d\n",i,A[i]);
    }
    system("pause");
    return 0;
}
