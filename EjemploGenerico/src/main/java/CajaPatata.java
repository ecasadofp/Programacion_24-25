import java.time.LocalDate;

public class CajaPatata {

    private Patata patataContenida;

    public void envolver(Patata patataAEnvolver){
        this.patataContenida = patataAEnvolver;
    }
    public Patata unboxing(){
        return this.patataContenida;
    }

}
