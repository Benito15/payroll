package ac.za.cput.repository.purchase.orderLine;

import ac.za.cput.domain.purchase.orderLine.OrderLine;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface OrderLineRepository extends IRepository<OrderLine,String>
{
    Set<OrderLine> getAll();
}

