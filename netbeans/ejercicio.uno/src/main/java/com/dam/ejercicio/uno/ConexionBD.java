
package com.dam.ejercicio.uno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    public static Connection conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/tienda_swing";
        String usuario = "root";  // Cambia el usuario según sea necesario
        String contrasena = "";  // Cambia la contraseña según sea necesario

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
            return conexion;
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            throw e;
        }
    }
}