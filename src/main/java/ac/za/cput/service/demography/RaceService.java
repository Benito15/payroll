package ac.za.cput.service.demography;

import ac.za.cput.domain.demography.Race;
import ac.za.cput.service.IService;

import java.util.Set;

public interface RaceService extends IService <Race, String> {
    Set<Race> getAll();
}
