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
    scanf("%s",fijo.nombres);//NO es necesario agregar el & porque la direccion del array es su propio nombre
    printf("Apellido: ");
    scanf("%s",fijo.apellidos);
    printf("Edad: ");
    scanf("%d",&fijo.edad);
    printf("Puesto: ");
    scanf("%s",fijo.puesto);

    visualizar(fijo);

    return 0;
}
void visualizar(struct trabajador *datos){
    printf("\nTRABAJADOR:\n");
    printf("Nombres: %s\n",datos->nombres);
    printf("Apellidos: %s\n",datos->apellidos);
    printf("Edad: %d\n",datos->edad);
    printf("Puesto: $s\n",datos->puesto);
}
