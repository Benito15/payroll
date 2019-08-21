package ac.za.cput.service.purchase.order;

import ac.za.cput.domain.purchase.order.Order;
import ac.za.cput.service.IService;

import java.util.Set;

public interface OrderService extends IService  <Order,String>{
    Set<Order> getAll();
}
