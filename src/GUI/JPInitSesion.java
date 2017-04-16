package GUI;

import Business.EmployeeBusiness;
import Domain.Sesion;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public final class JPInitSesion extends javax.swing.JPanel {

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
        jbtnExit = new javax.swing.JButton();
        jpfPass = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));

        jbtnInitSesion.setText("¡Iniciar Sesión!");
        jbtnInitSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInitSesionActionPerformed(evt);
            }
        });

        jlbDNI.setText("DNI");

        jlbPass.setText("Contraseña");

        jbtnExit.setText("Salir");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbDNI)
                    .addComponent(jlbPass)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnInitSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jbtnExit))
                    .addComponent(jpfPass)
                    .addComponent(jtfDNI))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jlbDNI)
                .addGap(18, 18, 18)
                .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnInitSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnExit))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnInitSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInitSesionActionPerformed
        if (isNumeric(this.jtfDNI.getText())) {

            EmployeeBusiness empB = new EmployeeBusiness();
            Sesion user = empB.loginBusiness(Integer.parseInt(this.jtfDNI.getText()), this.jpfPass.getText());
            if (user != null) {
                this.jpPrincipal.sesion.setDni(user.getDni());
                this.jpPrincipal.sesion.setNombre(user.getNombre());
                this.jpPrincipal.sesion.setPrivilege(user.getPrivilege());
                this.jpPrincipal.sesion.setSesionIniciada(true);
                this.jpPrincipal.activePrivileges();
                this.jpPrincipal.setNewTitle();
                this.jpPrincipal.sesion.setNombrePuesto(user.getNombrePuesto());
                this.jpPrincipal.inUse = !this.jpPrincipal.inUse;
                this.initSesion.dispose();
            }
        }

    }//GEN-LAST:event_jbtnInitSesionActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        this.jpPrincipal.inUse = !this.jpPrincipal.inUse;
        this.initSesion.dispose();
    }//GEN-LAST:event_jbtnExitActionPerformed

    public boolean isNumeric(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnInitSesion;
    private javax.swing.JLabel jlbDNI;
    private javax.swing.JLabel jlbPass;
    private javax.swing.JPasswordField jpfPass;
    private javax.swing.JTextField jtfDNI;
    // End of variables declaration//GEN-END:variables
}
