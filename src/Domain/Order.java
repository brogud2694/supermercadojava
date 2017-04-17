/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author kenne
 */
public class Order {

    private Article article;
    private int quantity;

    public Order(Article article) {

        this.article = article;
        this.quantity = 1;
    }

    public Order(Article article, int quantity) {
        this.article = article;
        this.quantity = quantity;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
