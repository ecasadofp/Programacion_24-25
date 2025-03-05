import java.io.FileWriter;
import java.io.IOException;

public class MainEscrituraClasico {

    public static void main(String[] args) {

        FileWriter fw = null;
        try {

            fw = new FileWriter("salida.txt");
            fw.write("Hola mundo desde ficheros con flush");


        }catch(IOException e){

            e.printStackTrace();

        }finally {
            try {
                if (fw != null)
                    fw.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
