/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.ArticleData;
import Domain.Article;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kenne
 */
public class ArticleBusiness {

    ArticleData artD;

    public ArticleBusiness() {
        artD = new ArticleData();
    }

    public Article getArticleBusiness(int id) {
        try {
            return artD.getArticle(id);
        } catch (SQLException ex) {
            return null;
        }
    }

    public int checkIfArticleAlreadyExist(DefaultTableModel tableData, int irArt) {

        for (int i = 0; i < tableData.getRowCount(); i++) {
            if (Integer.parseInt(tableData.getValueAt(i, 0).toString()) == irArt) {
                return i;
            }
        }
        return -1;
    }
    
    public Article[] getInventoryBusiness(){
        try {
            return artD.getAllInventory();
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean addArticleToinventory(int artId, int quantity) {
        Article newArticle = new Article();
        newArticle.setIdArticle(artId);
        newArticle.setQuantity(quantity);

        try {
            return artD.addArticleToInventory(newArticle);
        } catch (SQLException ex) {
            return false;
        }
    }  
    
    
}
