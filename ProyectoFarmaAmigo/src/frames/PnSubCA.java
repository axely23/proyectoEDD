/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Yair Mendoza
 */
public class PnSubCA extends javax.swing.JPanel
{

    /**
     * Creates new form PnSubAltas
     */
    public PnSubCA()
    {
        initComponents();
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

        jPanel2 = new javax.swing.JPanel();
        SubmenuAltas = new javax.swing.JPanel();
        bAgregaFARtxt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bAgregaProveedortxt = new javax.swing.JLabel();
        bAgregaSucursaltxt = new javax.swing.JLabel();
        bAgregaProductotxt = new javax.swing.JLabel();
        bAgregaProductotxt1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubmenuAltas.setBackground(new java.awt.Color(0, 102, 102));
        SubmenuAltas.setForeground(new java.awt.Color(0, 102, 102));
        SubmenuAltas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bAgregaFARtxt.setBackground(new java.awt.Color(255, 255, 255));
        bAgregaFARtxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bAgregaFARtxt.setForeground(new java.awt.Color(255, 255, 255));
        bAgregaFARtxt.setText("Proveedor por Suc.");
        bAgregaFARtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bAgregaFARtxt.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                bAgregaFARtxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                bAgregaFARtxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                bAgregaFARtxtMouseExited(evt);
            }
        });
        SubmenuAltas.add(bAgregaFARtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Consultas");
        SubmenuAltas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 19, 110, -1));

        bAgregaProveedortxt.setBackground(new java.awt.Color(255, 255, 255));
        bAgregaProveedortxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bAgregaProveedortxt.setForeground(new java.awt.Color(255, 255, 255));
        bAgregaProveedortxt.setText("Sucursales por ciudad");
        bAgregaProveedortxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bAgregaProveedortxt.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                bAgregaProveedortxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                bAgregaProveedortxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                bAgregaProveedortxtMouseExited(evt);
            }
        });
        SubmenuAltas.add(bAgregaProveedortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 160, 30));

        bAgregaSucursaltxt.setBackground(new java.awt.Color(255, 255, 255));
        bAgregaSucursaltxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bAgregaSucursaltxt.setForeground(new java.awt.Color(255, 255, 255));
        bAgregaSucursaltxt.setText("Buscar Producto");
        bAgregaSucursaltxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bAgregaSucursaltxt.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                bAgregaSucursaltxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                bAgregaSucursaltxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                bAgregaSucursaltxtMouseExited(evt);
            }
        });
        SubmenuAltas.add(bAgregaSucursaltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 120, 30));

        bAgregaProductotxt.setBackground(new java.awt.Color(255, 255, 255));
        bAgregaProductotxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bAgregaProductotxt.setForeground(new java.awt.Color(255, 255, 255));
        bAgregaProductotxt.setText("Precio total de productos");
        bAgregaProductotxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bAgregaProductotxt.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                bAgregaProductotxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                bAgregaProductotxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                bAgregaProductotxtMouseExited(evt);
            }
        });
        SubmenuAltas.add(bAgregaProductotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 160, 30));

        bAgregaProductotxt1.setBackground(new java.awt.Color(255, 255, 255));
        bAgregaProductotxt1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bAgregaProductotxt1.setForeground(new java.awt.Color(255, 255, 255));
        bAgregaProductotxt1.setText("Proveedores por producto");
        bAgregaProductotxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bAgregaProductotxt1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                bAgregaProductotxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                bAgregaProductotxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                bAgregaProductotxt1MouseExited(evt);
            }
        });
        SubmenuAltas.add(bAgregaProductotxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 180, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(SubmenuAltas, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(SubmenuAltas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void bAgregaFARtxtMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bAgregaFARtxtMouseClicked
    {//GEN-HEADEREND:event_bAgregaFARtxtMouseClicked
        VtnPrincipal.mostrarPanel(new PnCA1(), VtnPrincipal.PnPrincipal);
    }//GEN-LAST:event_bAgregaFARtxtMouseClicked

    private void bAgregaFARtxtMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bAgregaFARtxtMouseEntered
    {//GEN-HEADEREND:event_bAgregaFARtxtMouseEntered
        bAgregaFARtxt.setBackground(new Color(0, 51, 51));
    }//GEN-LAST:event_bAgregaFARtxtMouseEntered

    private void bAgregaFARtxtMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bAgregaFARtxtMouseExited
    {//GEN-HEADEREND:event_bAgregaFARtxtMouseExited
        bAgregaFARtxt.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_bAgregaFARtxtMouseExited

    private void bAgregaProveedortxtMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bAgregaProveedortxtMouseClicked
    {//GEN-HEADEREND:event_bAgregaProveedortxtMouseClicked
        if (true)
        {
            VtnPrincipal.mostrarPanel(new PnCA3(), VtnPrincipal.PnPrincipal);
        } else
        {
            JOptionPane.showMessageDialog(null, "No se encontraron farmacias", "Agrega ciudad", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/error.png", 50, 50));
        }
    }//GEN-LAST:event_bAgregaProveedortxtMouseClicked

    private void bAgregaProveedortxtMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bAgregaProveedortxtMouseEntered
    {//GEN-HEADEREND:event_bAgregaProveedortxtMouseEntered
        bAgregaProveedortxt.setBackground(new Color(0, 51, 51));
    }//GEN-LAST:event_bAgregaProveedortxtMouseEntered

    private void bAgregaProveedortxtMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bAgregaProveedortxtMouseExited
    {//GEN-HEADEREND:event_bAgregaProveedortxtMouseExited
        bAgregaProveedortxt.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_bAgregaProveedortxtMouseExited

    private void bAgregaSucursaltxtMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bAgregaSucursaltxtMouseClicked
    {//GEN-HEADEREND:event_bAgregaSucursaltxtMouseClicked
        VtnPrincipal.mostrarPanel(new PnCA2(), VtnPrincipal.PnPrincipal);
    }//GEN-LAST:event_bAgregaSucursaltxtMouseClicked

    private void bAgregaSucursaltxtMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bAgregaSucursaltxtMouseEntered
    {//GEN-HEADEREND:event_bAgregaSucursaltxtMouseEntered
        bAgregaSucursaltxt.setBackground(new Color(0, 51, 51));
    }//GEN-LAST:event_bAgregaSucursaltxtMouseEntered

    private void bAgregaSucursaltxtMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bAgregaSucursaltxtMouseExited
    {//GEN-HEADEREND:event_bAgregaSucursaltxtMouseExited
        bAgregaSucursaltxt.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_bAgregaSucursaltxtMouseExited

    private void bAgregaProductotxtMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bAgregaProductotxtMouseClicked
    {//GEN-HEADEREND:event_bAgregaProductotxtMouseClicked
        if (true)
        {
            VtnPrincipal.mostrarPanel(new PnCA5(), VtnPrincipal.PnPrincipal);
        } else
        {
            JOptionPane.showMessageDialog(null, "No se encontraron farmacias", "Agrega producto", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/error.png", 50, 50));
        }
    }//GEN-LAST:event_bAgregaProductotxtMouseClicked

    private void bAgregaProductotxtMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bAgregaProductotxtMouseEntered
    {//GEN-HEADEREND:event_bAgregaProductotxtMouseEntered
        bAgregaProductotxt.setBackground(new Color(0, 51, 51));
    }//GEN-LAST:event_bAgregaProductotxtMouseEntered

    private void bAgregaProductotxtMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bAgregaProductotxtMouseExited
    {//GEN-HEADEREND:event_bAgregaProductotxtMouseExited
        bAgregaProductotxt.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_bAgregaProductotxtMouseExited

    private void bAgregaProductotxt1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bAgregaProductotxt1MouseClicked
    {//GEN-HEADEREND:event_bAgregaProductotxt1MouseClicked
        if (true)
        {
            VtnPrincipal.mostrarPanel(new PnCA4(), VtnPrincipal.PnPrincipal);
        } else
        {
            JOptionPane.showMessageDialog(null, "No se encontraron farmacias", "Agrega producto", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/error.png", 50, 50));
        }
    }//GEN-LAST:event_bAgregaProductotxt1MouseClicked

    private void bAgregaProductotxt1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bAgregaProductotxt1MouseEntered
    {//GEN-HEADEREND:event_bAgregaProductotxt1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bAgregaProductotxt1MouseEntered

    private void bAgregaProductotxt1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bAgregaProductotxt1MouseExited
    {//GEN-HEADEREND:event_bAgregaProductotxt1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bAgregaProductotxt1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SubmenuAltas;
    private javax.swing.JLabel bAgregaFARtxt;
    private javax.swing.JLabel bAgregaProductotxt;
    private javax.swing.JLabel bAgregaProductotxt1;
    private javax.swing.JLabel bAgregaProveedortxt;
    private javax.swing.JLabel bAgregaSucursaltxt;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
