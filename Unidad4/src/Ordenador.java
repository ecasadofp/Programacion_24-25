public class Ordenador implements Comparable<Ordenador>{

    private String referencia;
    private int ramGb;
    private double precio;

    public Ordenador (String referencia, int ramGb, double precio){

        this.referencia = referencia;
        this.ramGb = ramGb;
        this.precio = precio;

    }

    @Override
    public String toString() {

        return "Referencia: " + referencia + ", ram: " + ramGb + ", precio: " + precio + " €";
    }


    @Override
    public int compareTo(Ordenador ordenador) {

        if(this.ramGb-ordenador.ramGb!=0)
            return this.ramGb-ordenador.ramGb;

        if((int)(this.precio-ordenador.precio)!=0)
            return (int)(this.precio-ordenador.precio);

        return this.referencia.compareTo(ordenador.referencia);
    }
}
