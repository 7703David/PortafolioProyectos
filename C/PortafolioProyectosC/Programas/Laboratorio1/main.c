#include <stdio.h>
#include <stdlib.h>
#include <string.h>
//David Diazgranados
int main()
{
    //Para primera parte=
    int tipo [3][2] ={{1000, 8000},{8000, 6000},{4000, 6000}};
    int soportes_tornillos [2][2] = {{16, 6},{12, 4}};
    int opc=0;
    char continuar;

    //menu
    do{
        printf("Selecciones que punto desea visualizar?\n1.primera parte\n2.segunda parte\n-->");
        scanf("%d",&opc);
        while(opc<1||opc>2){
            printf("EEROR.\nSelecciones que punto desea visualizar?\n1.primera parte\n2.segunda parte");
            scanf("%d",&opc);
        }
        switch(opc){
            case 1:
                punto1(tipo, soportes_tornillos);
                break;
            case 2:
                punto2();
                break;
        }
        printf("Desea repetir el menu?\npara si teclee(s/S)\npara no teclee letra\n-->");
        scanf("%s",&continuar);
    }while(continuar=='s'||continuar=='S');
    return 0;
}

void punto1(int tipo[3][2], int soportes_tornillos[2][2]){

    printf("\t\t\t\t\t\tPUNTO 1\n\n");

    char estanteria[3]= {'A', 'B', 'C'};

//punto a
printf("a)\n");
    printf("Modelos de estanterias:\n");
    for(int i = 0; i < 3; i++){
        printf("Modelo de estanteria %c: ",estanteria[i]);
        for(int j = 0; j < 2; j++){
            if(j==0){
                printf("%d grandes - ",tipo[i][j]);
            }
            else{
                printf("%d pequenios\t",tipo[i][j]);
            }
        }
        printf("\n");
    }
    printf("\n");

    printf("Estanterias: \n");
    for(int i = 0; i < 2; i++){
        if(i==0){
            printf("Grandes:");
        }
        else{
            printf("Pequenios:");
        }
        for(int j = 0; j < 2; j++){
            if(j==0){
                printf("\t%d tornillos - ",soportes_tornillos [i][j]);
            }
            else{
                printf("\t%d soportes\t",soportes_tornillos [i][j]);
            }
        }
        printf("\n");
    }
    printf("\n");

    int total_tornillos, total_soportes;
//punto b
printf("b)\n");
    printf("CANTIDAD DE TORNILLOS Y SOPORTES\n");

    for(int i = 0; i < 3; i++){
        printf("\nEstanterias %c:\n", estanteria[i]);
        total_tornillos = 0;
        total_soportes = 0;
        for(int j = 0; j < 2; j++){

            int grandes = soportes_tornillos[j][0];
            int pequenios = soportes_tornillos[j][1];

            total_tornillos += tipo[i][j]*grandes;
            total_soportes += tipo[i][j]*pequenios;
        }
        printf("\tTotal tornillos: %d\t + \tTotal soportes: %d\t = \tTotal piezas: %d\n", total_tornillos, total_soportes, (total_tornillos+total_soportes));
    }
}



void punto2(){

int ventasEmpleadoOficinaEdificio[6][10][2];
    for(int i = 0; i < 6; i++){
        for(int j = 0; j < 10; j++){
            for(int k = 0; k < 2; k++){
                ventasEmpleadoOficinaEdificio[i][j][k] = rand() % 10000;
            }
        }
    }

    printf("\t\t\t\t\t\tPUNTO 2\n\n");

    int cont = 0;

    for(int i = 0; i < 6; i++){
        for(int j = 0; j < 10; j++){
            for(int k = 0; k < 2; k++){
                ventasEmpleadoOficinaEdificio[i][j][k] += 10;
                cont ++;
            }
        }
    }

    printf("\n\t\tPREGUNTAS\n");
    printf("a)\n\tLo componen:%d celdas\n", cont);
    printf("\nb)\n\tImprime 0\n");
    printf("\nc)\n");


    for(int i = 0; i < 6; i++){
        for(int j = 0; j < 10; j++){
            for(int k = 0; k < 2; k++){
                printf("\tEl empleado %d de la oficina %d del edificio %d ha vendido %d unidades\n", i+1,j+1,k+1,ventasEmpleadoOficinaEdificio[i][j][k]);
            }
        }
    }
}
