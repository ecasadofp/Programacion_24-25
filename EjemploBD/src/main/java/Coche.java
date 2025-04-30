public class Coche {

    private String color;
    private String modelo;
    private int numPuertas;

    public Coche(String color, String modelo, int numPuertas) {
        this.color = color;
        this.modelo = modelo;
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numPuertas=" + numPuertas +
                '}';
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}
