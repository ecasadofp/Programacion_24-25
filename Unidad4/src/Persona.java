/*
 Crea una clase Persona con los atributos nombre y edad.
 Agrega un método presentarse() que muestre un mensaje como
 "Hola, me llamo [nombre] y tengo [edad] años".
 Luego, crea varias instancias de Persona
y llama al método presentarse() en cada una.
 */


public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){

        this.nombre = nombre;
        this.edad = edad;

    }

    public void presentarse(){
        System.out.printf("Hola me llamo %s y tengo %d años\n", this.nombre, this.edad);
    }

}
