package ac.za.cput.repository.demography;

import ac.za.cput.domain.demography.Race;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface RaceRepository extends IRepository<Race, String> {

    Set<Race> getAll();
}
