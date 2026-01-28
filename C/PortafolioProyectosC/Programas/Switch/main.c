#include <stdio.h>
#include <stdlib.h>

int main()
{
    int deporte;
    printf("Elija el numero de un deporte: \n\n\t1.Futbol \n\t2.Basketball \n\t3.Voleyball \n\t4.Natacion \n\t5.Tenis \n\t6.Ninguno");
    printf("\n-->");
    scanf("%d",&deporte);
    int razon;

    switch(deporte){
        case 1://FUTBOL
            printf("\nEligio este deporte(Futbol porque): \n\t1.Lo practica \n\t2.Lo ve \n3.descarte");
            printf("\n-->");
            scanf("%d",&razon);
            switch(razon){
                case 1:
                    printf("\nEl usuario eligio el futbol porque lo practica\n");
                break;
                case 2:
                    printf("\nEl usuario eligio el futbol porque lo ve\n");
                break;
                case 3:
                    printf("\nEl usuario eligio el futbol por descarte\n");
                break;
                default: printf("Ingreso una opcion incorrecta");
                break;
            }
        break;

        case 2://BASKETBALL
            printf("\nEligio este deporte(Basketball) porque: \n\t1.Lo practica \n\t2.Lo ve \n\t3.descarte");
            printf("\n-->");
            scanf("%d",&razon);
            switch(razon){
                case 1:
                    printf("\nEl usuario eligio el basketball porque lo practica\n");
                break;
                case 2:
                    printf("\nEl usuario eligio el basketball porque lo ve\n");
                break;
                case 3:
                    printf("\nEl usuario eligio el basketball por descarte\n");
                break;
                default: printf("Ingreso una opcion incorrecta");
                break;
            }
        break;

        case 3: //VOLEYBALL
            printf("\nEligio este deporte(Voleyball) porque: \n\t1.Lo practica \n\t2.Lo ve \n\t3.descarte");
            printf("\n-->");
            scanf("%d",&razon);
            switch(razon){
                case 1:
                    printf("\nEl usuario eligio el voleyball porque lo practica\n");
                break;
                case 2:
                    printf("\nEl usuario eligio el voleyball porque lo ve\n");
                break;
                case 3:
                    printf("\nEl usuario eligio el voleyball por descarte\n");
                break;
                default: printf("Ingreso una opcion incorrecta");
                break;
            }
        break;

        case 4: //NATACION
            printf("\nEligio este deporte(Natacion) porque: \n\t1.Lo practica \n\t2.Lo ve \n\t3.descarte");
            printf("\n-->");
            scanf("%d",&razon);
            switch(razon){
                case 1:
                    printf("\nEl usuario eligio la natacion porque lo practica\n");
                break;
                case 2:
                    printf("\nEl usuario eligio la natacion porque lo ve\n");
                break;
                case 3:
                    printf("\nEl usuario eligio la natacion por descarte\n");
                break;
                default: printf("Ingreso una opcion incorrecta");
                break;
            }
        break;

        case 5: //TENIS
            printf("\nEligio este deporte(Tenis) porque: \n\t1.Lo practica \n\t2.Lo ve \n\t3.descarte");
            printf("\n-->");
            scanf("%d",&razon);
            switch(razon){
                case 1:
                    printf("\nEl usuario eligio el tenis porque lo practica\n");
                break;
                case 2:
                    printf("\nEl usuario eligio el tenis porque lo ve\n");
                break;
                case 3:
                    printf("\nEl usuario eligio el tenis por descarte\n");
                break;
                default: printf("Ingreso una opcion incorrecta");
                break;
            }
        break;

        case 6: //NINGUNO
            printf("\nNo eligio un deportes porque: \n\t1.No le gustan los deportes \n\t2.Le gusta otro");
            printf("\n-->");
            scanf("%d",&razon);
            switch(razon){
                case 1:
                    printf("\nEl usuario no eligio un deporte porque no le gustan los deportes\n");
                break;
                case 2:
                    printf("\nEl usuario no eligio un deporte porque su deporte no esta dentro de las opciones\n");
                break;
                default: printf("Ingreso una opcion incorrecta");
                break;
            }
        break;

        default: printf("Ingreso una opcion incorrecta");
        break;
    }
    getch();
    return 0;
}
