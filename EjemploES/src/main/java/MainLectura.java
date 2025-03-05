import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainLectura {

    public static void main(String[] args) {


        try(FileReader fr = new FileReader("/home/ecasado/Programacion_24-25/EjemploES/src/main/java/entrada.txt")){
            int leido;
            do {
                leido = fr.read();
                char caracterLeido = (char) leido;
                if(leido != -1)
                    System.out.print(caracterLeido);
            }while(leido != -1);

        }catch (FileNotFoundException e){
            System.out.println("No se ha encontrado el fichero");;
        }catch(IOException e){
            e.printStackTrace();
        }



    }

}
