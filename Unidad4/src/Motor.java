/*
Crea una clase Motor con atributos como tipo y potencia.
Luego, modifica la clase Coche para que tenga un atributo motor
que sea una instancia de la clase Motor.
 */

public class Motor {

    private String tipo;
    private int potencia;

    public Motor(String tipo, int potencia){

        this.tipo = tipo;
        this.potencia = potencia;

    }


    @Override
    public String toString() {
        return "Tipo " + this.tipo + ", potencia " + this.potencia;
    }
}
