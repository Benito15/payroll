package ac.za.cput.repository.user;

import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface EmployeeGenderRepository extends IRepository<EmployeeGender, String> {

    Set<EmployeeGender> getAll();

}
