package GUI;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class JPPrincipal extends javax.swing.JPanel {

    public JPPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jdpPanel = new javax.swing.JDesktopPane();
        jtbTool = new javax.swing.JToolBar();
        jbtnSesion = new javax.swing.JButton();
        jbtnVentas = new javax.swing.JButton();
        jbtnInventario = new javax.swing.JButton();
        jbtnFacturacion = new javax.swing.JButton();
        jbtnEmpleado = new javax.swing.JButton();
        jbtnLog = new javax.swing.JButton();
        jtbExit = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout jdpPanelLayout = new javax.swing.GroupLayout(jdpPanel);
        jdpPanel.setLayout(jdpPanelLayout);
        jdpPanelLayout.setHorizontalGroup(
            jdpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 796, Short.MAX_VALUE)
        );
        jdpPanelLayout.setVerticalGroup(
            jdpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jdpPanel);

        jtbTool.setRollover(true);
        jtbTool.setEnabled(false);

        jbtnSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/sesion.png"))); // NOI18N
        jbtnSesion.setToolTipText("Panel de sesión");
        jbtnSesion.setFocusable(false);
        jbtnSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnSesion.setMaximumSize(new java.awt.Dimension(48, 48));
        jbtnSesion.setMinimumSize(new java.awt.Dimension(48, 48));
        jbtnSesion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSesionActionPerformed(evt);
            }
        });
        jtbTool.add(jbtnSesion);

        jbtnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/ventas.png"))); // NOI18N
        jbtnVentas.setToolTipText("Zona de Ventas");
        jbtnVentas.setEnabled(false);
        jbtnVentas.setFocusable(false);
        jbtnVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnVentas.setMaximumSize(new java.awt.Dimension(48, 48));
        jbtnVentas.setMinimumSize(new java.awt.Dimension(48, 48));
        jbtnVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVentasActionPerformed(evt);
            }
        });
        jtbTool.add(jbtnVentas);

        jbtnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/inventario.png"))); // NOI18N
        jbtnInventario.setToolTipText("Inventario");
        jbtnInventario.setEnabled(false);
        jbtnInventario.setFocusable(false);
        jbtnInventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnInventario.setMaximumSize(new java.awt.Dimension(48, 48));
        jbtnInventario.setMinimumSize(new java.awt.Dimension(48, 48));
        jbtnInventario.setPreferredSize(new java.awt.Dimension(32, 32));
        jbtnInventario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInventarioActionPerformed(evt);
            }
        });
        jtbTool.add(jbtnInventario);

        jbtnFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/factura.png"))); // NOI18N
        jbtnFacturacion.setToolTipText("Facturación");
        jbtnFacturacion.setEnabled(false);
        jbtnFacturacion.setFocusable(false);
        jbtnFacturacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnFacturacion.setMaximumSize(new java.awt.Dimension(48, 48));
        jbtnFacturacion.setMinimumSize(new java.awt.Dimension(48, 48));
        jbtnFacturacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbTool.add(jbtnFacturacion);

        jbtnEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/empleado.png"))); // NOI18N
        jbtnEmpleado.setToolTipText("Zona de Empleados");
        jbtnEmpleado.setEnabled(false);
        jbtnEmpleado.setFocusable(false);
        jbtnEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnEmpleado.setMaximumSize(new java.awt.Dimension(48, 48));
        jbtnEmpleado.setMinimumSize(new java.awt.Dimension(48, 48));
        jbtnEmpleado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbTool.add(jbtnEmpleado);

        jbtnLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/historial.png"))); // NOI18N
        jbtnLog.setToolTipText("Historial de acciones");
        jbtnLog.setEnabled(false);
        jbtnLog.setFocusable(false);
        jbtnLog.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnLog.setMaximumSize(new java.awt.Dimension(48, 48));
        jbtnLog.setMinimumSize(new java.awt.Dimension(48, 48));
        jbtnLog.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbTool.add(jbtnLog);

        jtbExit.setForeground(new java.awt.Color(255, 255, 255));
        jtbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/salir.png"))); // NOI18N
        jtbExit.setToolTipText("Salir");
        jtbExit.setFocusable(false);
        jtbExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtbExit.setMaximumSize(new java.awt.Dimension(48, 48));
        jtbExit.setMinimumSize(new java.awt.Dimension(48, 48));
        jtbExit.setPreferredSize(new java.awt.Dimension(50, 25));
        jtbExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jtbExitMouseEntered(evt);
            }
        });
        jtbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbExitActionPerformed(evt);
            }
        });
        jtbTool.add(jtbExit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbTool, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jtbTool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbExitActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Desea cerrar el programa?") == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jtbExitActionPerformed

    private void jtbExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbExitMouseEntered
    }//GEN-LAST:event_jtbExitMouseEntered

    private void jbtnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnInventarioActionPerformed

    private void jbtnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnVentasActionPerformed

    private void jbtnSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSesionActionPerformed
        try {
            //        this.jbtnFacturacion.setEnabled(true);
//        this.jbtnVentas.setEnabled(true);
//        this.jbtnInventario.setEnabled(true);
//        this.jbtnEmpleado.setEnabled(true);
//        this.jbtnLog.setEnabled(true);

            JInternalFrame initSesion = new JIFInitSesion();

            int x = (this.jdpPanel.getWidth() / 2) - (initSesion.getWidth() / 2);
            int y = (this.jdpPanel.getHeight() / 2) - (initSesion.getHeight() / 2);

            this.jdpPanel.add(initSesion);
            initSesion.setLocation(x, y);
            initSesion.show();
        } catch (IOException ex) {
            Logger.getLogger(JPPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnEmpleado;
    private javax.swing.JButton jbtnFacturacion;
    private javax.swing.JButton jbtnInventario;
    private javax.swing.JButton jbtnLog;
    private javax.swing.JButton jbtnSesion;
    private javax.swing.JButton jbtnVentas;
    private javax.swing.JDesktopPane jdpPanel;
    private javax.swing.JButton jtbExit;
    private javax.swing.JToolBar jtbTool;
    // End of variables declaration//GEN-END:variables
}
