/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Validaciones;
import conexion.Crud;
import conexion.ManipulaSelecciones;
import static frames.VtnPrincipal.Submenus;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Yair Mendoza
 */
public class PnBajaSuc extends javax.swing.JPanel
{

    String farm;

    /**
     * Creates new form PnAgregarSuc
     */
    public PnBajaSuc()
    {
        initComponents();
        msj.setVisible(false);
        err.setVisible(false);
        llenadoCombo(cmFarmaciaP, "SELECT * FROM farmacia f;");
    }

    public void llenadoCombo(JComboBox cb, String consulta)
    {
        ArrayList<String> f = ManipulaSelecciones.select(consulta);
        for (int i = 0; i < f.size(); i++)
        {
            cb.addItem(f.get(i));
        }
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
        jLabel29 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        msj = new javax.swing.JLabel();
        RegresarIN = new javax.swing.JPanel();
        RegresarINtxt = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cmSuc = new javax.swing.JComboBox<>();
        cmFarmaciaP = new javax.swing.JComboBox<>();
        err = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgregarSucursales.setBackground(new java.awt.Color(255, 255, 255));
        AgregarSucursales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        AgregarSucursales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Baja Sucursal");
        AgregarSucursales.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, 30));

        jLabel29.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 102, 102));
        jLabel29.setText("Sucursal");
        AgregarSucursales.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 150, 20));

        btnAgregar.setBackground(new java.awt.Color(66, 141, 141));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Elimina Sucursal");
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setOpaque(true);
        btnAgregar.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btnAgregarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btnAgregarFocusLost(evt);
            }
        });
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAgregarActionPerformed(evt);
            }
        });
        AgregarSucursales.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 170, 30));

        msj.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        msj.setForeground(new java.awt.Color(35, 35, 35));
        msj.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        msj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/advertencia.png"))); // NOI18N
        AgregarSucursales.add(msj, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 320, 60));

        RegresarIN.setBackground(new java.awt.Color(255, 51, 51));

        RegresarINtxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        RegresarINtxt.setForeground(new java.awt.Color(255, 255, 255));
        RegresarINtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegresarINtxt.setText("Regresar");
        RegresarINtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RegresarINtxt.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                RegresarINtxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                RegresarINtxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                RegresarINtxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout RegresarINLayout = new javax.swing.GroupLayout(RegresarIN);
        RegresarIN.setLayout(RegresarINLayout);
        RegresarINLayout.setHorizontalGroup(
            RegresarINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegresarINLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RegresarINtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        RegresarINLayout.setVerticalGroup(
            RegresarINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegresarINLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RegresarINtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        AgregarSucursales.add(RegresarIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 170, 30));

        jLabel30.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 102));
        jLabel30.setText("Farmacia");
        AgregarSucursales.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 150, 20));

        cmSuc.setBackground(new java.awt.Color(0, 102, 102));
        cmSuc.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                cmSucItemStateChanged(evt);
            }
        });
        cmSuc.addPopupMenuListener(new javax.swing.event.PopupMenuListener()
        {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt)
            {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt)
            {
                cmSucPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt)
            {
            }
        });
        cmSuc.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                cmSucKeyPressed(evt);
            }
        });
        AgregarSucursales.add(cmSuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 160, -1));

        cmFarmaciaP.setBackground(new java.awt.Color(0, 102, 102));
        cmFarmaciaP.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                cmFarmaciaPItemStateChanged(evt);
            }
        });
        cmFarmaciaP.addPopupMenuListener(new javax.swing.event.PopupMenuListener()
        {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt)
            {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt)
            {
                cmFarmaciaPPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt)
            {
            }
        });
        cmFarmaciaP.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                cmFarmaciaPKeyPressed(evt);
            }
        });
        AgregarSucursales.add(cmFarmaciaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 160, -1));

        err.setForeground(new java.awt.Color(255, 0, 0));
        err.setText("Elige una opcion con datos");
        AgregarSucursales.add(err, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 270, -1));

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

    private void cmFarmaciaPKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cmFarmaciaPKeyPressed
    {//GEN-HEADEREND:event_cmFarmaciaPKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            evt.consume();
        }
    }//GEN-LAST:event_cmFarmaciaPKeyPressed

    private void cmFarmaciaPPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt)//GEN-FIRST:event_cmFarmaciaPPopupMenuWillBecomeInvisible
    {//GEN-HEADEREND:event_cmFarmaciaPPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cmFarmaciaPPopupMenuWillBecomeInvisible

    private void cmFarmaciaPItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cmFarmaciaPItemStateChanged
    {//GEN-HEADEREND:event_cmFarmaciaPItemStateChanged
        if (ManipulaSelecciones.validaSuc("SELECT s.nombreSuc FROM sucursal s"
                + " JOIN farmacia f ON f.nombreFarm = s.nombreFarm AND f.nombreFarm = " + "'" + String.valueOf(cmFarmaciaP.getSelectedItem()) + "'"
                + " ORDER BY s.nombreSuc;"))
        {
            cmSuc.setEnabled(true);
            cmSuc.removeAllItems();
            err.setVisible(false);
            btnAgregar.setEnabled(true);
            ArrayList<String> arr = ManipulaSelecciones.select("SELECT s.nombreSuc FROM sucursal s"
                    + " JOIN farmacia f ON f.nombreFarm = s.nombreFarm AND f.nombreFarm = " + "'" + String.valueOf(cmFarmaciaP.getSelectedItem()) + "'"
                    + " ORDER BY s.nombreSuc;");
            for (int i = 0; i < arr.size(); i++)
            {
                cmSuc.addItem(arr.get(i));
            }
        } else
        {
            cmSuc.removeAllItems();
            cmSuc.setEnabled(false);
            err.setVisible(true);
            btnAgregar.setEnabled(false);
        }
    }//GEN-LAST:event_cmFarmaciaPItemStateChanged

    private void cmSucKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cmSucKeyPressed
    {//GEN-HEADEREND:event_cmSucKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            evt.consume();
        }
    }//GEN-LAST:event_cmSucKeyPressed

    private void cmSucPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt)//GEN-FIRST:event_cmSucPopupMenuWillBecomeInvisible
    {//GEN-HEADEREND:event_cmSucPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cmSucPopupMenuWillBecomeInvisible

    private void cmSucItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cmSucItemStateChanged
    {//GEN-HEADEREND:event_cmSucItemStateChanged

    }//GEN-LAST:event_cmSucItemStateChanged

    private void RegresarINtxtMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_RegresarINtxtMouseExited
    {//GEN-HEADEREND:event_RegresarINtxtMouseExited
        RegresarIN.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_RegresarINtxtMouseExited

    private void RegresarINtxtMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_RegresarINtxtMouseEntered
    {//GEN-HEADEREND:event_RegresarINtxtMouseEntered
        RegresarIN.setBackground(new Color(204, 0, 0));
    }//GEN-LAST:event_RegresarINtxtMouseEntered

    private void RegresarINtxtMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_RegresarINtxtMouseClicked
    {//GEN-HEADEREND:event_RegresarINtxtMouseClicked
        VtnPrincipal.mostrarPanel(new PnInicio(), jPanel1);
    }//GEN-LAST:event_RegresarINtxtMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAgregarActionPerformed
    {//GEN-HEADEREND:event_btnAgregarActionPerformed
        Crud.elimina("DELETE FROM producto WHERE nombreSuc = '" + String.valueOf(cmSuc.getSelectedItem()) +"';");
        Crud.elimina("DELETE FROM sucursal WHERE nombreSuc = '" + String.valueOf(cmSuc.getSelectedItem()) +"';");
        msj.setVisible(false);
        cmFarmaciaP.removeAllItems();
        cmSuc.removeAllItems();
        llenadoCombo(cmFarmaciaP, "SELECT f.nombreFarm FROM farmacia f ORDER BY f.nombreFarm;");
        JOptionPane.showMessageDialog(null, "Sucursal eliminada con exito", "Altas", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/comprobado.png", 50, 50));
        if (!ManipulaSelecciones.validaSuc("SELECT s.nombreSuc FROM sucursal s ORDER BY s.nombreSuc;"))
        {
            JOptionPane.showMessageDialog(null, "Has eliminado todas las Sucursales con sus datos relacionados \n Da de alta nuevas sucursales", "Altas", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/comprobado.png", 50, 50));
            VtnPrincipal.mostrarPanel(new PnAgregarSuc(), jPanel1);
            VtnPrincipal.mostrarPanel2(new PnSubAltas(), Submenus);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnAgregarMouseExited
    {//GEN-HEADEREND:event_btnAgregarMouseExited
        btnAgregar.setBackground(new java.awt.Color(66, 141, 141));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnAgregarMouseEntered
    {//GEN-HEADEREND:event_btnAgregarMouseEntered
        btnAgregar.setBackground(new java.awt.Color(31, 68, 68));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnAgregarFocusLost
    {//GEN-HEADEREND:event_btnAgregarFocusLost
        btnAgregar.setBackground(new java.awt.Color(66, 141, 141));
    }//GEN-LAST:event_btnAgregarFocusLost

    private void btnAgregarFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnAgregarFocusGained
    {//GEN-HEADEREND:event_btnAgregarFocusGained
        btnAgregar.setBackground(new java.awt.Color(31, 68, 68));
    }//GEN-LAST:event_btnAgregarFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgregarSucursales;
    private javax.swing.JPanel RegresarIN;
    private javax.swing.JLabel RegresarINtxt;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cmFarmaciaP;
    private javax.swing.JComboBox<String> cmSuc;
    private javax.swing.JLabel err;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel msj;
    // End of variables declaration//GEN-END:variables
}
