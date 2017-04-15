package GUI;

import java.awt.Graphics;
public class JIFInitSesion extends javax.swing.JInternalFrame {
    public JIFInitSesion() {
        initComponents();
    }
    
    @Override
     public void paint(Graphics g){
         System.err.println("asdadsa");
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(102, 204, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setForeground(new java.awt.Color(255, 51, 153));
        setMaximizable(true);
        setResizable(true);
        setTitle("Inicio sesión");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/sesion.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
