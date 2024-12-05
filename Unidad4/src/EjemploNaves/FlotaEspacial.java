package EjemploNaves;

import java.util.ArrayList;

public class FlotaEspacial {

    public static void main(String[] args) {

        ArrayList<NaveEspacial> naves = new ArrayList<>();

        naves.add( new NaveCarga("Halcón milenario", 100, 50));
        naves.add(new NaveExploracion("X-wing", 80, 200));

        naves.get(0).acelerar();
        naves.get(0).acelerar();

        for(int i = 0; i < 50; i++)
            naves.get(1).acelerar();

        for(NaveEspacial nave: naves)
            nave.obtenerInformacion();

    }


}
