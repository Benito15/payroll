package ac.za.cput.repository.demography.impl;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.repository.demography.GenderRepository;

import java.util.HashSet;
import java.util.Set;

public class GenderRepositoryImpl implements GenderRepository {

    private static GenderRepositoryImpl repository = null;
    private Set<Gender> genders;

    private GenderRepositoryImpl() {
        this.genders = new HashSet<>();
    }


    public static GenderRepository getRepository() {
        if (repository == null) repository = new GenderRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Gender> getAll() {
        return genders;
    }

    @Override
    public Gender create(Gender gender) {
        this.genders.add(gender);
        return gender;
    }

    @Override
    public Gender update(Gender gender) {
        Gender updatedGender = read(gender.getId());

        if (updatedGender != null) {
            //delete(gender.getId());
            this.genders.remove(updatedGender);
            this.genders.add(gender);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Gender e = read(s);
        if (e != null) {
            this.genders.remove(e);
        }
    }

    @Override
    public Gender read(String s) {
        return this.genders.stream().filter(e -> e.getId().equals(s)).findAny()
                .orElse(null);
    }

}