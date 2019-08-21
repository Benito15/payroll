package ac.za.cput.domain.purchase.orderLine;

//import ac.za.cput.domain.purchase.item.Item;
//import ac.za.cput.domain.purchase.order.Order;

public class OrderLine {

    private String orderID;
    private String itemID;
    private int qty;
    private String description;
    //amount value derived from item_price x orderLine_qty.
    private double amount;

    private OrderLine()
    {

    }

    public OrderLine(Builder builder)
    {
        this.qty = builder.qty;
        this.description = builder.description;
        this.amount = builder.amount;

    }

    public OrderLine getorderLineID(String orderID, String itemID)
    {
        this.orderID = orderID;
        this.itemID = itemID;
        return this;
    }




    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "orderID=" + orderID +
                ", itemID=" + itemID +
                ", qty=" + qty +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                '}';
    }


public static class Builder
    {
      //  private String itemID;
        private String description;
        private int qty;
        private double amount;

//        public Builder itemID(String itemID)
//        {
//            this.itemID = itemID;
//            return this;
//        }

        public Builder description(String description)
        {
            this.description = description;
            return this;
        }

        public Builder qty(int qty)
        {
            this.qty = qty;
            return this;
        }


        public Builder amount(double amount)
        {
            this.amount = amount;
            return this;
        }

        public OrderLine build()
        {
            return new OrderLine(this);
        }

    }


}
