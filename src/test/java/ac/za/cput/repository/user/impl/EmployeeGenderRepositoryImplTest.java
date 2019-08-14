package ac.za.cput.repository.user.impl;

import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.factory.user.EmployeeGenderFactory;
import ac.za.cput.repository.user.EmployeeGenderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeGenderRepositoryImplTest {

    private EmployeeGenderRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeGenderRepositoryImpl.getEmployeeGenderRepository();
    }

    @Test
    public void getAll() {
        Set<EmployeeGender> employeeSet = repository.getAll();
        Assert.assertNotNull(employeeSet);
    }

    @Test
    public void create() {
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("232","2r2e");
        this.repository.create(employeeGender);
        EmployeeGender readEmployeeGender= repository.read(employeeGender.getEmpNumber());
        Assert.assertNotNull(readEmployeeGender);

    }

    @Test
    public void update() {
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("232","2r2e");
        this.repository.create(employeeGender);
       // EmployeeGender readEmployeeGender= repository.read(employeeGender.getEmpNumber());
        EmployeeGender update = EmployeeGenderFactory.buildEmployeeGender("232","2r2e");
        update.setEmpNumber(employeeGender.getEmpNumber());
        this.repository.update(update);
        Assert.assertEquals(employeeGender.getEmpNumber(), update.getEmpNumber());

    }

    @Test
    public void delete() {
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("232","2r2e");
        this.repository.create(employeeGender);
        EmployeeGender readGender = repository.read(employeeGender.getEmpNumber());
        this.repository.delete(readGender.getEmpNumber());
        Assert.assertTrue(this.repository.getAll().size()<1);

    }

    @Test
    public void read() {
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("232","2r2e");
        this.repository.create(employeeGender);
        EmployeeGender readGender = this.repository.read(employeeGender.getEmpNumber());
        Assert.assertEquals(employeeGender.getEmpNumber(), readGender.getEmpNumber());
    }
}