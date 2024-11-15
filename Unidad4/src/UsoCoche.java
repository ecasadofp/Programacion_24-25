public class UsoCoche {

    public static void main(String[] args) {

        Coche cocheAmina = new Coche( "gris", "GT40");

        Coche cocheMartin = new Coche("Amarillo", "Land Cruiser");

        Coche cocheElena = new Coche("Blanco", "Auris");

        cocheMartin.acelerar();
        cocheMartin.acelerar();

        System.out.println("Velocidad del coche de Martín " + cocheMartin.getVelocidad());

        cocheMartin.parar();

        System.out.println("Velocidad del coche de Martín " + cocheMartin.getVelocidad());

        System.out.println("Velocidad del coche de Amina " + cocheAmina.getVelocidad());

        int velocidadAmina = cocheAmina.acelerar(50);

        System.out.println("Velocidad del coche de Amina " + cocheAmina.getVelocidad());

        System.out.println(cocheMartin);

        System.out.println("Martín, pintar el coche te ha costado "+ cocheMartin.pintar("rosa"));

        System.out.println(cocheMartin);

        System.out.printf("La velodidad de Amina es %d mph, que son %d km/h\n", velocidadAmina, Coche.convertirAKm(velocidadAmina));

        System.out.println("Se han fabricado " + Coche.totalCoches() + " coches");
    }



}
