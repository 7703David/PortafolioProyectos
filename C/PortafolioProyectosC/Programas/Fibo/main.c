#include <stdio.h>
#include <stdlib.h>

int main()
{
      int n,x,y,z,cont;

    x=0;
    y=1;
    printf("Ingrese hasta cuantos numero desea conocer la serie de Fibonacci\n-->");
    scanf("%d",&n);
    printf("\n0\n1\n");

    for (cont=1;cont<=n;cont=cont+1)
    {
        z=x+y;
        printf("%d\n",z);
        x=y;
        y=z;
    }
    return 0;
}
