package EjemploNaves;

public class NaveCarga extends NaveEspacial{


    private int capacidadCarga;

    public NaveCarga(String nombre, int vMax, int capacidadCarga){

        super(nombre, vMax);
        this.capacidadCarga = capacidadCarga;

    }

    @Override
    public void obtenerInformacion(){

        super.obtenerInformacion();
        System.out.println("Capacidad de carga " + capacidadCarga);
        System.out.println("********************************");
        System.out.println();

    }


}
