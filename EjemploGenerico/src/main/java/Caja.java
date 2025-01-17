public class Caja {

    private Object objetoContenido;

    public void envolver(Object objetoAEnvolver){
        this.objetoContenido = objetoAEnvolver;
    }
    public Object unboxing(){
        return this.objetoContenido;
    }

}
