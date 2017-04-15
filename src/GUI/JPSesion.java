package GUI;

import Domain.Sesion;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public final class JPSesion extends javax.swing.JPanel {

    JPPrincipal jpPrincipal;
    JIFSesion controlPanel;
    BufferedImage icon;

    public JPSesion(JPPrincipal jpPrincipal, JIFSesion sesion) throws IOException {
        this.jpPrincipal = jpPrincipal;
        this.controlPanel = sesion;
        initComponents();
        loadResources();
        init();
    }
    
    public void init(){
        this.jtfNombre.setText(this.jpPrincipal.sesion.getNombre());
        this.jtfPuesto.setText(this.jpPrincipal.sesion.getNombrePuesto());
    }

    public void loadResources() throws IOException {
        this.icon = ImageIO.read(getClass().getResourceAsStream(
                "/GUI/image/sesion.png"));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.icon, 60, 50, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbNombre = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfPuesto = new javax.swing.JTextField();
        jbtnExit = new javax.swing.JButton();
        jbtnCloseSesion = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 255));

        jlbNombre.setText("Nombre: ");

        jtfNombre.setEditable(false);

        jLabel1.setText("Puesto:");

        jtfPuesto.setEditable(false);

        jbtnExit.setText("Salir");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jbtnCloseSesion.setText("Cerrar Sesión");
        jbtnCloseSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCloseSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnCloseSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnExit)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNombre)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnExit)
                    .addComponent(jbtnCloseSesion))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        this.jpPrincipal.inUse = !this.jpPrincipal.inUse;
        this.controlPanel.dispose();
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnCloseSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCloseSesionActionPerformed
        this.jpPrincipal.desactivateButtons();
        this.jpPrincipal.sesion = new Sesion(jpPrincipal);
        this.jpPrincipal.setNewTitle();
        this.jpPrincipal.inUse = !this.jpPrincipal.inUse;
        this.controlPanel.dispose();
    }//GEN-LAST:event_jbtnCloseSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnCloseSesion;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPuesto;
    // End of variables declaration//GEN-END:variables
}
