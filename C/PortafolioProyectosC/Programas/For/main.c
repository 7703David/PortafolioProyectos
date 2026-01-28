#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a,b,c,i;
    printf("Digite un primer numero\n-->");
    scanf("%d",&a);
    printf("Digite un segundo numero\n-->");
    scanf("%d",&b);
    printf("Digite un tercer numero\n-->");
    scanf("%d",&c);

    printf("\n\tTABLA DE MULTIPLICAR del %d, %d y %d\n\n",a,b,c);
    for(i=1;i<=10;i++){
        printf("%d x %d = %d \t%d x %d = %d \t%d x %d = %d\n",a ,i , (a*i),b ,i , (b*i),c ,i , (c*i));
    }
    getch();
    return 0;
}
