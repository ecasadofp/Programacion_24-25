// Ejemplo uso genéricos en java

// https://docs.oracle.com/javase/tutorial/java/generics/types.html

public class Main {

    public static void main(String[] args) {

        Patata miPatata = new Patata();

        CajaGenerica<Patata> miCajaPatata = new CajaGenerica<>();

        miCajaPatata.envolver(miPatata);

        Patata suPatata = miCajaPatata.unboxing();


        Pera miPera = new Pera();

        CajaGenerica<Pera> envioPera = new CajaGenerica<>();

        envioPera.envolver(miPera);

        Pera suPera = envioPera.unboxing();

    }


}
