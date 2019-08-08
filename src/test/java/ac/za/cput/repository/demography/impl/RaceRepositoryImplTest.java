package ac.za.cput.repository.demography.impl;

import ac.za.cput.domain.demography.Race;
import ac.za.cput.factory.demography.RaceFactory;
import ac.za.cput.repository.demography.RaceRepository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceRepositoryImplTest {

    public RaceRepositoryImpl repository;

    @Before
    public void setUp() throws Exception {
        repository = RaceRepositoryImpl.getRepository();
    }

    @Test
    public void getAll() {
        Set<Race> raceSet = this.repository.getAll();
        // employeeSet.stream().forEach(e -> e.getEmpFirstName()::toString);
        Assert.assertNotNull(raceSet);
    }

    @Test
    public void create() {
        Race race = RaceFactory.buildRace("Male");
        this.repository.create(race);
        Race readRace = repository.read(race.getRaceID());
        Assert.assertTrue(this.repository.getAll().size() > 0);
        System.out.println(this.repository.getAll().size());
    }

    @Test
    public void update() {
        Race race = RaceFactory.buildRace("Male");
        this.repository.create(race);
        Race readRace = repository.read(race.getRaceID());
        System.out.println(readRace);
        readRace.setDesc("female");
        Race updatedRace = this.repository.update(readRace);
        System.out.println(updatedRace);
        Assert.assertEquals(race.getRaceID(), updatedRace.getRaceID());

    }



    @Test
    public void read()
    {
        Race race = RaceFactory.buildRace("Male");
        this.repository.create(race);

        Race readRace = repository.read(race.getRaceID());
        System.out.println(readRace);
        Assert.assertEquals(race.getRaceID(), readRace.getRaceID());


    }

    @Test
    public void delete() {
        Race race = RaceFactory.buildRace("Male");
        this.repository.create(race);

        Race readRace = repository.read(race.getRaceID());
        System.out.println(readRace);

        Assert.assertTrue(this.repository.getAll().size() > 0);

        this.repository.delete(readRace.getRaceID());
//
        Assert.assertTrue(this.repository.getAll().size()<1);
        System.out.println(this.repository.getAll().size());


    }
}