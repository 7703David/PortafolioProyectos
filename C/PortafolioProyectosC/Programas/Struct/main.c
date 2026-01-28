#include <stdio.h>
#include <stdlib.h>

struct carrera{
    char nombre_u[20];
    char nombre[40];
    int semestres;
    int profesores;
    int materias;
    }sistemas,publicidad,industrial;//si se declara en esta parte son las unicas variables que se pueden usar durante el programa
    //struct estudiante_ingenieria sistemas,publicidad,industrial; De esta maner se pueden declarar más a lo largo del programa

struct estudiente{
    char nombre[20];
    char apellidos[40];
    char ciudadania[10];
    int edad;
    char facultad[40];
    int semestre;
};

struct profesor{
    char nombre[20];
    char apellidos[40];
    char ciudadania[10];
    int edad;
    char facultad[40];
    };

int main()
{
    struct carrera sistemas={"UNIVERSIDAD CENTRAL","Ingenieria de sistemas",10,30,54};
    struct carrera publicidad={"UNIVERSIDAD CENTRAL","Publicidad",10,35,50};
    struct carrera industrial={"UNIVERSIDAD CENTRAL","Ingeniera industrial",10,40,45};
    visualizar_carrera(sistemas,publicidad,industrial);
    return 0;
}
void visualizar_carrera(struct carrera sistemas, struct carrera publicidad, struct carrera industrial){
    printf("Universidad: %s\n",sistemas.nombre_u);
    printf("carrera: %s\n",sistemas.nombre);
    printf("Numero de semestres: %d\n",sistemas.semestres);
    printf("Numero de profesores: %d\n",sistemas.profesores);
    printf("numero de materias: %d\n",sistemas.materias);
    printf("\n");

    printf("Universidad: %s\n",publicidad.nombre_u);
    printf("carrera: %s\n",publicidad.nombre);
    printf("Numero de semestres: %d\n",publicidad.semestres);
    printf("Numero de profesores: %d\n",publicidad.profesores);
    printf("numero de materias: %d\n",publicidad.materias);
    printf("\n");

    printf("Universidad: %s\n",industrial.nombre_u);
    printf("carrera: %s\n",industrial.nombre);
    printf("Numero de semestres: %d\n",industrial.semestres);
    printf("Numero de profesores: %d\n",industrial.profesores);
    printf("numero de materias: %d\n",industrial.materias);
}

