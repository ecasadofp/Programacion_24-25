import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        try {
            Coche coche1 = AccesoBD.buscaCoche(3);
            System.out.println(coche1);
        } catch (SQLException e) {
            System.out.println("No se ha podido conectar a la base de datos");;
        }

        try {
            Coche coche1 = AccesoBD.buscaCoche(2);
            System.out.println(coche1);
        } catch (SQLException e) {
            System.out.println("No se ha podido conectar a la base de datos");;
        }



        Coche miCoche = new Coche("negro", "aventador", 2);

        AccesoBD.guardaCoche(miCoche);

        try {
            Coche coche1 = AccesoBD.buscaCoche(7);
            System.out.println(coche1);
        } catch (SQLException e) {
            System.out.println("No se ha podido conectar a la base de datos");;
        }



    }



}
