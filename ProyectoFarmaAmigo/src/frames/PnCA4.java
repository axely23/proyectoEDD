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
public class PnCA4 extends javax.swing.JPanel
{

    /**
     * Creates new form PnConsFarm
     */
    public PnCA4()
    {
        initComponents();
        VtnPrincipal.disablePaste(cProduc);
        msj.setVisible(false);
    }

    public void llenaTabla(ArrayList<Proveedor> arr)
    {
        int ancho = 0;
        for (int i = 0; i < arr.size(); i++)
        {
            pnTabla.add(generador(arr.get(i).getNombre(), arr.get(i).getClave(), arr.get(i).getDireccion(), arr.get(i).getCorreo()),
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

    public JPanel generador(String nombre, String clave, String direccion, String correo)
    {
        JPanel pnProv = new javax.swing.JPanel();
        JLabel lbProveedor = new javax.swing.JLabel();
        JLabel lbPrv1 = new javax.swing.JLabel();
        JLabel lbPrv2 = new javax.swing.JLabel();
        JLabel lbPrv3 = new javax.swing.JLabel();
        JLabel jLabel2 = new javax.swing.JLabel();
        pnProv.setBackground(new java.awt.Color(255, 255, 255));
        pnProv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnProv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbProveedor.setBackground(new java.awt.Color(66, 141, 141));
        lbProveedor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbProveedor.setForeground(new java.awt.Color(255, 255, 255));
        lbProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbProveedor.setText(nombre);
        lbProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbProveedor.setOpaque(true);
        pnProv.add(lbProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 290, 30));

        lbPrv1.setBackground(new java.awt.Color(175, 207, 207));
        lbPrv1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbPrv1.setText("  Clave: " + clave);
        lbPrv1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbPrv1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbPrv1.setOpaque(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbPrv1.setOpaque(false);
            }
        });
        pnProv.add(lbPrv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 290, 45));

        lbPrv2.setBackground(new java.awt.Color(175, 207, 207));
        lbPrv2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbPrv2.setText("  Direcccion: " + direccion);
        lbPrv2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbPrv2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbPrv2.setOpaque(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbPrv2.setOpaque(false);
            }
        });
        pnProv.add(lbPrv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 290, 45));

        lbPrv3.setBackground(new java.awt.Color(175, 207, 207));
        lbPrv3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbPrv3.setText("  Correo:" + correo);
        lbPrv3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbPrv3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbPrv3.setOpaque(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbPrv3.setOpaque(false);
            }
        });
        pnProv.add(lbPrv3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 290, 45));

        jLabel2.setBackground(new java.awt.Color(66, 141, 141));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/repartidor (1).png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);
        pnProv.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 80));
        return pnProv;
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

        btnBusc = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnTabla = new javax.swing.JPanel();
        lbProd = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        msj = new javax.swing.JLabel();
        cProduc = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBusc.setBackground(new java.awt.Color(66, 141, 141));
        btnBusc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBusc.setForeground(new java.awt.Color(255, 255, 255));
        btnBusc.setText("Buscar Proveedores");
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
        add(btnBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 170, -1));

        jLabel33.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 102, 102));
        jLabel33.setText("Producto");
        add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 90, 20));

        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        pnTabla.setBackground(new java.awt.Color(255, 255, 255));
        pnTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(pnTabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 930, 300));

        lbProd.setFont(new java.awt.Font("Tahoma", 0, 31)); // NOI18N
        lbProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbProd.setText("Proveedores por producto");
        add(lbProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 410, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 460, 20));

        msj.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        msj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msj.setText("No se encontraron provedores");
        add(msj, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 420, 30));

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
            JOptionPane.showMessageDialog(null, "Ingresa un nombre de producto", "Consultas", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/error.png", 50, 50));
            CtrlInterfaz.selecciona(cProduc);
        } else
        {
            if (VtnPrincipal.validaCad(cProduc.getText(), "^[A-Z](?!\\s)(.*\\S)?(?!\\s)$"))
            {
                //Aqui un llena
                ArrayList<Proveedor> arr = ManipulaSelecciones.llenaProv("SELECT DISTINCT(p.nombreProv), p.claveProv, p.direccion, p.correo\n"
                        + "FROM proveedor p\n"
                        + "JOIN producto pr ON pr.nombreProv = p.nombreProv AND pr.nombreProd = '"+cProduc.getText() +"' ORDER BY p.nombreProv;");
                if (arr.isEmpty())
                {
                    pnTabla.removeAll();
                    pnTabla.updateUI();
                    msj.setVisible(true);
                } else
                {
                    msj.setVisible(false);

                    //Aqui se llena tabla
                    llenaTabla(arr);
                    pnTabla.updateUI();
                }

            } else
            {
                msj.setVisible(false);
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbProd;
    private javax.swing.JLabel msj;
    private javax.swing.JPanel pnTabla;
    // End of variables declaration//GEN-END:variables
}
