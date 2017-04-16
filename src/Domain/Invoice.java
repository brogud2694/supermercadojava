package Domain;

import java.util.Date;

public class Invoice {
    private int idInvioce;
    private Employee employee;
    private Date date;
    private char isCancelled;
    

    public Invoice(int idInvioce, Employee employee, Date date, char isCancelled) {
        this.idInvioce = idInvioce;
        this.employee = employee;
        this.date = date;
        this.isCancelled = isCancelled;
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
    
    

}
