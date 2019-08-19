package ac.za.cput.factory.user;

import ac.za.cput.domain.user.Customer;
import ac.za.cput.util.Misc;

public class CustomerFactory {

    public static Customer buildCustomer(String firstName, double balance) {
        return new Customer.Builder().custID(Misc.generateID())
                .firstName(firstName)
                .balance(balance)
                .build();
    }
}
