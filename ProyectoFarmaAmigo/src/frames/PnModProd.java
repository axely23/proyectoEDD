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
public class PnModProd extends javax.swing.JPanel
{

    boolean a;
    String farm;
    String ciu;

    /**
     * Creates new form PnAgregarProduc
     */
    public PnModProd()
    {
        initComponents();
        VtnPrincipal.disablePaste(cPrecioP, cExistenciaP);
        msj.setVisible(false);
        err.setVisible(false);
        llenadoCombo(cmFarmaciaP, "SELECT f.nombreFarm FROM farmacia f ORDER BY f.nombreFarm;");
//        llenadoFarm(VtnPrincipal.obj.ml.getR(), cmFarmaciaP);
//        farm = String.valueOf(cmFarmaciaP.getSelectedItem());
//        llenadoCiu(VtnPrincipal.obj.ml.getR(), cmCiuP);
//        ciu = (cmCiuP.isEnabled()) ? String.valueOf(cmCiuP.getSelectedItem()) : null;
//        llenadoSuc(VtnPrincipal.obj.ml.getR(), cmSuc);
//        if (verifComb(cmFarmaciaP, cmCiuP, cmSuc))
//        {
//            btnAgregar.setEnabled(true);
//            err.setVisible(false);
//        } else
//        {
//            btnAgregar.setEnabled(false);
//            err.setVisible(true);
//            msj.setVisible(false);
//        }
    }

    public void llenadoCombo(JComboBox cb, String consulta)
    {
        ArrayList<String> f = ManipulaSelecciones.select(consulta);
        for (int i = 0; i < f.size(); i++)
        {
            cb.addItem(f.get(i));
        }
    }

//
//    public void llenadoCiu(NodoListas r, JComboBox jc)
//    {
//        NodoListas aux = VtnPrincipal.obj.ml.buscarNodo(r, new String[]
//        {
//            String.valueOf(cmFarmaciaP.getSelectedItem())
//        }, 0);
//        if (aux != null)
//        {
//            if (aux.getAbj() != null)
//            {
//                jc.setEnabled(true);
//                NodoListas aux1 = aux.getAbj().getSig();
//                do
//                {
//                    jc.addItem(aux1.getEtiq());
//                    aux1 = aux1.getSig();
//                } while (aux1 != aux.getAbj().getSig());
//            } else
//            {
//                jc.addItem("No hay datos ");
//                jc.setEnabled(false);
//            }
//        }
//    }
//
//    public void llenadoSuc(NodoListas r, JComboBox jc)
//    {
//        if (cmCiuP.isEnabled())
//        {
//            NodoListas aux = VtnPrincipal.obj.ml.buscarNodo(r, new String[]
//            {
//                String.valueOf(cmFarmaciaP.getSelectedItem()), String.valueOf(cmCiuP.getSelectedItem())
//            }, 0);
//            if (aux != null)
//            {
//                if (aux.getAbj() != null)
//                {
//                    jc.setEnabled(true);
//                    NodoListas aux1 = aux.getAbj().getSig();
//                    do
//                    {
//                        jc.addItem(aux1.getEtiq());
//                        aux1 = aux1.getSig();
//                    } while (aux1 != aux.getAbj().getSig());
//                } else
//                {
//                    jc.addItem("No hay datos ");
//                    jc.setEnabled(false);
//                }
//            } else
//            {
//                jc.addItem("No hay datos ");
//                jc.setEnabled(false);
//            }
//        } else
//        {
//            jc.addItem("No hay datos ");
//            jc.setEnabled(false);
//        }
//    }
    public boolean verifComb(JComboBox... jc)
    {
        for (int i = 0; i < jc.length; i++)
        {
            if (!jc[i].isEnabled())
            {
                return false;
            }
        }
        return true;
    }

//    public boolean verifProd(NodoListas r, String[] s, int nivel, String nomProd, String cl)
//    {
//        if (nivel == s.length - 1)
//        {
//            if (r != null)
//            {
//                NodoListas aux = r.getSig();
//                do
//                {
//                    if (((Productos) aux.getObj()).getNombre().equals(nomProd))
//                    {
//                        msj.setVisible(true);
//                        msj.setText("<html>" + "Producto ya existente" + "<html>");
//                        CtrlInterfaz.selecciona(cNombreP);
//                        return false;
//                    }
//                    if (((Productos) aux.getObj()).getClaveProducto().equals(cl))
//                    {
//                        msj.setVisible(true);
//                        msj.setText("<html>" + "Clave ya existente" + "<html>");
//                        CtrlInterfaz.selecciona(cClaveP);
//                        return false;
//                    }
//                    aux = aux.getSig();
//                } while (aux != r.getSig());
//            }
//        } else
//        {
//            NodoListas aux = VtnPrincipal.obj.ml.buscar(r, s[nivel]);
//            if (aux != null)
//            {
//                return verifProd(aux.getAbj(), s, nivel + 1, nomProd, cl);
//            }
//        }
//        return true;
//    }
    public Icon icono(String direccion, int ancho, int alto)
    {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(direccion)).getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    public boolean verifPrecio(String s)
    {
        try
        {
            Double.parseDouble(s);
            return true;
        } catch (Exception e)
        {
            return false;
        }
    }

    public boolean verifExis(String s)
    {
        try
        {
            Integer.parseInt(s);
            return true;
        } catch (Exception e)
        {
            return false;
        }
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
        AgregarProductos = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cPrecioP = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        cExistenciaP = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        cmFarmaciaP = new javax.swing.JComboBox<>();
        cmProd = new javax.swing.JComboBox<>();
        cmSuc = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        msj = new javax.swing.JLabel();
        RegresarIN = new javax.swing.JPanel();
        RegresarINtxt = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        err = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgregarProductos.setBackground(new java.awt.Color(255, 255, 255));
        AgregarProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        AgregarProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));
        jLabel18.setText("Modifica Producto");
        AgregarProductos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 29, -1, 30));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 102));
        jLabel20.setText("Producto");
        AgregarProductos.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 100, -1));

        cPrecioP.setBorder(null);
        cPrecioP.setName("precio"); // NOI18N
        cPrecioP.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cPrecioPActionPerformed(evt);
            }
        });
        cPrecioP.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                cPrecioPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                cPrecioPKeyTyped(evt);
            }
        });
        AgregarProductos.add(cPrecioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 340, 30));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 102));
        jLabel21.setText("Precio");
        AgregarProductos.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 150, 30));

        jSeparator21.setBackground(new java.awt.Color(0, 51, 51));
        AgregarProductos.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 340, 20));

        cExistenciaP.setBorder(null);
        cExistenciaP.setName("existencia"); // NOI18N
        cExistenciaP.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cExistenciaPActionPerformed(evt);
            }
        });
        cExistenciaP.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                cExistenciaPKeyTyped(evt);
            }
        });
        AgregarProductos.add(cExistenciaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 340, 30));

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 102));
        jLabel22.setText("Existencia");
        AgregarProductos.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 100, 20));

        jSeparator22.setBackground(new java.awt.Color(0, 51, 51));
        AgregarProductos.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 340, 20));

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
        AgregarProductos.add(cmFarmaciaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 160, -1));

        cmProd.setBackground(new java.awt.Color(0, 102, 102));
        cmProd.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                cmProdKeyPressed(evt);
            }
        });
        AgregarProductos.add(cmProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 160, -1));

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
        AgregarProductos.add(cmSuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 160, -1));

        jLabel31.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 102, 102));
        jLabel31.setText("Farmacia");
        AgregarProductos.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 100, 20));

        jLabel33.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 102, 102));
        jLabel33.setText("Sucursal");
        AgregarProductos.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 100, 20));

        msj.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        msj.setForeground(new java.awt.Color(35, 35, 35));
        msj.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        msj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/advertencia.png"))); // NOI18N
        AgregarProductos.add(msj, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 320, 60));

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

        AgregarProductos.add(RegresarIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 170, 30));

        btnAgregar.setBackground(new java.awt.Color(66, 141, 141));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Modificar producto");
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
        AgregarProductos.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 170, 30));

        err.setForeground(new java.awt.Color(255, 0, 0));
        err.setText("Elige una opcion con datos");
        AgregarProductos.add(err, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 270, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cPrecioPKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cPrecioPKeyPressed
    {//GEN-HEADEREND:event_cPrecioPKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            cExistenciaP.requestFocus();
        }
    }//GEN-LAST:event_cPrecioPKeyPressed

    private void cPrecioPKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cPrecioPKeyTyped
    {//GEN-HEADEREND:event_cPrecioPKeyTyped
        Validaciones.validaFlotantes(evt, 6, cPrecioP.getText());
    }//GEN-LAST:event_cPrecioPKeyTyped

    private void cExistenciaPKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cExistenciaPKeyTyped
    {//GEN-HEADEREND:event_cExistenciaPKeyTyped
        Validaciones.validaEntero(evt, 3, cExistenciaP.getText());
    }//GEN-LAST:event_cExistenciaPKeyTyped

    private void cmFarmaciaPPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt)//GEN-FIRST:event_cmFarmaciaPPopupMenuWillBecomeInvisible
    {//GEN-HEADEREND:event_cmFarmaciaPPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cmFarmaciaPPopupMenuWillBecomeInvisible

    private void cmSucPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt)//GEN-FIRST:event_cmSucPopupMenuWillBecomeInvisible
    {//GEN-HEADEREND:event_cmSucPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cmSucPopupMenuWillBecomeInvisible

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

    private void btnAgregarFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnAgregarFocusGained
    {//GEN-HEADEREND:event_btnAgregarFocusGained
        btnAgregar.setBackground(new java.awt.Color(31, 68, 68));
    }//GEN-LAST:event_btnAgregarFocusGained

    private void btnAgregarFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnAgregarFocusLost
    {//GEN-HEADEREND:event_btnAgregarFocusLost
        btnAgregar.setBackground(new java.awt.Color(66, 141, 141));
    }//GEN-LAST:event_btnAgregarFocusLost

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnAgregarMouseClicked
    {//GEN-HEADEREND:event_btnAgregarMouseClicked

    }//GEN-LAST:event_btnAgregarMouseClicked

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
        if (VtnPrincipal.vComponentes(cPrecioP, cExistenciaP))
        {
            msj.setVisible(true);
            msj.setText("<html>" + VtnPrincipal.componentes(cPrecioP, cExistenciaP) + "<html>");
        } else
        {

            if (!VtnPrincipal.validaCad(cPrecioP.getText(), "^\\d+(\\.\\d{1,2})?$") || Double.parseDouble(cPrecioP.getText()) < 1)
            {
                msj.setVisible(true);
                msj.setText("<html>" + "Ingresa un precio valido" + "<html>");
                CtrlInterfaz.selecciona(cPrecioP);
            } else
            {
                if (!verifExis(cExistenciaP.getText()) || Integer.parseInt(cExistenciaP.getText()) < 1)
                {
                    msj.setVisible(true);
                    msj.setText("<html>" + "Ingresa una existencia valida o mayor a 0" + "<html>");
                    CtrlInterfaz.selecciona(cExistenciaP);
                } else
                {
                    Crud.modificacion("UPDATE producto p JOIN sucursal s ON p.nombreSuc = s.nombreSuc AND s.nombreSuc = '" + String.valueOf(cmSuc.getSelectedItem()) + "'"
                            + " JOIN farmacia f ON f.nombreFarm = s.nombreFarm AND f.nombreFarm = '" + String.valueOf(cmFarmaciaP.getSelectedItem()) + "'"
                            + " SET p.precio = '" + cPrecioP.getText() + "', p.existencia = '" + cExistenciaP.getText()
                            + "' WHERE p.nombreProd = '" + String.valueOf(cmProd.getSelectedItem()) + "';");
                    msj.setVisible(false);
                    CtrlInterfaz.limpia(cPrecioP, cExistenciaP);
                    JOptionPane.showMessageDialog(null, "Producto modificado con exito", "Altas", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/comprobado.png", 50, 50));
                }
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cmFarmaciaPItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cmFarmaciaPItemStateChanged
    {//GEN-HEADEREND:event_cmFarmaciaPItemStateChanged
        if (ManipulaSelecciones.validaSuc("SELECT s.nombreSuc FROM sucursal s"
                + " JOIN farmacia f ON f.nombreFarm = s.nombreFarm AND f.nombreFarm = " + "'" + String.valueOf(cmFarmaciaP.getSelectedItem()) + "'"
                + " ORDER BY s.nombreSuc;"))
        {
            cmSuc.setEnabled(true);
            cmSuc.removeAllItems();
            ArrayList<String> arr = ManipulaSelecciones.select("SELECT s.nombreSuc FROM sucursal s"
                    + " JOIN farmacia f ON f.nombreFarm = s.nombreFarm AND f.nombreFarm = " + "'" + String.valueOf(cmFarmaciaP.getSelectedItem()) + "'"
                    + " ORDER BY s.nombreSuc;");
            for (int i = 0; i < arr.size(); i++)
            {
                cmSuc.addItem(arr.get(i));
            }

            if (ManipulaSelecciones.validaSuc("SELECT p.nombreProd FROM producto p JOIN sucursal s ON p.nombreSuc = s.nombreSuc AND s.nombreSuc = '" + String.valueOf(cmSuc.getSelectedItem()) + "'"
                    + " JOIN farmacia f ON f.nombreFarm = s.nombreFarm AND f.nombreFarm = '" + String.valueOf(cmFarmaciaP.getSelectedItem()) + "'"
                    + " ORDER BY p.nombreProd;"))
            {
                cmProd.setEnabled(true);
                cmProd.removeAllItems();
                err.setVisible(false);
                btnAgregar.setEnabled(true);
                ArrayList<String> arr1 = ManipulaSelecciones.select("SELECT p.nombreProd FROM producto p JOIN sucursal s ON p.nombreSuc = s.nombreSuc AND s.nombreSuc = '" + String.valueOf(cmSuc.getSelectedItem()) + "'"
                        + " JOIN farmacia f ON f.nombreFarm = s.nombreFarm AND f.nombreFarm = '" + String.valueOf(cmFarmaciaP.getSelectedItem()) + "'"
                        + " ORDER BY p.nombreProd;");
                for (int i = 0; i < arr1.size(); i++)
                {
                    cmProd.addItem(arr1.get(i));
                }
            } else
            {
                cmProd.removeAllItems();
                cmProd.setEnabled(false);
                err.setVisible(true);
                btnAgregar.setEnabled(false);
            }
        } else
        {
            cmSuc.removeAllItems();
            cmSuc.setEnabled(false);
            cmProd.removeAllItems();
            cmProd.setEnabled(false);
            err.setVisible(true);
            btnAgregar.setEnabled(false);
        }
    }//GEN-LAST:event_cmFarmaciaPItemStateChanged

    private void cmSucItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cmSucItemStateChanged
    {//GEN-HEADEREND:event_cmSucItemStateChanged
        if (ManipulaSelecciones.validaSuc("SELECT p.nombreProd FROM producto p JOIN sucursal s ON p.nombreSuc = s.nombreSuc AND s.nombreSuc = '" + String.valueOf(cmSuc.getSelectedItem()) + "'"
                + " JOIN farmacia f ON f.nombreFarm = s.nombreFarm AND f.nombreFarm = '" + String.valueOf(cmFarmaciaP.getSelectedItem()) + "'"
                + " ORDER BY p.nombreProd;"))
        {
            cmProd.setEnabled(true);
            cmProd.removeAllItems();
            err.setVisible(false);
            btnAgregar.setEnabled(true);
            ArrayList<String> arr1 = ManipulaSelecciones.select("SELECT p.nombreProd FROM producto p JOIN sucursal s ON p.nombreSuc = s.nombreSuc AND s.nombreSuc = '" + String.valueOf(cmSuc.getSelectedItem()) + "'"
                    + " JOIN farmacia f ON f.nombreFarm = s.nombreFarm AND f.nombreFarm = '" + String.valueOf(cmFarmaciaP.getSelectedItem()) + "'"
                    + " ORDER BY p.nombreProd;");
            for (int i = 0; i < arr1.size(); i++)
            {
                cmProd.addItem(arr1.get(i));
            }
        } else
        {
            cmProd.removeAllItems();
            cmProd.setEnabled(false);
            err.setVisible(true);
            btnAgregar.setEnabled(false);
        }
    }//GEN-LAST:event_cmSucItemStateChanged

    private void cmFarmaciaPKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cmFarmaciaPKeyPressed
    {//GEN-HEADEREND:event_cmFarmaciaPKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            evt.consume();
        }
    }//GEN-LAST:event_cmFarmaciaPKeyPressed

    private void cmSucKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cmSucKeyPressed
    {//GEN-HEADEREND:event_cmSucKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            evt.consume();
        }
    }//GEN-LAST:event_cmSucKeyPressed

    private void cmProdKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cmProdKeyPressed
    {//GEN-HEADEREND:event_cmProdKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            evt.consume();
        }
    }//GEN-LAST:event_cmProdKeyPressed

    private void cPrecioPActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cPrecioPActionPerformed
    {//GEN-HEADEREND:event_cPrecioPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cPrecioPActionPerformed

    private void cExistenciaPActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cExistenciaPActionPerformed
    {//GEN-HEADEREND:event_cExistenciaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cExistenciaPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgregarProductos;
    private javax.swing.JPanel RegresarIN;
    private javax.swing.JLabel RegresarINtxt;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JTextField cExistenciaP;
    private javax.swing.JTextField cPrecioP;
    private javax.swing.JComboBox<String> cmFarmaciaP;
    private javax.swing.JComboBox<String> cmProd;
    private javax.swing.JComboBox<String> cmSuc;
    private javax.swing.JLabel err;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JLabel msj;
    // End of variables declaration//GEN-END:variables
}
