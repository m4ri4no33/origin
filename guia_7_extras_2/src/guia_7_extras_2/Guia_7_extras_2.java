/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_extras_2;

/**
 *
 * @author Mariano Benegas
 */
public class Guia_7_extras_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double entrePuntos;

        Puntos nuevo = new Puntos();

        nuevo.crearPuntos();
        entrePuntos = nuevo.distanciaEntrePuntos();
        System.out.println(entrePuntos);

    }

}
