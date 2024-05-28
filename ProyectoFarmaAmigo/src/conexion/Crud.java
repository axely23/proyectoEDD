/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import static conexion.ConexionMySQL.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author gollu
 */
public class Crud
{

    public static void insercion(String consulta)
    {
        try
        {
            Statement statement = conexion.createStatement();
            int filasInsertadas = statement.executeUpdate(consulta);

            if (filasInsertadas > 0)
            {
                System.out.println("Inserción exitosa!");
            } else
            {
                System.out.println("La inserción no se realizó.");
            }

            // Cerrar recursos
            statement.close();
        } catch (SQLException e)
        {
            System.out.println("Error al realizar la inserción: " + e.getMessage());
        }
    }

    public static void modificacion(String consulta)
    {
        try
        {
            Statement statement = conexion.createStatement();
            int filasModificadas = statement.executeUpdate(consulta);

            if (filasModificadas > 0)
            {
                System.out.println("Modificación exitosa!");
            } else
            {
                System.out.println("La modificación no se realizó.");
            }

            // Cerrar recursos
            statement.close();
        } catch (SQLException e)
        {
            System.out.println("Error al realizar la modificación: " + e.getMessage());
        }
    }

    public static void elimina(String consulta)
    {
        try
        {
            Statement statement = conexion.createStatement();
            int filasModificadas = statement.executeUpdate(consulta);

            if (filasModificadas > 0)
            {
                System.out.println("Eliminacion exitosa!");
            } else
            {
                System.out.println("La eliminacion no se realizó.");
            }

            // Cerrar recursos
            statement.close();
        } catch (SQLException e)
        {
            System.out.println("Error al realizar la eliminacion: " + e.getMessage());
        }
    }
}
