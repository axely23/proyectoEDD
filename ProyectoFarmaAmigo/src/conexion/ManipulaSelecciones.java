/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import clases.Farmacia;
import clases.Producto;
import clases.Proveedor;
import clases.Sucursal;
import static conexion.ConexionMySQL.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author gollu
 */
public class ManipulaSelecciones
{

    /**
     * Método para verificar si el valor del campo de un registro ya se
     * encuentra existente
     *
     * @param consulta Consulta
     * @param campo Campo que se desea verificar
     * @return false si el valor del campo se encuentra en la tabla
     */
    public static boolean validaCampo(String consulta, String campo)
    {
        try
        {
            boolean a = true;
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);
            while (resultSet.next())
            {
                if (resultSet.getString(1).equals(campo))
                {
                    a = false;
                }
            }
            // Cerrar recursos
            resultSet.close();
            statement.close();
            return a;
        } catch (SQLException e)
        {
            System.out.println("Error al realizar la selección: " + e.getMessage());
        }
        return false;
    }

    public static ArrayList<String> select(String consulta)
    {
        try
        {
            ArrayList<String> c = new ArrayList<>();
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);

            while (resultSet.next())
            {
                c.add(resultSet.getString(1));
            }
            // Cerrar recursos
            resultSet.close();
            statement.close();
            return c;
        } catch (SQLException e)
        {
            System.out.println("Error al realizar la selección: " + e.getMessage());
        }
        return null;
    }

    public static boolean validaSuc(String consulta)
    {
        try
        {
            boolean a = false;
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);

            while (resultSet.next())
            {
                a = true;
            }
            // Cerrar recursos
            resultSet.close();
            statement.close();
            return a;
        } catch (SQLException e)
        {
            System.out.println("Error al realizar la selección: " + e.getMessage());
        }
        return false;
    }

    public static ArrayList<Farmacia> llenaFarm(String consulta)
    {
        try
        {
            ArrayList<Farmacia> c = new ArrayList<>();
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);

            while (resultSet.next())
            {
                c.add(new Farmacia(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)));
            }
            // Cerrar recursos
            resultSet.close();
            statement.close();
            return c;
        } catch (SQLException e)
        {
            System.out.println("Error al realizar la selección: " + e.getMessage());
        }
        return null;
    }

    public static ArrayList<Sucursal> llenaSuc(String consulta)
    {
        try
        {
            ArrayList<Sucursal> c = new ArrayList<>();
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);

            while (resultSet.next())
            {
                c.add(new Sucursal(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getLong(6)));

            }
            // Cerrar recursos
            resultSet.close();
            statement.close();
            return c;
        } catch (SQLException e)
        {
            System.out.println("Error al realizar la selección: " + e.getMessage());
        }
        return null;
    }

    public static ArrayList<Proveedor> llenaProv(String consulta)
    {
        try
        {
            ArrayList<Proveedor> c = new ArrayList<>();
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);

            while (resultSet.next())
            {
                c.add(new Proveedor(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)));
            }
            // Cerrar recursos
            resultSet.close();
            statement.close();
            return c;
        } catch (SQLException e)
        {
            System.out.println("Error al realizar la selección: " + e.getMessage());
        }
        return null;
    }

    public static ArrayList<Producto> llenaProd(String consulta)
    {
        try
        {
            ArrayList<Producto> c = new ArrayList<>();
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);

            while (resultSet.next())
            {
                c.add(new Producto(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getFloat(5), resultSet.getInt(6)));
            }
            // Cerrar recursos
            resultSet.close();
            statement.close();
            return c;
        } catch (SQLException e)
        {
            System.out.println("Error al realizar la selección: " + e.getMessage());
        }
        return null;
    }

    public static ArrayList<Producto> llenaCA2(String consulta)
    {
        try
        {
            ArrayList<Producto> c = new ArrayList<>();
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);

            while (resultSet.next())
            {
                c.add(new Producto(resultSet.getString(1), resultSet.getString(3), resultSet.getString(4), resultSet.getFloat(5), resultSet.getInt(6), resultSet.getString(2)));
            }
            // Cerrar recursos
            resultSet.close();
            statement.close();
            return c;
        } catch (SQLException e)
        {
            System.out.println("Error al realizar la selección: " + e.getMessage());
        }
        return null;
    }
    public static ArrayList<Sucursal> llenaCA3(String consulta)
    {
        try
        {
            ArrayList<Sucursal> c = new ArrayList<>();
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);

            while (resultSet.next())
            {
                c.add(new Sucursal(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getLong(5)));
            }
            // Cerrar recursos
            resultSet.close();
            statement.close();
            return c;
        } catch (SQLException e)
        {
            System.out.println("Error al realizar la selección: " + e.getMessage());
        }
        return null;
    }
}
