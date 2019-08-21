package ac.za.cput.repository.user.impl;

import ac.za.cput.domain.user.Customer;
import ac.za.cput.repository.user.CustomerRepository;

import java.util.HashSet;
import java.util.Set;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static CustomerRepositoryImpl repository = null;
    private Set<Customer> customers;

    private CustomerRepositoryImpl()
    {
        this.customers = new HashSet<>();
    }

    public static CustomerRepositoryImpl getRepository()
    {
        if(repository == null) repository = new CustomerRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Customer> getAll() {
        return customers;
    }

    @Override
    public Customer create(Customer customer) {
        this.customers.add(customer);
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        Customer readCustomer = repository.read(customer.getCustID());
        if(this.customers.contains(customer))
        {
            this.customers.remove(readCustomer.getCustID());
            this.customers.add(customer);
        }
        return null;
    }

    @Override
    public void delete(String id) {
        Customer customer = read(id);
        if(customer != null)
        {
            this.customers.remove(id);
        }
    }

    @Override
    public Customer read(String id) {
        return this.customers.stream().filter(e ->
                e.getCustID().equals(id)).findAny()
                .orElse(null);
    }
}
