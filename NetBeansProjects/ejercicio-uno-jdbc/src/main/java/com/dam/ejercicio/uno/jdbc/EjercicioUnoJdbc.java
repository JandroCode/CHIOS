

package com.dam.ejercicio.uno.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class EjercicioUnoJdbc {
    
        
    /*
    Ejercicio CRUD productos JDBC
    */
    
    private static String url = "jdbc:mysql://localhost:3306/tienda_swing?useUnicode=true&characterEncoding=utf8";
    private static String usuario = "root";
    private static String contrasena = "";

    public static void main(String[] args) {
         listar(url, usuario, contrasena);
        /*
       
        guardar(url, usuario, contrasena);
        modificar(url, usuario, contrasena);
        
        */

        eliminar(url, usuario, contrasena);
    }
  
    public static void listar(String url, String usuario, String contrasena){
        
        try {
            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(url, usuario, contrasena);

            // Crear la sentencia SQL
            Statement stmt = conexion.createStatement();
            String sql = "SELECT * FROM productos";

            // Ejecutar la consulta
            ResultSet rs = stmt.executeQuery(sql);

            // Mostrar los resultados
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                int cantidad = rs.getInt("cantidad");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Precio: " + precio + ", Cantidad: " + cantidad);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
    public static  void guardar(String url, String usuario, String contrasena){
        
        Scanner scanner = new Scanner(System.in);
        
            try {
                // Establecer la conexión
                Connection conexion = DriverManager.getConnection(url, usuario, contrasena);

                // Pedir datos al usuario
                System.out.print("Nombre del producto: ");
                String nombre = scanner.nextLine();
                System.out.print("Precio del producto: ");
                double precio = scanner.nextDouble();
                System.out.print("Cantidad del producto: ");
                int cantidad = scanner.nextInt();

                // Sentencia SQL para insertar
                String sql = "INSERT INTO productos (nombre, precio, cantidad) VALUES (?, ?, ?)";
                PreparedStatement stmt = conexion.prepareStatement(sql);
                stmt.setString(1, nombre);
                stmt.setDouble(2, precio);
                stmt.setInt(3, cantidad);

                // Ejecutar la inserción
                stmt.executeUpdate();
                System.out.println("Producto insertado con éxito");

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        
    }
    
    
    public static void modificar(String url, String usuario, String contrasena){
        
        Scanner scanner = new Scanner(System.in);
        
         try {
                // Establecer la conexión
                Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
                
                System.out.println("ID del producto a modificar");
                int id = scanner.nextInt();
                
                
                System.out.println("Nuevo precio del producto");
                double nuevoPrecio = scanner.nextDouble();
                
                
                

                // Sentencia SQL para modificar
                String sql = "UPDATE productos SET precio = ?  WHERE id = ?";
                PreparedStatement stmt = conexion.prepareStatement(sql);
                stmt.setDouble(1, nuevoPrecio);
                stmt.setInt(2, id);
              
                // Ejecutar la modificaicón
                
                int filasAfectadas = stmt.executeUpdate();
                
                if(filasAfectadas > 0){
                    System.out.println("Producto actualizado con éxito");
                }else{
                    System.out.println("No se encontro el producto con el ID " + id);
                }
                
                stmt.close();
                
          

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } 
    }
    
    
    public  static void eliminar(String url, String usuario, String contrasena){
        
         Scanner scanner = new Scanner(System.in);
         
         try{
             
              Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
                
              System.out.println("ID del producto a eliminar");
              int id = scanner.nextInt();
              
                 // Sentencia SQL para eliminar
                String sql = "DELETE FROM productos WHERE id = ?";
                PreparedStatement stmt = conexion.prepareStatement(sql);
                stmt.setInt(1, id);
                
                 int filasAfectadas = stmt.executeUpdate();
                
                if(filasAfectadas > 0){
                    System.out.println("Producto eliminar con éxito");
                }else{
                    System.out.println("No se encontro el producto con el ID " + id);
                }
                
                stmt.close();
              
              
                
                
             
             
         }catch(Exception e){
             System.out.println("Error:" + e.getMessage());
             
         }
         
         
        
        
    }
    
    
}
