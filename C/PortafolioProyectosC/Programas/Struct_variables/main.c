#include <stdio.h>
#include <stdlib.h>

struct trabajador{
        char nombres[20];
        char apellidos[40];
        int edad;
        char puesto[20];
}fijo;

int main()
{
    struct trabajador fijo;
    printf("Nombre: ");
    scanf("%s",&fijo.nombres);
    printf("Apellido: ");
    scanf("%s",&fijo.apellidos);
    printf("Edad: ");
    scanf("%d",&fijo.edad);
    printf("Puesto: ");
    scanf("%s",&fijo.puesto);

    visualizar(fijo);

    return 0;
}

void visualizar(struct trabajador fijo){
    printf("\n\tTRABAJADOR:\n");
    printf("Nombres: %s\n",fijo.nombres);
    printf("Apellidos: %s\n",fijo.apellidos);
    printf("Edad: %d\n",fijo.edad);
    printf("Puesto: %s\n",fijo.puesto);
}
