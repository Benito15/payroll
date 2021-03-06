package ac.za.cput.domain.purchase.order;

import ac.za.cput.domain.user.Customer;

import java.util.Objects;

public class Order {

    private String orderID;
    private String custID;
    private double orderTotal;

    private Order(){}

    public Order(Builder builder)
    {
        this.orderID = builder.orderID;
        this.orderTotal = builder.orderTotal;
        this.custID = builder.custID;

    }

    public String getCustID(String custID)
    {
        this.custID = custID;
        return custID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", custID=" + custID+
                ", orderTotal=" + orderTotal +
                '}';
    }

    public static class Builder
    {
        private String orderID;
        private double orderTotal;
        private String custID;

        public Builder getCustID(String custID)
        {
            this.custID = custID;
            return this;
        }

        public Builder orderID(String orderID)
        {
            this.orderID = orderID;
            return this;
        }

        public Builder orderTotal(double orderTotal)
        {
            this.orderTotal = orderTotal;
            return this;

        }

        public Order build()
        {
            return new Order(this);
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderID, order.orderID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID);
    }
}


