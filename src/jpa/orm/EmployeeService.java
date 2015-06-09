/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa.orm;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author marcos
 */
public class EmployeeService {
    
    protected EntityManager em;
    
    public EmployeeService(EntityManager em){
        this.em = em;
    }
    
    public Employee createEmployee(int id, String name, long salary){
        Employee emp = new Employee(id);
        emp.setName(name);
        emp.setSalary(salary);
        emp.persist(emp);
        return emp;
    }
    
    public void removeEmployee(int id){
        Employee emp = findEmployee(id);
        if(emp != null){
            emp.remove(emp);
        }
    }
    
    public Employee raiseEmployeeSalary(int id,long raise){
        Employee emp = em.find(Employee.class,id);
        if(emp != null){
            emp.setSalary(emp.getSalary() + raise);
        }
        return emp;
    }
    
    public Employee findEmployee(int id){
        return em.find(Employee.class,id);
    }
    
    public List<Employee> findAllEmployees(){
        TypedQuery<Employee> query = em.createQuery("select e from Employee e",Employee.class);
        return query.getResultList();
    }
    
}
