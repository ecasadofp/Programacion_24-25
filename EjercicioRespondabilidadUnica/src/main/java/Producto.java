public class Producto implements Comparable<Producto> {

    private static int codigoSiguiente = 1;

    private int codigo;
    private String descripcion;
    private TipoProducto tipoProducto;
    private double precio;
    private int stockDisponible;


    public Producto (String descripcion, TipoProducto tipoProducto, double precio, int stockDisponible){

        if(precio <= 0)
            throw new RuntimeException("El precio tiene que ser mayor de 0");

        this.codigo = codigoSiguiente++;
        this.descripcion = descripcion;
        this.tipoProducto = tipoProducto;
        this.precio = precio;
        this.stockDisponible = stockDisponible;

    }

    public double getPrecio(){
        return this.precio;
    }

    public String toString(){

        return "Producto: " + descripcion;

    }


    @Override
    public int compareTo(Producto p) {


        return this.codigo - p.codigo;
    }
}
