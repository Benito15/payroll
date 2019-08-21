package ac.za.cput.repository.purchase.order;

import ac.za.cput.domain.purchase.order.Order;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface OrderRepository extends IRepository<Order,String>
{
    Set<Order> getAll();
}
