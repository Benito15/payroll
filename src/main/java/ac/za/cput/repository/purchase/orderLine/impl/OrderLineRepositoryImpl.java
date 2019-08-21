package ac.za.cput.repository.purchase.orderLine.impl;

import ac.za.cput.domain.purchase.orderLine.OrderLine;
import ac.za.cput.repository.purchase.orderLine.OrderLineRepository;

import java.util.HashSet;
import java.util.Set;

public class OrderLineRepositoryImpl implements OrderLineRepository {

    private static OrderLineRepositoryImpl repository = null;
    private Set<OrderLine> orderLines;

    private OrderLineRepositoryImpl()
    {
        this.orderLines = new HashSet<>();
    }


    public static OrderLineRepositoryImpl getRepository()
    {
        if(repository == null) repository = new OrderLineRepositoryImpl();
        return repository;
    }



    @Override
    public Set<OrderLine> getAll() {
        return orderLines;
    }

    @Override
    public OrderLine create(OrderLine orderLine) {
        this.orderLines.add(orderLine);
        return orderLine;
    }

    @Override
    public OrderLine update(OrderLine orderLine) {
        OrderLine readOrderLine = repository.read(orderLine.getItemID());
        if(this.orderLines.contains(orderLine))
        {
            this.orderLines.remove(readOrderLine);
            this.orderLines.add(orderLine);

        }
        return null;
    }

    @Override
    public void delete(String s) {
        OrderLine toDelete = read(s);
        if (toDelete != null) {
            this.orderLines.remove(toDelete);
        }

    }

    @Override
    public OrderLine read(String s) {
        return this.orderLines.stream().filter(e ->
                e.getOrderID().equals(s)).findAny()
                .orElse(null);    }
//why not read from composite key??]
    //why read from order primay key, high value..
}
