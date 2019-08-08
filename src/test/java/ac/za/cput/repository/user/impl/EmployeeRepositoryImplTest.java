package ac.za.cput.repository.user.impl;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.factory.user.EmployeeFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRepositoryImplTest {

    public EmployeeRepositoryImpl repository;

    @Before
    public void setUp() throws Exception {
        repository = EmployeeRepositoryImpl.getRepository();
    }

//    @After
//    public void tearDown() throws Exception {
//    }

    @Test
    public void create() {
        Employee employee = EmployeeFactory.buildEmployee("Rugal", "lugal");

        this.repository.create(employee);
       // System.out.println(employee);
       // Assert.assertNotNull(employee);
        Employee employee1 = repository.read(employee.getEmpNumber());
        Assert.assertSame(employee.getEmpNumber(), employee1.getEmpNumber());

        // make list to complicate my life
        //get list, search list to check in object created is there.


    }

    @Test
    public void update() {
        //create
        Employee employee = EmployeeFactory.buildEmployee("Benito", "lastname");
        this.repository.create(employee);

        Employee readEmp = repository.read(employee.getEmpNumber());

        System.out.println(readEmp);

        readEmp.setEmpFirstName("updatedBenito");
        System.out.println(readEmp);

        Employee updateEmp = repository.update(readEmp);
        System.out.println(updateEmp);
        Assert.assertEquals(updateEmp.getEmpFirstName(), employee.getEmpFirstName());
        System.out.println(  "--------------");
        System.out.println(updateEmp.getEmpFirstName());
        System.out.println( employee.getEmpFirstName());


    }

    @Test
    public void delete() {
        Employee employee = EmployeeFactory.buildEmployee("Rugal", "lugal");
        this.repository.create(employee);
        Employee readEmp = repository.read(employee.getEmpNumber());

        Assert.assertTrue(this.repository.getAll().size() > 0);
        System.out.println(this.repository.getAll().size());
       // Employee deletedEmp = this.repository.read(readEmp.getEmpNumber());
         this.repository.delete(readEmp.getEmpNumber());
        System.out.println("=================");
        Assert.assertTrue(this.repository.getAll().size()<1);
        System.out.println(this.repository.getAll().size());




    }

@Test
public void read() {
    Employee employee = EmployeeFactory.buildEmployee("Bennie", "Benassi");
    this.repository.create(employee);
    Employee readEmp = repository.read(employee.getEmpNumber());
    Assert.assertEquals(employee.getEmpNumber(), readEmp.getEmpNumber());
    System.out.println("hehehehe");

}

    @Test
    public void getAll() {

        Set<Employee> employeeSet = this.repository.getAll();
       // employeeSet.stream().forEach(e -> e.getEmpFirstName()::toString);
        Assert.assertNotNull(employeeSet);
    }
}