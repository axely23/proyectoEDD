/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author gollu
 */
public class Sucursal
{

    private String nombre;
    private String nombreFarm;
    private String clave;
    private String estado;
    private String ciudad;
    private long telefono;

    public Sucursal()
    {
    }

    public Sucursal(String nombre, String nombreFarm, String clave, String estado, String ciudad, long telefono)
    {
        this.nombre = nombre;
        this.nombreFarm = nombreFarm;
        this.clave = clave;
        this.estado = estado;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public Sucursal(String nombre, String nombreFarm, String clave, String estado, long telefono)
    {
        this.nombre = nombre;
        this.nombreFarm = nombreFarm;
        this.clave = clave;
        this.estado = estado;
        this.telefono = telefono;
    }
    
    

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the nombreFarm
     */
    public String getNombreFarm()
    {
        return nombreFarm;
    }

    /**
     * @param nombreFarm the nombreFarm to set
     */
    public void setNombreFarm(String nombreFarm)
    {
        this.nombreFarm = nombreFarm;
    }

    /**
     * @return the clave
     */
    public String getClave()
    {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave)
    {
        this.clave = clave;
    }

    /**
     * @return the estado
     */
    public String getEstado()
    {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado)
    {
        this.estado = estado;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad()
    {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad)
    {
        this.ciudad = ciudad;
    }

    /**
     * @return the telefono
     */
    public long getTelefono()
    {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(long telefono)
    {
        this.telefono = telefono;
    }

}
