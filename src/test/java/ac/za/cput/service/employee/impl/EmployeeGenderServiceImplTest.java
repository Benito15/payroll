package ac.za.cput.service.employee.impl;

import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.factory.user.EmployeeGenderFactory;
import ac.za.cput.service.employee.EmployeeGenderService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeGenderServiceImplTest {

    private EmployeeGenderService service;

    @Before
    public void setUp() throws Exception {
        this.service = EmployeeGenderServiceImpl.getService();
    }

    @Test
    public void getAll() {
        Set<EmployeeGender> employeeGenderSet = service.getAll();
        Assert.assertNotNull(employeeGenderSet);

    }

    @Test
    public void create() {
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("12","34");
        this.service.create(employeeGender);
        EmployeeGender readEmployeeGender = service.read(employeeGender.getEmpNumber());
        Assert.assertNotNull(readEmployeeGender.getEmpNumber());
    }

    @Test
    public void update() {
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("12","34");
        this.service.create(employeeGender);
        EmployeeGender readEmployeeGender = service.read(employeeGender.getEmpNumber());
        employeeGender.setEmpNumber("56");
        service.update(employeeGender);
        Assert.assertTrue(this.service.getAll().size() > 0);


    }

    @Test
    public void delete() {
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("12","34");
        this.service.create(employeeGender);
        EmployeeGender readEmployeeGender = service.read(employeeGender.getEmpNumber());
        Assert.assertTrue(this.service.getAll().size()>0);
        service.delete(readEmployeeGender.getEmpNumber());
        Assert.assertTrue(this.service.getAll().size()<1);



    }

    @Test
    public void read() {
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("12","34");
        this.service.create(employeeGender);
        EmployeeGender readEmployeeGender = service.read(employeeGender.getEmpNumber());
        Assert.assertTrue(this.service.getAll().size()>0);



    }
}