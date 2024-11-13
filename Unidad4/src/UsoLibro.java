public class UsoLibro {

    public static void main(String[] args) {


        Libro libro1 = new Libro("El Hobbit");
        Libro libro2 = new Libro("El señor de los anillos", "JR", "Tolkien", 19, "Sudafrica", 34.10);

        Autor autor1 = new Autor("Ken", "Follet", 12, "Británico");

        Libro libro3 = new Libro("Los pilares de la tierra", autor1, 36.35);

        libro1.muestraTitulo();

        libro2.muestraTitulo();

        libro2.muestraAutor();

        libro3.muestraAutor();



    }
}
