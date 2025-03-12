package ejmplosfile;

public class UsoFile {

    public static void ejemploUso() {

        System.out.println("Separadores sistema");
        String strFichero = "mifichero.txt";
        String strDirectorio = "midirectorio";
        String strRuta = File.separator + strDirectorio + File.separator + strFichero;
        System.out.println("Ruta con fichero: " + strRuta);

        System.out.println("Info sistema");
        System.out.println("Sistema " + System.getProperty("os.name") + ", version: "+ System.getProperty("os.version") + ", arquitectura " + System.getProperty("os.arch"));
        System.out.println("El separador de sistema es " + System.getProperty("file.separator"));
        System.out.println("El directorio actual es " + System.getProperty("user.dir") + ", el home del usuario es "+ System.getProperty("user.home"));
        System.out.println("La versión de java es " + System.getProperty("java.version"));

        System.out.println("Vamos a crear un fichero tontada.txt en nuestro home");
        File miTontada = new File(System.getProperty("user.home"), "tontada.txt");
        System.out.println(miTontada.getAbsolutePath());
        System.out.println("tontada eliminada: " + (miTontada.delete()?"Si":"No"));
        System.out.println("Existe tontada.txt? " + miTontada.exists());
        try{miTontada.createNewFile();}catch(IOException e){
            System.out.println("No se ha podido crear el fichero");
        }
        System.out.println("Existe tontada.txt? " + miTontada.exists());
        System.out.println("Fichero modificado en " + Instant.ofEpochMilli(miTontada.lastModified()).atZone(ZoneId.systemDefault()));

    }

}```