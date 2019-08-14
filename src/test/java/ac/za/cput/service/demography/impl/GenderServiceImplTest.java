package ac.za.cput.service.demography.impl;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.factory.demography.GenderFactory;
import ac.za.cput.service.demography.GenderService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderServiceImplTest {

    private GenderService service;

    @Before
    public void setUp() throws Exception {
        this.service = GenderServiceImpl.getService();
    }

    @Test
    public void getAll() {
        Set<Gender> genderSet = service.getAll();
        Assert.assertNotNull(genderSet);
    }

    @Test
    public void create() {
        Gender gender = GenderFactory.buildGender("Female");
        Gender gender2 = GenderFactory.buildGender("male");
        service.create(gender);
        service.create(gender2);
        Gender readGender = service.read(gender.getId());
        Gender readGender2 = service.read(gender2.getId());
        Assert.assertNotSame(readGender.getDesc(), readGender2.getDesc());

    }

    @Test
    public void update() {
        Gender gender = GenderFactory.buildGender("Female");
        service.create(gender);
        Gender readGender = service.read(gender.getId());
        gender.setDesc("male");
        service.update(gender);

        Assert.assertTrue(this.service.getAll().size() > 0);

    }

    @Test
    public void delete() {
        Gender gender = GenderFactory.buildGender("Female");
        service.create(gender);
        Gender readGender = service.read(gender.getId());
        Assert.assertTrue(this.service.getAll().size()>0);
        service.delete(readGender.getId());
        Assert.assertTrue(this.service.getAll().size()<1);

    }

    @Test
    public void read() {
        Gender gender = GenderFactory.buildGender("Female");
        service.create(gender);
        Gender readGender = service.read(gender.getId());
       // Assert.assertTrue(this.service.getAll().size()>0);
        Assert.assertNotNull(readGender);

    }
}