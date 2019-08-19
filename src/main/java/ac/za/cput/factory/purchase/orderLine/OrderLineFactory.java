package ac.za.cput.factory.purchase.orderLine;

import ac.za.cput.domain.purchase.orderLine.OrderLine;

public class OrderLineFactory {

    public static OrderLine buildOrderLine(String orderID, String itemID,
                                           String description, int qty, double amount)
    {
        return new OrderLine.Builder().amount(amount)
                .description(description)
                .qty(qty)
                .build().orderLine(orderID, itemID);

    }

}
