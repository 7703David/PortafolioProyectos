#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//Structs

typedef struct ElementoLista {
    char *dato;
    struct ElementoLista *siguiente;
    struct ElementoLista *anterior;
}Elemento;

typedef struct ListaIdentificar {
    Elemento *inicio;
    Elemento *fin;
    int tamanio;
}Lista;

//Funciones

//Iniciar programa
void inicializacion(Lista *lista){
    lista ->inicio = NULL;
    lista ->fin = NULL;
    lista ->tamanio=0;
}

// insercion en una lista vacia
int ins_en_lista_vacia (Lista *lista, char *dato) {
    Elemento *nuevo_elemento;
    if ((nuevo_elemento = (Elemento *) malloc (sizeof (Elemento))) == NULL)
        return -1;
    if ((nuevo_elemento->dato = (char *) malloc (50 * sizeof (char))) == NULL)
        return -1;
    strcpy(nuevo_elemento->dato, dato);
    nuevo_elemento->siguiente = NULL;
    nuevo_elemento->anterior = NULL;
    lista ->inicio = nuevo_elemento;
    lista ->fin = nuevo_elemento;
    lista ->tamanio++;
    return 0;
}

// inserción al inicio de la lista
int ins_inicio_lista (Lista * lista, char *dato) {
    Elemento *nuevo_elemento;
    if ((nuevo_elemento = (Elemento *) malloc (sizeof (Elemento))) == NULL)
        return -1;
    if ((nuevo_elemento->dato = (char *) malloc (50 * sizeof (char))) == NULL)
        return -1;
    strcpy (nuevo_elemento->dato, dato);
    nuevo_elemento->siguiente = lista->inicio;
    nuevo_elemento->anterior = NULL;
    lista ->inicio = nuevo_elemento;
    lista ->tamanio++;
return 0;
}

//insercion al final de la lista
int ins_fin_lista (Lista *lista, Elemento *actual, char *dato) {
    Elemento *nuevo_elemento;
    if ((nuevo_elemento = (Elemento *) malloc (sizeof (Elemento))) == NULL)
        return -1;
    if ((nuevo_elemento->dato = (char*) malloc (50 * sizeof (char))) == NULL)
        return -1;
    strcpy (nuevo_elemento->dato, dato);
    actual->siguiente = nuevo_elemento;
    nuevo_elemento->siguiente = NULL;
    nuevo_elemento->anterior = lista->fin;
    lista ->fin = nuevo_elemento;
    lista ->tamanio++;
    return 0;
}

// supresión al inicio de la lista
int sup_inicio(Lista * lista) {
    if (lista ->tamanio == 0)
        return -1;
    Elemento *sup_elemento;
    sup_elemento = lista ->inicio;
    lista ->inicio = lista ->inicio->siguiente;
    if (lista ->tamanio == 1)
        lista ->fin = NULL;
    free (sup_elemento->dato);
    free (sup_elemento);
    lista ->tamanio--;
    return 0;
}

// visualización de la Lista
void muestra(Lista * lista)
{
    Elemento *actual;
    actual = lista ->inicio;
    while (actual != NULL){
        printf ("%p - %s\n", actual, actual->dato);
        actual = actual->siguiente;
    }
    printf("\n");
}

// Eliminar la Lista
void destruir (Lista *lista) {
    while (lista ->tamanio > 0){
        sup_inicio(lista);}
}
//Principal
int main (void){
    int opcion;
    char *nom;
    Lista *lista;
    Elemento *actual;
    if((lista = (Lista*)malloc(sizeof (Lista))) == NULL)
        return -1;
    if((nom = (char*)malloc(50)) == NULL)
        return -1;
    actual = NULL;
    void inicializacion(lista);
    if(lista->tamanio!=0)
        lista->tamanio=0;
    int edad,k;
    while(opcion!=5){
        opcion = menu(lista,&k);
        switch(opcion){
        case 1:
            printf ("Ingresa el nombre: ");
            scanf ("%s",nom);
            getchar();
            printf ("Ingresa la edad: ");
            scanf ("%d",&edad);
                if (lista->tamanio==0)
                    ins_en_lista_vacia(lista,nom);
                else
                    ins_fin_lista(lista,lista->fin,nom);
            printf("%d elementos:ini=%s,fin=%s\n",lista->tamanio, lista->inicio->dato, lista->fin->dato);
            muestra(lista);
        break;
        case 2:
            printf ("Ingrese el nombre: ");
            scanf ("%s",nom);
            getchar();
            printf ("Ingresa la edad: ");
            scanf ("%i",&edad);
            printf("%d",edad);
            if(edad<60){
                ins_fin_lista(lista,lista->fin,nom);
            }
            if(edad>60){
                ins_inicio_lista(lista,nom);
            }
            getchar();
            printf ("%d elementos:ini=%s,fin=%s\n", lista->tamanio, lista->inicio->dato, lista->fin->dato);
            muestra(lista);
        break;
        case 3: sup_inicio(lista);
            if (lista->tamanio!=0)
                printf ("%d elementos:ini=%s,fin=%s\n", lista->tamanio, lista->inicio->dato, lista->fin->dato);
            else
                printf ("lista vacia\n");
            muestra (lista);
        break;
        case 4:
            destruir (lista);
            printf ("la lista ha sido destruida: %d elementos\n", lista->tamanio);
        break;
        }
    }
    return 0;
}

//Menú
int menu(Lista *lista,int *k){
    int eleccion;
    printf("========= MENU =========\n");
    if(lista ->tamanio == 0){
        printf ("1. Primer paciente\n");
        printf ("2. Salir\n");
    }
    else{
        printf ("2. Ingreso nuevo paciente\n");
        printf ("3. Paciente atendido\n");
        printf ("4. Eliminar lista\n");
        printf ("5. Salir\n");
    }
    printf ("\n\nElegir: ");
    scanf ("%d",&eleccion);
    getchar();
    if(lista->tamanio==0 && eleccion==2)
        eleccion=5;
    return eleccion;
}
