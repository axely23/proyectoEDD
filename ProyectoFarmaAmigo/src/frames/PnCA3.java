/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Validaciones;
import clases.Proveedor;
import clases.Sucursal;
import conexion.Crud;
import conexion.ManipulaSelecciones;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Daniel Yair Mendoza
 */
public class PnCA3 extends javax.swing.JPanel
{

    /**
     * Creates new form PnAgregarSuc
     */
    public PnCA3()
    {
        initComponents();
        msj.setVisible(false);
        llenadoCombo(cmCiudad, "SELECT s.ciudad FROM sucursal s GROUP BY s.ciudad ORDER BY s.ciudad;");;
    }

    public void llenadoCombo(JComboBox cb, String consulta)
    {
        ArrayList<String> f = ManipulaSelecciones.select(consulta);
        if (f.isEmpty())
        {
            cb.setEnabled(false);
            msj.setVisible(true);
        } else
        {
            for (int i = 0; i < f.size(); i++)
            {
                cb.addItem(f.get(i));
            }
        }
    }

    public void llenaTabla(ArrayList<Sucursal> arr)
    {
        int ancho = 0;
        for (int i = 0; i < arr.size(); i++)
        {
            pnTabla.add(generador(arr.get(i).getNombre(), arr.get(i).getNombreFarm(), arr.get(i).getClave(), arr.get(i).getEstado(), String.valueOf(arr.get(i).getTelefono())),
                    new org.netbeans.lib.awtextra.AbsoluteConstraints(ancho, 0, 290, 260));
            ancho += 310;
            pnTabla.updateUI();
        }
    }

    public JPanel generador(String suc, String farm, String clave, String estado, String telefono)
    {
        JPanel pnSuc = new javax.swing.JPanel();
        JLabel lbSuc = new javax.swing.JLabel();
        JLabel jLabel4 = new javax.swing.JLabel();
        JLabel lbS1 = new javax.swing.JLabel();
        JLabel lbS2 = new javax.swing.JLabel();
        JLabel lbS3 = new javax.swing.JLabel();
        JLabel lbS4 = new javax.swing.JLabel();

        pnSuc.setBackground(new java.awt.Color(255, 255, 255));
        pnSuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnSuc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSuc.setBackground(new java.awt.Color(66, 141, 141));
        lbSuc.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbSuc.setForeground(new java.awt.Color(255, 255, 255));
        lbSuc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSuc.setText(suc);
        lbSuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbSuc.setOpaque(true);
        pnSuc.add(lbSuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 290, 30));

        jLabel4.setBackground(new java.awt.Color(66, 141, 141));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/farmacia.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setOpaque(true);
        pnSuc.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 80));

        lbS1.setBackground(new java.awt.Color(175, 207, 207));
        lbS1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbS1.setText("  Farmacia: " + farm);
        lbS1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbS1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbS1.setOpaque(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbS1.setOpaque(false);
            }
        });
        pnSuc.add(lbS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 290, 40));

        lbS2.setBackground(new java.awt.Color(175, 207, 207));
        lbS2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbS2.setText("  Clave: " + clave);
        lbS2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbS2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbS2.setOpaque(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbS2.setOpaque(false);
            }
        });
        pnSuc.add(lbS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 290, 40));

        lbS3.setBackground(new java.awt.Color(175, 207, 207));
        lbS3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbS3.setText("  Estado:" + estado);
        lbS3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbS3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbS3.setOpaque(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbS3.setOpaque(false);
            }
        });
        pnSuc.add(lbS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 290, 40));

        lbS4.setBackground(new java.awt.Color(175, 207, 207));
        lbS4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbS4.setText("  Telefono:" + telefono);
        lbS4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbS4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbS4.setOpaque(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbS4.setOpaque(false);
            }
        });
        pnSuc.add(lbS4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 290, 40));

        return pnSuc;
    }

    public Icon icono(String direccion, int ancho, int alto)
    {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(direccion)).getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH));
        return img;
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

        jPanel1 = new javax.swing.JPanel();
        AgregarSucursales = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cmCiudad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnTabla = new javax.swing.JPanel();
        msj = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgregarSucursales.setBackground(new java.awt.Color(255, 255, 255));
        AgregarSucursales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        AgregarSucursales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Sucursales por ciudad");
        AgregarSucursales.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, 30));

        jLabel30.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 102));
        jLabel30.setText("Ciudad");
        AgregarSucursales.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 80, 20));

        cmCiudad.setBackground(new java.awt.Color(0, 102, 102));
        cmCiudad.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                cmCiudadItemStateChanged(evt);
            }
        });
        cmCiudad.addPopupMenuListener(new javax.swing.event.PopupMenuListener()
        {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt)
            {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt)
            {
                cmCiudadPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt)
            {
            }
        });
        cmCiudad.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                cmCiudadKeyPressed(evt);
            }
        });
        AgregarSucursales.add(cmCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 160, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        pnTabla.setBackground(new java.awt.Color(255, 255, 255));
        pnTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(pnTabla);

        AgregarSucursales.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 930, 300));

        msj.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        msj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msj.setText("No se encontraron sucusales");
        AgregarSucursales.add(msj, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 420, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AgregarSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AgregarSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cmCiudadItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cmCiudadItemStateChanged
    {//GEN-HEADEREND:event_cmCiudadItemStateChanged
        pnTabla.removeAll();
        pnTabla.updateUI();

        ArrayList<Sucursal> arr = ManipulaSelecciones.llenaCA3("SELECT s.nombreSuc, s.nombreFarm, s.claveSuc, s.estado, s.telefono FROM sucursal s"
                + " WHERE s.ciudad = '" + String.valueOf(cmCiudad.getSelectedItem()) + "';");

        if (arr.isEmpty())
        {
            msj.setVisible(true);
        } else
        {
            msj.setVisible(false);
            //lleno tabla
            llenaTabla(arr);
        }

    }//GEN-LAST:event_cmCiudadItemStateChanged

    private void cmCiudadPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt)//GEN-FIRST:event_cmCiudadPopupMenuWillBecomeInvisible
    {//GEN-HEADEREND:event_cmCiudadPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cmCiudadPopupMenuWillBecomeInvisible

    private void cmCiudadKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cmCiudadKeyPressed
    {//GEN-HEADEREND:event_cmCiudadKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            evt.consume();
        }
    }//GEN-LAST:event_cmCiudadKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgregarSucursales;
    private javax.swing.JComboBox<String> cmCiudad;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel msj;
    private javax.swing.JPanel pnTabla;
    // End of variables declaration//GEN-END:variables
}
