package GUI;

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
        jtbnInventario = new javax.swing.JButton();
        jbtnFacturacion = new javax.swing.JButton();
        jbtnEmpleado = new javax.swing.JButton();
        jtbExit = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jdpPanel.setBackground(new java.awt.Color(102, 255, 102));

        jtbTool.setRollover(true);
        jtbTool.setEnabled(false);

        jbtnSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/sesion.png"))); // NOI18N
        jbtnSesion.setToolTipText("Panel de sesión");
        jbtnSesion.setFocusable(false);
        jbtnSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnSesion.setMaximumSize(new java.awt.Dimension(48, 48));
        jbtnSesion.setMinimumSize(new java.awt.Dimension(48, 48));
        jbtnSesion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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

        jtbnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/inventario.png"))); // NOI18N
        jtbnInventario.setToolTipText("Inventario");
        jtbnInventario.setEnabled(false);
        jtbnInventario.setFocusable(false);
        jtbnInventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtbnInventario.setMaximumSize(new java.awt.Dimension(48, 48));
        jtbnInventario.setMinimumSize(new java.awt.Dimension(48, 48));
        jtbnInventario.setPreferredSize(new java.awt.Dimension(32, 32));
        jtbnInventario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnInventarioActionPerformed(evt);
            }
        });
        jtbTool.add(jtbnInventario);

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

        jdpPanel.setLayer(jtbTool, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpPanelLayout = new javax.swing.GroupLayout(jdpPanel);
        jdpPanel.setLayout(jdpPanelLayout);
        jdpPanelLayout.setHorizontalGroup(
            jdpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbTool, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        );
        jdpPanelLayout.setVerticalGroup(
            jdpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPanelLayout.createSequentialGroup()
                .addComponent(jtbTool, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 523, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jdpPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbExitActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Desea cerrar el programa?") == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jtbExitActionPerformed

    private void jtbExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbExitMouseEntered
    }//GEN-LAST:event_jtbExitMouseEntered

    private void jtbnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbnInventarioActionPerformed

    private void jbtnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnVentasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnEmpleado;
    private javax.swing.JButton jbtnFacturacion;
    private javax.swing.JButton jbtnSesion;
    private javax.swing.JButton jbtnVentas;
    private javax.swing.JDesktopPane jdpPanel;
    private javax.swing.JButton jtbExit;
    private javax.swing.JToolBar jtbTool;
    private javax.swing.JButton jtbnInventario;
    // End of variables declaration//GEN-END:variables
}
