package EjemploNaves;

public class NaveExploracion extends NaveEspacial{

    private int alcanceSensores;

    public NaveExploracion(String nombre, int vMax, int alcanceSensores){

        super(nombre, vMax);
        this.alcanceSensores = alcanceSensores;

    }

    @Override
    public void obtenerInformacion(){

        super.obtenerInformacion();
        System.out.println("Alcance de los sensores " + alcanceSensores);
        System.out.println("*********************************");
        System.out.println();

    }


}
