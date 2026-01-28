#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a, b, c, resta;
    printf("Digite un primer numero: ");
    scanf("%d",&a);
    printf("Digite un segundo numero: ");
    scanf("%d",&b);
    printf("Digite un tercer numero: ");
    scanf("%d",&c);
    if(a>b){
        if(a>c){
            if(b>c){
                printf("\nEl orden de mayor a menor es: \t%d\t%d\t%d\n\n",a,b,c);
            }
            else{
                printf("\nEl orden de mayor a menor es: \t%d\t%d\t%d\n\n",a,c,b);
            }
        }
        else{
            printf("\nEl orden de mayor a menor es: \t%d\t%d\t%d\n\n",c,a,b);
        }
    }
    else{
        if(a>c){
            printf("\nEl orden de mayor a menor es: \t%d\t%d\t%d\n\n",b,a,c);
        }
        else{
            if(b>c){
                printf("\nEl orden de mayor a menor es: \t%d\t%d\t%d\n\n",b,c,a);
            }
            else{
                printf("\nEl orden de mayor a menor es: \t%d\t%d\t%d\n\n",c,b,a);
            }
        }
    }

    return 0;
}
