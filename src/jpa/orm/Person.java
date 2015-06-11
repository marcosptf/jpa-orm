
package jpa.orm;

import java.sql.Date;
import java.util.Calendar;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="EMP")
public class Person {

//    @GeneratedValue // => especified the auto increment column property
    @Id // => definition of the primary key
    @Column(name="EMP_ID") // => name of the column on database
    private Long id;
      
//    @Basic => 
//    @Column(columnDefinition = "varchar(40)") => this is a definition of type and length to column
//    @Column(length = 40) => definition of length of column
    @Column(unique=true,nullable=false,columnDefinition = "varchar(40)") // => definition of the column is nullable and unique
    private String name;
    private String surname;
    
    @Column(precision=8,scale=2) // => when the column need to be float or double, use this kind of definition
    private float hourlyRate;
    
    @Lob  // => The simplest type of mapping to a database column. The Basic annotation can be applied to a persistent property or instance variable of any of the following types: Java primitive types, wrappers of the primitive types, String, java.math.BigInteger, java.math.BigDecimal, java.util.Date, java.util.Calendar, java.sql.Date, java.sql.Time, java.sql.Timestamp, byte[], Byte[], char[], Character[], enums, and any other type that implements java.io.Serializable.
    @Basic(fetch=LAZY)  // => The use of the Basic annotation is optional for persistent fields and properties of these types. If the Basic annotation is not specified for such a field or property, the default values of the Basic annotation will apply.
    private byte[] picture;
    
    @Column(name="START_DATE",columnDefinition="DATE DEFAULT CURRENT_DATE") // => temporal types are the set of times-based types that can be used in persistent state mappings
    private java.sql.Date startDate;                                       // =>the list of supported temporal types includes the three java.sql types, java.sql,Date, java.sql.Time, java.sql.Timestamp and java.util.Calendar
    
    @Temporal(TemporalType.TIME) // => this annotation is use to map java.util.Calendar
    private java.util.Date dob;
    
    @Transient
    private String convertedName; //=> if we dont want to save a property to database we can markthat field with this annotation

    public Person() { }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    public String getConvertedName() {
        return convertedName;
    }

    public void setConvertedName(String convertedName) {
        this.convertedName = convertedName;
    }
    
    public java.util.Date getDob() {
        return dob;
    }

    public void setDob(java.util.Date dob) {
        this.dob = dob;
    }
    
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourly) {
        this.hourlyRate = hourly;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", surname=" + surname + "]";
    }
}
