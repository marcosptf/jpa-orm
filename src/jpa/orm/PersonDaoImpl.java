
package jpa.orm;

import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;

@Transactional
public class PersonDaoImpl {

    @PersistenceContext
    private EntityManager em;

    public Long save(Person person) {
        em.persist(person);
        return person.getId();
    }

    public List<Person> getAll() {
        return em.createQuery("SELECT p FROM Person p", Person.class).getResultList();
    }
    
    public void testProfessor(){
        Professor emp = new Professor();
        emp.setId(1);
        emp.setName("name");
        emp.setSalary(123456);
        emp.setPhoneNumber("1234567890");
        em.persist(emp);
    }
    
    public void testPerson(){
        Person p1 = new Person("tom","smith");
        p1.setId(1l);
        p1.setPicture("javascripter".getBytes());
        p1.setHourlyRate(22222222.324F);
        p1.setStartDate((java.sql.Date) new Date(System.currentTimeMillis()));
        p1.setDob(Calendar.getInstance().getTime());
        
        Person p2 = new Person("jack","kook");
        p2.setId(2l);
        p2.setPicture("java2s.com".getBytes());
        p2.setHourlyRate(3333333.324F);
        p2.setStartDate((java.sql.Date) new Date(System.currentTimeMillis()));
        p2.setDob(Calendar.getInstance().getTime());
        
        save(p1);
        save(p2);
        listAll();
        
        Person emp = em.find(Person.class,1l);
        if(null != emp){
            em.remove(emp);
        }
        
        listAll();
    }
    
    public void testEmployee(){
        Employee emp = new Employee();
        emp.setName("Tom");
        em.persist(emp);
        emp = em.find(Employee.class, emp.getId());
        
        Employee managetEmp = em.merge(emp);
        managetEmp.setLastAccessTime(new Date());
    }
    
    private void listAll(){
        List<Person> persons = getAll();
        for(Person person : persons){
            System.out.println(person);
        }
    }
    
    
    

}
