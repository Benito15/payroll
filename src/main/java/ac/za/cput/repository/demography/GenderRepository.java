package ac.za.cput.repository.demography;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface GenderRepository extends IRepository<Gender, String> {

    Set<Gender> getAll();

}
