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

import java.util.Scanner;

public class Coche {

    private static int totalCoches = 0;
    private String color;
    private String modelo;
    private int velocidad;
    private Motor motor;

    public Coche(String color, String modelo){

        this.color = color;
        this.modelo = modelo;
        this.velocidad = 0;
        ++totalCoches;

    }

    public Coche(String color, String modelo, Motor motor){

        this.color = color;
        this.modelo = modelo;
        this.motor = motor;


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

    public int getVelocidadEnKm(){

        return convertirAKm(this.velocidad);
    }

    public static int totalCoches(){

        return totalCoches;
    }

    public Motor desmontarMotor(){
        return this.motor;
    }

    public void montarMotor(Motor motor){

        this.motor = motor;

    }

    public void muestraDatosMotor(){

        System.out.println("Datos motor: " + this.motor);

    }

    public static Coche comprarCoche(){

        Scanner sc = new Scanner(System.in);
        String color;
        String modelo;
        String tipoMotor;
        int potencia;

        System.out.println("De qué color lo quieres?");
        color = sc.nextLine();
        System.out.println("Qué modelo quieres?");
        modelo = sc.nextLine();
        System.out.println("Qué tipo de motor le ponemos?");
        tipoMotor = sc.nextLine();
        System.out.println("Cuántos caballos quieres?");
        potencia = sc.nextInt();

        Motor motor = new Motor(tipoMotor, potencia);
        Coche coche = new Coche(color, modelo, motor);

        return coche;


    }

}
