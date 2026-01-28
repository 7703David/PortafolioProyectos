#include <stdio.h>
#include <stdlib.h>

int main()
{
    int m=6;
    int v[m];
    int j,i,aux;
    for(i=0;i<m;i++){
        printf("Ingrese el valor para el espacio %d: ",i);
        scanf("%d",&v[i]);
    }

    //ORDEN ORIGINAL DEL ARRAY
    printf("\nORIGINAL:\n");
    for(i=0;i<m;i++){
        printf("\t%d",v[i]);
    }
    printf("\n");

    //ORDEN ASCENDENTE DEL ARRAY
    printf("\nORDENADO DE FORMA ASCENDENTE:\n");
    for(i=0;i<(m-1);i++){
        //Comparaciones
        for(j=0;j<(m-1)-i;j++){
            //Intercambiar elementos
            if(v[j]>v[j+1]){
                aux=v[j];
                v[j]=v[j+1];
                v[j+1]=aux;
            }
        }
    }
    for(i=0;i<m;i++){
        printf("\t%d",v[i]);
    }
    printf("\n");

    //ORDEN DESCENDENTE ARRAY
    printf("\nORDENADO DE FORMA DESCENDENTE:\n");
    for(i=0;i<(m-1);i++){
        //Comparaciones
        for(j=0;j<(m-1)-i;j++){
            //Intercambiar elementos
            if(v[j]<v[j+1]){
                aux=v[j];
                v[j]=v[j+1];
                v[j+1]=aux;
            }
        }
    }
    for(i=0;i<m;i++){
        printf("\t%d",v[i]);
    }
    printf("\n");


    getch();
    return 0;
}
