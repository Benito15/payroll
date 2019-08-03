package ac.za.cput.repository.user.impl;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.factory.user.EmployeeFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        Assert.assertSame(updateEmp.getEmpNumber(), employee.getEmpNumber());
        System.out.println("--------------");



    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }

    @Test
    public void getAll() {
    }
}