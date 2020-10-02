package instruments;

public class Guitar extends Instrument {

    private int strings;
    private boolean electric;

    public Guitar(int strings, boolean electric, String colour, String brand, int boughtPrice, int sellPrice) {
        super("wood", colour, "stringed", brand, boughtPrice, sellPrice);
        this.strings = strings;
        this.electric = electric;
    }

    public int getStrings() {
        return strings;
    }

    public boolean isElectric() {
        return electric;
    }

    public String play() {
        return "twaaang";
    }
}
