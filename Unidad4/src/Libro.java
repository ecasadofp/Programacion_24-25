public class Libro {

    private String titulo;
    private Autor autor;
    private double precio;
    private boolean estaDeteriorado;

    public Libro(String titulo){

    this.titulo = titulo;

    }

    public Libro(String titulo, String nombreAutor, String apellidoAutor, int librosPublicadosAutor, String nacionalidadAutor, double precio){

        this.titulo = titulo;
        this.autor = new Autor(nombreAutor, apellidoAutor, librosPublicadosAutor, nacionalidadAutor);
        this.precio = precio;
        this.estaDeteriorado = false;
    }

    public Libro(String titulo, Autor autor, double precio){

        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.estaDeteriorado = false;
    }


    public void muestraTitulo(){

        System.out.println("Título: " + titulo);
    }

    public void muestraAutor(){
        System.out.println("Autor: " + this.autor);
    }

    public void muestraPrecio(){

        System.out.println("Precio: " + this.precio);

    }

    public void marcarComoDeteriorado(){

        this.estaDeteriorado = true;
    }

    public double ponerDeOferta(int porcientoDescuento){

        precio = precio * (100-porcientoDescuento)/100;
        return precio;

    }


}
