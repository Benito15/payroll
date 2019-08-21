package ac.za.cput.repository.purchase.item.impl;

import ac.za.cput.domain.purchase.item.Item;
import ac.za.cput.repository.purchase.item.ItemRepository;

import java.util.HashSet;
import java.util.Set;

public class ItemRepositoryImpl implements ItemRepository
{

    private static ItemRepositoryImpl repository = null;
    private Set<Item> items;

    private ItemRepositoryImpl()
    {
        this.items = new HashSet<>();
    }


    public static ItemRepositoryImpl getRepository()
    {
        if(repository == null) repository = new ItemRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Item> getAll() {
        return items;
    }

    @Override
    public Item create(Item item) {
        this.items.add(item);
        return item;    }

    @Override
    public Item update(Item item) {
        Item readItem = repository.read(item.getItemID());
        if(this.items.contains(item))
        {
            this.items.remove(readItem.getItemID());
            this.items.add(item);
        }
        return null;
    }

    @Override
    public void delete(String id) {
        Item i = read(id);
        if(i != null)
        {
            this.items.remove(i);
        }
    }

    @Override
    public Item read(String id) {
        return this.items.stream().filter(i -> i.getItemID().equals(id)).findAny()
                .orElse(null);    }
}
