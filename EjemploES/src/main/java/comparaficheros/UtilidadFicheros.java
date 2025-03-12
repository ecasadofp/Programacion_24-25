package comparaficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UtilidadFicheros {

    public static boolean sonIguales (String fichero1, String fichero2){

        try(FileInputStream fis1 = new FileInputStream(fichero1); FileInputStream fis2 = new FileInputStream(fichero2)){
//do {
//    int leido1 = fis1.read();
//    int leido2
//    if (fis1.read() != fis2.read())
//        return false;
//}while(leido 1 !=-1 &&)
        }catch (FileNotFoundException e){
            System.out.println("No se ha encontrado un fichero");
        }catch (IOException e){
            System.out.println("No se han podido comparar los ficheros");
        }

       return true;
    }


}
