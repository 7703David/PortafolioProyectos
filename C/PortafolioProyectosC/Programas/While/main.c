#include <stdio.h>
#include <stdlib.h>

int main()
{
    int pasajes=0,dinero=0;
    int precioP=2650;
    printf("\t\tBienevenido a Transmilenio\n");
    printf("\tEl pasaje de transmilenio cuesta: $%d\n",precioP);

    printf("Cuanto dinero tiene recargado en la tarjeta?\n-->");
    scanf("%d",&dinero);
    printf("\n");

    while(dinero>=precioP){
        dinero = dinero - precioP;
        pasajes++;
        printf("Cervezas pedidas: %d \t/\tDinero disponible: $%d\n",pasajes,dinero);
    }
    printf("\nLe alcanzo para %d pasajes",pasajes);

    if(dinero>0){
        printf("\n!No alcanza para otro pasaje, pero le quedan: $%d",dinero);
        printf("\nPara completar un pasaje debe recargar $%d\n",precioP-dinero);
    }
    else{
        printf("\nPara completar un pasaje debe recargar $%d\n",precioP);
    }
    getch();
    return 0;
}
