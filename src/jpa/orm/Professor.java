/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa.orm;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author marcos
 */
@Access(AccessType.FIELD)
@Entity
public class Professor {
    
    @Id
    @Column(name = "EMP_ID")
    private int id;
    private String name;
    
    @Transient
    private String phoneNum;
    
    @Column(name = "SAL")
    private long salary;
    public static String LOCAL_AREA_CODE = "999";
    
    @Column(name = "COMM")
    private String comments;
    
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public long getSalary(){
        return salary;
    }
    
    public void setSalary(long salary){
        this.salary = salary;
    }
    
    public String getPhoneNumber(){
        return phoneNum;
    }
    
    public void setPhoneNumber(String num){
        this.phoneNum = num;
    }
    
    public String getComments(){
        return comments;
    }
    
    public void setComments(String comm){
        this.comments = comm;
    }
    
    @Access(AccessType.PROPERTY)
    @Column(name = "PHONE")
    protected String getPhoneNumberForDb(){
        if(null != phoneNum && phoneNum.length() == 10){
            return phoneNum;
        }
        return LOCAL_AREA_CODE + phoneNum;
    }
    
    protected void setPhoneNumberForDb(String num){
        if(num.startsWith(LOCAL_AREA_CODE)){
            phoneNum = num.substring(3);
        }
        phoneNum = num;
    }
    
    @Override
    public String toString(){
        return "Employee id=>" + this.getId() + " name=>" + this.getName() + " get salary=>" + this.getSalary();
    }
    
}
