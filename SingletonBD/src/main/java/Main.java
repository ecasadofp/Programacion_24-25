import java.sql.Connection;
import java.sql.SQLException;
import static datos.ConexionBD.*;


public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            try {
                Connection connection = getConexion();
                System.out.println("Conexión creada: " + connection);
            } catch (SQLException e) {

                e.printStackTrace();

            }

        }

        cierraConexion();

    }

}
