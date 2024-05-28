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
public class Farmacia
{

    private String nombre;
    private String claveFarmacia;
    private String tipoSociedad;
    private String rfc;

    public Farmacia()
    {
    }

    public Farmacia(String nombre, String claveFarmacia, String tipoSociedad, String rfc)
    {
        this.nombre = nombre;
        this.claveFarmacia = claveFarmacia;
        this.tipoSociedad = tipoSociedad;
        this.rfc = rfc;
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
     * @return the claveFarmacia
     */
    public String getClaveFarmacia()
    {
        return claveFarmacia;
    }

    /**
     * @param claveFarmacia the claveFarmacia to set
     */
    public void setClaveFarmacia(String claveFarmacia)
    {
        this.claveFarmacia = claveFarmacia;
    }

    /**
     * @return the tipoSociedad
     */
    public String getTipoSociedad()
    {
        return tipoSociedad;
    }

    /**
     * @param tipoSociedad the tipoSociedad to set
     */
    public void setTipoSociedad(String tipoSociedad)
    {
        this.tipoSociedad = tipoSociedad;
    }

    /**
     * @return the rfc
     */
    public String getRfc()
    {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc)
    {
        this.rfc = rfc;
    }

}
