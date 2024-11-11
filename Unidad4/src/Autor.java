public class Autor {

    private String nombre;
    private String apellido;
    private int librosPublicados;
    private String nacionalidad;

    public Autor(String nombre, String apellido, int librosPublicados, String nacionalidad){

        this.nombre = nombre;
        this.apellido = apellido;
        this.librosPublicados = librosPublicados;
        this.nacionalidad = nacionalidad;

    }

    public String toString(){

        return this.apellido + ", " + this.nombre + ". Ha escrito " + this.librosPublicados + " libros.";



    }

}
