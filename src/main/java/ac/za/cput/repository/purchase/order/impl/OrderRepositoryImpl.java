package ac.za.cput.repository.purchase.order.impl;

import ac.za.cput.domain.purchase.order.Order;
import ac.za.cput.repository.purchase.order.OrderRepository;

import java.util.HashSet;
import java.util.Set;

public class OrderRepositoryImpl implements OrderRepository {

    private static OrderRepositoryImpl repository = null;
    private Set<Order> orders;

    private OrderRepositoryImpl()
    {
        this.orders = new HashSet<>();
    }


    public static OrderRepositoryImpl getRepository()
    {
        if(repository == null) repository = new OrderRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Order> getAll() {
        return orders;
    }

    @Override
    public Order create(Order order) {
        orders.add(order);
        return order;
    }

    @Override
    public Order update(Order order) {
        Order readOrder = repository.read(order.getOrderID());
        if(this.orders.contains(order))
        {
            this.orders.remove(order.getOrderID());
            //  delete(employee.getEmpNumber());
            //this.employees.add(employee);
            this.orders.add(order);
        }
        return null;
    }

    @Override
    public void delete(String id) {
        Order e  = read(id);
        if(e != null)
        {
            this.orders.remove(e);
        }
    }

    @Override
    public Order read(String id) {
        return this.orders.stream().filter(e ->
                e.getOrderID().equals(id)).findAny()
                .orElse(null);
    }
}
