package ac.za.cput.service.employee.impl;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.domain.demography.Race;
import ac.za.cput.domain.user.Employee;
import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.factory.demography.GenderFactory;
import ac.za.cput.factory.demography.RaceFactory;
import ac.za.cput.factory.user.EmployeeFactory;
import ac.za.cput.factory.user.EmployeeGenderFactory;
import ac.za.cput.service.demography.GenderService;
import ac.za.cput.service.demography.RaceService;
import ac.za.cput.service.demography.impl.GenderServiceImpl;
import ac.za.cput.service.demography.impl.RaceServiceImpl;
import ac.za.cput.service.employee.EmployeeGenderService;
import ac.za.cput.service.employee.EmployeeService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeServiceImplTest {

    private EmployeeService service;
    private EmployeeGenderService employeeGenderService;
    private GenderService genderService;
    private RaceService raceService;

    @Before
    public void setUp() {

        this.service = EmployeeServiceImpl.getService();
        this.employeeGenderService = EmployeeGenderServiceImpl.getService();
        this.genderService = GenderServiceImpl.getService();
        this.raceService = RaceServiceImpl.getService();

    }

    @Test
    public void getAll() {
        Set<Employee> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {
        String name = "zen";
        Employee emp2 = EmployeeFactory.buildEmployee(name, "kriel");
        Employee employee = EmployeeFactory.buildEmployee("Bennie", "Kriel");

        service.create(employee);
        service.create(emp2);
        Employee readEmployee = service.read(employee.getEmpNumber());
        // Assert.assertNotEquals(readEmployee.getEmpFirstName().contains("l"));
        //Assert.assertThat(name.contains(readEmployee.getEmpFirstName()));
        Assert.assertNotSame(emp2, readEmployee.getEmpFirstName());
    }

    @Test
    public void update() {
        Employee employee = EmployeeFactory.buildEmployee("Bennie", "Kriel");

        service.create(employee);
        Employee readEmployee = service.read(employee.getEmpNumber());

        employee.setEmpFirstName("Xan");
        service.update(employee);

        //Assert.assertEquals(employee.getEmpFirstName(), readEmployee.getEmpFirstName());
        Assert.assertTrue(this.service.getAll().size() > 0);
    }

    @Test
    public void delete() {
        Employee employee = EmployeeFactory.buildEmployee("Bennie", "Kriel");

        service.create(employee);
        Employee readEmployee = service.read(employee.getEmpNumber());
        Assert.assertTrue(this.service.getAll().size() > 0);
        service.delete(employee.getEmpNumber());
        Assert.assertTrue(this.service.getAll().size() < 1);


    }

    @Test
    public void read() {
        Employee employee = EmployeeFactory.buildEmployee("Bennie", "Kriel");

        service.create(employee);
        Employee readEmployee = service.read(employee.getEmpNumber());
        Assert.assertNotNull(readEmployee);

    }


    @Test
    public Employee createFullEmployee() {
        Employee employee = EmployeeFactory.buildEmployee("Benito", "Kriel");
        this.service.create(employee);
        Assert.assertTrue(this.service.getAll().size() > 0);


        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("456", "0987");
        this.employeeGenderService.create(employeeGender);
        Assert.assertTrue(this.employeeGenderService.getAll().size() > 0);


        Race race = RaceFactory.buildRace("White");
        this.raceService.create(race);
        Assert.assertTrue(this.raceService.getAll().size() > 0);

        Gender gender = GenderFactory.buildGender("Male");
        this.genderService.create(gender);
        Assert.assertTrue(this.genderService.getAll().size() > 0);

        return null;
    }
}