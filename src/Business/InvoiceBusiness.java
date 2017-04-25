/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.InvoiceData;
import Domain.Article;
import Domain.Employee;
import Domain.Invoice;
import Domain.Order;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;

/**
 *
 * @author kenne
 */
public class InvoiceBusiness {
    
    InvoiceData invD;

    public InvoiceBusiness() {
        
        invD = new InvoiceData();
        
    }

    public boolean insertInvoiceBusiness(TableModel tableData, int employeeDNI) {

        Invoice newInvoice = new Invoice();
        Order[] orderArray = new Order[tableData.getRowCount()];
        Article temporalArticle;

        for (int i = 0; i < tableData.getRowCount(); i++) {
            temporalArticle = new Article();
            temporalArticle.setIdArticle(Integer.parseInt(tableData.getValueAt(i, 0).toString()));
            temporalArticle.setName(tableData.getValueAt(i, 1).toString());
            orderArray[i] = new Order(temporalArticle,
                    Integer.parseInt(tableData.getValueAt(i, 2).toString()));
            temporalArticle.setPrice(Double.parseDouble(tableData.getValueAt(i, 3).toString()));
        }
        
        newInvoice.setEmployee(new Employee(employeeDNI));
        newInvoice.setOrderArray(orderArray);
        newInvoice.setIsCancelled('n');
        
        try {
            invD.insertInvoice(newInvoice);
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }    
}
