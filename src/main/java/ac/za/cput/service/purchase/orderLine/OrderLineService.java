package ac.za.cput.service.purchase.orderLine;

import ac.za.cput.domain.purchase.orderLine.OrderLine;
import ac.za.cput.service.IService;

import java.util.Set;

public interface OrderLineService extends IService<OrderLine,String> {
    Set<OrderLine> getAll();
}
