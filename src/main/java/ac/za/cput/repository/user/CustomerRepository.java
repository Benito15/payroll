package ac.za.cput.repository.user;

import ac.za.cput.domain.user.Customer;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface CustomerRepository extends IRepository<Customer, String> {
    Set<Customer> getAll();
}
