package guia_7_ejercicio_2_objetocircunferencia;

/*Declarar una clase llamada Circunferencia que tenga como atributo privado 
el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el
atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 * @author Mariano Benegas
 */
public class Guia_7_ejercicio_2_objetoCircunferencia {

    public static void main(String[] args) {
        Circunferencia nuevo = new Circunferencia();
        nuevo.crearCincurferencia();
        System.out.println("El area es: " + nuevo.calcularArea());
        System.out.println("El perimetro es: " + nuevo.calcularPerimetro());
    }

}
