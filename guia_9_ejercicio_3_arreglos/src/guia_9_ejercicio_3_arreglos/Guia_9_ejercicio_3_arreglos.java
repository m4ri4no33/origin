/*
 Clase Arrays
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B
de 20 números reales. Crear la clase ArregloService, en el paquete servicio, con 
los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números 
aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B.
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, 
mostrar A y B.

 */
package guia_9_ejercicio_3_arreglos;

import Servicio.ArregloServicio;

/*
 * @author Mariano Benegas
 */
public class Guia_9_ejercicio_3_arreglos {

    public static void main(String[] args) {

        double[] A = new double[50];
        double[] B = new double[20];

        ArregloServicio array = new ArregloServicio();

        array.inicializarA(A);
        array.mostrar(A);
        System.out.println("ARREGLO ORDENADO");
        array.ordenar(A);
        array.inicializarB(A, B);
        System.out.println("ARREGLO A");
        array.mostrar(A);
        System.out.println("ARREGLO B");
        array.mostrar(B);

    }

}
