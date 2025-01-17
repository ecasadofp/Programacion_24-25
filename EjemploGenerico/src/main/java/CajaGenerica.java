public class CajaGenerica <T>{

    private T cosaContenida;

    public void envolver(T cosaAEnvolver){
        this.cosaContenida = cosaAEnvolver;
    }
    public T unboxing(){
        return this.cosaContenida;
    }

}
