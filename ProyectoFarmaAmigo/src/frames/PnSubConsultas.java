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
public class PnSubConsultas extends javax.swing.JPanel
{

    /**
     * Creates new form PnSubAltas
     */
    public PnSubConsultas()
    {
        initComponents();
    }

//    public boolean verifCiu(NodoListas r)
//    {
//        if (r != null)
//        {
//            NodoListas aux = r.getSig();
//            do
//            {
//                if (aux.getAbj() != null)
//                {
//                    return true;
//                }
//                aux = aux.getSig();
//            } while (aux != r.getSig());
//            return false;
//        } else
//        {
//            return false;
//        }
//    }
//
//    public boolean verifSuc(NodoListas r)
//    {
//        if (r != null)
//        {
//            NodoListas aux = r.getSig();
//            do
//            {
//                if (aux.getObj() instanceof Sucursales)
//                {
//                    return true;
//                } else
//                {
//                    boolean a = verifSuc(aux.getAbj());
//                    if (a)
//                    {
//                        return a;
//                    }
//                }
//                aux = aux.getSig();
//            } while (aux != r.getSig());
//            return false;
//        } else
//        {
//            return false;
//        }
//    }
//
//    public boolean verificaProduc(NodoListas r)
//    {
//        if (r != null)
//        {
//            NodoListas aux = r.getSig();
//            do
//            {
//                if (aux.getObj() instanceof Productos)
//                {
//                    return true;
//                } else
//                {
//                    boolean a = verificaProduc(aux.getAbj());
//                    if (a)
//                    {
//                        return a;
//                    }
//                }
//                aux = aux.getSig();
//            } while (aux != r.getSig());
//            return false;
//        } else
//        {
//            return false;
//        }
//    }
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
        SubmenuTraspasos = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        bConsulFarm = new javax.swing.JLabel();
        bConsulSuc = new javax.swing.JLabel();
        bConsulProv = new javax.swing.JLabel();
        bConsulProd1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 70));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubmenuTraspasos.setBackground(new java.awt.Color(0, 102, 102));
        SubmenuTraspasos.setForeground(new java.awt.Color(0, 102, 102));
        SubmenuTraspasos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Consultas");
        SubmenuTraspasos.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 20, 120, -1));

        bConsulFarm.setBackground(new java.awt.Color(255, 255, 255));
        bConsulFarm.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bConsulFarm.setForeground(new java.awt.Color(255, 255, 255));
        bConsulFarm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bConsulFarm.setText("Farmacia");
        bConsulFarm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bConsulFarm.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                bConsulFarmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                bConsulFarmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                bConsulFarmMouseExited(evt);
            }
        });
        SubmenuTraspasos.add(bConsulFarm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 50));

        bConsulSuc.setBackground(new java.awt.Color(255, 255, 255));
        bConsulSuc.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bConsulSuc.setForeground(new java.awt.Color(255, 255, 255));
        bConsulSuc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bConsulSuc.setText("Sucursal");
        bConsulSuc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bConsulSuc.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                bConsulSucMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                bConsulSucMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                bConsulSucMouseExited(evt);
            }
        });
        SubmenuTraspasos.add(bConsulSuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 120, 50));

        bConsulProv.setBackground(new java.awt.Color(255, 255, 255));
        bConsulProv.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bConsulProv.setForeground(new java.awt.Color(255, 255, 255));
        bConsulProv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bConsulProv.setText("Proveedor");
        bConsulProv.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bConsulProv.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                bConsulProvMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                bConsulProvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                bConsulProvMouseExited(evt);
            }
        });
        SubmenuTraspasos.add(bConsulProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 130, 50));

        bConsulProd1.setBackground(new java.awt.Color(255, 255, 255));
        bConsulProd1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bConsulProd1.setForeground(new java.awt.Color(255, 255, 255));
        bConsulProd1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bConsulProd1.setText("Producto");
        bConsulProd1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bConsulProd1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                bConsulProd1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                bConsulProd1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                bConsulProd1MouseExited(evt);
            }
        });
        SubmenuTraspasos.add(bConsulProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 130, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SubmenuTraspasos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SubmenuTraspasos, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void bConsulFarmMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bConsulFarmMouseClicked
    {//GEN-HEADEREND:event_bConsulFarmMouseClicked
        VtnPrincipal.mostrarPanel(new PnConsFarm(), VtnPrincipal.PnPrincipal);
    }//GEN-LAST:event_bConsulFarmMouseClicked

    private void bConsulFarmMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bConsulFarmMouseEntered
    {//GEN-HEADEREND:event_bConsulFarmMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bConsulFarmMouseEntered

    private void bConsulFarmMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bConsulFarmMouseExited
    {//GEN-HEADEREND:event_bConsulFarmMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bConsulFarmMouseExited

    private void bConsulSucMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bConsulSucMouseClicked
    {//GEN-HEADEREND:event_bConsulSucMouseClicked
        if (true)
        {
            VtnPrincipal.mostrarPanel(new PnConsSuc(), VtnPrincipal.PnPrincipal);
        } else
        {
            JOptionPane.showMessageDialog(null, "No se encontraron farmacias", "Consultas", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/error.png", 50, 50));
        }
    }//GEN-LAST:event_bConsulSucMouseClicked

    private void bConsulSucMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bConsulSucMouseEntered
    {//GEN-HEADEREND:event_bConsulSucMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bConsulSucMouseEntered

    private void bConsulSucMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bConsulSucMouseExited
    {//GEN-HEADEREND:event_bConsulSucMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bConsulSucMouseExited

    private void bConsulProvMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bConsulProvMouseClicked
    {//GEN-HEADEREND:event_bConsulProvMouseClicked
        if (true)
        {
            VtnPrincipal.mostrarPanel(new PnConsProveedor(), VtnPrincipal.PnPrincipal);
        } else
        {
            JOptionPane.showMessageDialog(null, "No se encontraron farmacias", "Consultas", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/error.png", 50, 50));
        }
    }//GEN-LAST:event_bConsulProvMouseClicked

    private void bConsulProvMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bConsulProvMouseEntered
    {//GEN-HEADEREND:event_bConsulProvMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bConsulProvMouseEntered

    private void bConsulProvMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bConsulProvMouseExited
    {//GEN-HEADEREND:event_bConsulProvMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bConsulProvMouseExited

    private void bConsulProd1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bConsulProd1MouseClicked
    {//GEN-HEADEREND:event_bConsulProd1MouseClicked
        if (true)
        {
            VtnPrincipal.mostrarPanel(new PnConsProd(), VtnPrincipal.PnPrincipal);
        } else
        {
            JOptionPane.showMessageDialog(null, "No se encontraron farmacias", "Consultas", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/error.png", 50, 50));
        }
    }//GEN-LAST:event_bConsulProd1MouseClicked

    private void bConsulProd1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bConsulProd1MouseEntered
    {//GEN-HEADEREND:event_bConsulProd1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bConsulProd1MouseEntered

    private void bConsulProd1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bConsulProd1MouseExited
    {//GEN-HEADEREND:event_bConsulProd1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bConsulProd1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SubmenuTraspasos;
    private javax.swing.JLabel bConsulFarm;
    private javax.swing.JLabel bConsulProd1;
    private javax.swing.JLabel bConsulProv;
    private javax.swing.JLabel bConsulSuc;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
