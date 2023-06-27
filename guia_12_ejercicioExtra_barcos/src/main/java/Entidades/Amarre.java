
package Entidades;

import java.util.Date;

/**
 *
 * @author Mariano Benegas
 */
public class Amarre {

    private String nombre;
    private Long dni;
    private Date fechaAlquiler;
    private Date fechadevolucion;
    private Integer posicionAmarre;
   

    public Amarre() {
    }

    public Amarre(String nombre, Long dni, Date fechaAlquiler, Date fechadevolucion, Integer posicionAmarre) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechadevolucion = fechadevolucion;
        this.posicionAmarre = posicionAmarre;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(Date fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }
      

    @Override
    public String toString() {
        return "Amarre{" + "nombre=" + nombre + ", dni=" + dni + ", fechaAlquiler=" + fechaAlquiler + ", fechadevolucion=" + fechadevolucion + ", posicionAmarre=" + posicionAmarre + ", listaBarcos=" + '}';
    }
    
    public Integer calcularDiasAlquiler(){
        
        return null;
    }

}


