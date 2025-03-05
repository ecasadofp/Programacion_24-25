import java.io.FileWriter;
import java.io.IOException;

public class MainRecursos {

    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("salida.txt")){

            fw.write("Hola mundo desde ficheros con flush");

        }catch(IOException e){

            e.printStackTrace();

        }

    }
}
