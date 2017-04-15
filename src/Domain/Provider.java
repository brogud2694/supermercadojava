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
public class Provider {
    private int idProvider;
    private String name;
    private String  tel_1;
    private String tel_2;

    public Provider() {
    }

    public Provider(int idProvider, String name, String tel_1, String tel_2) {
        this.idProvider = idProvider;
        this.name = name;
        this.tel_1 = tel_1;
        this.tel_2 = tel_2;
    }

    public int getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(int idProvider) {
        this.idProvider = idProvider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel_1() {
        return tel_1;
    }

    public void setTel_1(String tel_1) {
        this.tel_1 = tel_1;
    }

    public String getTel_2() {
        return tel_2;
    }

    public void setTel_2(String tel_2) {
        this.tel_2 = tel_2;
    }
    
    
}
