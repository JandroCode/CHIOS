package com.dam.ejercicio.uno.dao;


import com.dam.ejercicio.uno.ConexionBD;
import com.dam.ejercicio.uno.ConexionBD;
import com.dam.ejercicio.uno.model.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductoDAO {
    
    private Connection conectar() throws SQLException{
            return ConexionBD.conectar();
        }
    
       // Método para buscar productos por nombre
    public List<Producto> buscarProducto(String nombreBusqueda) {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM productos WHERE nombre LIKE ?";

        try (Connection conexion = conectar(); 
             PreparedStatement stmt = conexion.prepareStatement(sql)) {
            
            // Establecer el parámetro de búsqueda (nombre)
            stmt.setString(1, "%" + nombreBusqueda + "%");

            // Ejecutar la consulta
            ResultSet rs = stmt.executeQuery();

            // Procesar el resultado
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                int cantidad = rs.getInt("cantidad");

                Producto producto = new Producto(id, nombre, precio, cantidad);
                productos.add(producto);
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar productos: " + e.getMessage());
        }

        return productos;
    }
    
}
