package instruments;

import enums.InstrumentType;

public class Trumpet extends Instrument {

    private int valves;

    public Trumpet(String colour, String brand, int boughtPrice, int sellPrice) {
        super("metal", colour, InstrumentType.BRASS, brand, boughtPrice, sellPrice);
        this.valves = 3;
    }

    public int getValves() {
        return valves;
    }

    public String play() {
        return "parrrrp";
    }
}
