/*
Crea una clase llamada Coche que tenga
atributos para el color, el modelo y la velocidad.
Define un método acelerar() que aumente la velocidad del coche en 10 unidades                                                                                                        y un método frenar() que la disminuya en 10 unidades.
 */
/*
Añade un método estático convertirAKm() en la clase Coche
            que convierta una velocidad de millas por hora a kilómetros por hora.
            Luego, crea un método de clase totalCoches() que devuelva
            el número de coches creados (necesitarás una variable que lo almacene).
 */

/*
Crea una clase Motor con atributos como tipo y potencia. Luego, modifica la clase Coche para que
tenga un atributo motor que sea una instancia de la clase Motor.
 */

public class Coche {

    private static int totalCoches = 0;
    private String color;
    private String modelo;
    private int velocidad;

    public Coche(String color, String modelo){

        this.color = color;
        this.modelo = modelo;
        this.velocidad = 0;
        ++totalCoches;

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
@Override
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

    public  static int convertirAKm(int mph){

        int km = (int)(1.609 * mph);
        return km;

    }

    public static int totalCoches(){

        return totalCoches;
    }

}
