package ac.za.cput.repository.user.impl;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.repository.user.EmployeeRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private Set<Employee> employees;

    private EmployeeRepositoryImpl()
    {
        this.employees = new HashSet<>();
    }


    public static EmployeeRepository getRepository()
    {
        if(repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Employee create(Employee e) {
        this.employees.add(e);
        return e;
    }

    @Override
    public Employee update(Employee e) {
        Employee updatedEmployee = null;

        Employee hi = read(e.getEmpNumber());
        if(hi != null)
        {
           delete(e.getEmpNumber());
            this.employees.add(hi);
            updatedEmployee = e;
        }
        return updatedEmployee;
    }

    @Override
    public void delete(String s) {
        Employee e = read(s);
        if(e != null)
        {
            this.employees.remove(s);
        }

    }

    @Override
    public Employee read(String o) {
        return this.employees.stream().filter(e -> e.getEmpNumber().equals(o)).findAny()
                .orElse(null);
    }

    @Override
    public Set<Employee> getAll() {
        return null;
    }
}
