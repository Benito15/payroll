package ac.za.cput.service.demography.impl;

import ac.za.cput.domain.demography.Race;
import ac.za.cput.factory.demography.RaceFactory;
import ac.za.cput.service.demography.RaceService;
import ac.za.cput.service.employee.EmployeeService;
import ac.za.cput.service.employee.impl.EmployeeServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceServiceImplTest {

    private RaceService service;

    @Before
    public void setUp() throws Exception {
        this.service = RaceServiceImpl.getService();
    }

    @Test
    public void getAll() {
        Set<Race> raceSet = service.getAll();
        Assert.assertNotNull(raceSet);
    }

    @Test
    public void create() {
        String description = "Male";
        Race race = RaceFactory.buildRace( "Female");
        Race race2 =  RaceFactory.buildRace("male");

        service.create(race);
        service.create(race2);
        Race readRace1 = service.read(race.getDesc());
        // Assert.assertNotEquals(readEmployee.getEmpFirstName().contains("l"));
        //Assert.assertThat(name.contains(readEmployee.getEmpFirstName()));
        Assert.assertNotSame(race.getDesc(), race2.getDesc());
    }


    @Test
    public void update() {
        String newdescription = "Male";

        Race race = RaceFactory.buildRace( "Female");
        Race race2 = RaceFactory.buildRace( newdescription);

         race2.setRaceID(race.getRaceID());
        service.create(race);


        service.update(race2);

        Assert.assertNotEquals(race.getDesc(), race2.getDesc());


    }

    @Test
    public void delete() {
        Race race = RaceFactory.buildRace( "Female");
        service.create(race);
        Race readRace1 = service.read(race.getRaceID());
        Assert.assertTrue(this.service.getAll().size() > 0);
        service.delete(readRace1.getRaceID());
        Assert.assertTrue(this.service.getAll().size()<1);


    }

    @Test
    public void read() {
        Race race = RaceFactory.buildRace( "Female");
        service.create(race);
        Race readRace1 = service.read(race.getRaceID());
        Assert.assertNotNull(readRace1);

    }
}