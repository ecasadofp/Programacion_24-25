package serializacion;

import java.io.Serializable;

public class Silla implements Serializable {

    private String color;
    private int numPatas;
    private double precio;

    public Silla(String color, int numPatas, double precio) {
        this.color = color;
        this.numPatas = numPatas;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "color='" + color + '\'' +
                ", numPatas=" + numPatas +
                ", precio=" + precio +
                '}';
    }
}
