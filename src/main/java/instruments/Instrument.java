package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import enums.InstrumentType;

public abstract class Instrument implements IPlay, ISell {

    private String material;
    private String colour;
    private InstrumentType type;
    private String brand;
    private int boughtPrice;
    private int sellPrice;

    public Instrument(String material, String colour, InstrumentType type, String brand, int boughtPrice, int sellPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.brand = brand;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public void paint(String colour) {
        this.colour = colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public int getBoughtPrice() {
        return boughtPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int calculateMarkup() {
        return getSellPrice() - getBoughtPrice();
    }
}
