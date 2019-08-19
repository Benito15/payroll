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


    public static EmployeeRepositoryImpl getRepository()
    {
        if(repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Employee create(Employee employee) {
        this.employees.add(employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {

        Employee readEmp = repository.read(employee.getEmpNumber());
       // Employee inrepo = repository.read(employee.getEmpNumber());

        if(this.employees.contains(employee))
        {
            this.employees.remove(readEmp.getEmpNumber());
          //  delete(employee.getEmpNumber());
            //this.employees.add(employee);
            this.employees.add(employee);
        }
        return null;
    }

    @Override
    public void delete(String id) {
        Employee e = read(id);
        if(e != null)
        {
            this.employees.remove(e);
        }

    }

    @Override
    public Employee read(String o) {
        return this.employees.stream().filter(e -> e.getEmpNumber().equals(o)).findAny()
                .orElse(null);
    }

    @Override
    public Set<Employee> getAll() {
        return employees;
    }
}
