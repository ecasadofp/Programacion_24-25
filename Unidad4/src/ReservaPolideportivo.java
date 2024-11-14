import java.util.ArrayList;

public class ReservaPolideportivo {
    public static ArrayList<Persona> reservas = new ArrayList<>();
    public static void main(String[] args) {


        reservas.add(new Persona("Pepito", 34));
        reservas.add(new Persona("Marta", 2));
        reservas.add(new Persona("Fernando", 33));

        muestraReservas();

    }

    public static void muestraReservas(){

        for(Persona p: reservas)
            p.presentarse();

    }

}
