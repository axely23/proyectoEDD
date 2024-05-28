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
public class PnBajaProv extends javax.swing.JPanel
{

    /**
     * Creates new form PnAgregarFarm
     */
    public PnBajaProv()
    {
        initComponents();
        msj.setVisible(false);
        llenadoCombo(cmProv, "SELECT p.nombreProv FROM proveedor p ORDER BY p.nombreProv;");
    }

    public void llenadoCombo(JComboBox cb, String consulta)
    {
        ArrayList<String> f = ManipulaSelecciones.select(consulta);
        if (f.isEmpty())
        {
            cb.setEnabled(false);
        } else
        {
            for (int i = 0; i < f.size(); i++)
            {
                cb.addItem(f.get(i));
            }
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
        AgregarFarmacias = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        RegresarIN = new javax.swing.JPanel();
        RegresarINtxt = new javax.swing.JLabel();
        msj = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        cmProv = new javax.swing.JComboBox<>();

        AgregarFarmacias.setBackground(new java.awt.Color(255, 255, 255));
        AgregarFarmacias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        AgregarFarmacias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Baja Proveedor");
        AgregarFarmacias.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, 30));

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

        AgregarFarmacias.add(RegresarIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 170, 30));

        msj.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        msj.setForeground(new java.awt.Color(35, 35, 35));
        msj.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        msj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/advertencia.png"))); // NOI18N
        AgregarFarmacias.add(msj, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 320, 60));

        btnAgregar.setBackground(new java.awt.Color(66, 141, 141));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Elimina Proveedor");
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
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btnAgregarMouseClicked(evt);
            }
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
        AgregarFarmacias.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 170, 30));

        jLabel29.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 102, 102));
        jLabel29.setText("Proveedor");
        AgregarFarmacias.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 130, 20));

        cmProv.setBackground(new java.awt.Color(0, 102, 102));
        cmProv.addPopupMenuListener(new javax.swing.event.PopupMenuListener()
        {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt)
            {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt)
            {
                cmProvPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt)
            {
            }
        });
        cmProv.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmProvActionPerformed(evt);
            }
        });
        cmProv.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                cmProvKeyPressed(evt);
            }
        });
        AgregarFarmacias.add(cmProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 160, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AgregarFarmacias, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AgregarFarmacias, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmProvKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cmProvKeyPressed
    {//GEN-HEADEREND:event_cmProvKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            evt.consume();
        }
    }//GEN-LAST:event_cmProvKeyPressed

    private void cmProvActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmProvActionPerformed
    {//GEN-HEADEREND:event_cmProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmProvActionPerformed

    private void cmProvPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt)//GEN-FIRST:event_cmProvPopupMenuWillBecomeInvisible
    {//GEN-HEADEREND:event_cmProvPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cmProvPopupMenuWillBecomeInvisible

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAgregarActionPerformed
    {//GEN-HEADEREND:event_btnAgregarActionPerformed
        if (cmProv.isEnabled())
        {
            Crud.elimina("DELETE FROM producto WHERE nombreProv = '" + String.valueOf(cmProv.getSelectedItem()) + "';");
            Crud.elimina("DELETE FROM proveedor WHERE nombreProv = '" + String.valueOf(cmProv.getSelectedItem()) + "';");
            msj.setVisible(false);
            cmProv.removeAllItems();
            llenadoCombo(cmProv, "SELECT p.nombreProv FROM proveedor p ORDER BY p.nombreProv;");
            JOptionPane.showMessageDialog(null, "Proveedor eliminado con exito", "Altas", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/comprobado.png", 50, 50));
            if (!ManipulaSelecciones.validaSuc("SELECT p.nombreProv FROM proveedor p ORDER BY p.nombreProv;"))
            {
                JOptionPane.showMessageDialog(null, "Has eliminado todos los proveedores \n Da de alta nuevos proveedores ", "Altas", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/comprobado.png", 50, 50));
                VtnPrincipal.mostrarPanel(new PnAgregarProv(), jPanel1);
                VtnPrincipal.mostrarPanel2(new PnSubAltas(), Submenus);
            }
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

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnAgregarMouseClicked
    {//GEN-HEADEREND:event_btnAgregarMouseClicked

    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnAgregarFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnAgregarFocusLost
    {//GEN-HEADEREND:event_btnAgregarFocusLost
        btnAgregar.setBackground(new java.awt.Color(66, 141, 141));
    }//GEN-LAST:event_btnAgregarFocusLost

    private void btnAgregarFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnAgregarFocusGained
    {//GEN-HEADEREND:event_btnAgregarFocusGained
        btnAgregar.setBackground(new java.awt.Color(31, 68, 68));
    }//GEN-LAST:event_btnAgregarFocusGained

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgregarFarmacias;
    private javax.swing.JPanel RegresarIN;
    private javax.swing.JLabel RegresarINtxt;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cmProv;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel msj;
    // End of variables declaration//GEN-END:variables
}