package ac.za.cput.service.demography;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.service.IService;

import java.util.Set;

public interface GenderService extends IService<Gender, String> {

    Set<Gender> getAll();
}
