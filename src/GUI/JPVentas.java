package GUI;

import Business.ArticleBusiness;
import Business.InvoiceBusiness;
import Domain.Article;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class JPVentas extends javax.swing.JPanel {

    JPPrincipal jpPrincipal;
    JIFVentas ventas;
    BufferedImage icon;
    DefaultTableModel tableModel;

    public JPVentas(JPPrincipal jpPrincipal, JIFVentas initSesion) throws IOException {
        this.jpPrincipal = jpPrincipal;
        this.ventas = initSesion;
        initComponents();
        loadResources();
        init();
    }

    public void init() {
        this.jlbVendedorDos.setText(this.jpPrincipal.sesion.getNombre());
        this.tableModel = (DefaultTableModel) jtbInvoiceDetail.getModel();
    }

    public void loadResources() throws IOException {
        this.icon = ImageIO.read(getClass().getResourceAsStream(
                "/GUI/image/ventas.png"));
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
        jtbInvoiceDetail = new javax.swing.JTable();
        jtbTool = new javax.swing.JToolBar();
        jbtnProcesarCompra = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jlbCode = new javax.swing.JLabel();
        jtfCode = new javax.swing.JTextField();
        jlbCantidad = new javax.swing.JLabel();
        jtfCantidad = new javax.swing.JTextField();
        jbtnAdd = new javax.swing.JButton();
        jlbVendedor = new javax.swing.JLabel();
        jlbVendedorDos = new javax.swing.JLabel();
        jtfTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(720, 480));

        jtbInvoiceDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Cantidad", "Precio", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbInvoiceDetail);
        if (jtbInvoiceDetail.getColumnModel().getColumnCount() > 0) {
            jtbInvoiceDetail.getColumnModel().getColumn(1).setResizable(false);
            jtbInvoiceDetail.getColumnModel().getColumn(2).setResizable(false);
            jtbInvoiceDetail.getColumnModel().getColumn(3).setResizable(false);
            jtbInvoiceDetail.getColumnModel().getColumn(4).setResizable(false);
        }

        jtbTool.setFloatable(false);
        jtbTool.setRollover(true);
        jtbTool.setEnabled(false);

        jbtnProcesarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/image/ventaico.png"))); // NOI18N
        jbtnProcesarCompra.setToolTipText("Pagar");
        jbtnProcesarCompra.setFocusable(false);
        jbtnProcesarCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnProcesarCompra.setMaximumSize(new java.awt.Dimension(48, 48));
        jbtnProcesarCompra.setMinimumSize(new java.awt.Dimension(48, 48));
        jbtnProcesarCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnProcesarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnProcesarCompraActionPerformed(evt);
            }
        });
        jtbTool.add(jbtnProcesarCompra);

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

        jlbVendedor.setText("Vendedor:");

        jlbVendedorDos.setText("jLabel2");

        jtfTotal.setEditable(false);

        jLabel1.setText("Total:");

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
                    .addComponent(jbtnAdd)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbCode)
                            .addComponent(jlbCantidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfCode)
                            .addComponent(jtfCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))))
                .addContainerGap(444, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlbVendedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbVendedorDos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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
                .addComponent(jbtnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Desea cerrar la venta?") == 0) {
            this.jpPrincipal.inUse = !this.jpPrincipal.inUse;
            this.ventas.dispose();
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
        if (!(this.jtfCode.getText().equals("") && this.jtfCantidad.getText().equals(""))) {
            if (isNumeric(this.jtfCode.getText()) && isNumeric(this.jtfCantidad.getText())) {

                Business.ArticleBusiness artB = new ArticleBusiness();
                Article newArticle = artB.getArticleBusiness(
                        Integer.parseInt(this.jtfCode.getText()));
                int quantity = Integer.parseInt(this.jtfCantidad.getText());
                double subTotal = quantity * newArticle.getPrice();
                if (newArticle != null) {

                    int existCheck = artB.checkIfArticleAlreadyExist(tableModel, newArticle.getIdArticle());

                    if (existCheck == -1) {
                        tableModel.addRow(new Object[]{this.jtfCode.getText(),
                            newArticle.getName(),
                            quantity,
                            newArticle.getPrice(),
                            subTotal});
                    } else {
                        int newQuantity = Integer.parseInt(
                                tableModel.getValueAt(existCheck, 2).toString()) + quantity;
                        double newSubtotal = newQuantity * Double.parseDouble(
                                tableModel.getValueAt(existCheck, 3).toString());
                        
                        tableModel.setValueAt(newQuantity ,existCheck, 2);
                        tableModel.setValueAt(newSubtotal ,existCheck, 4);
                    }

                    //El objeto solo trae el nombre y el precio  
                } else {
                    //No existe el articulo
                    System.err.println("No se encontró el articulo");
                }
            }
        }
    }//GEN-LAST:event_jbtnAddActionPerformed

    private void jbtnProcesarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProcesarCompraActionPerformed

        InvoiceBusiness invB = new InvoiceBusiness();
        if (tableModel.getRowCount() != 0) {

            invB.insertInvoiceBusiness(tableModel, this.jpPrincipal.sesion.getDni());
        } else {
            System.out.println("Nada ingresado");
        }


    }//GEN-LAST:event_jbtnProcesarCompraActionPerformed

    public boolean isNumeric(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnProcesarCompra;
    private javax.swing.JLabel jlbCantidad;
    private javax.swing.JLabel jlbCode;
    private javax.swing.JLabel jlbVendedor;
    private javax.swing.JLabel jlbVendedorDos;
    private javax.swing.JTable jtbInvoiceDetail;
    private javax.swing.JToolBar jtbTool;
    private javax.swing.JTextField jtfCantidad;
    private javax.swing.JTextField jtfCode;
    private javax.swing.JTextField jtfTotal;
    // End of variables declaration//GEN-END:variables
}
