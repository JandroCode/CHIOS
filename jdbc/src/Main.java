import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/tu_base_de_datos";
        String usuario = "tu_usuario";
        String contrasena = "tu_contraseña";

        try {
            Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contrasena);
            Statement statement = conexion.createStatement();
            String sqlQuery = "SELECT * FROM nombre_de_la_tabla";
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()) {
                String columna1 = resultSet.getString("nombre_columna_1");
                String columna2 = resultSet.getString("nombre_columna_2");
                System.out.println(columna1 + " | " + columna2);
            }

            resultSet.close();
            statement.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
