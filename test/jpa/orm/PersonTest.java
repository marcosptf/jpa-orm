/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa.orm;

import junit.framework.TestCase;

/**
 *
 * @author marcos
 */
public class PersonTest extends TestCase {
    
    public PersonTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getId method, of class Person.
     */
    public void testGetId() {
        System.out.println("getId");
        Person instance = new Person();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Person.
     */
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Person instance = new Person();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Person.
     */
    public void testGetName() {
        System.out.println("getName");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Person.
     */
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Person instance = new Person();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class Person.
     */
    public void testGetSurname() {
        System.out.println("getSurname");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class Person.
     */
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "";
        Person instance = new Person();
        instance.setSurname(surname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Person.
     */
    public void testToString() {
        System.out.println("toString");
        Person instance = new Person();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
