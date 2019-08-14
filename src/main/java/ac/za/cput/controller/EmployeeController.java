package ac.za.cput.controller;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.domain.demography.Race;
import ac.za.cput.domain.user.Employee;
import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.factory.demography.GenderFactory;
import ac.za.cput.factory.demography.RaceFactory;
import ac.za.cput.factory.user.EmployeeFactory;
import ac.za.cput.factory.user.EmployeeGenderFactory;
import ac.za.cput.repository.demography.GenderRepository;
import ac.za.cput.repository.demography.RaceRepository;
import ac.za.cput.repository.user.EmployeeGenderRepository;
import ac.za.cput.repository.user.EmployeeRepository;
import ac.za.cput.service.demography.GenderService;
import ac.za.cput.service.demography.RaceService;
import ac.za.cput.service.demography.impl.GenderServiceImpl;
import ac.za.cput.service.demography.impl.RaceServiceImpl;
import ac.za.cput.service.employee.EmployeeGenderService;
import ac.za.cput.service.employee.EmployeeService;
import ac.za.cput.service.employee.impl.EmployeeGenderServiceImpl;
import ac.za.cput.service.employee.impl.EmployeeServiceImpl;

public class EmployeeController {

    private EmployeeService service = EmployeeServiceImpl.getService();

    public Employee createFullEmployee(String empNumber, String fname, String lname, String raceID, String genderID) {


        return service.createFullEmployee(empNumber, fname, lname, raceID, genderID);


    }

}
