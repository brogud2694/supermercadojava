package GUI;

import java.io.IOException;
import javax.swing.JPanel;

public final class JIFInventory extends javax.swing.JInternalFrame {

    private final JPPrincipal jpPrincipal;
    private JPanel inventory;

    public JIFInventory(JPPrincipal jpPrincipal) throws IOException {
        this.jpPrincipal = jpPrincipal;
        initComponents();
        initPanel();
    }

    public void initPanel() throws IOException {
        this.inventory = new JPInventory(this.jpPrincipal, this);
        this.inventory.setOpaque(true);
        this.add(this.inventory);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(102, 204, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setForeground(new java.awt.Color(204, 204, 255));
        setTitle("Inventario");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/inventarioico.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
