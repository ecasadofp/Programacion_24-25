public class Bici {

    static final int NUM_MARCHAS = 12;

    private String color;
    private char talla;
    private String tipo;
    private double velocidad;
    private int cadencia;
    private int marcha;

    public Bici(String color, char talla, String tipo){
        this.color = color;
        this.talla = talla;
        this.tipo = tipo;
        this.velocidad = 0;
        this.cadencia = 0;
        this.marcha = 3;

    }

    public Bici(char talla, String tipo){

        this.color ="blanco";
        this.talla = talla;
        this.tipo = tipo;
        this.velocidad = 0;
        this.cadencia = 0;
        this.marcha = 3;
    }


    public void pintarla(String color){

        this.color = color;
    }

    public void acelerar(int aumentoVelocidad){

        this.velocidad += aumentoVelocidad;
    }

    public void frenar(int disminucionVelocidad){

        this.velocidad -= disminucionVelocidad;
        if(velocidad < 0)
            velocidad = 0;
    }

    public void pedalearMasDeprisa(){
        this.cadencia +=5;
    }

    public void pedalearMasDespacio(){
        this.cadencia -=5;
    }

    public void subirMarcha(){

        this.marcha++;
        if(this.marcha > NUM_MARCHAS)
            this.marcha = NUM_MARCHAS;

    }

    public void bajarMarcha(){

       this.marcha--;
       if(this.marcha < 0)
           this.marcha = 0;
    }

    @Override
    public String toString(){

        String salida;
        salida = String.format("Color: %s, talla %s, va a %.1f km/h", this.color, this.talla, this.velocidad);

        return salida;
    }
}
