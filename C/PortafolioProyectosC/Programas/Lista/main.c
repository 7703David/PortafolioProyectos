#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

struct persona{
	int edad;
	char *nombre;
	struct persona *siguiente;
};

typedef struct persona Nodo;

Nodo *cabeza = NULL;
Nodo *actual = NULL;

char* getStr();
void clearBuffer();
int getedad();

void insertar();
void eliminar();
void CrearRaiz();
void ContarNodos();
void ImprimirLista();

int main(){
	return menu();
}

void insertar(){

	Nodo *nodo = (struct persona*)malloc(sizeof(struct persona));

	if(NULL == nodo){
    	printf("\n Error en creacion de nodo \n");
	}

	nodo->edad = getedad();
	clearBuffer();
	nodo->nombre=getStr();
	nodo->siguiente = cabeza;
	cabeza = nodo;

}

void eliminar(){

	if(NULL == cabeza){
        	printf("La pila esta vacia \n");
	}else{
    	printf("\nElemento Top Removedado\n");
    	Nodo *nodo = cabeza;
    	printf("\n edad: %d ",nodo->edad);
    	printf("Nombre: %s \n", nodo->nombre);

    	cabeza=nodo->siguiente;
    	free(nodo);
	}

}

void ImprimirLista(voedad){

	if(NULL == cabeza){
    	printf("La pila esta vacia \n");
	}else{
    	Nodo *nodo = cabeza;
    	printf("\nInicio de la Pila\n");

    	while(nodo != NULL)
    	{
        	printf("\nEdad: %d ",nodo->edad);
        	printf("Nombre: %s \n", nodo->nombre);
        	nodo = nodo->siguiente;
    	}

    	printf("\nFinal de la Pila\n");

	}

}

void ContarNodos(voedad){
	Nodo *nodo = cabeza;
	int i=0;

	while(nodo != NULL){
    	i++;
    	nodo = nodo->siguiente;
	}

	printf("\n Cantidad de nodos: %d\n", i);

	return;
}

int getedad() {
  int num;
  printf("\n Ingrese el edad: ");
  scanf("%d" , &num);
  return num;
}

char* getStr() {
  char d,*newAr;

  int i = 0;

  newAr = (char*) malloc(sizeof(char)*100);

  printf("\n Ingrese el nombre: ");
  while((d = getchar()) != EOF && d != '\n') {
	newAr[i++] = d;
  }

  return newAr;
}

void clearBuffer() {
  while(getchar() != '\n');
}

int menu() {
  char c;

  do {
	printf("\nMenu pila");
	printf("\nHaga una seleccion:");
	printf("\n 1. insertar");
	printf("\n 2. eliminar");
	printf("\n 3. ImprimirLista");
	printf("\n 4. ContarNodos");
	printf("\n 0: salir.\n");
	c = getchar();

	switch(c) {
  	case '1':
      	clearBuffer();
      	insertar();
    	break;
  	case '2':
      	clearBuffer();
      	eliminar();
    	break;
  	case '3':
      	clearBuffer();
      	ImprimirLista();
    	break;
  	case '4':
      	clearBuffer();
      	ContarNodos();
    	break;
  	default:
    	break;
	}
  } while(c != '0' && c != EOF);
}
