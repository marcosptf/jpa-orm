/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa.orm;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author marcos
 */
@Entity
public class Employee {
    
    @Id
    private int id;
    private String name;
    
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
    
}
