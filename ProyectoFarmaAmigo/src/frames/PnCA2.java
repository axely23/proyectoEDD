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
import conexion.ManipulaSelecciones;
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
public class PnCA2 extends javax.swing.JPanel
{

    int ancho = 0;
    int ancho2 = 0;
    String ciu;
    String pd;

    /**
     * Creates new form PnConsFarm
     */
    public PnCA2()
    {
        initComponents();
        VtnPrincipal.disablePaste(cProduc);
        msj.setVisible(false);
        lbRes1.setVisible(false);
        lbProduc.setVisible(false);
        jSeparator1.setVisible(false);

    }

    public void llenaTabla(ArrayList<Producto> arr)
    {
        int ancho = 0;
        for (int i = 0; i < arr.size(); i++)
        {
            pnTabla.add(generador(arr.get(i).getNombrePrd(), arr.get(i).getFarmacia(), arr.get(i).getNombreSuc(), arr.get(i).getNombreProv(),
                    String.valueOf(arr.get(i).getPrecio()), String.valueOf(arr.get(i).getExistencia())),
                    new org.netbeans.lib.awtextra.AbsoluteConstraints(ancho, 0, 290, 260));
            ancho += 310;
            pnTabla.updateUI();
        }
    }

    public Icon icono(String direccion, int ancho, int alto)
    {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(direccion)).getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    public JPanel generador(String prod, String farm, String suc, String prov, String precio, String ex)
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
        lbP1.setText("  Farmacia: " + farm);
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lbProduc = new javax.swing.JLabel();
        btnBusc = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnTabla = new javax.swing.JPanel();
        lbProd = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbRes1 = new javax.swing.JLabel();
        msj = new javax.swing.JLabel();
        cProduc = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbProduc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbProduc.setForeground(new java.awt.Color(35, 75, 75));
        lbProduc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(lbProduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 180, 30));

        btnBusc.setBackground(new java.awt.Color(66, 141, 141));
        btnBusc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBusc.setForeground(new java.awt.Color(255, 255, 255));
        btnBusc.setText("Buscar");
        btnBusc.setContentAreaFilled(false);
        btnBusc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBusc.setOpaque(true);
        btnBusc.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btnBuscMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnBuscMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btnBuscMouseExited(evt);
            }
        });
        btnBusc.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscActionPerformed(evt);
            }
        });
        add(btnBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 110, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 920, 10));

        jLabel33.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 102, 102));
        jLabel33.setText("Producto");
        add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 90, 20));

        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        pnTabla.setBackground(new java.awt.Color(255, 255, 255));
        pnTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(pnTabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 930, 300));

        lbProd.setFont(new java.awt.Font("Tahoma", 0, 31)); // NOI18N
        lbProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbProd.setText("Productos");
        add(lbProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 220, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 460, 20));

        lbRes1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbRes1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbRes1.setText("Mejores precios encontrados para:");
        add(lbRes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 280, 30));

        msj.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        msj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msj.setText("No se encontraron productos");
        add(msj, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 420, 30));

        cProduc.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                cProducKeyTyped(evt);
            }
        });
        add(cProduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnBuscMouseClicked
    {//GEN-HEADEREND:event_btnBuscMouseClicked

    }//GEN-LAST:event_btnBuscMouseClicked

    private void btnBuscMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnBuscMouseEntered
    {//GEN-HEADEREND:event_btnBuscMouseEntered
        btnBusc.setBackground(new java.awt.Color(31, 68, 68));
    }//GEN-LAST:event_btnBuscMouseEntered

    private void btnBuscMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnBuscMouseExited
    {//GEN-HEADEREND:event_btnBuscMouseExited
        btnBusc.setBackground(new java.awt.Color(66, 141, 141));
    }//GEN-LAST:event_btnBuscMouseExited

    private void btnBuscActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBuscActionPerformed
    {//GEN-HEADEREND:event_btnBuscActionPerformed
        pnTabla.removeAll();
        pnTabla.updateUI();

        if (VtnPrincipal.vComponentes(cProduc))
        {
            pnTabla.updateUI();
            msj.setVisible(false);
            lbRes1.setVisible(false);
            lbProduc.setVisible(false);
            jSeparator1.setVisible(false);
            JOptionPane.showMessageDialog(null, "Ingresa un nombre de producto", "Consultas", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/error.png", 50, 50));
            CtrlInterfaz.selecciona(cProduc);
        } else
        {
            if (VtnPrincipal.validaCad(cProduc.getText(), "^[A-Z](?!\\s)(.*\\S)?(?!\\s)$"))
            {
                //Aqui un llena
                ArrayList<Producto> arr = ManipulaSelecciones.llenaCA2("SELECT p.nombreProd, f.nombreFarm,p.nombreSuc, p.nombreProv, p.precio, p.existencia FROM producto p"
                        + " JOIN sucursal s ON s.nombreSuc = p.nombreSuc "
                        + "JOIN farmacia f ON f.nombreFarm = s.nombreFarm"
                        + " WHERE p.nombreProd = '" + cProduc.getText() + "'ORDER BY p.precio;");
                if (arr.isEmpty())
                {
                    pnTabla.removeAll();
                    pnTabla.updateUI();
                    msj.setVisible(true);
                    lbRes1.setVisible(false);
                    lbProduc.setVisible(false);
                    jSeparator1.setVisible(false);
                } else
                {
                    msj.setVisible(false);
                    lbRes1.setVisible(true);
                    jSeparator1.setVisible(true);
                    lbProduc.setVisible(true);
                    lbProduc.setText(cProduc.getText());

                    //Aqui se llena tabla
                    llenaTabla(arr);
                    pnTabla.updateUI();
                }

            } else
            {
                msj.setVisible(false);
                lbRes1.setVisible(false);
                lbProduc.setVisible(false);
                jSeparator1.setVisible(false);
                JOptionPane.showMessageDialog(null, "Nombre de producto no valido", "Consultas", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/error.png", 50, 50));
                CtrlInterfaz.selecciona(cProduc);
            }
        }
//        pnTabla.updateUI();
    }//GEN-LAST:event_btnBuscActionPerformed

    private void cProducKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cProducKeyTyped
    {//GEN-HEADEREND:event_cProducKeyTyped
        if (cProduc.getText().equals(""))
        {
            if (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')
            {
                evt.setKeyChar((char) (evt.getKeyChar() - 32));
            }
        }
        Validaciones.validaAlfanumerico(evt, 25, cProduc.getText());
        if (evt.getKeyChar() == '.')
        {
            evt.setKeyChar((char) 8);
        }
    }//GEN-LAST:event_cProducKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusc;
    private javax.swing.JTextField cProduc;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbProd;
    private javax.swing.JLabel lbProduc;
    private javax.swing.JLabel lbRes1;
    private javax.swing.JLabel msj;
    private javax.swing.JPanel pnTabla;
    // End of variables declaration//GEN-END:variables
}
