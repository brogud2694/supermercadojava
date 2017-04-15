/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.sql.Date;



/**
 *
 * @author kenne
 */
public class Employee {
    private int DNI;
    private String name;
    private String lastName;
    private Job job;
    private char gender;
    private Date f_nac;
    private String tel_1;
    private String tel_2;
    private String direction;
    private Schedule[] scheduleArray;
    private String pass;

    public Employee(int DNI, String name, String lastName, Job job, char gender, Date f_nac, String tel_1, String tel_2, String direction, Schedule[] scheduleArray) {
        this.DNI = DNI;
        this.name = name;
        this.lastName = lastName;
        this.job = job;
        this.gender = gender;
        this.f_nac = f_nac;
        this.tel_1 = tel_1;
        this.tel_2 = tel_2;
        this.direction = direction;
        this.scheduleArray = scheduleArray;
    }    

    public Employee() {
    }
    
  

    public Employee(int DNI) {
        this.DNI = DNI;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getF_nac() {
        return f_nac;
    }

    public void setF_nac(Date f_nac) {
        this.f_nac = f_nac;
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

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Schedule[] getScheduleArray() {
        return scheduleArray;
    }

    public void setScheduleArray(Schedule[] scheduleArray) {
        this.scheduleArray = scheduleArray;
    }

    @Override
    public String toString() {
        return "Employee{" + "DNI=" + DNI + ", name=" + name + ", lastName=" + lastName + ", gender=" + gender + ", f_nac=" + f_nac + ", tel_1=" + tel_1 + ", tel_2=" + tel_2 + ", direction=" + direction + '}';
    }
    
    
    
}
