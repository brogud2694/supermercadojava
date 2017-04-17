package Domain;

import java.util.Date;

public class Invoice {
    private int idInvioce;
    private Employee employee;
    private Date date;
    private char isCancelled;
    private Order[] orderArray;
    

    public Invoice() {
    }

    public int getIdInvioce() {
        return idInvioce;
    }

    public void setIdInvioce(int idInvioce) {
        this.idInvioce = idInvioce;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getIsCancelled() {
        return isCancelled;
    }

    public void setIsCancelled(char isCancelled) {
        this.isCancelled = isCancelled;
    }

    public Order[] getOrderArray() {
        return orderArray;
    }

    public void setOrderArray(Order[] orderArray) {
        this.orderArray = orderArray;
    }
    
    
    

}
