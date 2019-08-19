package ac.za.cput.domain.user;

import java.util.Objects;

public class Customer {

    private String custID;
    private String firstName;
    private double balance;

    private Customer(){}

    public Customer(Builder builder) {
        this.custID = builder.custID;
        this.firstName = builder.firstName;
        this.balance = builder.balance;

    }


    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custID='" + custID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static class Builder {
        private String custID, firstName;
        private double balance;

        public Builder custID(String custID) {
            this.custID = custID;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;

        }

        public Builder balance(double balance) {
            this.balance = balance;
            return this;

        }


        public Customer build() {
            return new Customer(this);
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(custID, customer.custID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custID);
    }
}