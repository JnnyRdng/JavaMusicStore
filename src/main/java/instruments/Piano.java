package instruments;

import enums.InstrumentType;

public class Piano extends Instrument {

    private int keys;
    private int pedals;

    public Piano(String colour, String brand, int boughtPrice, int sellPrice, int keys, int pedals) {
        super("wood", colour, InstrumentType.PERCUSSION, brand, boughtPrice, sellPrice);
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
