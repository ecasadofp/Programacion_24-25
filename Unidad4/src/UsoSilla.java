public class UsoSilla {

    public static void main(String[] args) {


        Silla miSilla = new Silla(4, Color.BLANCO);
        Silla tuSilla = new Silla(4, Color.NEGRO);

        Coche miCoche = new Coche("Azul", "Mustang");



        System.out.println(miSilla.equals(miCoche));

    }

}
