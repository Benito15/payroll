package ac.za.cput.service.employee.impl;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.repository.user.EmployeeRepository;
import ac.za.cput.repository.user.impl.EmployeeRepositoryImpl;
import ac.za.cput.service.employee.EmployeeService;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeServiceImpl service = null;
    private EmployeeRepository repository;


    private  EmployeeServiceImpl()
    {
        repository = EmployeeRepositoryImpl.getRepository();
    }

    public  EmployeeServiceImpl getService()
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
}
