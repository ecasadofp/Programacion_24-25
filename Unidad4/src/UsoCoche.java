public class UsoCoche {

    public static void main(String[] args) {

        Coche cocheAmina = new Coche( "gris", "GT40");

        Coche cocheMartin = new Coche("Amarillo", "Land Cruiser");

        Coche cocheElena = new Coche("Blanco", "Auris");

        Coche cocheAlex = new Coche("Azul", "Aventador", new Motor("V12",540));

        cocheAlex.muestraDatosMotor();

        Motor nuevoMotor = new Motor("V10", 850);

        System.out.println("Le cambio el motor a uno nuevo");

        cocheAlex.montarMotor(nuevoMotor);

        cocheAlex.muestraDatosMotor();

        Coche cocheLorien = Coche.comprarCoche();
        
        System.out.println(cocheLorien);

        cocheAlex.acelerar();

        System.out.println(cocheAlex.compareTo(cocheLorien));


    }



}
