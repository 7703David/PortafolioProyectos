#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

struct empleado{
    char nombre[20];
    char sexo;
    double sueldo;
};

int main()
{
    int n,i,sueldo_mayor,sueldo_menor;
    int mayor=0.0, menor=100000000;
    printf("Ingrese el numero de empleados\n-->");
    scanf("%d",&n);
    struct empleado datos[n];
    for(int i=0;i<n;i++){
        printf("Ingrese el nombre del empleado %d: \n-->",i+1);
        scanf("%s",datos[i].nombre);
        printf("EL genero del empleado %d es masculino?S o s para si, cualquier otra letra para no\n-->",i+1);
        scanf("%s",&datos[i].sexo);
        printf("Ingrese el sueldo del empleado %d: \n-->$",i+1);
        scanf("%d",&datos[i].sueldo);
    }
    for(i=0;i<n;i++){
        printf("\nEl nombre del empleado %d es: %s\n",i+1,datos[i].nombre);
        if(datos[i].sexo=='S'||datos[i].sexo=='s'){
                printf("El genero empleado %d es: masculino\n",i+1);
        }
        else{
            printf("El genero empleado %d es: femenino\n",i+1);
        }
        printf("El sueldo del empleado %d es: $%d\n",i+1,datos[i].sueldo);
    }
    for(i=0;i<n;i++){
        if(datos[i].sueldo>mayor) {
            mayor=datos[i].sueldo;
            sueldo_mayor=i;
        }
        if(datos[i].sueldo<menor){
            menor=datos[i].sueldo;
            sueldo_menor=i;
        }
    }

    printf("\n\nEl trabajador con mayor salario es %s \n",datos[sueldo_mayor].nombre);
    printf("El trabajador con menor salario es %s\n",datos[sueldo_menor].nombre);
    return 0;
}

