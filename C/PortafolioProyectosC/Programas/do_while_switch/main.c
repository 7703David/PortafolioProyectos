#include <stdio.h>
#include <stdlib.h>

int main()
{
    int opc;
    char acep;

    printf("\t\tRESTAURANTE DONDE EL WILMER\n\n");

    do{
    printf("1. Pollo\n");
    printf("2. Chiguiro\n");
    printf("3. Cerdo\n");
    printf("4. Pescado\n");
    printf("\n");
    printf("Elija una opcion\n-->");

    scanf("%d",&opc);
    printf("\n");
    switch(opc){
        case 1:printf("Que disfrute el pollo\n");
        break;
        case 2:printf("Que disfrute el chiguiro\n");
        break;
        case 3:printf("Que disfrute el cerdo\n");
        break;
        case 4:printf("Que disfrute el pescado\n");
        break;
        default:printf("Eligio una opcion incorrecta\n");
        break;
        }

        printf("\nDesea pedir algo mas?(s/n)\n-->");
        setbuf(stdin,NULL);     //Limpiar el bafer del teclado
        scanf("%s",&acep);

        while(!(acep=='s'||acep=='n')){
            printf("ERROR, elija entre s para si y n para no\n-->");
            scanf("%s",&acep);
        }

    }while(acep=='s');

    getch();
    return 0;
}
