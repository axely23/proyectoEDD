/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import conexion.ConexionMySQL;
import conexion.ManipulaSelecciones;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 *
 * @author Daniel Yair Mendoza
 */
public class VtnPrincipal extends javax.swing.JFrame
{

    public static ConexionMySQL conector;
    int x, y;

    public static void mostrarPanel(JPanel mostrar, JPanel limpiar)
    {
        mostrar.setSize(1000, 510);
        mostrar.setLocation(0, 0);
        limpiar.removeAll();
        limpiar.add(mostrar, BorderLayout.CENTER);
        limpiar.revalidate();
        limpiar.repaint();
    }

    public static void mostrarPanel2(JPanel mostrar, JPanel limpiar)
    {
        mostrar.setSize(1000, 70);
        mostrar.setLocation(0, 0);
        limpiar.removeAll();
        limpiar.add(mostrar, BorderLayout.CENTER);
        limpiar.revalidate();
        limpiar.repaint();

    }

    public static void mostrarPanelN(JPanel mostrar, JPanel limpiar)
    {
        limpiar.removeAll();
        limpiar.setLayout(null); // Establecer el layout del panel limpiar como null para permitir el Absolute Layout

        // Establecer el tamaño y la posición del panel a mostrar
        mostrar.setBounds(0, 0, 1330, 770);

        // Añadir el panel a mostrar al panel limpiar
        limpiar.add(mostrar);

        // Repintar el panel limpiar para que se reflejen los cambios
        limpiar.revalidate();
        limpiar.repaint();
    }

    public Icon icono(String direccion, int ancho, int alto)
    {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(direccion)).getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    public static boolean vComponentes(JTextField... arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i].getText().isEmpty() || !valpal(arr[i].getText()))
            {
                arr[i].requestFocus();
                return true;
            }
        }
        return false;
    }

    public static boolean valpal(String s)
    {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++)
        {
            if (c[i] != ' ')
            {
                return true;
            }
        }
        return false;
    }

    public static String componentes(JTextField... arr)
    {
        String s = "Por favor rellena los campos faltantes: ";
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i].getText().isEmpty() || !valpal(arr[i].getText()))
            {
                s += arr[i].getName() + ". ";
            }
        }
        return s;
    }

    public static boolean validaCad(String input, String exp)
    {
        return input.matches(exp);
    }

    public static void disablePaste(JComponent... components)
    {
        for (JComponent component : components)
        {
            component.getInputMap().put(KeyStroke.getKeyStroke("control V"), "none");
        }
    }

    /**
     * Creates new form VtnPrincipal
     */
    public VtnPrincipal()
    {
        initComponents();
        mostrarPanel(new PnInicio(), PnPrincipal);
        conector = new ConexionMySQL();
        conector.conectar();
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

        barraSuperior = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        bMinimiza = new javax.swing.JPanel();
        Minimizatxt = new javax.swing.JLabel();
        BCerrar = new javax.swing.JPanel();
        Cerrartxt = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bBajas = new javax.swing.JPanel();
        Bajas = new javax.swing.JLabel();
        bConsultas = new javax.swing.JPanel();
        bConsultastxt = new javax.swing.JLabel();
        bAltas = new javax.swing.JPanel();
        bAltastxt = new javax.swing.JLabel();
        jSeparator29 = new javax.swing.JSeparator();
        Modifica = new javax.swing.JPanel();
        modifica = new javax.swing.JLabel();
        bCAvz = new javax.swing.JPanel();
        bCAv = new javax.swing.JLabel();
        Submenus = new javax.swing.JPanel();
        PnPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraSuperior.setBackground(new java.awt.Color(0, 102, 102));
        barraSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        barraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                barraSuperiorMouseDragged(evt);
            }
        });
        barraSuperior.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                barraSuperiorMousePressed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Farma amigo");

        javax.swing.GroupLayout barraSuperiorLayout = new javax.swing.GroupLayout(barraSuperior);
        barraSuperior.setLayout(barraSuperiorLayout);
        barraSuperiorLayout.setHorizontalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorLayout.createSequentialGroup()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(540, 540, 540))
        );
        barraSuperiorLayout.setVerticalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorLayout.createSequentialGroup()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        getContentPane().add(barraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 30));

        bMinimiza.setBackground(new java.awt.Color(0, 102, 102));
        bMinimiza.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        Minimizatxt.setBackground(new java.awt.Color(255, 255, 255));
        Minimizatxt.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        Minimizatxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimizatxt.setText("-");
        Minimizatxt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Minimizatxt.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                MinimizatxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                MinimizatxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                MinimizatxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bMinimizaLayout = new javax.swing.GroupLayout(bMinimiza);
        bMinimiza.setLayout(bMinimizaLayout);
        bMinimizaLayout.setHorizontalGroup(
            bMinimizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(bMinimizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bMinimizaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Minimizatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        bMinimizaLayout.setVerticalGroup(
            bMinimizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(bMinimizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bMinimizaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Minimizatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(bMinimiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 30, 30));

        BCerrar.setBackground(new java.awt.Color(0, 102, 102));
        BCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        Cerrartxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Cerrartxt.setText(" X");
        Cerrartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Cerrartxt.setPreferredSize(new java.awt.Dimension(20, 24));
        Cerrartxt.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CerrartxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                CerrartxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CerrartxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BCerrarLayout = new javax.swing.GroupLayout(BCerrar);
        BCerrar.setLayout(BCerrarLayout);
        BCerrarLayout.setHorizontalGroup(
            BCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BCerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Cerrartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BCerrarLayout.setVerticalGroup(
            BCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BCerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Cerrartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(BCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 30, 30));

        Menu.setBackground(new java.awt.Color(0, 51, 51));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú");
        Menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        bBajas.setBackground(new java.awt.Color(0, 51, 51));

        Bajas.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        Bajas.setForeground(new java.awt.Color(255, 255, 255));
        Bajas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bajas.setText("Bajas");
        Bajas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Bajas.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                BajasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                BajasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                BajasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bBajasLayout = new javax.swing.GroupLayout(bBajas);
        bBajas.setLayout(bBajasLayout);
        bBajasLayout.setHorizontalGroup(
            bBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bBajasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bajas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bBajasLayout.setVerticalGroup(
            bBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bBajasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bajas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menu.add(bBajas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 190, 50));

        bConsultas.setBackground(new java.awt.Color(0, 51, 51));

        bConsultastxt.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        bConsultastxt.setForeground(new java.awt.Color(255, 255, 255));
        bConsultastxt.setText("         Consultas");
        bConsultastxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bConsultastxt.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                bConsultastxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                bConsultastxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                bConsultastxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bConsultasLayout = new javax.swing.GroupLayout(bConsultas);
        bConsultas.setLayout(bConsultasLayout);
        bConsultasLayout.setHorizontalGroup(
            bConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
            .addGroup(bConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bConsultasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bConsultastxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        bConsultasLayout.setVerticalGroup(
            bConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(bConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bConsultasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bConsultastxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Menu.add(bConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 190, 50));

        bAltas.setBackground(new java.awt.Color(0, 51, 51));

        bAltastxt.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        bAltastxt.setForeground(new java.awt.Color(255, 255, 255));
        bAltastxt.setText("             Altas");
        bAltastxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bAltastxt.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                bAltastxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                bAltastxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                bAltastxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bAltasLayout = new javax.swing.GroupLayout(bAltas);
        bAltas.setLayout(bAltasLayout);
        bAltasLayout.setHorizontalGroup(
            bAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bAltasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bAltastxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bAltasLayout.setVerticalGroup(
            bAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bAltasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bAltastxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menu.add(bAltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        jSeparator29.setForeground(new java.awt.Color(255, 255, 255));
        Menu.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 130, 20));

        Modifica.setBackground(new java.awt.Color(0, 51, 51));

        modifica.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        modifica.setForeground(new java.awt.Color(255, 255, 255));
        modifica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modifica.setText("Modifica");
        modifica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        modifica.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                modificaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                modificaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                modificaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ModificaLayout = new javax.swing.GroupLayout(Modifica);
        Modifica.setLayout(ModificaLayout);
        ModificaLayout.setHorizontalGroup(
            ModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modifica, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ModificaLayout.setVerticalGroup(
            ModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modifica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menu.add(Modifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        bCAvz.setBackground(new java.awt.Color(0, 51, 51));

        bCAv.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        bCAv.setForeground(new java.awt.Color(255, 255, 255));
        bCAv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bCAv.setText("Consultas Avanzadas");
        bCAv.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bCAv.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                bCAvMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                bCAvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                bCAvMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bCAvzLayout = new javax.swing.GroupLayout(bCAvz);
        bCAvz.setLayout(bCAvzLayout);
        bCAvzLayout.setHorizontalGroup(
            bCAvzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bCAvzLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bCAv, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bCAvzLayout.setVerticalGroup(
            bCAvzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bCAvzLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bCAv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menu.add(bCAvz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 190, 580));

        Submenus.setBackground(new java.awt.Color(0, 102, 102));
        Submenus.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout SubmenusLayout = new javax.swing.GroupLayout(Submenus);
        Submenus.setLayout(SubmenusLayout);
        SubmenusLayout.setHorizontalGroup(
            SubmenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        SubmenusLayout.setVerticalGroup(
            SubmenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(Submenus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 1000, 70));

        PnPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PnPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        javax.swing.GroupLayout PnPrincipalLayout = new javax.swing.GroupLayout(PnPrincipal);
        PnPrincipal.setLayout(PnPrincipalLayout);
        PnPrincipalLayout.setHorizontalGroup(
            PnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        PnPrincipalLayout.setVerticalGroup(
            PnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        getContentPane().add(PnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 1000, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void barraSuperiorMouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_barraSuperiorMouseDragged
    {//GEN-HEADEREND:event_barraSuperiorMouseDragged

//        int x1 = evt.getXOnScreen();
//        int y1 = evt.getYOnScreen();
//        this.setLocation(x1 - x, y1 - y);
    }//GEN-LAST:event_barraSuperiorMouseDragged

    private void barraSuperiorMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_barraSuperiorMousePressed
    {//GEN-HEADEREND:event_barraSuperiorMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_barraSuperiorMousePressed

    private void MinimizatxtMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_MinimizatxtMouseClicked
    {//GEN-HEADEREND:event_MinimizatxtMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(1);
    }//GEN-LAST:event_MinimizatxtMouseClicked

    private void MinimizatxtMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_MinimizatxtMouseEntered
    {//GEN-HEADEREND:event_MinimizatxtMouseEntered
        // TODO add your handling code here:
        bMinimiza.setBackground(new Color(0, 51, 51));
        Minimizatxt.setForeground(Color.white);
    }//GEN-LAST:event_MinimizatxtMouseEntered

    private void MinimizatxtMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_MinimizatxtMouseExited
    {//GEN-HEADEREND:event_MinimizatxtMouseExited
        // TODO add your handling code here:
        bMinimiza.setBackground(new Color(0, 102, 102));
        Minimizatxt.setForeground(Color.black);
    }//GEN-LAST:event_MinimizatxtMouseExited

    private void CerrartxtMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CerrartxtMouseClicked
    {//GEN-HEADEREND:event_CerrartxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrartxtMouseClicked

    private void CerrartxtMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CerrartxtMouseEntered
    {//GEN-HEADEREND:event_CerrartxtMouseEntered
        BCerrar.setBackground(Color.red);
        Cerrartxt.setForeground(Color.white);
    }//GEN-LAST:event_CerrartxtMouseEntered

    private void CerrartxtMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CerrartxtMouseExited
    {//GEN-HEADEREND:event_CerrartxtMouseExited
        BCerrar.setBackground(new Color(0, 102, 102));
        Cerrartxt.setForeground(Color.black);
    }//GEN-LAST:event_CerrartxtMouseExited

    private void BajasMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BajasMouseClicked
    {//GEN-HEADEREND:event_BajasMouseClicked
        if (ManipulaSelecciones.validaSuc("SELECT * FROM farmacia;"))
        {
            mostrarPanel(new PnBajaFarmacia(), PnPrincipal);
            mostrarPanel2(new PnSubBajas(), Submenus);
        } else
        {
            JOptionPane.showMessageDialog(null, "No se encontraron farmacias", "Bajas", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/error.png", 50, 50));
        }
    }//GEN-LAST:event_BajasMouseClicked

    private void BajasMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BajasMouseEntered
    {//GEN-HEADEREND:event_BajasMouseEntered
        bBajas.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_BajasMouseEntered

    private void BajasMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BajasMouseExited
    {//GEN-HEADEREND:event_BajasMouseExited
        bBajas.setBackground(new Color(0, 51, 51));
    }//GEN-LAST:event_BajasMouseExited

    private void bConsultastxtMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bConsultastxtMouseClicked
    {//GEN-HEADEREND:event_bConsultastxtMouseClicked
        if (ManipulaSelecciones.validaSuc("SELECT * FROM farmacia;"))
        {
            mostrarPanel(new PnConsFarm(), PnPrincipal);
            mostrarPanel2(new PnSubConsultas(), Submenus);
        } else
        {
            JOptionPane.showMessageDialog(null, "No se encontraron farmacias", "Consultas", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/error.png", 50, 50));
        }
    }//GEN-LAST:event_bConsultastxtMouseClicked

    private void bConsultastxtMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bConsultastxtMouseEntered
    {//GEN-HEADEREND:event_bConsultastxtMouseEntered
        bConsultas.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_bConsultastxtMouseEntered

    private void bConsultastxtMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bConsultastxtMouseExited
    {//GEN-HEADEREND:event_bConsultastxtMouseExited
        bConsultas.setBackground(new Color(0, 51, 51));
    }//GEN-LAST:event_bConsultastxtMouseExited

    private void bAltastxtMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bAltastxtMouseClicked
    {//GEN-HEADEREND:event_bAltastxtMouseClicked
        mostrarPanel(new PnAgregarFarm(), PnPrincipal);
        mostrarPanel2(new PnSubAltas(), Submenus);
    }//GEN-LAST:event_bAltastxtMouseClicked

    private void bAltastxtMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bAltastxtMouseEntered
    {//GEN-HEADEREND:event_bAltastxtMouseEntered
        bAltas.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_bAltastxtMouseEntered

    private void bAltastxtMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bAltastxtMouseExited
    {//GEN-HEADEREND:event_bAltastxtMouseExited
        bAltas.setBackground(new Color(0, 51, 51));
    }//GEN-LAST:event_bAltastxtMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void modificaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_modificaMouseClicked
    {//GEN-HEADEREND:event_modificaMouseClicked
        if (ManipulaSelecciones.validaSuc("SELECT * FROM farmacia;"))
        {
            mostrarPanel(new PnModFarm(), PnPrincipal);
            mostrarPanel2(new PnSubMod(), Submenus);
        } else
        {
            JOptionPane.showMessageDialog(null, "No se encontraron farmacias", "Consultas", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/error.png", 50, 50));
        }
    }//GEN-LAST:event_modificaMouseClicked

    private void modificaMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_modificaMouseEntered
    {//GEN-HEADEREND:event_modificaMouseEntered
        Modifica.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_modificaMouseEntered

    private void modificaMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_modificaMouseExited
    {//GEN-HEADEREND:event_modificaMouseExited
        Modifica.setBackground(new Color(0, 51, 51));
    }//GEN-LAST:event_modificaMouseExited

    private void bCAvMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bCAvMouseClicked
    {//GEN-HEADEREND:event_bCAvMouseClicked
        if (ManipulaSelecciones.validaSuc("SELECT * FROM farmacia;"))
        {
            mostrarPanel(new PnCA1(), PnPrincipal);
            mostrarPanel2(new PnSubCA(), Submenus);
        } else
        {
            JOptionPane.showMessageDialog(null, "No se encontraron farmacias", "Consultas", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/error.png", 50, 50));
        }
    }//GEN-LAST:event_bCAvMouseClicked

    private void bCAvMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bCAvMouseEntered
    {//GEN-HEADEREND:event_bCAvMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bCAvMouseEntered

    private void bCAvMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bCAvMouseExited
    {//GEN-HEADEREND:event_bCAvMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bCAvMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BCerrar;
    private javax.swing.JLabel Bajas;
    private javax.swing.JLabel Cerrartxt;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel Minimizatxt;
    private javax.swing.JPanel Modifica;
    public static javax.swing.JPanel PnPrincipal;
    public static javax.swing.JPanel Submenus;
    private javax.swing.JPanel bAltas;
    private javax.swing.JLabel bAltastxt;
    private javax.swing.JPanel bBajas;
    private javax.swing.JLabel bCAv;
    private javax.swing.JPanel bCAvz;
    private javax.swing.JPanel bConsultas;
    private javax.swing.JLabel bConsultastxt;
    private javax.swing.JPanel bMinimiza;
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel modifica;
    // End of variables declaration//GEN-END:variables
}
