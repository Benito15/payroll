package ac.za.cput.factory.purchase.orderLine;

import ac.za.cput.domain.purchase.orderLine.OrderLine;
import ac.za.cput.factory.purchase.order.OrderFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderLineFactoryTest {

    @Test
    public void buildOrderLine() {
    OrderLine orderLine = OrderLineFactory.buildOrderLine
            ("12","1","Shocks", 5,50.00);
        Assert.assertNotNull(orderLine);
        System.out.println(orderLine);

    }
}