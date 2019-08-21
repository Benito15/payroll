package ac.za.cput.service.purchase.item;

import ac.za.cput.domain.purchase.item.Item;
import ac.za.cput.service.IService;

import java.util.Set;

public interface ItemService extends IService<Item, String> {
    Set<Item> getAll();
}
