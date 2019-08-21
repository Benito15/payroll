package ac.za.cput.factory.purchase.order;

import ac.za.cput.domain.purchase.order.Order;
import ac.za.cput.domain.user.Customer;
import ac.za.cput.util.Misc;

public class OrderFactory {

    public static Order buildOrder(double grandTotal, String custID)
    {
        return new Order.Builder().orderID(Misc.generateID())
                .orderTotal(grandTotal)
                .getCustID(custID).build();

    }


}
