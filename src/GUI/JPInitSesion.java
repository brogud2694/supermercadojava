package GUI;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class JPInitSesion extends javax.swing.JPanel {

    JPPrincipal jpPrincipal;
    JIFInitSesion initSesion;
    BufferedImage icon;

    public JPInitSesion(JPPrincipal jpPrincipal, JIFInitSesion initSesion) throws IOException {
        this.jpPrincipal = jpPrincipal;
        this.initSesion = initSesion;
        initComponents();
        loadResources();
    }

    public void loadResources() throws IOException {
        this.icon = ImageIO.read(getClass().getResourceAsStream(
                "/GUI/image/sesion.png"));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.icon, 180, 30, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnInitSesion = new javax.swing.JButton();
        jlbDNI = new javax.swing.JLabel();
        jlbPass = new javax.swing.JLabel();
        jtfDNI = new javax.swing.JTextField();
        jtfPass = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jbtnInitSesion.setText("¡Iniciar Sesión!");
        jbtnInitSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInitSesionActionPerformed(evt);
            }
        });

        jlbDNI.setText("DNI");

        jlbPass.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlbDNI)
                                .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlbPass))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jbtnInitSesion)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jlbDNI)
                .addGap(18, 18, 18)
                .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jlbPass)
                .addGap(18, 18, 18)
                .addComponent(jtfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnInitSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnInitSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInitSesionActionPerformed
        this.jpPrincipal.setJbtnEmpleado();
        this.jpPrincipal.setJbtnFacturacion();
        this.jpPrincipal.setJbtnInventario();
        this.jpPrincipal.setJbtnLog();
        this.jpPrincipal.setJbtnVentas();
        this.jpPrincipal.sesion.setNombre(this.jtfDNI.getText());
        this.jpPrincipal.sesion.setPrivilege(1);
        this.jpPrincipal.sesion.setSesionIniciada(true);
        this.jpPrincipal.setNewTitle();
        this.jpPrincipal.inUse = !this.jpPrincipal.inUse;
        this.initSesion.dispose();
        
    }//GEN-LAST:event_jbtnInitSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnInitSesion;
    private javax.swing.JLabel jlbDNI;
    private javax.swing.JLabel jlbPass;
    private javax.swing.JTextField jtfDNI;
    private javax.swing.JTextField jtfPass;
    // End of variables declaration//GEN-END:variables
}
