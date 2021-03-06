package GUI;

import Business.ArticleBusiness;
import Domain.Article;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class JPInventory extends javax.swing.JPanel {

    JPPrincipal jpPrincipal;
    JIFInventory inventory;
    BufferedImage icon;
    ArticleBusiness artBusiness;

    public JPInventory(JPPrincipal jpPrincipal, JIFInventory inventory) throws IOException {
        this.jpPrincipal = jpPrincipal;
        this.inventory = inventory;
        initComponents();
        loadResources();
        init();
        artBusiness = new ArticleBusiness();
        loadTable();

    }

    public void init() {
        this.jlbVendedorDos.setText(this.jpPrincipal.sesion.getNombre());
    }

    public void loadTable() {
        Article[] artArray = artBusiness.getInventoryBusiness();
        DefaultTableModel model = (DefaultTableModel) this.jtbArticles.getModel();
        if (artArray != null) {
            for (Article article : artArray) {
                model.addRow(new Object[]{article.getIdArticle(),
                    article.getName(), article.getQuantity()});
            }
        }
    }

    public void loadResources() throws IOException {
        this.icon = ImageIO.read(getClass().getResourceAsStream(
                "/GUI/image/inventario.png"));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.icon, 80, 155, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbArticles = new javax.swing.JTable();
        jtbTool = new javax.swing.JToolBar();
        jbtnExit = new javax.swing.JButton();
        jlbCode = new javax.swing.JLabel();
        jtfCode = new javax.swing.JTextField();
        jlbCantidad = new javax.swing.JLabel();
        jtfCantidad = new javax.swing.JTextField();
        jbtnAdd = new javax.swing.JButton();
        jlbVendedor = new javax.swing.JLabel();
        jlbVendedorDos = new javax.swing.JLabel();
        jbtnEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(720, 480));

        jtbArticles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbArticles);
        if (jtbArticles.getColumnModel().getColumnCount() > 0) {
            jtbArticles.getColumnModel().getColumn(0).setResizable(false);
            jtbArticles.getColumnModel().getColumn(1).setResizable(false);
            jtbArticles.getColumnModel().getColumn(2).setResizable(false);
        }

        jtbTool.setFloatable(false);
        jtbTool.setRollover(true);
        jtbTool.setEnabled(false);

        jbtnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/salir.png"))); // NOI18N
        jbtnExit.setToolTipText("Salir");
        jbtnExit.setMaximumSize(new java.awt.Dimension(48, 48));
        jbtnExit.setMinimumSize(new java.awt.Dimension(48, 48));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jtbTool.add(jbtnExit);

        jlbCode.setText("Código del Producto:");

        jlbCantidad.setText("Cantidad:");

        jbtnAdd.setText("Añadir");
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });

        jlbVendedor.setText("Empleado:");

        jlbVendedorDos.setText("jLabel2");

        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbTool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnAdd))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbCode)
                            .addComponent(jlbCantidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfCode)
                            .addComponent(jtfCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))))
                .addContainerGap(450, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbVendedor)
                .addGap(18, 18, 18)
                .addComponent(jlbVendedorDos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jtbTool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbVendedor)
                    .addComponent(jlbVendedorDos))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCantidad)
                    .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAdd)
                    .addComponent(jbtnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Desea cerrar la venta?") == 0) {
            this.jpPrincipal.inUse = !this.jpPrincipal.inUse;
            this.inventory.dispose();
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
        if (!(this.jtfCode.getText().equals("") && this.jtfCantidad.getText().equals(""))) {
            if (isNumeric(this.jtfCode.getText()) && isNumeric(this.jtfCantidad.getText())) {

                int id = Integer.parseInt(this.jtfCode.getText());
                int quantity = Integer.parseInt(this.jtfCantidad.getText());

                if (artBusiness.addArticleToinventory(id, quantity)) {

                    DefaultTableModel model = (DefaultTableModel) this.jtbArticles.getModel();
                    int existCheck = artBusiness.checkIfArticleAlreadyExist(model, id);

                    if (existCheck == -1) {
                        model.addRow(new Object[]{
                            artBusiness.getArticleBusiness(
                            Integer.parseInt(this.jtfCode.getText())).getIdArticle(),
                            this.jtfCode.getText(),
                            this.jtfCantidad.getText()});
                    } else {
                        quantity += Integer.parseInt(model.getValueAt(existCheck, 2).toString());
                        model.setValueAt(quantity, existCheck, 2);
                    }
                } else {

                }
            }
        }
    }//GEN-LAST:event_jbtnAddActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        if (!(this.jtfCode.getText().equals(""))) {
            if (isNumeric(this.jtfCode.getText())) {
                try {
                    int id = Integer.parseInt(this.jtfCode.getText());
                    if (artBusiness.deleteArticleInventory(id)) {
                        JOptionPane.showMessageDialog(inventory, "Eliminado con exito");
                        
                    } else {
                       JOptionPane.showMessageDialog(inventory, "No se pudo eliminar"); 
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(JPInventory.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    public boolean isNumeric(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JLabel jlbCantidad;
    private javax.swing.JLabel jlbCode;
    private javax.swing.JLabel jlbVendedor;
    private javax.swing.JLabel jlbVendedorDos;
    private javax.swing.JTable jtbArticles;
    private javax.swing.JToolBar jtbTool;
    private javax.swing.JTextField jtfCantidad;
    private javax.swing.JTextField jtfCode;
    // End of variables declaration//GEN-END:variables
}
