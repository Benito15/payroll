package ac.za.cput.service.demography.impl;


import ac.za.cput.domain.demography.Race;
import ac.za.cput.repository.demography.RaceRepository;
import ac.za.cput.repository.demography.impl.RaceRepositoryImpl;
import ac.za.cput.service.demography.RaceService;

import java.util.Set;

public class RaceServiceImpl implements RaceService {

    private RaceServiceImpl service = null;
    private RaceRepository repository;


    private  RaceServiceImpl()
    {
        repository = RaceRepositoryImpl.getRepository();
    }

    public  RaceServiceImpl getService()
    {
        if(service == null)return  new RaceServiceImpl();
        return  service;
    }


    @Override
    public Set<Race> getAll() {
        return repository.getAll();
    }

    @Override
    public Race create(Race race) {
        return repository.create(race);

    }

    @Override
    public Race update(Race race) {
        return this.repository.update(race);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }

    @Override
    public Race read(String s) {
        return this.repository.read(s);
    }
}
