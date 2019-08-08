package ac.za.cput.repository.demography.impl;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.factory.demography.GenderFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderRepositoryImplTest {

    public GenderRepositoryImpl repository;

    @Before
    public void setUp() throws Exception {

        repository = GenderRepositoryImpl.getRepository();
    }

    @Test
    public void getAll() {
        Set<Gender> genderSetSet = this.repository.getAll();
        Assert.assertNotNull(genderSetSet);
    }

    @Test
    public void create() {
        Gender gender = GenderFactory.buildGender("Male");

        this.repository.create(gender);
        // System.out.println(employee);
        // Assert.assertNotNull(employee);
        Gender readGender = repository.read(gender.getId());
        Assert.assertSame(gender.getId(), readGender.getId());

    }

    @Test
    public void update() {
        Gender gender = GenderFactory.buildGender("Male");

        this.repository.create(gender);


        Gender updatedGender= GenderFactory.buildGender("Not Specify");


        updatedGender.setId(gender.getId());

        this.repository.update(updatedGender);

        Assert.assertNotEquals(gender.getDesc(), updatedGender.getDesc());

    }

    @Test
    public void delete() {
        Gender gender = GenderFactory.buildGender("Male");

        this.repository.create(gender);

        Gender readGender = repository.read(gender.getId());
        // Employee deletedEmp = this.repository.read(readEmp.getEmpNumber());
        this.repository.delete(readGender.getId());
        System.out.println("=================");
        Assert.assertTrue(this.repository.getAll().size()<1);
        System.out.println(this.repository.getAll().size());
    }

    @Test
    public void read() {
        Gender gender = GenderFactory.buildGender("Male");

        this.repository.create(gender);

        Gender readGender = repository.read(gender.getId());
        Assert.assertEquals(gender.getId(),readGender.getId());

    }
}