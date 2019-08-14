package ac.za.cput.service.employee.impl;

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
import ac.za.cput.repository.demography.impl.GenderRepositoryImpl;
import ac.za.cput.repository.demography.impl.RaceRepositoryImpl;
import ac.za.cput.repository.user.EmployeeGenderRepository;
import ac.za.cput.repository.user.EmployeeRepository;
import ac.za.cput.repository.user.impl.EmployeeGenderRepositoryImpl;
import ac.za.cput.repository.user.impl.EmployeeRepositoryImpl;
import ac.za.cput.service.employee.EmployeeService;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {


    private static EmployeeServiceImpl service = null;
    private EmployeeRepository repository;
    private EmployeeGenderRepository employeeGenderRepository;
    private RaceRepository raceRepository;
    private GenderRepository genderRepository;



    private  EmployeeServiceImpl()
    {
        repository = EmployeeRepositoryImpl.getRepository();
        employeeGenderRepository = EmployeeGenderRepositoryImpl.getEmployeeGenderRepository();
        raceRepository = RaceRepositoryImpl.getRepository();
        genderRepository = GenderRepositoryImpl.getRepository();
    }

    public static EmployeeServiceImpl getService()
    {
        if(service == null)return  new EmployeeServiceImpl();
        return  service;
    }

    @Override
    public Set<Employee> getAll() {
        return repository.getAll();    }


    @Override
    public Employee create(Employee employee) {
        return repository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return this.repository.update(employee);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public Employee read(String s) {
        return this.repository.read(s);
    }


    @Override
    public Employee createFullEmployee(String empNumber, String fname, String lname, String raceID, String genderID) {

        Employee employee = EmployeeFactory.buildEmployee(fname, lname);
        this.repository.create( employee);

        Race race = RaceFactory.buildRace(raceID);
        this.raceRepository.create(race);

        Gender gender = GenderFactory.buildGender(genderID);
        genderRepository.create(gender);

        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender(empNumber,genderID);
        employeeGenderRepository.create(employeeGender);

        return employee;

    }

}
