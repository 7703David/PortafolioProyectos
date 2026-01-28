#include <stdio.h>
#include <stdlib.h>

int main()
{
    int A[5];
    int B[5];
    int C[5];

    printf("VALORES VECTOR A\n");
    for(int i=0;i<5;i++){
        printf("Digite el %d-esimo numero:\n",i);
        scanf("%d",&A[i]);
    }
    printf("VALORES VECTOR B\n");
    for(int i=0;i<5;i++){
        printf("Digite el %d-esimo numero:\n",i);
        scanf("%d",&B[i]);
    }
    printf("VALORES VECTOR C=A+B:\n");
    for(int i=0;i<5;i++){
        C[i]=A[i]+B[i];
    }
    printf("\nCONTENIDO DEL VECTOR A:\n");
    for(int i=0;i<5;i++){
        printf("A[%d] = %d\t",i,A[i]);
    }
    printf("\nCONTENIDO DEL VECTOR B:\n");
    for(int i=0;i<5;i++){
        printf("B[%d] = %d\t",i,B[i]);
    }
    printf("\nCONTENIDO DEL VECTOR C:\n");
    for(int i=0;i<5;i++){
        printf("C[%d] = %d\t",i,C[i]);
    }
    printf("\n");
    return 0;
}
