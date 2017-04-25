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
public class Article {
    private int idArticle;
    private String name;
    private String desciption;
    private double price;
    private int quantity;

    private Provider[] providerArray;

    public Article(int idArticle, String name, String desciption, double price, Provider[] providerArray) {
        this.idArticle = idArticle;
        this.name = name;
        this.desciption = desciption;
        this.price = price;
        this.providerArray = providerArray;
    }

    public Article() {
    }
    
    

    public int getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Provider[] getProviderArray() {
        return providerArray;
    }

    public void setProviderArray(Provider[] providerArray) {
        this.providerArray = providerArray;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Article{" + "idArticle=" + idArticle + ", name=" + name + ", price=" + price + '}';
    }

    
    
    
}
