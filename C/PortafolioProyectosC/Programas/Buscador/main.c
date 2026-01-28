#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main()
{
    char continuar;
    do{
        char palabra[10];

        palabra[0]='m';
        palabra[1]='u';
        palabra[2]='r';
        palabra[3]='c';
        palabra[4]='i';
        palabra[5]='e';
        palabra[6]='l';
        palabra[7]='a';
        palabra[8]='g';
        palabra[9]='o';

        char objetivo;
        int pos;
        bool bandera = true;

        printf("La palabra es: ");
        for(int i=0;i<10;i++){
            printf("%c",palabra[i]);
        }
        printf("\n");

        printf("Ingrese una letra de la palabra que desee saber la posicion\n-->");
        scanf("%s",&objetivo);
        printf("\n");

        for(int i=0;i<10;i++){
            if(palabra[i]==objetivo){
                pos=i+1;
                bandera = false;
            }
        }
        if(bandera==true){
            printf("La letra '%c' NO esta en la palabra '");
            for(int i=0;i<10;i++){
                printf("%c",palabra[i]);
            }
            printf("'\n");
        }
        else{
            printf("La letra '%c' esta en la pocicion: %d\n",objetivo,pos);
        }

        printf("\n");
        printf("Desea continuar?(s/n)\n-->");
        scanf("%s",&continuar);
        while(!(continuar=='s'||continuar=='S'||continuar=='n'||continuar=='N')){
            printf("ERROR, ingrese: \n's' o 'S' para (SI) \n(n) o (N) para (NO)\n-->");
            scanf("%c",&continuar);
        }
        printf("\n");
    }while(continuar=='s'||continuar=='S');

    return 0;
}
