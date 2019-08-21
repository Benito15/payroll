package ac.za.cput.repository.purchase.item;

import ac.za.cput.domain.purchase.item.Item;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface ItemRepository extends IRepository<Item,String> {
    Set<Item>getAll();
}
