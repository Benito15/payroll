package ac.za.cput.service.employee;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.service.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee,String> {
    Set<Employee>getAll();
}
