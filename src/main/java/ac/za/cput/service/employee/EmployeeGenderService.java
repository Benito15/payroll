package ac.za.cput.service.employee;

import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.service.IService;

import java.util.Set;

public interface EmployeeGenderService extends IService<EmployeeGender,String> {
    Set<EmployeeGender> getAll();
}
