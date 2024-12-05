package EjemploNaves;

public abstract class NaveEspacial {

    private String nombre;
    private final int VELOCIDAD_MAXIMA;
    private int velocidadActual;


    public NaveEspacial(String nombre, int vMax){

        this.nombre = nombre;
        this.VELOCIDAD_MAXIMA = vMax;
        this.velocidadActual = 0;

    }

    public void acelerar(){
        velocidadActual +=10;
        if(velocidadActual > VELOCIDAD_MAXIMA)
            velocidadActual = VELOCIDAD_MAXIMA;
    }

    public void frenar(){
        velocidadActual -=10;
        if(velocidadActual < 0)
            velocidadActual = 0;

    }

    public String getNombre(){
        return this.nombre;
    }

    public  void obtenerInformacion(){
        System.out.println("********************************");
        System.out.println("Información nave espacial " + nombre);
        System.out.println("Velocidad máxima " + VELOCIDAD_MAXIMA);
        System.out.println("Velocidad actual " + velocidadActual);

    }

}
