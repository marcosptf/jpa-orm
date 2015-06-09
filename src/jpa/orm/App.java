package jpa.orm;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        PersonDaoImpl dao = (PersonDaoImpl) context.getBean("personDao");

        Person peter = new Person("XML", "HTML");
        Person nasta = new Person("Java", "SQL");

        dao.save(peter);
        dao.save(nasta);

        List<Person> persons = dao.getAll();
        for (Person person : persons) {
            System.out.println(person);
        }
        context.close();
    }
}
