import java.sql.*;

public class AccesoBD {


    public static Coche buscaCoche(int id) throws SQLException {

        Coche cocheBuscado = null;

        Connection conexion = DriverManager.getConnection("jdbc:mysql://pruebas-programacion.cx6os4cqeuzn.us-east-1.rds.amazonaws.com/concesionario", "admin", "programacion-DAW1");

        PreparedStatement preparedStatement = conexion.prepareStatement("SELECT * FROM coches WHERE id= ?");

        preparedStatement.setInt(1, id);

        ResultSet resultSet =preparedStatement.executeQuery();

//        String consulta = "SELECT * FROM coches WHERE id="+ id;
//
//        Statement statement = conexion.createStatement();
//
// ResultSet resultSet = statement.executeQuery(consulta);

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

    public static int guardaCoche(Coche coche){

        int codigoResultado;

        try {

            Connection conexion = DriverManager.getConnection("jdbc:mysql://pruebas-programacion.cx6os4cqeuzn.us-east-1.rds.amazonaws.com:3306/concesionario", "admin", "programacion-DAW1");

            PreparedStatement preparedStatement = conexion.prepareStatement("INSERT INTO coches VALUES(?, ?, ?, ?)");

            preparedStatement.setInt(1, 7);
            preparedStatement.setString(2, coche.getColor());
            preparedStatement.setString(3, coche.getModelo());
            preparedStatement.setInt(4, coche.getNumPuertas());

            codigoResultado = preparedStatement.executeUpdate();




        }catch(SQLException e){

            e.printStackTrace();
            codigoResultado = 0;
        }

return codigoResultado;


    }


}
