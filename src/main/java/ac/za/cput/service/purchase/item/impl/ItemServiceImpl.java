package ac.za.cput.service.purchase.item.impl;

import ac.za.cput.domain.purchase.item.Item;
import ac.za.cput.repository.purchase.item.ItemRepository;
import ac.za.cput.repository.purchase.item.impl.ItemRepositoryImpl;
import ac.za.cput.service.purchase.item.ItemService;

import java.util.Set;

public class ItemServiceImpl implements ItemService {

    private static ItemServiceImpl service = null;
    private ItemRepository repository;


    private  ItemServiceImpl()
    {
        repository = ItemRepositoryImpl.getRepository();
//        employeeGenderRepository = EmployeeGenderRepositoryImpl.getEmployeeGenderRepository();
//        raceRepository = RaceRepositoryImpl.getRepository();
//        genderRepository = GenderRepositoryImpl.getRepository();
    }

    public static ItemServiceImpl getService()
    {
        if(service == null)return  new ();
        return  service;
    }



    @Override
    public Set<Item> getAll() {
        return null;
    }

    @Override
    public Item create(Item item) {
        return null;
    }

    @Override
    public Item update(Item item) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Item read(String s) {
        return null;
    }
}
