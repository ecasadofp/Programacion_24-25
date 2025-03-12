package ejerciciorifa;

import java.io.*;
import java.time.LocalDate;

public class ManejoFicheros {

    public static void guardarPremiados(int[] premiados) {

        LocalDate hoy = LocalDate.now();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("datos" + hoy + ".dat"))) {

        for(int num: premiados)
            dos.writeInt(num);
        } catch (IOException e) {
            System.out.println("No se ha podido guardar el fichero");
        }
    }

    public static void mostrarPremiadosFichero(String nombreFichero){


        try(DataInputStream dis = new DataInputStream(new FileInputStream(nombreFichero))){

            while(true)
                System.out.print(dis.readInt() + "\t");


        }catch(FileNotFoundException e){
            System.out.println("Fichero no encontrado");
        }catch (EOFException e){
            System.out.println();
        }catch (IOException e){
            System.out.println("No se ha podido leer");
        }

    }

}
