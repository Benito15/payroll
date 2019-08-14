package ac.za.cput.controller;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.domain.demography.Race;
import ac.za.cput.domain.user.Employee;
import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.factory.demography.GenderFactory;
import ac.za.cput.factory.demography.RaceFactory;
import ac.za.cput.factory.user.EmployeeFactory;
import ac.za.cput.factory.user.EmployeeGenderFactory;
import ac.za.cput.service.employee.impl.EmployeeServiceImplTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeControllerTest {

    private EmployeeController employeeController;
    //private EmployeeServiceImplTest employeeGenderService;


    @Before
    public void setUp() throws Exception {
        employeeController = new EmployeeController();
    }


    @Test
    public void createFullEmployee() {


        Employee employee = EmployeeFactory.buildEmployee("Benito","Kriel");
       // this.employeeController.create(employee);
       // Assert.assertTrue(this.service.getAll().size()> 0);


        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("456", "0987");
       // this.employeeGenderService.create(employeeGender);
       // Assert.assertTrue(this.employeeGenderService.getAll().size()> 0);


        Race race = RaceFactory.buildRace("White");
       // this.raceService.create(race);
       // Assert.assertTrue(this.raceService.getAll().size()> 0);

        Gender gender = GenderFactory.buildGender("Male");
       // this.genderService.create(gender);
        //Assert.assertTrue(this.genderService.getAll().size()> 0);

        Employee employee1 = employeeController.createFullEmployee(employee.getEmpNumber(), employee.getEmpFirstName(), employee.getEmpLastName(),race.getRaceID(),gender.getId());


        Assert.assertNotNull(employee1);

    }
}