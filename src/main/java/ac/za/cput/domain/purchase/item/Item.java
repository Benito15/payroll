package ac.za.cput.domain.purchase.item;


import java.util.Objects;

public class Item {

    private String itemID;
    private String description;
    private double price;
    //quantity ON HAND
    private int qtyOH;

    private Item(){}

    public Item(Builder builder)
        {
          this.itemID = builder.itemID;
          this.description = builder.description;
          this.price = builder.price;
          this.qtyOH = builder.qtyOH;
        }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyOH() {
        return qtyOH;
    }

    public void setQtyOH(int qtyOH) {
        this.qtyOH = qtyOH;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemID='" + itemID + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", qtyOH=" + qtyOH +
                '}';
    }

    public static class Builder
    {
        private String itemID, description;
        private int qtyOH;
        private double price;


        public Builder itemID(String itemID)
        {
            this.itemID = itemID;
            return this;

        }

        public Builder description(String description)
        {
            this.description = description;
            return this;

        }

        public Builder qtyOH (int qtyOH)
        {
            this.qtyOH = qtyOH;
            return this;

        }

        public Builder price (double price)
        {
            this.description = description;
            return this;

        }

        public Item build()
        {
            return new Item(this);
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(itemID, item.itemID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemID);
    }
}

