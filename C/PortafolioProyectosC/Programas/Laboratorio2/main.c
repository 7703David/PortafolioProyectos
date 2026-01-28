#include <stdio.h>
#include <stdlib.h>

struct jugador{
    char nombre[40];
    int estatura;
    int edad;
};

int main()
{
    struct jugador lista[10];
    for(int i=0;i<10;i++){
        printf("Ingrese el nombre del jugador\n-->");
        scanf("%s",lista[i].nombre);
        printf("Ingrese la edad del jugador\n-->");
        scanf("%d",&lista[i].edad);
        while(lista[i].edad<3||lista[i].edad>90){
            printf("ERROR. Ingrese la edad del jugador\n-->");
            scanf("%d",&lista[i].edad);
        }
        printf("Ingrese la estatura del jugador\n-->");
        scanf("%d",&lista[i].estatura);
        while(lista[i].estatura<100||lista[i].estatura>230){
            printf("ERROR. Ingrese la edad del jugador\n-->");
            scanf("%d",&lista[i].estatura);
        }
    }
    visualizar(lista);
    return 0;
}
void visualizar(struct jugador lista[10]){
    int opc;
    char continuar;
    do{
        printf("Desea:\n1.Ver nombre del jugador\n2.Ver la edad del jugador\n3.Ver la estatura del jugador\n-->");
        scanf("%d",&opc);
        switch(opc){
        case 1:
            for(int i=0;i<10;i++){
             printf("\nEl nombre del jugador %d es: %s\n",i,lista[i].nombre);
            }
            break;
        case 2:
            for(int i=0;i<10;i++){
               printf("\nLa edad del jugador %d es: %d anios\n",i,lista[i].edad);
            }
            break;
        case 3:
            for(int i=0;i<10;i++){
             printf("\nLa estatura del jugador %d es: %d cm\n",i,lista[i].estatura);
            }
            break;
        }
        printf("\nDesea volver a ver el menu?\n-S o s para si\n-para no teclee cualquier letra\n");
        scanf("%s",&continuar);
    }while(continuar=='s'||continuar=='S');
}
