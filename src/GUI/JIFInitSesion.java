package GUI;

import java.awt.Graphics;
import java.io.IOException;
import javax.swing.JPanel;

public final class JIFInitSesion extends javax.swing.JInternalFrame {

    JPPrincipal jpPrincipal;
    private JPanel initSesion;

    public JIFInitSesion(JPPrincipal jpPrincipal) throws IOException {
        this.jpPrincipal = jpPrincipal;
        initComponents();
        initPanel();
    }

    public void initPanel() throws IOException {
        this.initSesion = new JPInitSesion(this.jpPrincipal, this);
        this.initSesion.setOpaque(true);
        this.add(this.initSesion);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(102, 204, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setForeground(new java.awt.Color(204, 204, 255));
        setMaximizable(true);
        setResizable(true);
        setTitle("Inicio sesión");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/sesionico.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
