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
public class Job {
    private int idJob;
    private String name;
    private String desciption;
    private double baseSalay;

    public Job(int idJob, String name, String desciption, double baseSalay) {
        this.idJob = idJob;
        this.name = name;
        this.desciption = desciption;
        this.baseSalay = baseSalay;
    }

    public Job(int idJob) {
        this.idJob = idJob;
    }    

    public int getIdJob() {
        return idJob;
    }

    public void setIdJob(int idJob) {
        this.idJob = idJob;
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

    public double getBaseSalay() {
        return baseSalay;
    }

    public void setBaseSalay(double baseSalay) {
        this.baseSalay = baseSalay;
    }

    
}
