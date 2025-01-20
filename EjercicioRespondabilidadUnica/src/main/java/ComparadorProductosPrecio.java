import java.util.Comparator;

public class ComparadorProductosPrecio implements Comparator<Producto> {

    @Override
    public int compare(Producto p1, Producto p2){

        return (int)(100*p1.getPrecio()-100*p2.getPrecio());

    }
}
