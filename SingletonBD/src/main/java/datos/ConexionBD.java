package datos;

import recursos.Secretos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static Connection conexion;

    public static Connection getConexion() throws SQLException {

        if (conexion == null) {
            conexion = DriverManager.getConnection(Secretos.getEndpointDb(), Secretos.getUser(), Secretos.getPwd());
        }
        return conexion;
    }
    public static void cierraConexion(){

        try {
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
