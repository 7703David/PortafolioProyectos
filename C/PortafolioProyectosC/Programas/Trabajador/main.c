#include <stdio.h>
#include <stdlib.h>

typedef struct{//TYPEDEF al establecer data al final no es necesario usar (struct trabajador)
    int codigo;
    char nombre[20];
    char apellido[40];
    int edad;
}data;
int main()
{
    //struct trabajador=data
    data fijo[20]={{0,"Maria","Diaz",23},{1,"Juan","Parra",20},{2,"Jaime","Arias",21},{3,"Juan","Diaz",18},{4,"Karen","fort",19},{5,"Mario","Smith",25},
    {6,"Maria","Paez",22},{7,"Juan","Ariel",27},{8,"Jaime","Perez",23},{9,"Juan","Botia",27},{10,"Carlos","Lagos",26},{11,"que","Arias",21},{12,"Maria","Villa",18},
    {13,"Juan","Paez",20},{14,"Jaime","Arias",21},{15,"Juan","Lara",19},{16,"Karen","Botia",23},{17,"Mario","Smith",20},{18,"Maria","Villa",25},{19,"Juan","Parra",24}};;
    visualizar(fijo);
    return 0;
}
visualizar(data fijo[20]){
    for(int i=0;i<20;i++){
        printf("Codigo: %d\tNombre: %s\t\tApellido: %s\t\tEdad: %d\n",fijo[i].codigo,fijo[i].nombre,fijo[i].apellido,fijo[i].edad);
    }
}
