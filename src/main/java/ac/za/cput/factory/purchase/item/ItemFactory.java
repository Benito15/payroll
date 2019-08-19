package ac.za.cput.factory.purchase.item;

import ac.za.cput.domain.purchase.item.Item;
import ac.za.cput.util.Misc;

public class ItemFactory {

    public static Item buildItem(String description, int qtyOH, double price )
    {


        return new Item.Builder()
                .itemID(Misc.generateID())
                .description(description)
                .qtyOH(qtyOH)
                .price(price)
                .build();
    }


}
