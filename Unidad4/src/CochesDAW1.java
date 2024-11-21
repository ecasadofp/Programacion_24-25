import java.util.ArrayList;

public class CochesDAW1 {

    private static final int NUM_ALUMNOS = 3;

    public static void main(String[] args) {

        ArrayList<Coche> cochesDAW1 = new ArrayList<>();

        for(int i = 0; i < NUM_ALUMNOS; i++)
            cochesDAW1.add(Coche.comprarCoche());

        for(Coche c:cochesDAW1)
            System.out.println(c);
    }

}
