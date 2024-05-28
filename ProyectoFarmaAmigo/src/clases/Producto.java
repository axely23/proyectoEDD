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
public class Producto
{

    private String clave;
    private String nombrePrd;
    private String nombreSuc;
    private String nombreProv;
    private float precio;
    private int existencia;
    private String farmacia;

    public Producto()
    {
    }

    public Producto(String clave, String nombrePrd, String nombreSuc, String nombreProv, float precio, int existencia)
    {
        this.clave = clave;
        this.nombrePrd = nombrePrd;
        this.nombreSuc = nombreSuc;
        this.nombreProv = nombreProv;
        this.precio = precio;
        this.existencia = existencia;
    }

    public Producto(String nombrePrd, String nombreSuc, String nombreProv, float precio, int existencia, String farmacia)
    {
        this.nombrePrd = nombrePrd;
        this.nombreSuc = nombreSuc;
        this.nombreProv = nombreProv;
        this.precio = precio;
        this.existencia = existencia;
        this.farmacia = farmacia;
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
     * @return the nombrePrd
     */
    public String getNombrePrd()
    {
        return nombrePrd;
    }

    /**
     * @param nombrePrd the nombrePrd to set
     */
    public void setNombrePrd(String nombrePrd)
    {
        this.nombrePrd = nombrePrd;
    }

    /**
     * @return the nombreSuc
     */
    public String getNombreSuc()
    {
        return nombreSuc;
    }

    /**
     * @param nombreSuc the nombreSuc to set
     */
    public void setNombreSuc(String nombreSuc)
    {
        this.nombreSuc = nombreSuc;
    }

    /**
     * @return the nombreProv
     */
    public String getNombreProv()
    {
        return nombreProv;
    }

    /**
     * @param nombreProv the nombreProv to set
     */
    public void setNombreProv(String nombreProv)
    {
        this.nombreProv = nombreProv;
    }

    /**
     * @return the precio
     */
    public float getPrecio()
    {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio)
    {
        this.precio = precio;
    }

    /**
     * @return the existencia
     */
    public int getExistencia()
    {
        return existencia;
    }

    /**
     * @param existencia the existencia to set
     */
    public void setExistencia(int existencia)
    {
        this.existencia = existencia;
    }

    /**
     * @return the farmacia
     */
    public String getFarmacia()
    {
        return farmacia;
    }

    /**
     * @param farmacia the farmacia to set
     */
    public void setFarmacia(String farmacia)
    {
        this.farmacia = farmacia;
    }

}
