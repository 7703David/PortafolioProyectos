#include <stdio.h>
#include <stdlib.h>

struct datos{
char nombre[40];
char pais[25];
};

struct atleta{
    struct datos pers;
    int medallas;
    char deporte[30];
};

int main()
{
    struct atleta ats[10}];
    for(int i=0;i<10;i++){
        printf("Ingrese el nombre del atleta %d\n-->",i+1);
        scanf("%s",ats[i].pers.nombre);
        printf("Ingrese el pais del atleta %d\n-->",i+1);
        scanf("%s",ats[i].pers.pais);
        printf("Ingrese el numero de medallas del atleta %d\n-->",i+1);
        scanf("%d",&ats[i].medallas);
        printf("Ingrese el deporte del atleta %d\n-->",i+1);
        scanf("%s",ats[i].deporte);
        system("cls");
    }
    visualizar(ats);
    return 0;
}

void visualizar(struct atleta ats[10]){
    int mayor=0;
    for(int i=0;i<10;i++){
        if(ats[i].medallas>mayor){
            mayor=ats[i].medallas;
        }
    }
    for(int i=0;i<10;i++){
        if(mayor==ats[i].medallas){
            printf("Atleta con mas medallas es el atleta %d:\n",i+1);
            printf("\tNombre: %s\n",ats[i].pers.nombre);
            printf("\tPais: %s\n",ats[i].pers.pais);
            printf("\tMedallas: %d\n",ats[i].medallas);
            printf("\tDeporte: %s\n",ats[i].deporte);
        }
    }
}
