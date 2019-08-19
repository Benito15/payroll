package ac.za.cput.factory.purchase.order;

import ac.za.cput.domain.purchase.order.Order;
import ac.za.cput.domain.user.Customer;
import ac.za.cput.factory.user.CustomerFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderFactoryTest {

    @Test
    public void buildOrder() {
        Customer customer = CustomerFactory.buildCustomer("Bennie",500);
        Order order = OrderFactory.buildOrder(500,customer);
        Assert.assertNotNull(order);
        System.out.println(order);

    }
}