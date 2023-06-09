package Entidades;

/**
 *
 * @author Mariano Benegas
 */
public class BarcoMotor extends Barco {

    private Integer potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer potencia) {
        this.potencia = potencia;
    }

    public BarcoMotor(Integer potencia, Integer matricula, Double eslora, Integer anoFabricacion) {
        super(matricula, eslora, anoFabricacion);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "TIPO BARCO A MOTOR :"
                + "\n POTENCIA CV : " + potencia
                + "\n MATRICULA : " + super.getMatricula()
                + "\n ESLORA : " + super.getEslora()
                + "\n MODELO : " + super.getAnoFabricacion();
    }

    @Override
    public double calculaAlquiler() {
        return (super.calculaAlquiler() + getPotencia());
    }

}
