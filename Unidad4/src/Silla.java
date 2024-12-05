public class Silla {

    private int numPatas;
    private Color color;

    public Silla(int numPatas, Color color){

        this.numPatas = numPatas;
        this.color = color;

    }


    @Override
    public String toString(){

        String salida ="La silla tiene" + numPatas + " patas y es de color " + color;
        return salida;

    }

    @Override
    public boolean equals(Object objeto){

        if(!(objeto instanceof Silla))
            return false;

        Silla objetoSilla = (Silla) objeto;

        if(this.color != objetoSilla.color)
            return false;

        if(this.numPatas != objetoSilla.numPatas)
            return false;

        return true;

    }

}
