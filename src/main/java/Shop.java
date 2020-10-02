import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private int till;
    private ArrayList<ISell> stock;

    public Shop(String name, int till) {
        this.name = name;
        this.till = till;
        stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public int getTill() {
        return till;
    }

    public void useTill(int amount) {
        till += amount;
    }

    public void addStock(ISell item) {
        stock.add(item);
    }

    public boolean removeStock(ISell item) {
        return stock.remove(item);
    }

    public boolean canAfford(ISell item) {
        return getTill() >= item.getBoughtPrice();
    }

    public void buy(ISell item) {
        if (canAfford(item)) {
            addStock(item);
            useTill(- item.getBoughtPrice());
        }
    }

    public void sell(ISell item) {
        if (removeStock(item)) {
            useTill(item.getSellPrice());
        }
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int potentialProfit() {
        return stock.stream()
                .reduce(0, (sum, item) -> sum += item.calculateMarkup(), Integer::sum);
    }
}
