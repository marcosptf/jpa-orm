/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa.orm;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author marcos
 */
public class Main {
    
    public static void main(String[] args){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();
        EmployeeService service = new EmployeeService(em);
        
        em.getTransaction().begin();
        Employee emp = service.createEmployee(1,"javascripter", 5000);
        em.getTransaction().commit();
        System.out.println("persisted" + emp);
        
        em = service.findEmployee(1);
        System.out.println("fount =>" + em);
        
        List<Employee> emps = service.findAllEmployees();
        for(Employee e :emps){
            System.out.println("Found employees:" + e);
        }
        
        em.getTransaction().begin();
        emp = service.raiseEmployeeSalary(1, 1000);
        em.getTransaction().commit();
        System.out.println("updated =>" + emp);
        
        em.getTransaction().begin();
        service.removeEmployee(158);
        em.getTransaction().commit();
        System.out.println("removed employee 158");
        
        em.close();
        emf.close();
    }
    
}
