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
public class PnModFarm extends javax.swing.JPanel
{

    String farm;

    /**
     * Creates new form PnAgregarSuc
     */
    public PnModFarm()
    {
        initComponents();
        VtnPrincipal.disablePaste(cTipoSoC, cRfcC);
        msj.setVisible(false);
        llenadoCombo(cmFarmaciaSuc, "SELECT * FROM farmacia f;");
    }

    public void llenadoCombo(JComboBox cb, String consulta)
    {
        ArrayList<String> f = ManipulaSelecciones.select(consulta);
        for (int i = 0; i < f.size(); i++)
        {
            cb.addItem(f.get(i));
        }
    }

    public static void vaP2(KeyEvent ke, int len, String s)
    {
        if (s.length() == len)
        {
            ke.consume();
        } else
        {
            if ((ke.getKeyChar() < 'a' || ke.getKeyChar() > 'z')
                    && (ke.getKeyChar() < 'A' || ke.getKeyChar() > 'Z')
                    && ke.getKeyCode() != 8 && ke.getKeyChar() != 'ñ'
                    && ke.getKeyChar() != 'Ñ'
                    && (ke.getKeyChar() < '0' || ke.getKeyChar() > '9'))
            {
                ke.setKeyChar((char) 8);
            } else if (ke.getKeyChar() >= 'a' && ke.getKeyChar() <= 'z')
            {
                ke.setKeyChar((char) (ke.getKeyChar() - 32));
            } else if (ke.getKeyChar() == 'ñ')
            {
                ke.setKeyChar('Ñ');
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
        AgregarSucursales = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cmFarmaciaSuc = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        msj = new javax.swing.JLabel();
        RegresarIN = new javax.swing.JPanel();
        RegresarINtxt = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cTipoSoC = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        cRfcC = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgregarSucursales.setBackground(new java.awt.Color(255, 255, 255));
        AgregarSucursales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        AgregarSucursales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Modifica Farmacia");
        AgregarSucursales.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, 30));

        cmFarmaciaSuc.setBackground(new java.awt.Color(0, 102, 102));
        cmFarmaciaSuc.addPopupMenuListener(new javax.swing.event.PopupMenuListener()
        {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt)
            {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt)
            {
                cmFarmaciaSucPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt)
            {
            }
        });
        cmFarmaciaSuc.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmFarmaciaSucActionPerformed(evt);
            }
        });
        cmFarmaciaSuc.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                cmFarmaciaSucKeyPressed(evt);
            }
        });
        AgregarSucursales.add(cmFarmaciaSuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 160, -1));

        jLabel29.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 102, 102));
        jLabel29.setText("Farmacia");
        AgregarSucursales.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 120, 20));

        btnAgregar.setBackground(new java.awt.Color(66, 141, 141));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Modifiacar Farmacia");
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
        AgregarSucursales.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 170, 30));

        msj.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        msj.setForeground(new java.awt.Color(35, 35, 35));
        msj.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        msj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/advertencia.png"))); // NOI18N
        AgregarSucursales.add(msj, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 320, 60));

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

        AgregarSucursales.add(RegresarIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 170, 30));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Tipo de Sociedad");
        AgregarSucursales.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 150, 20));

        cTipoSoC.setBorder(null);
        cTipoSoC.setName("sociedad"); // NOI18N
        cTipoSoC.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                cTipoSoCKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                cTipoSoCKeyTyped(evt);
            }
        });
        AgregarSucursales.add(cTipoSoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 340, 30));

        jSeparator11.setBackground(new java.awt.Color(0, 51, 51));
        AgregarSucursales.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 340, 20));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("RFC");
        AgregarSucursales.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 100, 20));

        cRfcC.setBorder(null);
        cRfcC.setName("RFC"); // NOI18N
        cRfcC.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                cRfcCKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                cRfcCKeyTyped(evt);
            }
        });
        AgregarSucursales.add(cRfcC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 340, 30));

        jSeparator12.setBackground(new java.awt.Color(0, 51, 51));
        AgregarSucursales.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 340, 20));

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

    private void cmFarmaciaSucPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt)//GEN-FIRST:event_cmFarmaciaSucPopupMenuWillBecomeInvisible
    {//GEN-HEADEREND:event_cmFarmaciaSucPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cmFarmaciaSucPopupMenuWillBecomeInvisible

    private void cmFarmaciaSucActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmFarmaciaSucActionPerformed
    {//GEN-HEADEREND:event_cmFarmaciaSucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmFarmaciaSucActionPerformed

    private void btnAgregarFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnAgregarFocusGained
    {//GEN-HEADEREND:event_btnAgregarFocusGained
        btnAgregar.setBackground(new java.awt.Color(31, 68, 68));
    }//GEN-LAST:event_btnAgregarFocusGained

    private void btnAgregarFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnAgregarFocusLost
    {//GEN-HEADEREND:event_btnAgregarFocusLost
        btnAgregar.setBackground(new java.awt.Color(66, 141, 141));
    }//GEN-LAST:event_btnAgregarFocusLost

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnAgregarMouseEntered
    {//GEN-HEADEREND:event_btnAgregarMouseEntered
        btnAgregar.setBackground(new java.awt.Color(31, 68, 68));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnAgregarMouseExited
    {//GEN-HEADEREND:event_btnAgregarMouseExited
        btnAgregar.setBackground(new java.awt.Color(66, 141, 141));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAgregarActionPerformed
    {//GEN-HEADEREND:event_btnAgregarActionPerformed
        if (VtnPrincipal.vComponentes(cTipoSoC, cRfcC))
        {
            msj.setVisible(true);
            msj.setText("<html>" + VtnPrincipal.componentes(cTipoSoC, cRfcC) + "<html>");
        } else
        {
            if (!VtnPrincipal.validaCad(cRfcC.getText(), "^[A-Z]{4}\\d{6}[A-Z\\d]{3}$"))
            {
                msj.setVisible(true);
                msj.setText("<html>" + "Ingresa un RFC valido" + "<html>");
                CtrlInterfaz.selecciona(cRfcC);
            } else
            {
                Crud.modificacion("UPDATE farmacia f SET f.tipoSociedad = '" + cTipoSoC.getText() + "', f.rfc = '" + cRfcC.getText()
                        + "' WHERE f.nombreFarm = '" + String.valueOf(cmFarmaciaSuc.getSelectedItem()) + "';");
                msj.setVisible(false);
                CtrlInterfaz.limpia(cTipoSoC, cRfcC);
                JOptionPane.showMessageDialog(null, "Farmacia modificada con exito", "Altas", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/comprobado.png", 50, 50));
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void RegresarINtxtMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_RegresarINtxtMouseClicked
    {//GEN-HEADEREND:event_RegresarINtxtMouseClicked
        VtnPrincipal.mostrarPanel(new PnInicio(), jPanel1);
    }//GEN-LAST:event_RegresarINtxtMouseClicked

    private void RegresarINtxtMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_RegresarINtxtMouseEntered
    {//GEN-HEADEREND:event_RegresarINtxtMouseEntered
        RegresarIN.setBackground(new Color(204, 0, 0));
    }//GEN-LAST:event_RegresarINtxtMouseEntered

    private void RegresarINtxtMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_RegresarINtxtMouseExited
    {//GEN-HEADEREND:event_RegresarINtxtMouseExited
        RegresarIN.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_RegresarINtxtMouseExited

    private void cmFarmaciaSucKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cmFarmaciaSucKeyPressed
    {//GEN-HEADEREND:event_cmFarmaciaSucKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            evt.consume();
        }
    }//GEN-LAST:event_cmFarmaciaSucKeyPressed

    private void cTipoSoCKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cTipoSoCKeyPressed
    {//GEN-HEADEREND:event_cTipoSoCKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            cRfcC.requestFocus();
        }
    }//GEN-LAST:event_cTipoSoCKeyPressed

    private void cTipoSoCKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cTipoSoCKeyTyped
    {//GEN-HEADEREND:event_cTipoSoCKeyTyped
        Validaciones.validaAlfabeticos(evt, 20, cTipoSoC.getText());
        if (evt.getKeyChar() == '.')
        {
            evt.setKeyChar((char) 8);
        }
    }//GEN-LAST:event_cTipoSoCKeyTyped

    private void cRfcCKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cRfcCKeyPressed
    {//GEN-HEADEREND:event_cRfcCKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            btnAgregar.requestFocus();
        }
    }//GEN-LAST:event_cRfcCKeyPressed

    private void cRfcCKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cRfcCKeyTyped
    {//GEN-HEADEREND:event_cRfcCKeyTyped
        Validaciones.validaAlfanumerico(evt, 13, cRfcC.getText());
        if (evt.getKeyChar() == '.')
        {
            evt.setKeyChar((char) 8);
        }
        vaP2(evt, 13, cRfcC.getText());
    }//GEN-LAST:event_cRfcCKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgregarSucursales;
    private javax.swing.JPanel RegresarIN;
    private javax.swing.JLabel RegresarINtxt;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JTextField cRfcC;
    private javax.swing.JTextField cTipoSoC;
    private javax.swing.JComboBox<String> cmFarmaciaSuc;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JLabel msj;
    // End of variables declaration//GEN-END:variables
}
