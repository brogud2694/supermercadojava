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
    private Invoice invoice;
    private Article article;
    private int quantity;

    public Order(Invoice invoice, Article article) {
        this.invoice = invoice;
        this.article = article;
        this.quantity = 1;
    }
    
    public void incrementQuantity(){
        this.quantity++;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
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
