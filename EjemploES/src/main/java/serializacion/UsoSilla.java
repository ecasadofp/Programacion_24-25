package serializacion;

import java.io.*;

public class UsoSilla {

    public static void main(String[] args) {

        Silla silla1 = new Silla("rojo", 4, 34.2);


        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sillas.dat"))){

            oos.writeObject(silla1);
            System.out.println("Objeto escrito correctamente");

        }catch (IOException e){

            e.printStackTrace();

        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sillas.dat"))){

            Object objeto = ois.readObject();

            Silla sillaLeida = (Silla)objeto;

            System.out.println("La silla es: " + sillaLeida);

        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


}
