/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author gollu
 */
public class ConexionMySQL
{

    public static  Connection conexion;

    public void conectar()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmaamigo", "root", "123456");
            System.out.println("Conexión exitosa a la base de datos MySQL");
        } catch (ClassNotFoundException e)
        {
            System.out.println("Error al cargar el controlador MySQL: " + e.getMessage());
        } catch (SQLException e)
        {
            System.out.println("Error al conectar a la base de datos MySQL: " + e.getMessage());
        }
    }

    public void desconectar()
    {
        try
        {
            if (conexion != null && !conexion.isClosed())
            {
                conexion.close();
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException e)
        {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

    public void seleccion(String consulta)
    {
        try
        {
            Statement statement = conexion.createStatement();
//            String query = "SELECT * FROM tabla";
            ResultSet resultSet = statement.executeQuery(consulta);

            // Procesar los resultados
            while (resultSet.next())
            {
                // Leer datos del resultado
                String columna1 = resultSet.getString(1);
                int columna2 = resultSet.getInt(2);

                // Hacer algo con los datos, por ejemplo, imprimirlos
                System.out.println("hora: " + columna1 + ", sala: " + columna2);
            }

            // Cerrar recursos
            resultSet.close();
            statement.close();
        } catch (SQLException e)
        {
            System.out.println("Error al realizar la selección: " + e.getMessage());
        }
    }

}
