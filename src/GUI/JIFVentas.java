package GUI;

import java.io.IOException;
import javax.swing.JPanel;

public final class JIFVentas extends javax.swing.JInternalFrame {

    private final JPPrincipal jpPrincipal;
    private JPanel ventas;

    public JIFVentas(JPPrincipal jpPrincipal) throws IOException {
        this.jpPrincipal = jpPrincipal;
        initComponents();
        initPanel();
    }

    public void initPanel() throws IOException {
        this.ventas = new JPVentas(this.jpPrincipal, this);
        this.ventas.setOpaque(true);
        this.add(this.ventas);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(102, 204, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setForeground(new java.awt.Color(204, 204, 255));
        setTitle("Ventas");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/ventasico.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
