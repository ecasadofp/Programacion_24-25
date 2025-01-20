import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {

        Producto producto1 = new Producto("Pantalón corto", TipoProducto.PANTALON, 34.43, 5);
        Producto producto2 = new Producto("Camiseta surfero", TipoProducto.CAMISETA, 59.50, 1);

        System.out.println("Productos en la tienda");
        System.out.println(producto1);
        System.out.println(producto2);

        System.out.printf("El producto\n%s\ncuesta %.2f con impuestos\n", producto1, CalculadoraPrecio.precioConIva(producto1));
int descuento = 15;
        System.out.printf("El producto\n%s\ncuesta %.2f con descuento \n", producto1, CalculadoraPrecio.precioConDescuento(producto1, descuento));


        System.out.println("el primer producto comparado con el segundo " + producto1.compareTo(producto2));
        System.out.println("el segundo producto comparado con el primero " + producto2.compareTo(producto1));
        System.out.println("el primer producto comparado con el primero " + producto1.compareTo(producto1));

        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(producto2);
        productos.add(producto1);

        System.out.println(productos);

        Collections.sort(productos, new ComparadorProductosPrecio());

        System.out.println(productos);

    }

}
