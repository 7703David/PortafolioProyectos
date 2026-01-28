#include <stdio.h>
#include <stdlib.h>

// Prototipado de funciones
int suma(int a, int b);

int main()
{


 //Calculadora
  int a, b, c, d;

  printf("Digite un numero\n");
  scanf("%d", &a);

  printf("Digite otro numero\n");
  scanf("%d", &b);

  // resta
  c = a - b;
  printf(" %d - %d = %d\n", a, b, c );

  //multiplicacion
  c = a * b;
  printf(" %d * %d = %d\n", a, b, c );

  //division
  if (b != 0){
  c = a / b;
  printf(" %d / %d = %d\n", a, b, c );
  }
  else {
    printf("No se puede dividir entre Cero\n");
  }

  c = suma (a, b);  //llamar a la funciones
  printf(" %d + %d = %d\n", a, b, c );

    return 0;
}

// implementa la funcion suma

int suma (int a, int b){
    int res=0;
    // suma
    res = a + b;

    return res;

}
