/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Validaciones;
import clases.Producto;
import clases.Proveedor;
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
public class PnCA5 extends javax.swing.JPanel
{

    /**
     * Creates new form PnAgregarSuc
     */
    public PnCA5()
    {
        initComponents();
        msj.setVisible(false);
        pnPrecio.setVisible(false);
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

    public void llenaTabla(ArrayList<Producto> arr)
    {
        int ancho = 0;
        for (int i = 0; i < arr.size(); i++)
        {
            pnTabla.add(generador(arr.get(i).getNombrePrd(), arr.get(i).getClave(), arr.get(i).getNombreSuc(), arr.get(i).getNombreProv(),
                    String.valueOf(arr.get(i).getPrecio()), String.valueOf(arr.get(i).getExistencia())),
                    new org.netbeans.lib.awtextra.AbsoluteConstraints(ancho, 0, 290, 260));
            ancho += 310;
            pnTabla.updateUI();
        }
    }

    public JPanel generador(String prod, String clave, String suc, String prov, String precio, String ex)
    {
        JPanel pnProd = new javax.swing.JPanel();
        JLabel lbProducto = new javax.swing.JLabel();
        JLabel lbP1 = new javax.swing.JLabel();
        JLabel lbP2 = new javax.swing.JLabel();
        JLabel lbP3 = new javax.swing.JLabel();
        JLabel lbP4 = new javax.swing.JLabel();
        JLabel lbP5 = new javax.swing.JLabel();
        JLabel jLabel3 = new javax.swing.JLabel();

        pnProd.setBackground(new java.awt.Color(255, 255, 255));
        pnProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnProd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbProducto.setBackground(new java.awt.Color(66, 141, 141));
        lbProducto.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbProducto.setForeground(new java.awt.Color(255, 255, 255));
        lbProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbProducto.setText(prod);
        lbProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbProducto.setOpaque(true);
        pnProd.add(lbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 290, 30));

        lbP1.setBackground(new java.awt.Color(175, 207, 207));
        lbP1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbP1.setText("  Clave: " + clave);
        lbP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbP1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbP1.setOpaque(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbP1.setOpaque(false);
            }
        });
        pnProd.add(lbP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 290, 30));

        lbP2.setBackground(new java.awt.Color(175, 207, 207));
        lbP2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbP2.setText("  Sucursal:" + suc);
        lbP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbP2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbP2.setOpaque(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbP2.setOpaque(false);
            }
        });
        pnProd.add(lbP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 290, 30));

        lbP3.setBackground(new java.awt.Color(175, 207, 207));
        lbP3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbP3.setText("  Proveedor:" + prov);
        lbP3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbP3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbP3.setOpaque(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbP3.setOpaque(false);
            }
        });
        pnProd.add(lbP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 290, 30));

        lbP4.setBackground(new java.awt.Color(175, 207, 207));
        lbP4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbP4.setText("  Precio: " + precio);
        lbP4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbP4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbP4.setOpaque(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbP4.setOpaque(false);
            }
        });
        pnProd.add(lbP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 290, 30));

        lbP5.setBackground(new java.awt.Color(175, 207, 207));
        lbP5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbP5.setText("  Existencia: " + ex);
        lbP5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbP5.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbP5.setOpaque(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbP5.setOpaque(false);
            }
        });
        pnProd.add(lbP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 290, 30));

        jLabel3.setBackground(new java.awt.Color(66, 141, 141));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/farmacias.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        pnProd.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 80));

        return pnProd;
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
        jLabel30 = new javax.swing.JLabel();
        cmSuc = new javax.swing.JComboBox<>();
        cmFarmaciaP = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnTabla = new javax.swing.JPanel();
        msj = new javax.swing.JLabel();
        pnPrecio = new javax.swing.JPanel();
        lbTxt = new javax.swing.JLabel();
        lbSigno = new javax.swing.JLabel();
        lbPrecio = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgregarSucursales.setBackground(new java.awt.Color(255, 255, 255));
        AgregarSucursales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        AgregarSucursales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Productos por Sucursal");
        AgregarSucursales.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, 30));

        jLabel29.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 102, 102));
        jLabel29.setText("Sucursal");
        AgregarSucursales.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 80, 20));

        jLabel30.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 102));
        jLabel30.setText("Farmacia");
        AgregarSucursales.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 80, 20));

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
        AgregarSucursales.add(cmSuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 160, -1));

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
        AgregarSucursales.add(cmFarmaciaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 160, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        pnTabla.setBackground(new java.awt.Color(255, 255, 255));
        pnTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(pnTabla);

        AgregarSucursales.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 930, 300));

        msj.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        msj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msj.setText("No se encontraron productos");
        AgregarSucursales.add(msj, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 420, 30));

        pnPrecio.setBackground(new java.awt.Color(255, 255, 255));
        pnPrecio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTxt.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lbTxt.setText("Precio total de los productos:");
        pnPrecio.add(lbTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 30));

        lbSigno.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lbSigno.setText("$");
        pnPrecio.add(lbSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 20, 30));

        lbPrecio.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        pnPrecio.add(lbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 180, 30));

        AgregarSucursales.add(pnPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 510, 40));

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

    private void cmSucItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cmSucItemStateChanged
    {//GEN-HEADEREND:event_cmSucItemStateChanged
        pnTabla.removeAll();
        pnTabla.updateUI();
        pnPrecio.setVisible(false);
        msj.setVisible(false);

        ArrayList<Producto> arr = ManipulaSelecciones.llenaProd("SELECT * FROM producto p WHERE p.nombreSuc = '" + String.valueOf(cmSuc.getSelectedItem()) + "';");
        if (!arr.isEmpty())
        {
            llenaTabla(arr);
            pnPrecio.setVisible(true);
            lbPrecio.setText(ManipulaSelecciones.select("SELECT ROUND(SUM(p.precio), 2) FROM producto p WHERE p.nombreSuc = '" + String.valueOf(cmSuc.getSelectedItem()) + "';").get(0));
        } else
        {
            msj.setVisible(true);
        }
    }//GEN-LAST:event_cmSucItemStateChanged

    private void cmSucPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt)//GEN-FIRST:event_cmSucPopupMenuWillBecomeInvisible
    {//GEN-HEADEREND:event_cmSucPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cmSucPopupMenuWillBecomeInvisible

    private void cmSucKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cmSucKeyPressed
    {//GEN-HEADEREND:event_cmSucKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            evt.consume();
        }
    }//GEN-LAST:event_cmSucKeyPressed

    private void cmFarmaciaPItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cmFarmaciaPItemStateChanged
    {//GEN-HEADEREND:event_cmFarmaciaPItemStateChanged
        pnTabla.removeAll();
        pnTabla.updateUI();

        ArrayList<String> arr = ManipulaSelecciones.select("SELECT s.nombreSuc FROM sucursal s"
                + " JOIN farmacia f ON f.nombreFarm = s.nombreFarm AND f.nombreFarm = " + "'" + String.valueOf(cmFarmaciaP.getSelectedItem()) + "'"
                + " ORDER BY s.nombreSuc;");

        if (arr.isEmpty())
        {
            cmSuc.removeAllItems();
            msj.setVisible(true);
            cmSuc.setEnabled(false);
        } else
        {
            cmSuc.setEnabled(true);
            cmSuc.removeAllItems();
            for (int i = 0; i < arr.size(); i++)
            {
                cmSuc.addItem(arr.get(i));
            }
        }

    }//GEN-LAST:event_cmFarmaciaPItemStateChanged

    private void cmFarmaciaPPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt)//GEN-FIRST:event_cmFarmaciaPPopupMenuWillBecomeInvisible
    {//GEN-HEADEREND:event_cmFarmaciaPPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cmFarmaciaPPopupMenuWillBecomeInvisible

    private void cmFarmaciaPKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cmFarmaciaPKeyPressed
    {//GEN-HEADEREND:event_cmFarmaciaPKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            evt.consume();
        }
    }//GEN-LAST:event_cmFarmaciaPKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgregarSucursales;
    private javax.swing.JComboBox<String> cmFarmaciaP;
    private javax.swing.JComboBox<String> cmSuc;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JLabel lbSigno;
    private javax.swing.JLabel lbTxt;
    private javax.swing.JLabel msj;
    private javax.swing.JPanel pnPrecio;
    private javax.swing.JPanel pnTabla;
    // End of variables declaration//GEN-END:variables
}
