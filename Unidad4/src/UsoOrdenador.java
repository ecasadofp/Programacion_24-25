import java.util.ArrayList;
import java.util.TreeSet;

public class UsoOrdenador {

    public static void main(String[] args) {

        TreeSet<Ordenador> ordenadores = new TreeSet<>();

        ordenadores.add(new Ordenador("t5j", 8, 456.43));
        ordenadores.add(new Ordenador("z65", 24, 265.33));
        ordenadores.add(new Ordenador("p45", 32, 915.78));
        ordenadores.add(new Ordenador("u78", 8, 645.80));
        ordenadores.add(new Ordenador("a69", 32, 915.78));
        ordenadores.add(new Ordenador("p45", 32, 915.78));

    for(Ordenador o:ordenadores)
        System.out.println(o);

    }



}
