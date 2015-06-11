
package jpa.orm;

import static javax.persistence.FetchType.LAZY;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@Entity
@Table(name="EMP")
public class Person {

//    @GeneratedValue
    @Id
    @Column(name="EMP_ID")
    private Long id;
    
//    @Basic
    @Column(columnDefinition = "varchar(40)")
    private String name;
    private String surname;
    
    @Lob
    @Basic(fetch=LAZY)
    private byte[] picture;

    public Person() { }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", surname=" + surname + "]";
    }
}
