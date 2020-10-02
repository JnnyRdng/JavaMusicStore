package instruments;

public class Piano extends Instrument {

    private int keys;
    private int pedals;

    Piano(int keys, int pedals, String material, String colour, String brand, int boughtPrice, int sellPrice) {
        super(material, colour, "percussion", brand, boughtPrice, sellPrice);
        this.keys = keys;
        this.pedals = pedals;
    }

    public int getKeys() {
        return keys;
    }

    public int getPedals() {
        return pedals;
    }

    public String play() {
        return "plinky-plonk";
    }
}
