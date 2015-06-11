/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa.orm;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 *
 * @author marcos
 */
@Entity
public class Employee {
    
    @Id
    private int id;
    private String name;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastAccessTime;
    
    public Employee(){ }
    
    public Employee(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Date getLastAccessTime(){
        return lastAccessTime;
    }
    
    public void setLastAccessTime(Date lastAccessTime){
        this.lastAccessTime = lastAccessTime;
    }
    
    @Override
    public String toString(){
        return "Employee " + getId() + " name: " + getName() + " lastAccessTime" + getLastAccessTime();
    }
}
