import java.sql.*;

public class AccesoBD {


    public static Coche buscaCoche(int id) throws SQLException {

        Coche cocheBuscado = null;

        Connection conexion = DriverManager.getConnection("jdbc:mysql://pruebas-programacion.cx6os4cqeuzn.us-east-1.rds.amazonaws.com/concesionario", "admin", "programacion-DAW1");

        String consulta = "SELECT * FROM coches WHERE id="+ id;

        Statement statement = conexion.createStatement();

        ResultSet resultSet = statement.executeQuery(consulta);

        while(resultSet.next()){


            int idEncontrado = resultSet.getInt("id");
            String color = resultSet.getString("color");
            String modelo = resultSet.getString("modelo");
            int num_puertas = resultSet.getInt("num_puertas");

            cocheBuscado = new Coche(color, modelo, num_puertas);

             return cocheBuscado;

        }


        return cocheBuscado;
    }


}
