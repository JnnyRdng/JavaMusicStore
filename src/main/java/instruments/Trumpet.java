package instruments;

public class Trumpet extends Instrument {

    private int valves;

    public Trumpet(String colour, String brand, int boughtPrice, int sellPrice) {
        super("metal", colour, "brass", brand, boughtPrice, sellPrice);
        this.valves = 3;
    }

    public int getValves() {
        return valves;
    }

    public String play() {
        return "parrrrp";
    }
}
