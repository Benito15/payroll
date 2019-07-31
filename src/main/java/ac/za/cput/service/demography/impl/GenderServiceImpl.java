package ac.za.cput.service.demography.impl;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.repository.demography.GenderRepository;
import ac.za.cput.repository.demography.impl.GenderRepositoryImpl;
import ac.za.cput.service.demography.GenderService;

import java.util.Set;

public class GenderServiceImpl implements GenderService {

    private GenderServiceImpl service = null;
    private GenderRepository repository;


    private  GenderServiceImpl()
    {
        repository = GenderRepositoryImpl.getRepository();
    }

    public  GenderServiceImpl getService()
    {
        if(service == null)return  new GenderServiceImpl();
        return  service;
    }


    @Override
    public Set<Gender> getAll() {
        return repository.getAll();
    }

    @Override
    public Gender create(Gender gender) {
        return repository.create(gender);
    }

    @Override
    public Gender update(Gender gender) {
        return this.repository.update(gender);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }

    @Override
    public Gender read(String s) {
        return this.repository.read(s);
    }
}
