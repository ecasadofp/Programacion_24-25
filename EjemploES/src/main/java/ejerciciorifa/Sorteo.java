package ejerciciorifa;

public class Sorteo {

    public static int[] generarNumeros(int cantidad){

        int[] premidados = new int[cantidad];

        for(int i = 0; i < cantidad; i++)
            premidados[i] = (int)(Math.random()*100000);
        return premidados;

    }
}
