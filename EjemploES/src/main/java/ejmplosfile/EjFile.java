package ejmplosfile;

import java.io.File;

public class EjFile {

    public static void main(String[] args) {

        String directorio;

        if(args.length > 0)
            directorio = args[0];
        else
            directorio = ".";

        File actual = new File (directorio);

        System.out.print("El directorio actual es: ");
        try {

            System.out.println(actual.getAbsolutePath());

        }catch(SecurityException e){
        }

        File[] archivos = actual.listFiles();

        for(File archivo : archivos) {

            if(archivo.isFile()) {

                System.out.println("Nombre: " + archivo.getName());
                System.out.println("Longitud en bytes: " + archivo.length());
                System.out.println("Modificado: " + archivo.lastModified());
                System.out.println("Ruta: " + archivo.getPath());
                System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
                System.out.println("Se puede escribir: " + archivo.canWrite());
                System.out.println("Se puede leer: " + archivo.canRead());

            }
            System.out.println();
        }
    }
}
