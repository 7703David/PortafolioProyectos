#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n, fact=1;

    printf("Ingresa el numero al cual le desea calcular su factorial: \n");
    scanf("%d",&n);

    for (int i=1; i<=n;i++){
        fact*=i;
    }
    printf("El factorial de %d es: %d\n", n, fact);

    return 0;
}

