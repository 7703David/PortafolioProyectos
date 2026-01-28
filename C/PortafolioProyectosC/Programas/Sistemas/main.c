#include <stdio.h>
#include <stdlib.h>

// Prototipado de funciones
int suma(double a, double b);
int resta(double a, double b);
double divi(double a, double b);
double multi(double a, double b);

int main()
{
 //Calculadora
    int a,b,c;
    int opc;
    char seguir;
    do{
        printf("Digite un numero\n-->");
        scanf("%d", &a);

        printf("Digite otro numero\n-->");
        scanf("%d", &b);

        printf("\n");
        //llamar a la funciones
        printf("Ingrese una opción: \n1.Sumar\n2.Restar\n3.Multiplicacion\n4.Division\n-->");
        scanf("%d",&opc);
        switch(opc){
            case 1://Suma
                printf("\t%d + %d = %d\n", a, b, suma(a,b) );
                break;
            case 2:
                printf("\t%d - %d = %d\n", a, b, resta(a,b));
                break;
            case 3:
                printf("\t%d x %d = %d\n",a,b,(a*b));
                break;
            case 4:
                if(b!=0){
                    printf("\t%d / %d = %.2f\n", a, b, divi(a,b));
                }
                else{
                    printf("No se puede dividir entre 0\n");
                }
                break;
            default:
                printf("Opcion no valida");
                break;
        }

        printf("\n");

        printf("Desea volver a operar?(s/n)\n-->");
        scanf("%s",&seguir);
        while(!(seguir=='s'||seguir=='n'||seguir=='S'||seguir=='N')){
            printf("ERROR, ingrese (s)o(S) para SI y (n)o(N) para NO\n-->");
            scanf("%c",&seguir);
        }
        printf("\n");
        }while(seguir=='s'||seguir=='S');

    return 0;
}

// implementacion de funciones
int suma (double a, double b){
    int res=0;
    res = a + b;
    return res;
}
int resta(double a, double b){
    int res=0;
    res = a - b;
    return res;
}
double divi(double a,double b){
    double res=0;
    res= (a / b);
    return res;
}
double multi(double a,double b){
    double res=a*b;
    return res;
}
