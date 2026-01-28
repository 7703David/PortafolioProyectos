#include <stdio.h>
#include <stdlib.h>

int main()
{
    int A[3][3],B[3][3],C[3][3],D[3][3],i,j;

    printf("MATRIZ A:\n");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("Ingrese un valor para A[%d][%d]:\n",i,j);
            scanf("%d",&A[i][j]);
        }
    }
    printf("\nMATRIZ B:\n");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("Ingrese un valor para B[%d][%d]:\n",i,j);
            scanf("%d",&B[i][j]);
        }
    }
    printf("\nMATRIZ C=A+B\n");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
                printf("C[%d][%d] = A[%d][%d]+B[%d][%d] = %d+%d = %d\n",i,j,i,j,i,j,A[i][j],B[i][j],(A[i][j]+B[i][j]));
            C[i][j]=A[i][j]+B[i][j];
        }
    }
    printf("\nMATRIZ D=A-B\n");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
                printf("D[%d][%d] = A[%d][%d]-B[%d][%d] = %d-%d = %d\n",i,j,i,j,i,j,A[i][j],B[i][j],(A[i][j]-B[i][j]));
            D[i][j]=A[i][j]-B[i][j];
        }
    }
    printf("\nVALORES MATRIZ A:\n");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("\t%d",A[i][j]);
        }
        printf("\n");
    }
    printf("\nVALORES MATRIZ B:\n");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("\t%d",B[i][j]);
        }
        printf("\n");
    }
    printf("\nVALORES MATRIZ C=A+B:\n");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("\t%d",C[i][j]);
        }
        printf("\n");
    }
    printf("\nVALORES MATRIZ D=A-B:\n");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("\t%d",D[i][j]);
        }
        printf("\n");
    }
    return 0;
}
