package products;

import behaviours.ISell;

public class Product implements ISell {

    private String description;
    private int boughtPrice;
    private int sellPrice;

    public Product(String description, int boughtPrice, int sellPrice) {
        this.description = description;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public int getBoughtPrice() {
        return boughtPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int calculateMarkup() {
        return getSellPrice() - getBoughtPrice();
    }
}
