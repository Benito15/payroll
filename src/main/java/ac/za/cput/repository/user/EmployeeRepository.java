package ac.za.cput.repository.user;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.repository.IRepository;

import java.util.Set;


public interface EmployeeRepository extends IRepository<Employee,String> {

    Set<Employee> getAll();

}
