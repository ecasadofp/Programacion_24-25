/*
Crea una clase llamada Coche que tenga
atributos para el color, el modelo y la velocidad.
Define un método acelerar() que aumente la velocidad del coche en 10 unidades                                                                                                        y un método frenar() que la disminuya en 10 unidades.
 */

public class Coche {

    private String color;
    private String modelo;
    private int velocidad;

    public Coche(String color, String modelo){

        this.color = color;
        this.modelo = modelo;
        this.velocidad = 0;

    }

    public int acelerar(){

        this.velocidad += 10;
        return this.velocidad;

    }

    public int acelerar(int aceleracion){

        this.velocidad += aceleracion;
        return this.velocidad;

    }

    public double pintar(String color){

        this.color = color;
        return 356.96;

    }

    public String toString(){

        String valor = String.format("El coche es de color %s, modelo %s y va a %d km/h", this.color, this.modelo, this.velocidad);
        return valor;

    }


    public int frenar(){

        this.velocidad -= 10;
        if(this.velocidad < 0)
            this.velocidad = 0;
        return this.velocidad;

    }

    public void parar(){
        this.velocidad = 0;
    }

    public int getVelocidad(){
        return this.velocidad;
    }




}
