/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import clases.Farmacia;
import clases.Sucursal;
import conexion.ManipulaSelecciones;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Daniel Yair Mendoza
 */
public class PnConsSuc extends javax.swing.JPanel
{

    int ancho = 0;

    /**
     * Creates new form PnConsFarm
     */
    public PnConsSuc()
    {
        initComponents();
        msj.setVisible(false);
        llenadoTabla(ManipulaSelecciones.llenaSuc("SELECT * FROM sucursal ORDER BY nombreSuc;"));
    }

    public void llenadoTabla(ArrayList<Sucursal> arr)
    {
        if (arr.isEmpty())
        {
            msj.setVisible(false);
        } else
        {
            for (int i = 0; i < arr.size(); i++)
            {
                pnTabla.add(generador(arr.get(i).getNombre(), arr.get(i).getNombreFarm(), arr.get(i).getClave(), arr.get(i).getEstado(), arr.get(i).getCiudad(),
                        String.valueOf(arr.get(i).getTelefono())),
                        new org.netbeans.lib.awtextra.AbsoluteConstraints(0, ancho, 880, 32));
                ancho += 32;
                pnTabla.updateUI();
            }
        }
    }

    public JPanel generador(String nombre, String farm, String clave, String estado, String ciudad, String telf)
    {
        JPanel pnRegistro = new javax.swing.JPanel();
        JLabel jLabel30 = new javax.swing.JLabel();
        JLabel jLabel31 = new javax.swing.JLabel();
        JLabel jLabel32 = new javax.swing.JLabel();
        JLabel jLabel33 = new javax.swing.JLabel();
        JLabel jLabel34 = new javax.swing.JLabel();
        JLabel jLabel35 = new javax.swing.JLabel();

        pnRegistro.setBackground(new java.awt.Color(255, 255, 255));
        pnRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText(nombre);
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnRegistro.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 32));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText(farm);
        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnRegistro.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 160, 32));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText(clave);
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnRegistro.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 80, 32));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText(estado);
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnRegistro.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 160, 32));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText(ciudad);
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnRegistro.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 160, 32));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText(telf);
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnRegistro.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 160, 32));

        return pnRegistro;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnTabla = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        msj = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(66, 141, 141));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Farmacia");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 160, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ciudad");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 160, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Telefono");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 160, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Estado");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 160, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Clave");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 80, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sucursal");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 30));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 880, 30));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnTabla.setBackground(new java.awt.Color(255, 255, 255));
        pnTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(pnTabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 880, 320));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 31)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sucursales");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 230, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 460, 10));

        msj.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        msj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msj.setText("No se encontraron sucursales");
        add(msj, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 420, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel msj;
    private javax.swing.JPanel pnTabla;
    // End of variables declaration//GEN-END:variables
}