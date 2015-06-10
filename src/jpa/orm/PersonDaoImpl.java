
package jpa.orm;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

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
    
    public void test(){
        Professor emp = new Professor();
        emp.setId(1);
        emp.setName("name");
        emp.setSalary(123456);
        emp.setPhoneNumber("1234567890");
        em.persist(emp);
    }
    

}
