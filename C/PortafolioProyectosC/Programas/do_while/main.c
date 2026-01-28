#include <stdio.h>
#include <stdlib.h>

int main()
{
    int dinero, cervezas, precio_cerveza, i;
    cervezas=1;
    precio_cerveza = 3000;
    printf("Cuanto dinero tienes?\n");
    scanf("%d", &dinero);

    do{
        dinero=dinero - precio_cerveza;
        printf(" Pido %d cervezas    Me queda $%d\n", cervezas++,  dinero);
    } while(dinero > 5000);

    printf(" Tachak, ya se tomo %d cervezas, eche pa la casa\n",(cervezas-1));

    return 0;
}
